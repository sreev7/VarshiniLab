package model;

public class SuperDept {
	
	//private variables
	private String deptname;
	private String getTodaysWork;
	private String getWorkDeadline;
	private String isTodayAHoliday;
	
	//creating parameterized Constructor
	public SuperDept( String deptname, String getTodaysWork, String getWorkDeadline, String isTodayAHoliday)
	{
	
		this.deptname = deptname;
		this.getTodaysWork = getTodaysWork;
		this.getWorkDeadline = getWorkDeadline;
		this.isTodayAHoliday = isTodayAHoliday;	
		
	}
	
	
	public String getDeptname() {
		return deptname;
	}


	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}


	public String getGetTodaysWork() {
		return getTodaysWork;
	}


	public void setGetTodaysWork(String getTodaysWork) {
		this.getTodaysWork = getTodaysWork;
	}


	public String getWorkDeadline() {
		return getWorkDeadline;
	}


	public void setGetWorkDetails(String getWorkDeadline) {
		this.getWorkDeadline = getWorkDeadline;
	}


	public String getIsTodayAHoliday() {
		return isTodayAHoliday;
	}


	public void setIsTodayAHoliday(String isTodayAHoliday) {
		this.isTodayAHoliday = isTodayAHoliday;
	}

	public static void main(String[] args)
	{
		SuperDept sd = new SuperDept("Welcome to Admin Department", "Complete yout documents submission", "Complete by EOD", "Today is not a holiday");
		System.out.println(sd);
		sd.setDeptname("Admin");
		System.out.println("Dept is"+sd.getDeptname());
	}

}





