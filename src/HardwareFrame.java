import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HardwareFrame extends JFrame {

	public HardwareFrame(JPanel p) {
		final long serialversionUID = 1L;
		setSize(300, 300);
		setVisible(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(comCheck.class.getResource("/resources/tcdtxt.png")));
		setResizable(false);
		setTitle(" Transmission Info ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		getContentPane().add(p, BorderLayout.CENTER);
		p.setVisible(true);
		getContentPane().add(p);
		
	}
}
