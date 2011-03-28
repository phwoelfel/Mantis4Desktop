package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.BigInteger;
import java.rmi.RemoteException;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.xml.rpc.ServiceException;

import biz.futureware.mantisconnect.IssueData;
import biz.futureware.mantisconnect.MantisConnectLocator;
import biz.futureware.mantisconnect.MantisConnectPortType;
import biz.futureware.mantisconnect.ProjectData;

public class MainGUI extends JFrame implements ActionListener, ItemListener {

	private JTable tab;
	private JComboBox project_select;
	
	private static final String USER = "apiuser";
	private static final String PWD = "Crp97.zogt";
	
	private MantisConnectPortType service;
	private ProjectData[] projects;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}
	
	public MainGUI() {
		setTitle("Mantis Bugtracker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		
		//Container Anfang
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		JPanel top = new JPanel();
		top.setLayout(new FlowLayout());
		//Container Ende
		
		
		//Initialisierung der Inhalte Anfang
		
		MantisConnectLocator loc = new MantisConnectLocator();
		try {
			loc.setMantisConnectPortEndpointAddress("http://localhost/~philip/bugtracker/api/soap/mantisconnect.php");
			service = loc.getMantisConnectPort();
			
			projects = service.mc_projects_get_user_accessible(USER, PWD);
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		
		
		tab = new JTable();
		project_select = new JComboBox();
		project_select.addItemListener(this);
		//Initialisierung der Inhalte Ende
		
		
		//Action Listener zu den Inhalten hinzufuegen Anfang
		
		//Action Listener zu den Inhalten hinzufuegen Ende
		
		
		//Inhalte zu den JPanel hinzufuegen Anfang
		
		//Inhalte zu den JPanel hinzufuegen Ende
		
		
		//JPanel zum Container hinzufuegen Anfang
		
		//JPanel zum Container hinzufuegen Ende
		
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
