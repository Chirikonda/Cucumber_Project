package utilities;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

//import tech.grasshopper.pdf.pojo.cucumber.Row;

public class DataReader {
	public static HashMap<String ,String>storeValues=new HashMap();
	public static List<HashMap<String ,String>>data(String filepath,String sheetName){
		List<HashMap<String ,String>>mydata=new ArrayList<>();
		
		try {
			FileInputStream fs=new FileInputStream(filepath);
			HSSFWorkbook wb=new HSSFWorkbook(fs);
			HSSFSheet sheet=wb.getSheet(sheetName);
			HSSFRow HeaderRow=sheet.getRow(0);
			for(int i=1;i<sheet.getPhysicalNumberOfRows();i++) {
				HSSFRow currentRow=sheet.getRow(i);
				HashMap<String,String>currentHash=new HashMap<String,String>();
				for(int j=0;j<currentRow.getPhysicalNumberOfCells();j++) {
					HSSFCell currentCell=currentRow.getCell(j);
				switch(currentCell.getCellType()) {
				case STRING:
					currentHash.put(HeaderRow.getCell(j).getStringCellValue(),currentCell.getStringCellValue());
					break;
				}
					
				}
				mydata.add(currentHash);
				}
			fs.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			
			
		}
		return mydata;
		
	}
	
	

}
