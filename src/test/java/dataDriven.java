import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//FileInputStream argument to get the excel file
		
		//FileInputStream fls = new FileInputStream("C:\\testdata.xlsx");
		FileInputStream fls = new FileInputStream("C:/testdata.xlsx");
		

		
		XSSFWorkbook workbook = new XSSFWorkbook(fls);
		
		int sheets=workbook.getNumberOfSheets();
		System.out.println(sheets);
		//System.out.println(sheets);
		for (int i=0; i<sheets; i++)
		{
			//System.out.println(workbook.getSheetName(i));
			
			if(workbook.getSheetName(i).equalsIgnoreCase("testd1"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> ce = firstrow.cellIterator();
				//ce.next();
				
				int k=0;
				int column = 0;
				while (ce.hasNext())
				{
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("Testcases"))
					{
						column=k;
						//System.out.println(value.getStringCellValue());
					}
				k++;		
				}
				System.out.println(column);
				System.out.println("GitDemo 2nd User adds code");
				
			}
		}
	}

}
