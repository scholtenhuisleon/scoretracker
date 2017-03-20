import java.util.Arrays;

import javax.swing.JPanel;

import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

// version Dec 10 Jan 2014  

public class PortReader {

//	public static SerialPort serialPort;
//	public static byte[] buffer;
//	public static byte[] a;
//	public static int caseCounter;
//	public static byte validDataArray[] = new byte[5];
	
	public void reader(String comport) {
		comCheck.serialPort = new SerialPort(comport);
		try {
			comCheck.serialPort.openPort();// Open port
			comCheck.serialPort.setParams(57600, 8, 1, 0);// Set params
			comCheck.serialPort.addEventListener(new SerialPortReader());// Add SerialPortEventListener
		} catch (SerialPortException ex) {
			System.out.println(ex);
		}
		System.out.println();

	}

	static class SerialPortReader implements SerialPortEventListener {

		public void serialEvent(SerialPortEvent event) {
			if (event.isRXCHAR()) {// If data is available
		
				// Check bytes count in the input buffer read data, if >0 bytes
				// available
						
				
				while (event.getEventValue() > 0) {

					try {
						// Read Port
						comCheck.buffer = comCheck.serialPort.readBytes(event.getEventValue()); // troubleshooting:
													// https://github.com/arduino/Arduino/issues/1885
													// JSSC and empty bytes,
													// event.getEventValue()

						System.out.println("Received from Port:" + Arrays.toString(comCheck.buffer));
						comCheck.a = validityOfByteTest(comCheck.buffer);

						comCheck.games = ByteConvert.gameAllocation(comCheck.a);
						comCheck.sets = ByteConvert.setAllocation(comCheck.a);
						comCheck.tries = ByteConvert.triesAllocation(comCheck.a);
						comCheck.voltage = ByteConvert.voltageAllocation(comCheck.a);
						System.out.println("games =" + Arrays.toString(comCheck.games));
						System.out.println("sets =" + Arrays.toString(comCheck.sets));
						System.out.println("tries =" + Arrays.toString(comCheck.tries));
						System.out.println("voltage =" + Arrays.toString(comCheck.voltage));

						
					} catch (SerialPortException ex) {
						System.out.println(ex);
						ex.printStackTrace();
					}
				}
			}
		}

		public static byte[] validityOfByteTest(byte[] input) {
			comCheck.caseCounter = 0; // counts case progress
			// validDataArray = new byte[5]; // byte array court, playerA, player B, voltage, tries

			if (input[5]>=0){ 		// Switch for Side Not Turned
					switch (comCheck.caseCounter) {
					case 0: // T valid?
						if (input[0] == 84) {
							comCheck.caseCounter++;
						} else {
							break;
						}
					case 1: // C valid?
						if (input[1] == 67) {
							comCheck.caseCounter++;
						} else {
							comCheck.caseCounter = 0;
							break;
						}
					case 2: // D valid?
						if (input[2] == 68) {
							comCheck.caseCounter++;
						} else {
							comCheck.caseCounter = 0;
							break;
						}
					case 3: // Court
						if (input[3] < 9) {
							comCheck.validDataArray[0] = input[3];
							comCheck.caseCounter++;
						} else {
							comCheck.caseCounter = 0;
							break;
						}
					case 4: // BytesPlayerA
						comCheck.validDataArray[1] = input[4];
						comCheck.caseCounter++;
						comCheck.caseCounter = 7; 
					case 5: // BytesPlayerB
						comCheck.validDataArray[2] = input[5];
						comCheck.caseCounter++;
					case 6: // Voltage
						comCheck.validDataArray[3] = input[6];
						comCheck.caseCounter++;
					case 7: // Tries
						comCheck.validDataArray[4] = input[7];
						comCheck.caseCounter = 0;
						// print court, bytesA, bytesB, voltage, tries
						System.out.println("ValidDataArray = "
								+ Arrays.toString(comCheck.validDataArray));
						break;
					default:
						comCheck.caseCounter = 0;
						break;
					}
			}
			else{					// Switch for Side Turned
					switch (comCheck.caseCounter) {
					case 0: // T valid?
						if (input[0] == 84) {
							comCheck.caseCounter++;
						} else {
							break;
						}
					case 1: // C valid?
						if (input[1] == 67) {
							comCheck.caseCounter++;
						} else {
							comCheck.caseCounter = 0;
							break;
						}
					case 2: // D valid?
						if (input[2] == 68) {
							comCheck.caseCounter++;
						} else {
							comCheck.caseCounter = 0;
							break;
						}
					case 3: // Court
						if (input[3] < 9) {
							comCheck.validDataArray[0] = input[3];
							comCheck.caseCounter++;
						} else {
							comCheck.caseCounter = 0;
							break;
						}
					case 4: // BytesPlayerA
						comCheck.validDataArray[1] = input[5];
						comCheck.caseCounter++;
					case 5: // BytesPlayerB
						comCheck.validDataArray[2] = input[4];
						comCheck.caseCounter++;
					case 6: // Voltage
						comCheck.validDataArray[3] = input[6];
						comCheck.caseCounter++;
					case 7: // Tries
						comCheck.validDataArray[4] = input[7];
						comCheck.caseCounter = 0;
						// print court, bytesA, bytesB, voltage, tries
						System.out.println("ValidDataArray = " + Arrays.toString(comCheck.validDataArray));
						break;
					default:
						comCheck.caseCounter = 0;
						break;
					}
					}
			return comCheck.validDataArray;
		}
	}
}
