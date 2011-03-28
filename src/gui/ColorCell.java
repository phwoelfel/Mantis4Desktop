/**
 * 
 */
package gui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import biz.futureware.mantisconnect.ObjectRef;

/**
 * @author philip
 *
 */
public class ColorCell extends JLabel implements TableCellRenderer {
	private ObjectRef[] stati;
	public ColorCell(ObjectRef[] stati) {
		this.stati = stati;
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		setText((String) table.getValueAt(row, column));
		//String val = (String) table.getValueAt(row, MantisTableModel.COL_STATUS);
		String val = "zugewiesen";
		for (int i = 0; i < stati.length; i++) {
			if(val.equals(stati[i].getName())){
				setBackground(new Color(255, 200, 200));
			}
		}
		
		return this;
	}

}
