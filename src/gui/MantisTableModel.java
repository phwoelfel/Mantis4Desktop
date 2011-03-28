/**
 * 
 */
package gui;

import java.math.BigInteger;
import java.rmi.RemoteException;

import javax.swing.table.AbstractTableModel;

import biz.futureware.mantisconnect.IssueData;
import biz.futureware.mantisconnect.MantisConnectPortType;

/**
 * @author philip
 * 
 */
public class MantisTableModel extends AbstractTableModel {
	private IssueData[] data;
	private BigInteger projectId;
	private MantisConnectPortType service;
	private static String USER = "apiuser";
	private static String PWD = "Crp97.zogt";

	public MantisTableModel(MantisConnectPortType service,
			BigInteger projectId, String usr, String pwd) {
		this.projectId = projectId;
		this.service = service;
		USER = usr;
		PWD = pwd;
		try {
			data = service.mc_project_get_issues(USER, PWD, this.projectId,	new BigInteger("0"), new BigInteger("0"));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		return data != null ? data.length : 0;
	}

	@Override
	public Object getValueAt(int row, int col) {
		IssueData is = data[row];
		switch (col) {
		case 0:
			return is.getSummary();

		case 1:
			return is.getStatus().getName();

		case 2:
			return is.getDescription();

		default:
			break;
		}
		return null;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		super.setValueAt(aValue, rowIndex, columnIndex);
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0:
			return "Titel";

		case 1:
			return "Status";

		case 2:
			return "Beschreibung";

		default:
			break;
		}
		return null;
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return super.getColumnClass(columnIndex);
	}

}
