import java.util.Arrays;

import javax.swing.JPanel;

public class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	public int refreshCounter = 0; 

	ThreadDemo(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	public void run() {
		System.out.println("Running " + threadName);
		try {
			// Create empty frame for score + info
			comCheck.sf0 = new ScorePlayerFrame(new JPanel());
			comCheck.hf = new HardwareFrame(new JPanel());
			
			// Create and add panels
			comCheck.sp = new ScorePlayerPanel(comCheck.games, comCheck.sets);
			comCheck.sf0.add(comCheck.sp);
			
			comCheck.hp = new HardwarePanel(comCheck.tries, comCheck.voltage);
			comCheck.hf.add(comCheck.hp);
			
			while (true) {

//				System.out.println("games =" + Arrays.toString(comCheck.games));
//				System.out.println("sets =" + Arrays.toString(comCheck.sets));
//				System.out.println("tries =" + Arrays.toString(comCheck.tries));
//				System.out.println("voltage =" + Arrays.toString(comCheck.voltage));
				if (refreshCounter == 10)
				{
					System.gc();
					refreshCounter = 0;
				}
					
				// refreshes score panel
				comCheck.sp.updateTxt(comCheck.gamesPlayer, comCheck.setsPlayer);
				comCheck.sp.repaint();	

				// Let the thread sleep for a while.
				Thread.sleep(500);
				
				// refreshes hardware panel
				comCheck.hp.updateTransmissionTxt(comCheck.tries, comCheck.voltage);
				comCheck.hp.repaint();
				
				refreshCounter ++; 
			}

		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

}
