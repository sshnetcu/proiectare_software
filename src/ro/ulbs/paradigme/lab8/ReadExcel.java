package ro.ulbs.paradigme.lab8;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
    public static void main(String[] args) {
        XSSFWorkbook workbook = null;
        try{
            FileInputStream file = new FileInputStream(new File("laborator8_input.xlsx"));
            workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                for (Cell cell: row){
                    switch (cell.getCellType()) {
                        case CellType.NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case CellType.STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                    }
                }
                System.out.println();
            }
            file.close();
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
