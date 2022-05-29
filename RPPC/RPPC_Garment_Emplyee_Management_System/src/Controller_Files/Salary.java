package Controller_Files;

import javafx.beans.property.SimpleStringProperty;

public class Salary {
	
	private final SimpleStringProperty EmpNo;
	private final SimpleStringProperty Name;
	private final SimpleStringProperty Month;
	private final SimpleStringProperty Total_Hours;
	private final SimpleStringProperty Total_OT_Hours;
	private final SimpleStringProperty Total_Salary;
	
	
	Salary(String empno, String name, String month, String generalhours, String othours, String totalsalary) {
		
		this.EmpNo = new SimpleStringProperty(empno);
		this.Name = new SimpleStringProperty(name);
		this.Month = new SimpleStringProperty(month);
		this.Total_Hours = new SimpleStringProperty(generalhours);
		this.Total_OT_Hours = new SimpleStringProperty(othours);
		this.Total_Salary = new SimpleStringProperty(totalsalary);		
		
	}
	
	public String getEmpNo() {
		return EmpNo.get();
	}
	public void setEmpNo(String empno) {
		EmpNo.set(empno);
	}
	
	public String getName() {
		return Name.get();
	}
	public void setName(String name) {
		Name.set(name);
	}
	
	public String getMonth() {
		return Month.get();
	}
	public void setMonth(String month) {
		Month.set(month);
	}
	
	public String getTotal_Hours() {
		return Total_Hours.get();
	}
	public void setTotal_Hours(String generalhours) {
		Total_Hours.set(generalhours);
	}
	
	public String getTotal_OT_Hours() {
		return Total_OT_Hours.get();
	}
	public void setTotal_OT_Hours(String othours) {
		Total_OT_Hours.set(othours);
	}
	
	public String getTotal_Salary() {
		return Total_Salary.get();
	}
	public void setTotal_Salary(String totalsalary) {
		Total_Salary.set(totalsalary);
	}
	

}
