package Controller_Files;

import javafx.beans.property.SimpleStringProperty;

public class Employee {
	
	
	private final SimpleStringProperty EmpNo;
	private final SimpleStringProperty Name;
	private final SimpleStringProperty Age;
	private final SimpleStringProperty NIC;
	private final SimpleStringProperty Designation;
	private final SimpleStringProperty Mobile;
	private final SimpleStringProperty Contact;
	private final SimpleStringProperty Address;

	
	Employee(String empno, String fname, String age, String idno, String designation, String mobileno, String emergencymobile, String address) {
		
		this.EmpNo = new SimpleStringProperty(empno);
		this.Name = new SimpleStringProperty(fname);
		this.Age = new SimpleStringProperty(age);
		this.NIC = new SimpleStringProperty(idno);
		this.Designation = new SimpleStringProperty(designation);
		this.Mobile = new SimpleStringProperty(mobileno);
		this.Contact = new SimpleStringProperty(emergencymobile);
		this.Address = new SimpleStringProperty(address);
		
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
	public void setName(String fname) {
		Name.set(fname);
	}
	
	public String getAge() {
		return Age.get();
	}
	public void setAge(String age) {
		Age.set(age);
	}
	
	public String getNIC() {
		return NIC.get();
	}
	public void setNIC(String idno) {
		NIC.set(idno);
	}
	
	public String getDesignation() {
		return Designation.get();
	}
	public void setDesignation(String designation) {
		Designation.set(designation);
	}
	
	public String getMobile() {
		return Mobile.get();
	}
	public void setMobile(String mobileno) {
		Mobile.set(mobileno);
	}
		
	public String getContact() {
	return Contact.get();
	}
	public void setContact(String emergencymobile) {
		Contact.set(emergencymobile);
	}
	
	public String getAddress() {
	return Address.get();
	}
	public void setAddress(String address) {
		Address.set(address);
	}	

}
