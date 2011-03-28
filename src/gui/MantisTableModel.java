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
		return data!=null?data.length:0;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		super.setValueAt(aValue, rowIndex, columnIndex);
	}
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return super.getColumnName(column);
	}
	
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return super.getColumnClass(columnIndex);
	}

}
