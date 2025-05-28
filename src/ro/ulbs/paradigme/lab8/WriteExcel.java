package ro.ulbs.paradigme.lab8;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.TreeMap;

public class WriteExcel {
    public static void main(String[] args) {
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("2", new Object[] {"Amit", "Shukla", 9,8,7,5});
        data.put("3", new Object[] {"Lokesh", "Gupta", 8,9,6,7});
        data.put("4", new Object[] {"John", "Adwards", 8,8,7,6 });
        data.put("5", new Object[] {"Brian", "Schultz", 7,6,8,9});

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();
        XSSFCellStyle greenCellStyle = workbook.createCellStyle();
        greenCellStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        greenCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        XSSFCellStyle yellowCellStyle = workbook.createCellStyle();
        yellowCellStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
        yellowCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        XSSFFont font = workbook.createFont();
        font.setColor(IndexedColors.BLUE_GREY.getIndex());
        font.setBold(true);


        Row row1 = sheet.createRow(1);

        row1.createCell(1).setCellValue("Name");
        row1.createCell(2).setCellValue("Surname");
        row1.createCell(3).setCellValue("Grade 1");
        row1.createCell(4).setCellValue("Grade 2");
        row1.createCell(5).setCellValue("Grade 3");
        row1.createCell(6).setCellValue("Grade 4");
        row1.createCell(7).setCellValue("Max");
        row1.createCell(8).setCellValue("Average");
        for (Cell i : row1) {
            i.setCellStyle(greenCellStyle);
        }
        font.setColor(IndexedColors.BLACK.getIndex());
        font.setBold(false);

        int row = 0;
        for (Map.Entry<String, Object[]> entry : data.entrySet()) {
            Row row2 = sheet.createRow(row++);
            Object[] value = entry.getValue();
            int cell = 0;
            for (Object o : value) {
                Cell cell1 = row2.createCell(cell++);
                font.setItalic(false);
                if (cell == 7) {
                    font.setItalic(true);
                    cell1.setCellStyle(yellowCellStyle);
                    cell1.setCellFormula("=MAX(D" + row + ":F" + row + ")");
                }
                if (cell == 8) {
                    font.setItalic(true);
                    cell1.setCellStyle(yellowCellStyle);
                    cell1.setCellFormula("=AVERAGE(D" + row + ":F" + row + ")");
                }
                if (o instanceof String) {
                    cell1.setCellValue((String) o);
                }
                else if (o instanceof Integer) {
                    cell1.setCellValue((Integer) o);
                }
            }
        }

        try (OutputStream fileOut = new FileOutputStream("workbook.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            //do stuff
        }
    }

}
