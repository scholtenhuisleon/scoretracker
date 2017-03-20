
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScorePlayerFrame extends JFrame {


	public ScorePlayerFrame (JPanel p) {
		final long serialversionUID = 1L;
		setSize(1600,900);//1680,1050);
		setVisible(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ScorePlayerFrame.class.getResource("/resources/tcdtxt.png")));
		setResizable(false);
		setTitle("Tennis Live Score System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().add(p, BorderLayout.CENTER);
		p.setVisible(true);
		getContentPane().add(p);
		
	}
}