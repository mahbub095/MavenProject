package DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Utils.ExcelUtils;

public class AssignLeaveDataProvider {
	@DataProvider(name="AssignLeaveData")
	public static Object[][] getAssignLeaveData(){
		try {
			return new Object[][]{
					{
						ExcelUtils.getAssignLeaveData()
					},
				};
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}	        
    }
}
