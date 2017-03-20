import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.SystemColor;


public class HardwarePanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	// field tries & voltage
	private JLabel lblTc;
	private JLabel lblTc_1;
	private JLabel lblTc_2;
	private JLabel lblTc_3;
	private JLabel lblTc_4;
	private JLabel lblTc_6;
	private JLabel lblTc_7;
	private JLabel lblTc_8;
	
	private JLabel lblVc;
	private JLabel lblVc_1;
	private JLabel lblVc_2;
	private JLabel lblVc_3;
	private JLabel lblVc_4;
	private JLabel lblVc_5;
	private JLabel lblVc_6;
	private JLabel lblVc_7;
	
	
	public HardwarePanel(int[] tries, int[] voltage) {

		setBackground(SystemColor.activeCaption);
		setLayout(new BorderLayout(0, 0));
		
		//Title Panel
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		add(panel, BorderLayout.NORTH);
		JLabel lblTransmissionAndHardware = new JLabel("Transmission and Hardware Information");
		panel.add(lblTransmissionAndHardware, BorderLayout.NORTH);

		//Row Titles
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{27, 44, 0, 0, 41, 0, 0, 59, 0};
		gbl_panel_1.rowHeights = new int[]{14, 14, 14, 14, 14, 14, 14, 14, 14, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblCourt = new JLabel("Court");
		GridBagConstraints gbc_lblCourt = new GridBagConstraints();
		gbc_lblCourt.anchor = GridBagConstraints.NORTH;
		gbc_lblCourt.insets = new Insets(0, 0, 5, 5);
		gbc_lblCourt.gridx = 1;
		gbc_lblCourt.gridy = 1;
		panel_1.add(lblCourt, gbc_lblCourt);
		
		JLabel lblTries = new JLabel("Tries");
		GridBagConstraints gbc_lblTries = new GridBagConstraints();
		gbc_lblTries.insets = new Insets(0, 0, 5, 5);
		gbc_lblTries.gridx = 4;
		gbc_lblTries.gridy = 1;
		panel_1.add(lblTries, gbc_lblTries);
		
		JLabel lblVoltage = new JLabel("Voltage");
		GridBagConstraints gbc_lblVoltage = new GridBagConstraints();
		gbc_lblVoltage.insets = new Insets(0, 0, 5, 0);
		gbc_lblVoltage.gridx = 7;
		gbc_lblVoltage.gridy = 1;
		panel_1.add(lblVoltage, gbc_lblVoltage);
		
		//Rows 
		
		// Court no.
		JLabel label = new JLabel("1");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.NORTH;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 2;
		panel_1.add(label, gbc_label);
		
		JLabel label_1 = new JLabel("2");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.NORTH;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 3;
		panel_1.add(label_1, gbc_label_1);
			
		JLabel label_2 = new JLabel("3");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.NORTH;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 4;
		panel_1.add(label_2, gbc_label_2);
		
		JLabel label_3 = new JLabel("4");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.NORTH;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 5;
		panel_1.add(label_3, gbc_label_3);
		
		JLabel label_4 = new JLabel("5");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.NORTH;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 6;
		panel_1.add(label_4, gbc_label_4);
						
		JLabel label_5 = new JLabel("6");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.NORTH;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 7;
		panel_1.add(label_5, gbc_label_5);

		JLabel label_6 = new JLabel("7");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.anchor = GridBagConstraints.NORTH;
		gbc_label_6.gridx = 1;
		gbc_label_6.gridy = 8;
		panel_1.add(label_6, gbc_label_6);
		
		JLabel label_7 = new JLabel("8");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.insets = new Insets(0, 0, 0, 5);
		gbc_label_7.anchor = GridBagConstraints.NORTH;
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 9;
		panel_1.add(label_7, gbc_label_7);
		
		// Tries
		lblTc = new JLabel("");
		GridBagConstraints gbc_lblTc = new GridBagConstraints();
		gbc_lblTc.insets = new Insets(0, 0, 5, 5);
		gbc_lblTc.gridx = 4;
		gbc_lblTc.gridy = 2;
		panel_1.add(lblTc, gbc_lblTc);
		
		lblTc_1 = new JLabel("");
		GridBagConstraints gbc_lblTc_1 = new GridBagConstraints();
		gbc_lblTc_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTc_1.gridx = 4;
		gbc_lblTc_1.gridy = 3;
		panel_1.add(lblTc_1, gbc_lblTc_1);
		
		lblTc_2 = new JLabel("");
		GridBagConstraints gbc_lblTc_2 = new GridBagConstraints();
		gbc_lblTc_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblTc_2.gridx = 4;
		gbc_lblTc_2.gridy = 4;
		panel_1.add(lblTc_2, gbc_lblTc_2);
		
		lblTc_3 = new JLabel("");
		GridBagConstraints gbc_lblTc_3 = new GridBagConstraints();
		gbc_lblTc_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblTc_3.gridx = 4;
		gbc_lblTc_3.gridy = 5;
		panel_1.add(lblTc_3, gbc_lblTc_3);
		
		lblTc_4 = new JLabel("");
		GridBagConstraints gbc_lblTc_4 = new GridBagConstraints();
		gbc_lblTc_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblTc_4.gridx = 4;
		gbc_lblTc_4.gridy = 6;
		panel_1.add(lblTc_4, gbc_lblTc_4);
		
		lblTc_6 = new JLabel("");
		GridBagConstraints gbc_lblTc_6 = new GridBagConstraints();
		gbc_lblTc_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblTc_6.gridx = 4;
		gbc_lblTc_6.gridy = 7;
		panel_1.add(lblTc_6, gbc_lblTc_6);
		
		lblTc_7 = new JLabel("");
		GridBagConstraints gbc_lblTc_7 = new GridBagConstraints();
		gbc_lblTc_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblTc_7.gridx = 4;
		gbc_lblTc_7.gridy = 8;
		panel_1.add(lblTc_7, gbc_lblTc_7);
		
		lblTc_8 = new JLabel("");
		GridBagConstraints gbc_lblTc_8 = new GridBagConstraints();
		gbc_lblTc_8.insets = new Insets(0, 0, 0, 5);
		gbc_lblTc_8.gridx = 4;
		gbc_lblTc_8.gridy = 9;
		panel_1.add(lblTc_8, gbc_lblTc_8);
		
		// Voltage
		lblVc = new JLabel("");
		GridBagConstraints gbc_lblVc = new GridBagConstraints();
		gbc_lblVc.insets = new Insets(0, 0, 5, 0);
		gbc_lblVc.gridx = 7;
		gbc_lblVc.gridy = 2;
		panel_1.add(lblVc, gbc_lblVc);
		
		lblVc_1 = new JLabel("");
		GridBagConstraints gbc_lblVc_1 = new GridBagConstraints();
		gbc_lblVc_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblVc_1.gridx = 7;
		gbc_lblVc_1.gridy = 3;
		panel_1.add(lblVc_1, gbc_lblVc_1);	
		
		lblVc_2 = new JLabel("");
		GridBagConstraints gbc_lblVc_2 = new GridBagConstraints();
		gbc_lblVc_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblVc_2.gridx = 7;
		gbc_lblVc_2.gridy = 4;
		panel_1.add(lblVc_2, gbc_lblVc_2);
		
		lblVc_3 = new JLabel("");
		GridBagConstraints gbc_lblVc_3 = new GridBagConstraints();
		gbc_lblVc_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblVc_3.gridx = 7;
		gbc_lblVc_3.gridy = 5;
		panel_1.add(lblVc_3, gbc_lblVc_3);
		
		lblVc_4 = new JLabel("");
		GridBagConstraints gbc_lblVc_4 = new GridBagConstraints();
		gbc_lblVc_4.insets = new Insets(0, 0, 5, 0);
		gbc_lblVc_4.gridx = 7;
		gbc_lblVc_4.gridy = 6;
		panel_1.add(lblVc_4, gbc_lblVc_4);
		
		lblVc_5 = new JLabel("");
		GridBagConstraints gbc_lblVc_5 = new GridBagConstraints();
		gbc_lblVc_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblVc_5.gridx = 7;
		gbc_lblVc_5.gridy = 7;
		panel_1.add(lblVc_5, gbc_lblVc_5);
		
		lblVc_6 = new JLabel("");
		GridBagConstraints gbc_lblVc_6 = new GridBagConstraints();
		gbc_lblVc_6.insets = new Insets(0, 0, 5, 0);
		gbc_lblVc_6.gridx = 7;
		gbc_lblVc_6.gridy = 8;
		panel_1.add(lblVc_6, gbc_lblVc_6);
		
		lblVc_7 = new JLabel("");
		GridBagConstraints gbc_lblVc_7 = new GridBagConstraints();
		gbc_lblVc_7.gridx = 7;
		gbc_lblVc_7.gridy = 9;
		panel_1.add(lblVc_7, gbc_lblVc_7);
	}

	public void updateTransmissionTxt(int[] tries, int[] voltage) {
		lblTc.setText("" + String.valueOf(tries[0] + ""));
		lblTc_1.setText("" + String.valueOf(tries[1] + ""));
		lblTc_2.setText("" + String.valueOf(tries[2] + ""));
		lblTc_3.setText("" + String.valueOf(tries[3] + ""));
		lblTc_4.setText("" + String.valueOf(tries[4] + ""));
		lblTc_6.setText("" + String.valueOf(tries[5] + ""));
		lblTc_7.setText("" + String.valueOf(tries[6] + ""));
		lblTc_8.setText("" + String.valueOf(tries[7] + ""));
		
		float volt0 = voltage[0];
		volt0 = volt0/10;
		lblVc.setText("" + String.valueOf(volt0 + ""));
		
		float volt1 = voltage[1];
		volt1 = volt1/10;
		lblVc_1.setText("" + String.valueOf(volt1 + ""));
		
		float volt2 = voltage[2];
		volt2 = volt2/10;
		lblVc_2.setText("" + String.valueOf(volt2 + ""));
		
		float volt3 = voltage[3];
		volt3 = volt3/10;
		lblVc_3.setText("" + String.valueOf(volt3 + ""));
		
		float volt4 = voltage[4];
		volt4 = volt4/10;
		lblVc_4.setText("" + String.valueOf(volt4 + ""));
		
		float volt5 = voltage[5];
		volt5 = volt5/10;
		lblVc_5.setText("" + String.valueOf(volt5 + ""));
		
		float volt6 = voltage[6];
		volt6 = volt6/10;
		lblVc_6.setText("" + String.valueOf(volt6 + ""));
		
		float volt7 = voltage[7];
		volt7 = volt7/10;
		lblVc_7.setText("" + String.valueOf(volt7 + ""));
	}
}
