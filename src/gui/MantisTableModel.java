/**
 * 
 */
package gui;

import java.math.BigInteger;

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
	public MantisTableModel(MantisConnectPortType service, String projectId) {
		this.projectId = new BigInteger(projectId);
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
