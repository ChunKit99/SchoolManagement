package base;

public class Student {
	private String sId;
	private String sName;
	private int sPhone;
	private String Address;

	public Student(String sId, String sName, int sPhone, String address) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sPhone = sPhone;
		Address = address;
	}
	
	public void admissionForm() {
		
	}
	public void getEnrolled() {
		
	}
	public void writeExam() {
	
	}
	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsPhone() {
		return sPhone;
	}

	public void setsPhone(int sPhone) {
		this.sPhone = sPhone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
}
