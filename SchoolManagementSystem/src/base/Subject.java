package base;

public class Subject {
	private String id;
	private String name;
	private String classID;
	
	public Subject() {
		// TODO Auto-generated constructor stub
	}
	
	public void DisplaySubject() {
		
	}
	public Subject(String id, String name, String classID) {
		super();
		this.id = id;
		this.name = name;
		this.classID = classID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassID() {
		return classID;
	}

	public void setClassID(String classID) {
		this.classID = classID;
	}
	
}
