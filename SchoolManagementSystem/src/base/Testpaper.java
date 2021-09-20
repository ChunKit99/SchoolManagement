package base;

public class Testpaper {
	private String pID;
	private String pName;
	private double pDuration;
	private String pClassid;

	public Testpaper(String pID, String pName, double pDuration, String pClassid) {
		super();
		this.pID = pID;
		this.pName = pName;
		this.pDuration = pDuration;
		this.pClassid = pClassid;
	}

	public void viewTestaper() {

	}

	public void deleteTestPaper() {

	}

	public String getpID() {
		return pID;
	}

	public void setpID(String pID) {
		this.pID = pID;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpDuration() {
		return pDuration;
	}

	public void setpDuration(double pDuration) {
		this.pDuration = pDuration;
	}

	public String getpClassid() {
		return pClassid;
	}

	public void setpClassid(String pClassid) {
		this.pClassid = pClassid;
	}

}
