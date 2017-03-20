import java.util.Arrays;

public class ByteConvert {
	
	//byte to bits
	public static boolean[] byte2BitArray(byte byteIn) {
		 boolean[] bits = new boolean[8];
		for (int i = 0; i < 8; i++) {
			if ((byteIn & (1 << (7 - (i % 8)))) > 0)
				bits[i] = true;
		}
		return bits;
	}

	//bits to sets
	public static int bitsToSets(byte byteIn) {
		boolean[] myBits = byte2BitArray(byteIn);
		// System.out.println(Arrays.toString(myBits));
		int set = 0;
		if (myBits[7] == true) {  		//8e bit is setstand, eerste (van player A) is side.
			set = 1;
		}
		//System.out.println("Set: " + set);
		return set;
	}

	//bits to games
	public static int bitsToGames(byte bitIn) {
		boolean[] myBits2 = byte2BitArray(bitIn);
		int[] games = new int[6];

		for (int i = 0; i < games.length; i++) {
			if (myBits2[i + 1] == true) {
				games[i] = 1;
			} else {
				games[i] = 0;
			}
			// System.out.println("Game " + i + " : " + games[i]);
		}

		int cumulativeLowerHalf = games[0] + games[1] + games[2];
		int cumulativeUpperHalf = games[3] + games[4] + games[5];

		int gameScore = 0;
		if (cumulativeLowerHalf > cumulativeUpperHalf) {
			for (int j = 0; j < 6; j++) {
				if (games[j] > 0) {
					gameScore = j + 1;
				}
			}
			// System.out.println("Game Score Bottom Up: " + gameScore);
		} else {
			for (int k = 5; k > -1; k--) {
				if (games[k] > 0) {
					gameScore = 6 - k;
				}
			}
			// System.out.println("Game Score Top Down: " + gameScore);
		}
		return gameScore;
	}

	// place games in array, allocate to court
	public static int[] gameAllocation(byte[] validReceivedDataArray) {

		//int[] gamesPlayer = new int[16];

		switch (validReceivedDataArray[0] - 1) {
		case 0: // court 1
			comCheck.gamesPlayer[0] = bitsToGames(validReceivedDataArray[1]);
			comCheck.gamesPlayer[1] = bitsToGames(validReceivedDataArray[2]);
			break;
		case 1: // court 2
			comCheck.gamesPlayer[2] = bitsToGames(validReceivedDataArray[1]);
			comCheck.gamesPlayer[3] = bitsToGames(validReceivedDataArray[2]);
			break;
		case 2: // court 3
			comCheck.gamesPlayer[4] = bitsToGames(validReceivedDataArray[1]);
			comCheck.gamesPlayer[5] = bitsToGames(validReceivedDataArray[2]);
			break;
		case 3: // court 4
			comCheck.gamesPlayer[6] = bitsToGames(validReceivedDataArray[1]);
			comCheck.gamesPlayer[7] = bitsToGames(validReceivedDataArray[2]);
			break;
		case 4: // court 5
			comCheck.gamesPlayer[8] = bitsToGames(validReceivedDataArray[1]);
			comCheck.gamesPlayer[9] = bitsToGames(validReceivedDataArray[2]);
			break;
		case 5: // court 6
			comCheck.gamesPlayer[10] = bitsToGames(validReceivedDataArray[1]);
			comCheck.gamesPlayer[11] = bitsToGames(validReceivedDataArray[2]);
			break;
		case 6: // court 7
			comCheck.gamesPlayer[12] = bitsToGames(validReceivedDataArray[1]);
			comCheck.gamesPlayer[13] = bitsToGames(validReceivedDataArray[2]);
			break;
		case 7: // court 8
			comCheck.gamesPlayer[14] = bitsToGames(validReceivedDataArray[1]);
			comCheck.gamesPlayer[15] = bitsToGames(validReceivedDataArray[2]);
			break;
		default:
			System.out.println("Court Count Error in Games");
			break;
		}
		return comCheck.gamesPlayer;
	}

	// place sets in array, allocate to courts
	public static int[] setAllocation(byte[] validByteArray) {

		//int[] setsPlayer = new int[16];

		switch (validByteArray[0] - 1) {
		case 0: // court 1
			comCheck.setsPlayer[0] = bitsToSets(validByteArray[1]);
			comCheck.setsPlayer[1] = bitsToSets(validByteArray[2]);
			break;
		case 1: // court 2
			comCheck.setsPlayer[2] = bitsToSets(validByteArray[1]);
			comCheck.setsPlayer[3] = bitsToSets(validByteArray[2]);
			break;
		case 2: // court 3
			comCheck.setsPlayer[4] = bitsToSets(validByteArray[1]);
			comCheck.setsPlayer[5] = bitsToSets(validByteArray[2]);
			break;
		case 3: // court 4
			comCheck.setsPlayer[6] = bitsToSets(validByteArray[1]);
			comCheck.setsPlayer[7] = bitsToSets(validByteArray[2]);
			break;
		case 4: // court 5
			comCheck.setsPlayer[8] = bitsToSets(validByteArray[1]);
			comCheck.setsPlayer[9] = bitsToSets(validByteArray[2]);
			break;
		case 5: // court 6
			comCheck.setsPlayer[10] = bitsToSets(validByteArray[1]);
			comCheck.setsPlayer[11] = bitsToSets(validByteArray[2]);
			break;
		case 6: // court 7
			comCheck.setsPlayer[12] = bitsToSets(validByteArray[1]);
			comCheck.setsPlayer[13] = bitsToSets(validByteArray[2]);
			break;
		case 7: // court 8
			comCheck.setsPlayer[14] = bitsToSets(validByteArray[1]);
			comCheck.setsPlayer[15] = bitsToSets(validByteArray[2]);
			break;
		default:
			System.out.println("Court Count Error in Sets");
			break;
		}
		return comCheck.setsPlayer;
		
	}
	
	//allocate tries
	public static int[] triesAllocation(byte[] validByteArray) {

			//int[] triesBaan = new int[8];

			switch (validByteArray[0] - 1) {
			case 0: // court 1
				comCheck.triesBaan[0] = (validByteArray[4]);
				break;
			case 1: // court 2
				comCheck.triesBaan[1] = (validByteArray[4]);
				break;
			case 2: // court 3
				comCheck.triesBaan[2] = (validByteArray[4]);
				break;
			case 3: // court 4
				comCheck.triesBaan[3] = (validByteArray[4]);
				break;
			case 4: // court 5
				comCheck.triesBaan[4] = (validByteArray[4]);
				break;
			case 5: // court 6
				comCheck.triesBaan[5] = (validByteArray[4]);
				break;
			case 6: // court 7
				comCheck.triesBaan[6] = (validByteArray[4]);
				break;
			case 7: // court 8
				comCheck.triesBaan[7] = (validByteArray[4]);
				break;
			default:
				System.out.println("Error in Tries Count");
				break;
			}
			return comCheck.triesBaan;
		}
	
	//allocate voltage
	public static int[] voltageAllocation(byte[] validByteArray) {

		//int[] voltageCourt = new int[8];

		switch (validByteArray[0] - 1) {
		case 0: // court 1
			comCheck.voltageCourt[0] = (validByteArray[3]);
			break;
		case 1: // court 2
			comCheck.voltageCourt[1] = (validByteArray[3]);
			break;
		case 2: // court 3
			comCheck.voltageCourt[2] = (validByteArray[3]);
			break;
		case 3: // court 4
			comCheck.voltageCourt[3] = (validByteArray[3]);
			break;
		case 4: // court 5
			comCheck.voltageCourt[4] = (validByteArray[3]);
			break;
		case 5: // court 6
			comCheck.voltageCourt[5] = (validByteArray[3]);
			break;
		case 6: // court 7
			comCheck.voltageCourt[6] = (validByteArray[3]);
			break;
		case 7: // court 8
			comCheck.voltageCourt[7] = (validByteArray[3]);
			break;
		default:
			System.out.println("Error in Voltage Count");
			break;
		}
		return comCheck.voltageCourt;
	}
		
}
