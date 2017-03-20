import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlayerFrame extends JFrame {


	public PlayerFrame (JPanel p) {
		final long serialversionUID = 1L;
		setSize(1000,900);
		setVisible(true);
		//setIconImage(Toolkit.getDefaultToolkit().getImage(ScorePlayerFrame.class.getResource("/resources/tcdtxt.png")));
		setTitle("Select Players");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().add(p, BorderLayout.CENTER);
		p.setVisible(true);
		getContentPane().add(p);
		
	}
}