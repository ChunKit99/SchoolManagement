package base;

public class Teacher {
	private String id;
	private String tName;
	private int tPhone;

	public Teacher(String id, String tName, int tPhone) {
		super();
		this.id = id;
		this.tName = tName;
		this.tPhone = tPhone;
	}
	
	public void prepareTestPaper() {
		
	}
	public void markAttendance() {
		
	}
	public void checkPaper() {
		
	}
	public void prepareReportCards() {
		
	}
	public void declarResult() {
		
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public int gettPhone() {
		return tPhone;
	}

	public void settPhone(int tPhone) {
		this.tPhone = tPhone;
	}

}
