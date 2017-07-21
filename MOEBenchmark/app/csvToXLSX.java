import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
import java.util.ArrayList;
 
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.ss.usermodel.Cell;
 
 
public class csvToXLSX {
 
    public static void main(String args[]) {
        boolean isCreated=false;
        XSSFRow currentRow;
        XSSFWorkbook workBook = new XSSFWorkbook();
        XSSFSheet sheet = workBook.createSheet("benchmarks");
        String xlsxFileAddress = "benchmark_stats.xlsx";
        for(int i=0; i<args.length; i++) {
            try {
                String csvFileAddress = args[i];
                String currentLine=null;
                int RowNum=0;
                BufferedReader br = new BufferedReader(new FileReader(csvFileAddress));
                while ((currentLine = br.readLine()) != null) {
                    String str[] = currentLine.split(",");
                    RowNum++;
                    if(isCreated) {
                        currentRow=sheet.getRow(RowNum);
                    }
                    else {
                        currentRow=sheet.createRow(RowNum);
                    }
                    for(int j=0;j<str.length;j++){
                        if(j%2==0){
                            if(isCreated){
                                currentRow.getCell(j).setCellValue(str[j]);
                            }
                            else{
                                currentRow.createCell(j).setCellValue(str[j]);
                            }
                        }
                        else{
                            currentRow.createCell(j+i).setCellValue(str[j]);
                        }
                    }
                }
                isCreated=true;
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream =  new FileOutputStream(xlsxFileAddress);
            workBook.write(fileOutputStream);
        } catch (IOException e) {
                e.printStackTrace();
        }
        finally{
            try {
                fileOutputStream.close();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("---XLSX FILE(S) CREATED---");
    }
}