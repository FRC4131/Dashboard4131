package org.usfirst.frc.team4131.dashboard;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import edu.wpi.first.smartdashboard.gui.elements.bindings.AbstractValueWidget;
import edu.wpi.first.smartdashboard.properties.Property;
import edu.wpi.first.smartdashboard.types.DataType;

public class StatusAlert extends AbstractValueWidget{
	public static final DataType[] TYPES = {DataType.BOOLEAN};
	private JPanel panel = new JPanel();
	@Override
	public void init(){
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.NORTHWEST;
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = c.gridheight = 1;
		c.gridx = c.gridy = 0;
		c.weightx = 1;
		c.weighty = 0;
		
		JLabel label = new JLabel(getFieldName());
		add(label, c);
		
		++c.gridy;
		c.weighty = 4;
		add(panel, c);
		
		setValue(false);
		
		revalidate();
		repaint();
	}
	@Override
	public void propertyChanged(Property prop){
		
	}
	@Override
	public void setValue(boolean value){
		panel.setBackground(value ? Color.green : Color.red);
		repaint();
	}
}
