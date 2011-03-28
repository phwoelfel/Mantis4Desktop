/**
 * 
 */
package gui;

import java.awt.Color;
import java.awt.Component;
import java.math.BigInteger;
import java.rmi.RemoteException;

import javax.swing.JTable;
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
	
	public static final int COL_SUMMARY = 0;
	public static final int COL_STATUS = 1;
	public static final int COL_DESC = 2;
	

	public MantisTableModel(MantisConnectPortType service, BigInteger projectId, String usr, String pwd) {
		this.projectId = projectId;
		this.service = service;
		USER = usr;
		PWD = pwd;
		try {
			data = service.mc_project_get_issues(USER, PWD, this.projectId, new BigInteger("0"), new BigInteger("0"));
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
			case COL_SUMMARY:
				return is.getSummary();

			case COL_STATUS:
				return is.getStatus().getName();

			case COL_DESC:
				return is.getDescription();

			default:
				break;
		}
		return null;
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		return true;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		IssueData is = data[rowIndex];
		switch (columnIndex) {
			case COL_SUMMARY:
				is.setSummary((String) aValue);
				break;
			case COL_STATUS:
				//is.getStatus().setName((String) aValue);
				return;
			case COL_DESC:
				is.setDescription((String) aValue);
				break;

			default:
				break;
		}
		try {
			service.mc_issue_update(USER, PWD, is.getId(), is);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
			case COL_SUMMARY:
				return "Titel";

			case COL_STATUS:
				return "Status";

			case COL_DESC:
				return "Beschreibung";

			default:
				break;
		}
		return null;
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return getValueAt(0, columnIndex).getClass();
	}
	
	
}
