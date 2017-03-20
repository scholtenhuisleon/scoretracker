import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import jxl.Cell;		// imports JXL Api from http://www.simplecodestuffs.com/read-excel-with-java-jexcel-api/
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReader {

	public static ArrayList<String> team1 = new ArrayList<String>();
	public static ArrayList<String> team2 = new ArrayList<String>();
	public static ArrayList<String> cat = new ArrayList<String>();

	public void ExcelReader() throws IOException {
		ExcelReader test = new ExcelReader();
		test.setInputFile("D:\\Users\\Gebruiker\\Desktop\\spelers.xls");//("d:\\spelers.xls");//"(C;\\spelers.xls");//("src/spelers.xls");
		test.read();
	}

	private String inputFile;

	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	public void read() throws IOException {
		File inputWorkbook = new File(inputFile);
		Workbook w;
		try {
			w = Workbook.getWorkbook(inputWorkbook);
			// Get the first sheet
			Sheet sheet = w.getSheet(0);
			
			for (int i = 0; i < sheet.getRows(); i++) {
				Cell cell = sheet.getCell(1, i);
				CellType type = cell.getType();
				if (type == CellType.LABEL) {
					//System.out.println(cell.getContents());
					cat.add(cell.getContents());
					}
			}
		System.out.println("Imported new categories: " + cat.toString());
		
			for (int i = 0; i < sheet.getRows(); i++) {
				Cell cell = sheet.getCell(2, i);
					CellType type = cell.getType();
					if (type == CellType.LABEL) {
						//System.out.println(cell.getContents());
						team1.add(cell.getContents());
						}
				}
			System.out.println("Imported new players HOME team: " + team1.toString());
			
			for (int i = 0; i < sheet.getRows(); i++) {
				Cell cell = sheet.getCell(3, i);
				CellType type = cell.getType();
				if (type == CellType.LABEL) {
					//System.out.println(cell.getContents());
					team2.add(cell.getContents());
					}
			}
		System.out.println("Imported new players AWAY Team 2: " + team2.toString());
		
		} catch (BiffException e) {
			e.printStackTrace();
		}
	}
}