import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Dimension;
import net.miginfocom.swing.MigLayout;

public class ScorePlayerPanel extends JPanel {

	//Fields Categories
	private JLabel b1cat;
	private JLabel b2cat;
	private JLabel b3cat;
	private JLabel b4cat;
	private JLabel b5cat;
	private JLabel b6cat;
	private JLabel b7cat;
	private JLabel b8cat;
	
	//Fields player names
	private JLabel b1PLA;
	private JLabel b1PLB;
	private JLabel b2PLA;
	private JLabel b3PLA;
	private JLabel b4PLA;
	private JLabel b5PLA;
	private JLabel b6PLA;
	private JLabel b7PLA;
	private JLabel b8PLA;
	private JLabel b2PLB;
	private JLabel b3PLB;
	private JLabel b4PLB;
	private JLabel b5PLB;
	private JLabel b6PLB;
	private JLabel b7PLB;
	private JLabel b8PLB;
	
	//Fields Scores
	private JLabel b1SA;
	private JLabel b1SB;
	private JLabel b1GA;
	private JLabel b1GB;
	private JLabel b2SA;
	private JLabel b3SA;
	private JLabel b4SA;
	private JLabel b2SB;
	private JLabel b5SA;
	private JLabel b6SA;
	private JLabel b7SA;
	private JLabel b8SA;
	private JLabel b3SB;
	private JLabel b4SB;
	private JLabel b5SB;
	private JLabel b6SB;
	private JLabel b7SB;
	private JLabel b8SB;
	private JLabel b2GA;
	private JLabel b3GA;
	private JLabel b4GA;
	private JLabel b5GA;
	private JLabel b6GA;
	private JLabel b7GA;
	private JLabel b8GA;
	private JLabel b2GB;
	private JLabel b3GB;
	private JLabel b4GB;
	private JLabel b5GB;
	private JLabel b6GB;
	private JLabel b7GB;
	private JLabel b8GB;


	//Field label courts 
	private JLabel lblbaan1;
	private JLabel lblbaan2;
	private JLabel lblbaan3;
	private JLabel lblbaan4;
	private JLabel lblbaan5;
	private JLabel lblbaan6;
	private JLabel lblbaan7;
	private JLabel lblbaan8;

	
	//Field logos for each court
	private JLabel lbllogob1;
	private JLabel lbllogob2;
	private JLabel lbllogob3;
	private JLabel lbllogob4;
	private JLabel lbllogob5;
	private JLabel lbllogob6;
	private JLabel lbllogob7;
	private JLabel lbllogob8;

	private JLabel lblheadertext;
	private JLabel lblLogosponsor;
	private JLabel lbllogoclub;
	private JLabel lblLivescoretennisgmailcom;
	
	public ScorePlayerPanel(int[] gamesPlayer, int[] setsPlayer) {

		//General panel settings
		setBackground(new Color(18,60,28)); //0,80,0
		setOpaque(true);
		setSize(1600,900);//1680,1050);
		setLayout(new MigLayout("", "[5][:60px:60px][420px:n:440px][65px][65px][150px][5px:n][:60px:60px][420px:n:440px][65px][65px][150px][]", "[140.00px][55px][55px][55px][55px][55px][55px][55px][55px][55px][55px][55px]"));
		
				
		//headers
		
		lblheadertext = new JLabel("Rabobank Delden Open");
		lblheadertext.setForeground(Color.WHITE);
		lblheadertext.setHorizontalAlignment(SwingConstants.CENTER);
		lblheadertext.setFont(new Font("Arial Black", Font.PLAIN, 46));
		add(lblheadertext, "cell 3 0 6 1,alignx left");
		
		lblLogosponsor = new JLabel("");
		lblLogosponsor.setIcon(new ImageIcon(ScorePlayerPanel.class.getResource("/resources/logoclub.jpg")));
		add(lblLogosponsor, "cell 2 0,alignx center");
		
		lbllogoclub = new JLabel("");
		lbllogoclub.setIcon(new ImageIcon(ScorePlayerPanel.class.getResource("/resources/logoclub.jpg")));
		add(lbllogoclub, "cell 9 0 3 1");
		
		lblLivescoretennisgmailcom = new JLabel("livescoretennis@gmail.com");
		lblLivescoretennisgmailcom.setForeground(Color.WHITE);
		lblLivescoretennisgmailcom.setFont(new Font("Arial Black", Font.PLAIN, 22));
		add(lblLivescoretennisgmailcom, "cell 2 11");
		
		
		//Courts
		lblbaan1 = new JLabel("1.");
		lblbaan1.setForeground(Color.ORANGE);
		lblbaan1.setFont(new Font("Arial Black", Font.PLAIN, 60));
		add(lblbaan1, "cell 1 2,alignx center,aligny top");
		
		lblbaan2 = new JLabel("2.");
		lblbaan2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblbaan2.setForeground(Color.ORANGE);
		lblbaan2.setFont(new Font("Arial Black", Font.PLAIN, 60));
		add(lblbaan2, "cell 1 4,alignx center,aligny top");
		
		lblbaan3 = new JLabel("3.");
		lblbaan3.setForeground(Color.ORANGE);
		lblbaan3.setFont(new Font("Arial Black", Font.PLAIN, 60));
		add(lblbaan3, "cell 1 6,alignx center,aligny top");
		
		lblbaan4 = new JLabel("4.");
		lblbaan4.setForeground(Color.ORANGE);
		lblbaan4.setFont(new Font("Arial Black", Font.PLAIN, 60));
		add(lblbaan4, "cell 1 8,alignx center,aligny top");
		
		lblbaan5 = new JLabel("5.");
		lblbaan5.setForeground(Color.ORANGE);
		lblbaan5.setFont(new Font("Arial Black", Font.PLAIN, 60));
		add(lblbaan5, "cell 7 2,alignx center,aligny top");
		
		lblbaan6 = new JLabel("6.");
		lblbaan6.setForeground(Color.ORANGE);
		lblbaan6.setFont(new Font("Arial Black", Font.PLAIN, 60));
		add(lblbaan6, "cell 7 4,alignx center,aligny top");
		
		lblbaan7 = new JLabel("7.");
		lblbaan7.setForeground(Color.ORANGE);
		lblbaan7.setFont(new Font("Arial Black", Font.PLAIN, 60));
		add(lblbaan7, "cell 7 6,alignx center,aligny top");
		
		lblbaan8 = new JLabel("8.");
		lblbaan8.setForeground(Color.ORANGE);
		lblbaan8.setFont(new Font("Arial Black", Font.PLAIN, 60));
		add(lblbaan8, "cell 7 8,alignx center,aligny top");
		
		
		//Logos
		lbllogob1 = new JLabel("");
		lbllogob1.setIcon(new ImageIcon(ScorePlayerPanel.class.getResource("/resources/baan1small.jpg")));
		add(lbllogob1, "cell 5 2 1 2,alignx left,aligny center");
		
		lbllogob2 = new JLabel("");
		lbllogob2.setIcon(new ImageIcon(ScorePlayerPanel.class.getResource("/resources/baan2small.jpg")));
		add(lbllogob2, "cell 5 4 1 2,alignx left,aligny center");
		
		lbllogob3 = new JLabel("");
		lbllogob3.setIcon(new ImageIcon(ScorePlayerPanel.class.getResource("/resources/baan3small.jpg")));
		add(lbllogob3, "cell 5 6 1 2,alignx left,aligny center");
		
		lbllogob4 = new JLabel("");
		lbllogob4.setIcon(new ImageIcon(ScorePlayerPanel.class.getResource("/resources/baan4small.jpg")));
		add(lbllogob4, "cell 5 8 1 2,alignx left,aligny center");
		
		
		lbllogob5 = new JLabel("");
		lbllogob5.setHorizontalAlignment(SwingConstants.CENTER);
		lbllogob5.setIcon(new ImageIcon(ScorePlayerPanel.class.getResource("/resources/baan5small.jpg")));
		add(lbllogob5, "cell 11 2 1 2,alignx left,aligny center");
		
		lbllogob6 = new JLabel("");
		lbllogob6.setHorizontalAlignment(SwingConstants.LEFT);
		lbllogob6.setIcon(new ImageIcon(ScorePlayerPanel.class.getResource("/resources/baan6small.jpg")));
		add(lbllogob6, "cell 11 4 1 2,alignx left,aligny center");

		lbllogob7 = new JLabel("");
		lbllogob7.setHorizontalAlignment(SwingConstants.LEFT);
		lbllogob7.setIcon(new ImageIcon(ScorePlayerPanel.class.getResource("/resources/baan7small.jpg")));
		add(lbllogob7, "cell 11 6 1 2,alignx left,aligny center");

		lbllogob8 = new JLabel("");
		lbllogob8.setHorizontalAlignment(SwingConstants.LEFT);
		lbllogob8.setIcon(new ImageIcon(ScorePlayerPanel.class.getResource("/resources/baan8small.jpg")));
		add(lbllogob8, "cell 11 8 1 2,alignx left,aligny center");

		
		// Match Category & Type
		b1cat = new JLabel("Catinit");
		b1cat.setHorizontalAlignment(SwingConstants.RIGHT);
		b1cat.setForeground(Color.WHITE);
		b1cat.setFont(new Font("Arial Black", Font.PLAIN, 14));
		add(b1cat, "cell 1 3,alignx center,aligny top");
		
		b2cat = new JLabel("Catinit");
		b2cat.setHorizontalAlignment(SwingConstants.RIGHT);
		b2cat.setForeground(Color.WHITE);
		b2cat.setFont(new Font("Arial Black", Font.PLAIN, 14));
		add(b2cat, "cell 1 5,alignx center,aligny top");
		
		b3cat = new JLabel("Catinit");
		b3cat.setHorizontalAlignment(SwingConstants.RIGHT);
		b3cat.setForeground(Color.WHITE);
		b3cat.setFont(new Font("Arial Black", Font.PLAIN, 14));
		add(b3cat, "cell 1 7,alignx center,aligny top");
		
		b4cat = new JLabel("Catinit");
		b4cat.setHorizontalAlignment(SwingConstants.RIGHT);
		b4cat.setForeground(Color.WHITE);
		b4cat.setFont(new Font("Arial Black", Font.PLAIN, 14));
		add(b4cat, "cell 1 9,alignx center,aligny top");
		
		b5cat = new JLabel("Catinit");
		b5cat.setHorizontalAlignment(SwingConstants.RIGHT);
		b5cat.setForeground(Color.WHITE);
		b5cat.setFont(new Font("Arial Black", Font.PLAIN, 14));
		add(b5cat, "cell 7 3,alignx center,aligny top");
		
		b6cat = new JLabel("Catinit");
		b6cat.setHorizontalAlignment(SwingConstants.RIGHT);
		b6cat.setForeground(Color.WHITE);
		b6cat.setFont(new Font("Arial Black", Font.PLAIN, 14));
		add(b6cat, "cell 7 5,alignx center,aligny top");
		
		b7cat = new JLabel("Catinit");
		b7cat.setHorizontalAlignment(SwingConstants.RIGHT);
		b7cat.setForeground(Color.WHITE);
		b7cat.setFont(new Font("Arial Black", Font.PLAIN, 14));
		add(b7cat, "cell 7 7,alignx center,aligny top");
		
		b8cat = new JLabel("Catinit");
		b8cat.setHorizontalAlignment(SwingConstants.RIGHT);
		b8cat.setForeground(Color.WHITE);
		b8cat.setFont(new Font("Arial Black", Font.PLAIN, 14));
		add(b8cat, "cell 7 9,alignx center,aligny top");
				
	
		// Player Names
		b1PLA = new JLabel("");
		b1PLA.setFont(new Font("Arial Black", Font.PLAIN, 20));
		b1PLA.setForeground(Color.WHITE);
		add(b1PLA, "cell 2 2,alignx right,aligny center");
		
		b1PLB = new JLabel("");
		b1PLB.setFont(new Font("Arial Black", Font.PLAIN, 20));
		b1PLB.setForeground(Color.WHITE);
		add(b1PLB, "cell 2 3,alignx right,aligny center");

		b2PLA = new JLabel("");
		b2PLA.setForeground(Color.WHITE);
		b2PLA.setFont(new Font("Arial Black", Font.PLAIN, 20));
		add(b2PLA, "cell 2 4,alignx right,aligny center");
		
		b2PLB = new JLabel("");
		b2PLB.setForeground(Color.WHITE);
		b2PLB.setFont(new Font("Arial Black", Font.PLAIN, 20));
		add(b2PLB, "cell 2 5,alignx right,aligny center");
		
		b3PLA = new JLabel("");
		b3PLA.setForeground(Color.WHITE);
		b3PLA.setFont(new Font("Arial Black", Font.PLAIN, 20));
		add(b3PLA, "cell 2 6,alignx right,aligny center");
		
		b3PLB = new JLabel("");
		b3PLB.setForeground(Color.WHITE);
		b3PLB.setFont(new Font("Arial Black", Font.PLAIN, 20));
		add(b3PLB, "cell 2 7,alignx right,aligny center");
		
		b4PLA = new JLabel("");
		b4PLA.setForeground(Color.WHITE);
		b4PLA.setFont(new Font("Arial Black", Font.PLAIN, 20));
		add(b4PLA, "cell 2 8,alignx right,aligny center");
		
		b4PLB = new JLabel("");
		b4PLB.setForeground(Color.WHITE);
		b4PLB.setFont(new Font("Arial Black", Font.PLAIN, 20));
		add(b4PLB, "cell 2 9,alignx right,aligny center");
		
		b5PLA = new JLabel("");
		b5PLA.setForeground(Color.WHITE);
		b5PLA.setFont(new Font("Arial Black", Font.PLAIN, 20));
		add(b5PLA, "cell 8 2,alignx right,aligny center");
		
		b5PLB = new JLabel("");
		b5PLB.setForeground(Color.WHITE);
		b5PLB.setFont(new Font("Arial Black", Font.PLAIN, 20));
		add(b5PLB, "cell 8 3,alignx right,aligny center");
		
		b6PLA = new JLabel("");
		b6PLA.setForeground(Color.WHITE);
		b6PLA.setFont(new Font("Arial Black", Font.PLAIN, 20));
		add(b6PLA, "cell 8 4,alignx right,aligny center");
	
		b6PLB = new JLabel("");
		b6PLB.setForeground(Color.WHITE);
		b6PLB.setFont(new Font("Arial Black", Font.PLAIN, 20));
		add(b6PLB, "cell 8 5,alignx right,aligny center");
		
		b7PLA = new JLabel("");
		b7PLA.setForeground(Color.WHITE);
		b7PLA.setFont(new Font("Arial Black", Font.PLAIN, 20));
		add(b7PLA, "cell 8 6,alignx right,aligny center");
		
		b7PLB = new JLabel("");
		b7PLB.setForeground(Color.WHITE);
		b7PLB.setFont(new Font("Arial Black", Font.PLAIN, 20));
		add(b7PLB, "cell 8 7,alignx right,aligny center");
		
		b8PLA = new JLabel("");
		b8PLA.setForeground(Color.WHITE);
		b8PLA.setFont(new Font("Arial Black", Font.PLAIN, 20));
		add(b8PLA, "cell 8 8,alignx right,aligny center");
		
		b8PLB = new JLabel("");
		b8PLB.setForeground(Color.WHITE);
		b8PLB.setFont(new Font("Arial Black", Font.PLAIN, 20));
		add(b8PLB, "cell 8 9,alignx right,aligny center");
				
		
		// Set and Game Scores
		b1SA = new JLabel("-");
		b1SA.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		b1SA.setFont(new Font("Arial Black", Font.PLAIN, 40));
		b1SA.setForeground(Color.WHITE);
		add(b1SA, "cell 3 2,alignx center,aligny center");

		b1SB = new JLabel("-");
		b1SB.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		b1SB.setFont(new Font("Arial Black", Font.PLAIN, 40));
		b1SB.setForeground(Color.WHITE);
		add(b1SB, "cell 3 3,alignx center,aligny center");

		b1GA = new JLabel("-");
		b1GA.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 255, 0)));
		b1GA.setFont(new Font("Arial Black", Font.PLAIN, 40));
		b1GA.setForeground(Color.WHITE);
		add(b1GA, "cell 4 2,alignx center,aligny center");

		b1GB = new JLabel("-");
		b1GB.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 255, 0)));
		b1GB.setFont(new Font("Arial Black", Font.PLAIN, 40));
		b1GB.setForeground(Color.WHITE);
		add(b1GB, "cell 4 3,alignx center,aligny center");
		
		b2SA = new JLabel("-");
		b2SA.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		b2SA.setForeground(Color.WHITE);
		b2SA.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b2SA, "cell 3 4,alignx center,aligny center");
		
		b2SB = new JLabel("-");
		b2SB.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		b2SB.setForeground(Color.WHITE);
		b2SB.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b2SB, "cell 3 5,alignx center,aligny center");b2GA = new JLabel("-");
		
		b2GA.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.YELLOW));
		b2GA.setForeground(Color.WHITE);
		b2GA.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b2GA, "cell 4 4,alignx center,aligny center");
			
		b2GB = new JLabel("-");
		b2GB.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.YELLOW));
		b2GB.setForeground(Color.WHITE);
		b2GB.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b2GB, "cell 4 5,alignx center,aligny center");
		
		b3SA = new JLabel("-");
		b3SA.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		b3SA.setForeground(Color.WHITE);
		b3SA.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b3SA, "cell 3 6,alignx center,aligny center");
		
		b3SB = new JLabel("-");
		b3SB.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		b3SB.setForeground(Color.WHITE);
		b3SB.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b3SB, "cell 3 7,alignx center,aligny center");
		
		b3GA = new JLabel("-");
		b3GA.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.YELLOW));
		b3GA.setForeground(Color.WHITE);
		b3GA.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b3GA, "cell 4 6,alignx center,aligny center");
				
		b3GB = new JLabel("-");
		b3GB.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.YELLOW));
		b3GB.setForeground(Color.WHITE);
		b3GB.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b3GB, "cell 4 7,alignx center,aligny center");
		
		b4SA = new JLabel("-");
		b4SA.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		b4SA.setForeground(Color.WHITE);
		b4SA.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b4SA, "cell 3 8,alignx center,aligny center");
		
		b4SB = new JLabel("-");
		b4SB.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		b4SB.setForeground(Color.WHITE);
		b4SB.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b4SB, "cell 3 9,alignx center,aligny center");
		
		b4GA = new JLabel("-");
		b4GA.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.YELLOW));
		b4GA.setForeground(Color.WHITE);
		b4GA.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b4GA, "cell 4 8,alignx center,aligny center");
				
		b4GB = new JLabel("-");
		b4GB.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.YELLOW));
		b4GB.setForeground(Color.WHITE);
		b4GB.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b4GB, "cell 4 9,alignx center,aligny center");

		b5SA = new JLabel("-");
		b5SA.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		b5SA.setForeground(Color.WHITE);
		b5SA.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b5SA, "cell 9 2,alignx center,aligny center");
		
		b5SB = new JLabel("-");
		b5SB.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		b5SB.setForeground(Color.WHITE);
		b5SB.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b5SB, "cell 9 3,alignx center,aligny center");
		
		b5GA = new JLabel("-");
		b5GA.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.YELLOW));
		b5GA.setForeground(Color.WHITE);
		b5GA.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b5GA, "cell 10 2,alignx center,aligny center");
		
		b5GB = new JLabel("-");
		b5GB.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.YELLOW));
		b5GB.setForeground(Color.WHITE);
		b5GB.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b5GB, "cell 10 3,alignx center,aligny center");
		
		b6SA = new JLabel("-");
		b6SA.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		b6SA.setForeground(Color.WHITE);
		b6SA.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b6SA, "cell 9 4,alignx center,aligny center");
		
		b6SB = new JLabel("-");
		b6SB.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		b6SB.setForeground(Color.WHITE);
		b6SB.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b6SB, "cell 9 5,alignx center,aligny center");
		
		b6GA = new JLabel("-");
		b6GA.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.YELLOW));
		b6GA.setForeground(Color.WHITE);
		b6GA.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b6GA, "cell 10 4,alignx center,aligny center");
		
		b6GB = new JLabel("-");
		b6GB.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.YELLOW));
		b6GB.setForeground(Color.WHITE);
		b6GB.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b6GB, "cell 10 5,alignx center,aligny center");
		
		b7SA = new JLabel("-");
		b7SA.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		b7SA.setForeground(Color.WHITE);
		b7SA.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b7SA, "cell 9 6,alignx center,aligny center");
		
		b7SB = new JLabel("-");
		b7SB.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		b7SB.setForeground(Color.WHITE);
		b7SB.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b7SB, "cell 9 7,alignx center,aligny center");
		
		b7GA = new JLabel("-");
		b7GA.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.YELLOW));
		b7GA.setForeground(Color.WHITE);
		b7GA.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b7GA, "cell 10 6,alignx center,aligny center");
		
		b7GB = new JLabel("-");
		b7GB.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.YELLOW));
		b7GB.setForeground(Color.WHITE);
		b7GB.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b7GB, "cell 10 7,alignx center,aligny center");
		
		b8SA = new JLabel("-");
		b8SA.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		b8SA.setForeground(Color.WHITE);
		b8SA.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b8SA, "cell 9 8,alignx center,aligny center");
		
		b8SB = new JLabel("-");
		b8SB.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		b8SB.setForeground(Color.WHITE);
		b8SB.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b8SB, "cell 9 9,alignx center,aligny center");
		
		b8GA = new JLabel("-");
		b8GA.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.YELLOW));
		b8GA.setForeground(Color.WHITE);
		b8GA.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b8GA, "cell 10 8,alignx center,aligny center");
		
		b8GB = new JLabel("-");
		b8GB.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.YELLOW));
		b8GB.setForeground(Color.WHITE);
		b8GB.setFont(new Font("Arial Black", Font.PLAIN, 40));
		add(b8GB, "cell 10 9,alignx center,aligny center");
		
		
		// Select Player Button
		JButton btnSelectPlayer = new JButton("Select Players");
		btnSelectPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comCheck.pf = new PlayerFrame(new JPanel());
				comCheck.pp = new PlayerSelectionPanel();
				comCheck.pf.getContentPane().add(comCheck.pp);
				
			}
			
		});
		add(btnSelectPlayer, "cell 11 11,alignx center,aligny center");
			}

	public void updatePlayerText() {
		b1PLA.setText(PlayerSelectionPanel.cbox1Player1 + " "); 
		b1PLB.setText(PlayerSelectionPanel.cbox1Player2 + " "); 
		b1cat.setText(PlayerSelectionPanel.catbox1 + " "); 
		
		b2PLA.setText(PlayerSelectionPanel.cbox2Player1 + " "); 
		b2PLB.setText(PlayerSelectionPanel.cbox2Player2 + " "); 
		b2cat.setText(PlayerSelectionPanel.catbox2 + " "); 
		
		b3PLA.setText(PlayerSelectionPanel.cbox3Player1 + " "); 
		b3PLB.setText(PlayerSelectionPanel.cbox3Player2 + " "); 
		b3cat.setText(PlayerSelectionPanel.catbox3 + " "); 
		
		b4PLA.setText(PlayerSelectionPanel.cbox4Player1 + " "); 
		b4PLB.setText(PlayerSelectionPanel.cbox4Player2 + " "); 
		b4cat.setText(PlayerSelectionPanel.catbox4 + " "); 
		
		b5PLA.setText(PlayerSelectionPanel.cbox5Player1 + " "); 
		b5PLB.setText(PlayerSelectionPanel.cbox5Player2 + " "); 
		b5cat.setText(PlayerSelectionPanel.catbox5 + " "); 
		
		b6PLA.setText(PlayerSelectionPanel.cbox6Player1 + " "); 
		b6PLB.setText(PlayerSelectionPanel.cbox6Player2 + " "); 
		b6cat.setText(PlayerSelectionPanel.catbox6 + " "); 
		
		b7PLA.setText(PlayerSelectionPanel.cbox7Player1 + " "); 
		b7PLB.setText(PlayerSelectionPanel.cbox7Player2 + " "); 
		b7cat.setText(PlayerSelectionPanel.catbox7 + " ");
		
		b8PLA.setText(PlayerSelectionPanel.cbox8Player1 + " "); 
		b8PLB.setText(PlayerSelectionPanel.cbox8Player2 + " "); 
		b8cat.setText(PlayerSelectionPanel.catbox8 + " "); 
		
		
	}
		
		public void updateTxt(int[] games, int[] sets) {
			
				//court 8 
					b8SA.setText(" " + String.valueOf(sets[14]) + " ");
					b8SB.setText(" " + String.valueOf(sets[15])+ " ");
					b8GA.setText(" " + String.valueOf(games[14])+ " "); 
					b8GB.setText(" " + String.valueOf(games[15])+ " ");
						
				//court 7
					b7SA.setText(" " + String.valueOf(sets[12])+ " ");
					b7SB.setText(" " + String.valueOf(sets[13])+ " ");
					b7GA.setText(" " + String.valueOf(games[12])+ " ");
					b7GB.setText(" " + String.valueOf(games[13])+ " ");
						
				//court 6
					b6SA.setText(" " + String.valueOf(sets[10])+ " ");
					b6SB.setText(" " + String.valueOf(sets[11])+ " ");
					b6GA.setText(" " + String.valueOf(games[10])+ " ");
					b6GB.setText(" " + String.valueOf(games[11])+ " ");
					
				//court 5: 
					b5SA.setText(" " + String.valueOf(sets[8])+ " ");
					b5SB.setText(" " + String.valueOf(sets[9])+ " ");
					b5GA.setText(" " + String.valueOf(games[8])+ " ");
					b5GB.setText(" " + String.valueOf(games[9])+ " ");
					
				//court 4	
					b4SA.setText(" " + String.valueOf(sets[6])+ " ");
					b4SB.setText(" " + String.valueOf(sets[7])+ " ");
					b4GA.setText(" " + String.valueOf(games[6])+ " ");
					b4GB.setText(" " + String.valueOf(games[7])+ " ");
				
				//court 3
					b3SA.setText(" " + String.valueOf(sets[4])+ " ");
					b3SB.setText(" " + String.valueOf(sets[5])+ " ");
					b3GA.setText(" " + String.valueOf(games[4])+ " ");
					b3GB.setText(" " + String.valueOf(games[5])+ " ");
						
				//court 2
					b2SA.setText(" " + String.valueOf(sets[2])+ " ");
					b2SB.setText(" " + String.valueOf(sets[3])+ " ");
					b2GA.setText(" " + String.valueOf(games[2])+ " ");
					b2GB.setText(" " + String.valueOf(games[3])+ " ");
						
				//court 1		
					b1SA.setText(" " + String.valueOf(sets[0])+ " ");
					b1SB.setText(" " + String.valueOf(sets[1])+ " ");
					b1GA.setText(" " + String.valueOf(games[0])+ " ");
					b1GB.setText(" " + String.valueOf(games[1])+ " ");
					
			}
	
	

//	public static void main(String[] args) {
//		//XMLReader xmlr = new XMLReader();
//		//xmlr.XMLReader();
//		
//		ExcelReader xlsr = new ExcelReader();
//		
//		try {
//			xlsr.ExcelReader();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		
//		//spf = new ScorePlayerFrame(new JPanel());
//		//spp = new ScorePlayerPanel(null, null);
//		//spf.getContentPane().add(spp);
//		
//		spp = new ScorePlayerPanel(null, null);
//		spf = new ScorePlayerFrame(spp);
//		
//
//	}

}