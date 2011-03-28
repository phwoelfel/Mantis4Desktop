package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.rmi.RemoteException;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.xml.rpc.ServiceException;

import biz.futureware.mantisconnect.MantisConnectLocator;
import biz.futureware.mantisconnect.MantisConnectPortType;
import biz.futureware.mantisconnect.ObjectRef;
import biz.futureware.mantisconnect.ProjectData;

public class MainGUI extends JFrame implements ActionListener, ItemListener {

	private JTable tab;
	private JComboBox project_select;

	private static final String USER = "apiuser";
	private static final String PWD = "Crp97.zogt";

	private MantisConnectPortType service;
	private ProjectData[] projects;
	private ObjectRef[] stati;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new MainGUI();

	}

	public MainGUI() {
		setTitle("Mantis Bugtracker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 600);

		// Container Anfang
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());

		JPanel top = new JPanel();
		top.setLayout(new FlowLayout());
		// Container Ende

		// Initialisierung der Inhalte Anfang
		tab = new JTable();
		tab.setAutoCreateRowSorter(true);

		MantisConnectLocator loc = new MantisConnectLocator();
		try {
			loc.setMantisConnectPortEndpointAddress("http://localhost/~philip/bugtracker/api/soap/mantisconnect.php");
			service = loc.getMantisConnectPort();

			projects = service.mc_projects_get_user_accessible(USER, PWD);
			String[] data = new String[projects.length + 1];
			data[0] = "";
			for (int i = 1; i < projects.length + 1; i++) {
				ProjectData p = projects[i-1];
				data[i] = p.getName();
			}
			project_select = new JComboBox(data);
			project_select.addItemListener(this);

		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		// Initialisierung der Inhalte Ende

		// Action Listener zu den Inhalten hinzufuegen Anfang

		// Action Listener zu den Inhalten hinzufuegen Ende

		// Inhalte zu den JPanel hinzufuegen Anfang
		top.add(project_select);
		// Inhalte zu den JPanel hinzufuegen Ende

		// JPanel zum Container hinzufuegen Anfang
		cp.add(top, BorderLayout.NORTH);
		cp.add(new JScrollPane(tab), BorderLayout.CENTER);
		// JPanel zum Container hinzufuegen Ende

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void itemStateChanged(ItemEvent ev) {
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				updateTable();
			}
		});
		th.start();
	}

	private void updateTable() {
		int proj = project_select.getSelectedIndex();
		if (proj != 0) {
			ProjectData pdata = projects[proj-1];
			tab.setModel(new MantisTableModel(service, pdata.getId(), USER, PWD));
			
			try {
				stati = service.mc_enum_status(USER, PWD);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (stati != null) {
				JComboBox cb = new JComboBox();
				for (int i = 0; i < stati.length; i++) {
					cb.addItem(stati[i].getName());
				}
				TableColumn tc = tab.getColumnModel().getColumn(MantisTableModel.COL_STATUS);
				tc.setCellEditor(new DefaultCellEditor(cb));
				
				/*TableColumn tc2 = tab.getColumnModel().getColumn(MantisTableModel.COL_DESC);
				tc2.setCellRenderer(new ColorCell(stati));
				*/
				
			}
		}
	}

}
