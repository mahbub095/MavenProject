package Utils;

public class XpathUtils {
public static class LoginModule{
		
		public static final String user_name= "//*[@id=\"txtUsername\"]";
		public static final String password= "//*[@id=\"txtPassword\"]";
		public static final String signIN_BTN="//*[@id=\"btnLogin\"]";
	}
	
 
	
public static class AssignLeaveModule{
		
		public static final String EmployeeName = "//*[@id=\"assignleave_txtEmployee_empName\"]";
		public static final String Leave_Type = "//*[@id=\"assignleave_txtLeaveType\"]";
		public static final String From_Date ="//*[@id=\"assignleave_txtFromDate\"]";
		public static final String FromDate_Month ="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]";
		public static final String FromDate_Year ="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]";
		public static final String To_Date = "//*[@id=\"assignleave_txtToDate\"]";
		public static final String ToDate_Month ="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]";
		public static final String ToDate_Year ="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]";
		public static final String Comment ="//*[@id=\"assignleave_txtComment\"]";
		public static final String Assign_BTN ="//*[@id=\"assignBtn\"]";
	}
 
}
