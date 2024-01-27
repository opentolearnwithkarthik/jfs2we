package file.operations;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

	public static void main(String[] args) throws Exception {
		Workbook workbook = new XSSFWorkbook(new File("C:\\Users\\sreek\\Downloads\\test.xlsx"));
		printWorkbook(workbook);
		Sheet newSheet = workbook.createSheet();
		workbook.setSheetName(3, "newSheet");
		Row row = newSheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Inserted from Code");
		printWorkbook(workbook);
		workbook.write(new FileOutputStream(new File("C:\\Users\\sreek\\Downloads\\test.xlsx")));
	}

	private static void printWorkbook(Workbook workbook) {
		for (Sheet sheet : workbook) {
			System.out.println("Sheet " + sheet.getSheetName());
			for (Row row : sheet) {
				for (Cell cell : row) {
					switch (cell.getCellType()) {
					case FORMULA:
						System.out.print(cell.getCellFormula());
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue());
						break;
					case STRING:
						System.out.print(cell.getStringCellValue());
						break;
					default:
						System.out.print("UNKNOWN");
						break;
					}
					System.out.print("\t\t");
				}
				System.out.println();
			}
		}
	}

	private static void generateStudentMarks(StudentMarks studentMarks) {
		studentMarks.setChemistry(getRandomMark());
		studentMarks.setComputerScience(getRandomMark());
		studentMarks.setEnglish(getRandomMark());
		studentMarks.setMaths(getRandomMark());
		studentMarks.setPhysics(getRandomMark());
		studentMarks.setTamil(getRandomMark());
	}

	private static int getRandomMark() {
		int min = 0;
		int max = 100;
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

}
