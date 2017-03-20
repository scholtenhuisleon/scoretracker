import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

import jssc.SerialPort;
import jssc.SerialPortList;

public class comCheck {
//
	public static int games[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	public static int sets[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	public static int tries[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	public static int voltage[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	
	public static String s; //com port 
	
	public static PlayerFrame pf;
	public static PlayerSelectionPanel pp;
	public static ScorePlayerFrame sf0;
	public static ScorePlayerPanel sp; 
	public static HardwareFrame hf;
	public static HardwarePanel hp; 
	
	public static SerialPort serialPort;
	public static byte[] buffer;
	public static byte[] a;
	public static int caseCounter;
	public static byte validDataArray[] = new byte[5];
	
	public static int[] gamesPlayer = new int[16];
	public static int[] setsPlayer = new int[16];
	public static int[] triesBaan = new int[8];
	public static int[] voltageCourt = new int[8];
	

	public String[] comlist() {

		// Method getPortNames() returns an array of strings.
		String[] portNames = SerialPortList.getPortNames();
		for (int i = 0; i < portNames.length; i++) {
			System.out.println(portNames[i] + " available");
		}
		return portNames;
	}

	// creates swing objects
	JButton select = new JButton("Select");
	JComboBox cbox = new JComboBox(this.comlist());
	private final JLabel photo_tcd = new JLabel("");
	
	

	// builds frame
	public comCheck() {
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout(0, 0));
		p.add(cbox, BorderLayout.CENTER);
		p.add(select, BorderLayout.LINE_END);
		photo_tcd.setHorizontalAlignment(SwingConstants.CENTER);
		photo_tcd.setIcon(new ImageIcon(comCheck.class
				.getResource("/resources/TCD-LOGO-FC.png")));
		p.add(photo_tcd, BorderLayout.NORTH);

		
		final JFrame f = new JFrame();
		f.getContentPane().add(p);
		f.setVisible(true);
		f.setAlwaysOnTop(true);
		f.setSize(450, 180);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setIconImage(Toolkit.getDefaultToolkit().getImage(
				comCheck.class.getResource("/resources/tcdtxt.png")));
		f.setTitle("Select COM port");

	
		select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s = cbox.getSelectedItem().toString();
				System.out.println(s + " selected");
				f.setVisible(false); // closes screen

				// receive processed data from COM port
				PortReader r = new PortReader();
				r.reader(s);
			}
		});
	}

	public static void main(String[] args) {

			ExcelReader xlsr = new ExcelReader();
			
			try {
				xlsr.ExcelReader();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		new comCheck();
		
		ThreadDemo T1 = new ThreadDemo("Thread-1");
		T1.start();
		
	}

}
