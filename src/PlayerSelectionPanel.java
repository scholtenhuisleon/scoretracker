import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Choice;
import java.awt.Insets;
import java.awt.Panel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTextField;
import java.awt.Font;

public class PlayerSelectionPanel extends JPanel {

	// fields for comboboxes 
	private JComboBox cbox1;
	private JComboBox cbox2;
	private JComboBox cbox3;
	private JComboBox cbox4;
	private JComboBox cbox5;
	private JComboBox cbox6;
	private JComboBox cbox7;
	private JComboBox cbox8;
	
	// fields for selected items in comboboxes
	public static String cbox1Player1 = "";
	public static String cbox1Player2 = "";
	public static String cbox2Player1 = "";
	public static String cbox2Player2 = "";
	public static String cbox3Player1 = "";
	public static String cbox3Player2 = "";
	public static String cbox4Player1 = "";
	public static String cbox4Player2 = "";
	public static String cbox5Player1 = "";
	public static String cbox5Player2 = "";
	public static String cbox6Player1 = "";
	public static String cbox6Player2 = "";
	public static String cbox7Player1 = "";
	public static String cbox7Player2 = "";
	public static String cbox8Player1 = "";
	public static String cbox8Player2 = "";
	public static String catbox1 = "";
	public static String catbox2 = "";
	public static String catbox3 = "";
	public static String catbox4 = "";
	public static String catbox5 = "";
	public static String catbox6 = "";
	public static String catbox7 = "";
	public static String catbox8 = "";

	
	private JLabel ManualExplain;
	private JTextField textFieldA;
	private JTextField textFieldB;
	private JTextField textFieldCat;
	private JLabel importExplain;
	private JLabel lblOf;

	
	
	
	public PlayerSelectionPanel() {

		// general panel settings
		setBackground(Color.LIGHT_GRAY);
		setOpaque(true);
		setSize(1000, 900);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 100, 500, 100 }; 
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 0.0 };
		setLayout(gridBagLayout);
		
		importExplain = new JLabel("Selecteer speler uit bestand (selecteren en venster sluiten)");
		importExplain.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblGemporteerdeSpelersSelecteren = new GridBagConstraints();
		gbc_lblGemporteerdeSpelersSelecteren.insets = new Insets(0, 0, 5, 5);
		gbc_lblGemporteerdeSpelersSelecteren.gridx = 1;
		gbc_lblGemporteerdeSpelersSelecteren.gridy = 0;
		add(importExplain, gbc_lblGemporteerdeSpelersSelecteren);

		// court labels
		JLabel lblBaan = new JLabel("Baan 1");
		GridBagConstraints gbc_lblBaan = new GridBagConstraints();
		gbc_lblBaan.anchor = GridBagConstraints.EAST;
		gbc_lblBaan.insets = new Insets(0, 0, 5, 5);
		gbc_lblBaan.gridx = 0;
		gbc_lblBaan.gridy = 1;
		add(lblBaan, gbc_lblBaan);
		
		JLabel lblBaan2 = new JLabel("Baan 2");
		GridBagConstraints gbc_lblBaan2 = new GridBagConstraints();
		gbc_lblBaan2.anchor = GridBagConstraints.EAST;
		gbc_lblBaan2.insets = new Insets(0, 0, 5, 5);
		gbc_lblBaan2.gridx = 0;
		gbc_lblBaan2.gridy = 3;
		add(lblBaan2, gbc_lblBaan2);

		JLabel lblBaan3 = new JLabel("Baan 3");
		GridBagConstraints gbc_lblBaan3 = new GridBagConstraints();
		gbc_lblBaan3.anchor = GridBagConstraints.EAST;
		gbc_lblBaan3.insets = new Insets(0, 0, 5, 5);
		gbc_lblBaan3.gridx = 0;
		gbc_lblBaan3.gridy = 5;
		add(lblBaan3, gbc_lblBaan3);

		JLabel lblBaan4 = new JLabel("Baan 4");
		GridBagConstraints gbc_lblBaan4 = new GridBagConstraints();
		gbc_lblBaan4.anchor = GridBagConstraints.EAST;
		gbc_lblBaan4.insets = new Insets(0, 0, 5, 5);
		gbc_lblBaan4.gridx = 0;
		gbc_lblBaan4.gridy = 7;
		add(lblBaan4, gbc_lblBaan4);

		JLabel lblBaan5 = new JLabel("Baan 5");
		GridBagConstraints gbc_lblBaan5 = new GridBagConstraints();
		gbc_lblBaan5.anchor = GridBagConstraints.EAST;
		gbc_lblBaan5.insets = new Insets(0, 0, 5, 5);
		gbc_lblBaan5.gridx = 0;
		gbc_lblBaan5.gridy = 11;
		add(lblBaan5, gbc_lblBaan5);

		JLabel lblBaan6 = new JLabel("Baan 6");
		GridBagConstraints gbc_lblBaan6 = new GridBagConstraints();
		gbc_lblBaan6.anchor = GridBagConstraints.EAST;
		gbc_lblBaan6.insets = new Insets(0, 0, 5, 5);
		gbc_lblBaan6.gridx = 0;
		gbc_lblBaan6.gridy = 13;
		add(lblBaan6, gbc_lblBaan6);

		JLabel lblBaan7 = new JLabel("Baan 7");
		GridBagConstraints gbc_lblBaan7 = new GridBagConstraints();
		gbc_lblBaan7.anchor = GridBagConstraints.EAST;
		gbc_lblBaan7.insets = new Insets(0, 0, 5, 5);
		gbc_lblBaan7.gridx = 0;
		gbc_lblBaan7.gridy = 15;
		add(lblBaan7, gbc_lblBaan7);
		
		JLabel lblBaan8 = new JLabel("Baan 8");
		GridBagConstraints gbc_lblBaan8 = new GridBagConstraints();
		gbc_lblBaan8.anchor = GridBagConstraints.EAST;
		gbc_lblBaan8.insets = new Insets(0, 0, 5, 5);
		gbc_lblBaan8.gridx = 0;
		gbc_lblBaan8.gridy = 17;
		add(lblBaan8, gbc_lblBaan8);
		
		 lblOf = new JLabel("OF");
		 lblOf.setFont(new Font("Tahoma", Font.BOLD, 18));
		 GridBagConstraints gbc_lblOf = new GridBagConstraints();
		 gbc_lblOf.insets = new Insets(0, 0, 5, 5);
		 gbc_lblOf.gridx = 1;
		 gbc_lblOf.gridy = 21;
		 add(lblOf, gbc_lblOf);
		
		// initialize comboboxes
		cbox1 = new JComboBox<String>();
		cbox1.setModel(new DefaultComboBoxModel<>(importedarrays()));//importedteam1toarray()));
		cbox1.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent arg0) {
						JComboBox<String> cbox1 = (JComboBox<String>) arg0.getSource();
						int indexbox1 = cbox1.getSelectedIndex();
						cbox1Player1 = importedteam1toarray()[indexbox1];
						System.out.println(cbox1Player1 + " plays on Baan 1 - HOME TEAM" );
						cbox1Player2 = importedteam2toarray()[indexbox1];
						System.out.println(cbox1Player2 + " plays on Baan 1 - AWAY TEAM" );
						catbox1 = importedcattoarray()[indexbox1];
						System.out.println(catbox1 + " is selected category" );
						comCheck.sp.updatePlayerText();
						comCheck.sp.repaint();
						}
				}
				);
		
		GridBagConstraints gbc_cbox1 = new GridBagConstraints();
		gbc_cbox1.insets = new Insets(0, 0, 5, 5);
		gbc_cbox1.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbox1.gridx = 1;
		gbc_cbox1.gridy = 1;
		add(cbox1, gbc_cbox1);
		
		cbox2 = new JComboBox<String>();
		cbox2.setModel(new DefaultComboBoxModel<>(importedarrays()));
		cbox2.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent arg0) {
						JComboBox<String> cbox2 = (JComboBox<String>) arg0.getSource();
						int indexbox2 = cbox2.getSelectedIndex();
						cbox2Player1 = importedteam1toarray()[indexbox2];
						System.out.println(cbox2Player1 + " plays on Baan 2 - HOME TEAM" );
						cbox2Player2 = importedteam2toarray()[indexbox2];
						System.out.println(cbox2Player2 + " plays on Baan 2 - AWAY TEAM" );
						catbox2 = importedcattoarray()[indexbox2];
						System.out.println(catbox2 + " is selected category" );
						comCheck.sp.updatePlayerText();
						comCheck.sp.repaint();
						}
				}
				);
		
		GridBagConstraints gbc_cbox2 = new GridBagConstraints();
		gbc_cbox2.insets = new Insets(0, 0, 5, 5);
		gbc_cbox2.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbox2.gridx = 1;
		gbc_cbox2.gridy = 3;
		add(cbox2, gbc_cbox2);
		
		cbox3 = new JComboBox<String>();
		cbox3.setModel(new DefaultComboBoxModel<>(importedarrays()));
		cbox3.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent arg0) {
						JComboBox<String> cbox3 = (JComboBox<String>) arg0.getSource();
						int indexbox3 = cbox3.getSelectedIndex();
						cbox3Player1 = importedteam1toarray()[indexbox3];
						System.out.println(cbox3Player1 + " plays on Baan 3 - HOME TEAM" );
						cbox3Player2 = importedteam2toarray()[indexbox3];
						System.out.println(cbox3Player2 + " plays on Baan 3 - AWAY TEAM" );
						catbox3 = importedcattoarray()[indexbox3];
						System.out.println(catbox3 + " is selected category" );
						comCheck.sp.updatePlayerText();
						comCheck.sp.repaint();
						}
				}
				);
		
		GridBagConstraints gbc_cbox3 = new GridBagConstraints();
		gbc_cbox3.insets = new Insets(0, 0, 5, 5);
		gbc_cbox3.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbox3.gridx = 1;
		gbc_cbox3.gridy = 5;
		add(cbox3, gbc_cbox3);
		
		cbox4 = new JComboBox<String>();
		cbox4.setModel(new DefaultComboBoxModel<>(importedarrays()));
		cbox4.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent arg0) {
						JComboBox<String> cbox4 = (JComboBox<String>) arg0.getSource();
						int indexbox4 = cbox4.getSelectedIndex();
						cbox4Player1 = importedteam1toarray()[indexbox4];
						System.out.println(cbox4Player1 + " plays on Baan 4 - HOME TEAM" );
						cbox4Player2 = importedteam2toarray()[indexbox4];
						System.out.println(cbox4Player2 + " plays on Baan 4 - AWAY TEAM" );
						catbox4 = importedcattoarray()[indexbox4];
						System.out.println(catbox4 + " is selected category" );
						comCheck.sp.updatePlayerText();
						comCheck.sp.repaint();
						}
				}
				);
		
		GridBagConstraints gbc_cbox4 = new GridBagConstraints();
		gbc_cbox4.insets = new Insets(0, 0, 5, 5);
		gbc_cbox4.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbox4.gridx = 1;
		gbc_cbox4.gridy = 7;
		add(cbox4, gbc_cbox4);
		
		cbox5 = new JComboBox<String>();
		cbox5.setModel(new DefaultComboBoxModel<>(importedarrays()));
		cbox5.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent arg0) {
						JComboBox<String> cbox5 = (JComboBox<String>) arg0.getSource();
						int indexbox5 = cbox5.getSelectedIndex();
						cbox5Player1 = importedteam1toarray()[indexbox5];
						System.out.println(cbox5Player1 + " plays on Baan 5 - HOME TEAM" );
						cbox5Player2 = importedteam2toarray()[indexbox5];
						System.out.println(cbox5Player2 + " plays on Baan 5 - AWAY TEAM" );
						catbox5 = importedcattoarray()[indexbox5];
						System.out.println(catbox5 + " is selected category" );
						comCheck.sp.updatePlayerText();
						comCheck.sp.repaint();
						}
				}
				);
		
		GridBagConstraints gbc_cbox5 = new GridBagConstraints();
		gbc_cbox5.insets = new Insets(0, 0, 6, 6);
		gbc_cbox5.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbox5.gridx = 1;
		gbc_cbox5.gridy = 11;
		add(cbox5, gbc_cbox5);
		
		cbox6 = new JComboBox<String>();
		cbox6.setModel(new DefaultComboBoxModel<>(importedarrays()));
		cbox6.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent arg0) {
						JComboBox<String> cbox6 = (JComboBox<String>) arg0.getSource();
						int indexbox6 = cbox6.getSelectedIndex();
						cbox6Player1 = importedteam1toarray()[indexbox6];
						System.out.println(cbox6Player1 + " plays on Baan 6 - HOME TEAM" );
						cbox6Player2 = importedteam2toarray()[indexbox6];
						System.out.println(cbox6Player2 + " plays on Baan 6 - AWAY TEAM" );
						catbox6 = importedcattoarray()[indexbox6];
						System.out.println(catbox6 + " is selected category" );
						comCheck.sp.updatePlayerText();
						comCheck.sp.repaint();
						}
				}
				);
		
		GridBagConstraints gbc_cbox6 = new GridBagConstraints();
		gbc_cbox6.insets = new Insets(0, 0, 7, 7);
		gbc_cbox6.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbox6.gridx = 1;
		gbc_cbox6.gridy = 13;
		add(cbox6, gbc_cbox6);

		cbox7 = new JComboBox<String>();
		cbox7.setModel(new DefaultComboBoxModel<>(importedarrays()));
		cbox7.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent arg0) {
						JComboBox<String> cbox7 = (JComboBox<String>) arg0.getSource();
						int indexbox7 = cbox7.getSelectedIndex();
						cbox7Player1 = importedteam1toarray()[indexbox7];
						System.out.println(cbox7Player1 + " plays on Baan 7 - HOME TEAM" );
						cbox7Player2 = importedteam2toarray()[indexbox7];
						System.out.println(cbox7Player2 + " plays on Baan 7 - AWAY TEAM" );
						catbox7 = importedcattoarray()[indexbox7];
						System.out.println(catbox7 + " is selected category" );
						comCheck.sp.updatePlayerText();
						comCheck.sp.repaint();
						}
				}
				);
		
		GridBagConstraints gbc_cbox7 = new GridBagConstraints();
		gbc_cbox7.insets = new Insets(0, 0, 8, 8);
		gbc_cbox7.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbox7.gridx = 1;
		gbc_cbox7.gridy = 15;
		add(cbox7, gbc_cbox7);
		
		cbox8 = new JComboBox<String>();
		cbox8.setModel(new DefaultComboBoxModel<>(importedarrays()));
		cbox8.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent arg0) {
						JComboBox<String> cbox8 = (JComboBox<String>) arg0.getSource();
						int indexbox8 = cbox8.getSelectedIndex();
						cbox8Player1 = importedteam1toarray()[indexbox8];
						System.out.println(cbox8Player1 + " plays on Baan 8 - HOME TEAM" );
						cbox8Player2 = importedteam2toarray()[indexbox8];
						System.out.println(cbox8Player2 + " plays on Baan 8 - AWAY TEAM" );
						catbox8 = importedcattoarray()[indexbox8];
						System.out.println(catbox8 + " is selected category" );
						comCheck.sp.updatePlayerText();
						comCheck.sp.repaint();
						}
				}
				);
		
		GridBagConstraints gbc_cbox8 = new GridBagConstraints();
		gbc_cbox8.insets = new Insets(0, 0, 5, 5);
		gbc_cbox8.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbox8.gridx = 1;
		gbc_cbox8.gridy = 17;
		add(cbox8, gbc_cbox8);
		
		// close button
		 JButton CloseButton = new JButton("Close");
		 CloseButton.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent arg0) {
			 comCheck.pf.dispose();
		 }
		 });
		 
		 GridBagConstraints gbc_btnApplyButton = new GridBagConstraints();
		 gbc_btnApplyButton.gridx = 2;
		 gbc_btnApplyButton.gridy = 31;
		 add(CloseButton, gbc_btnApplyButton);
		 
		 
		 // Manual input
		 
		 ManualExplain = new JLabel("Voeg handmatig toe (vul velden in en selecteer een baan)");
		 ManualExplain.setFont(new Font("Tahoma", Font.BOLD, 14));
		 GridBagConstraints gbc_lblHandmatigInvullenvul = new GridBagConstraints();
		 gbc_lblHandmatigInvullenvul.insets = new Insets(0, 0, 5, 5);
		 gbc_lblHandmatigInvullenvul.gridx = 1;
		 gbc_lblHandmatigInvullenvul.gridy = 23;
		 add(ManualExplain, gbc_lblHandmatigInvullenvul);
		 
		 textFieldA = new JTextField("Speler A");
		 GridBagConstraints gbc_textFieldA = new GridBagConstraints();
		 gbc_textFieldA.insets = new Insets(0, 0, 5, 5);
		 gbc_textFieldA.fill = GridBagConstraints.HORIZONTAL;
		 gbc_textFieldA.gridx = 1;
		 gbc_textFieldA.gridy = 24;
		 add(textFieldA, gbc_textFieldA);
		 //textFieldA.setColumns(10);
		 
		 textFieldB = new JTextField("Speler B");
		 GridBagConstraints gbc_textFieldB = new GridBagConstraints();
		 gbc_textFieldB.insets = new Insets(0, 0, 5, 5);
		 gbc_textFieldB.fill = GridBagConstraints.HORIZONTAL;
		 gbc_textFieldB.gridx = 1;
		 gbc_textFieldB.gridy = 25;
		 add(textFieldB, gbc_textFieldB);
		 //textFieldB.setColumns(10);
		 
		 textFieldCat = new JTextField("Categorie");
		 GridBagConstraints gbc_textFieldCat = new GridBagConstraints();
		 gbc_textFieldCat.insets = new Insets(0, 0, 5, 5);
		 gbc_textFieldCat.fill = GridBagConstraints.HORIZONTAL;
		 gbc_textFieldCat.gridx = 1;
		 gbc_textFieldCat.gridy = 26;
		 add(textFieldCat, gbc_textFieldCat);
		 //textFieldA.setColumns(10);
		 
		 JComboBox cBoxManual = new JComboBox();
		 cBoxManual.setModel(new DefaultComboBoxModel(new String[] {"Baan 1", "Baan 2", "Baan 3", "Baan 4", "Baan 5", "Baan 6", "Baan 7", "Baan 8"})); ;
		 GridBagConstraints gbc_comboBox = new GridBagConstraints();
		 gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		 gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		 gbc_comboBox.gridx = 1;
		 gbc_comboBox.gridy = 27;
		 add(cBoxManual, gbc_comboBox);
		 
		 cBoxManual.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent arg0) {
							JComboBox<String> cBoxManual = (JComboBox<String>) arg0.getSource();
							int indexboxManual = cBoxManual.getSelectedIndex();
							System.out.println(cBoxManual.getSelectedIndex());
							switch (indexboxManual){
								case 0: 
								cbox1Player1 = textFieldA.getText();
								cbox1Player2 = textFieldB.getText();
								catbox1 = textFieldCat.getText();
								break;
								case 1: 
								cbox2Player1 = textFieldA.getText();
								cbox2Player2 = textFieldB.getText();
								catbox2 = textFieldCat.getText();
								break;
								case 2: 
								cbox3Player1 = textFieldA.getText();
								cbox3Player2 = textFieldB.getText();
								catbox3 = textFieldCat.getText();
								break;
								case 3: 
								cbox4Player1 = textFieldA.getText();
								cbox4Player2 = textFieldB.getText();
								catbox4 = textFieldCat.getText();
								break;
								case 4: 
								cbox5Player1 = textFieldA.getText();
								cbox5Player2 = textFieldB.getText();
								catbox5 = textFieldCat.getText();
								break;
								case 5: 
								cbox6Player1 = textFieldA.getText();
								cbox6Player2 = textFieldB.getText();
								catbox6 = textFieldCat.getText();
								break;
								case 6: 
								cbox7Player1 = textFieldA.getText();
								cbox7Player2 = textFieldB.getText();
								catbox7 = textFieldCat.getText();
								break;
								case 7: 
								cbox8Player1 = textFieldA.getText();
								cbox8Player2 = textFieldB.getText();
								catbox8 = textFieldCat.getText();
								break;

						}
							comCheck.sp.updatePlayerText();
							comCheck.sp.repaint();
						}
					}
					);
		 
		 JLabel lblemptycourt = new JLabel("Banen Leegmaken");
		 lblemptycourt.setForeground(Color.RED);
		 lblemptycourt.setFont(new Font("Tahoma", Font.BOLD, 14));
		 GridBagConstraints gbc_lblemptycourt = new GridBagConstraints();
		 gbc_lblemptycourt.insets = new Insets(0, 0, 5, 5);
		 gbc_lblemptycourt.gridx = 1;
		 gbc_lblemptycourt.gridy = 30;
		 add(lblemptycourt, gbc_lblemptycourt);
		 
		 JComboBox cBoxEmpty = new JComboBox();
		 cBoxEmpty.setModel(new DefaultComboBoxModel(new String[] {"Baan 1", "Baan 2", "Baan 3", "Baan 4", "Baan 5", "Baan 6", "Baan 7", "Baan 8"}));
		 GridBagConstraints gbc_cBoxEmpty = new GridBagConstraints();
		 gbc_cBoxEmpty.insets = new Insets(0, 0, 0, 5);
		 gbc_cBoxEmpty.fill = GridBagConstraints.HORIZONTAL;
		 gbc_cBoxEmpty.gridx = 1;
		 gbc_cBoxEmpty.gridy = 31;
		 add(cBoxEmpty, gbc_cBoxEmpty);
		 cBoxEmpty.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent arg0) {
							JComboBox<String> cBoxManual = (JComboBox<String>) arg0.getSource();
							int indexboxManual = cBoxManual.getSelectedIndex();
							System.out.println(cBoxManual.getSelectedIndex());
							switch (indexboxManual){
								case 0: 
								cbox1Player1 = "";
								cbox1Player2 = "";
								catbox1 = "";
								break;
								case 1: 
								cbox2Player1 = "";
								cbox2Player2 = "";
								catbox2 = "";
								break;
								case 2: 
								cbox3Player1 = "";
								cbox3Player2 = "";
								catbox3 = "";
								break;
								case 3: 
								cbox4Player1 = "";
								cbox4Player2 = "";
								catbox4 = "";
								break;
								case 4: 
								cbox5Player1 = "";
								cbox5Player2 = "";
								catbox5 = "";
								break;
								case 5: 
								cbox6Player1 = "";
								cbox6Player2 = "";
								catbox6 = "";
								break;
								case 6: 
								cbox7Player1 = "";
								cbox7Player2 = "";
								catbox7 = "";
								break;
								case 7: 
								cbox8Player1 = "";
								cbox8Player2 = "";
								catbox8 = "";
								break;
						}
							comCheck.sp.updatePlayerText();
							comCheck.sp.repaint();
						}
					}
					);
					
		 

	}

	
	// combine team 1 and team 2 from ExcelReader, used in combobox 
	public String[] importedarrays(){
		ArrayList<String> importedmatch = new ArrayList<String>();
		String[] importedarrays;
		for (int n=0; n<ExcelReader.team1.size(); n++){
			importedmatch.add(ExcelReader.team1.get(n) + " - "+ (ExcelReader.team2.get(n)).toString()); 
		}
		importedarrays = importedmatch.toArray(new String [importedmatch.size()]);
		return importedarrays;
		
	}
	
	// Used to set values after index from selected item in combobox has been determined

	public String[] importedcattoarray(){
		String[] importedcattoarray; 
		importedcattoarray = ExcelReader.cat.toArray(new String [ExcelReader.cat.size()]);
		return importedcattoarray;
	}
	
	public String[] importedteam1toarray(){
		String[] importedteam1toarray; 
		importedteam1toarray = ExcelReader.team1.toArray(new String [ExcelReader.team1.size()]);
		return importedteam1toarray;
	}
	
	public String[] importedteam2toarray(){
		String[] importedteam2toarray;
		importedteam2toarray = ExcelReader.team2.toArray(new String [ExcelReader.team2.size()]);
		return importedteam2toarray;
	}
}