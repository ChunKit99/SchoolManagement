package base;

public class Class {
	private String id;
	private String name;
	private Division dividion;

	public Class() {
		// TODO Auto-generated constructor stub
	}

	public void DisplayClass() {

	}

	public Class(String id, String name, Division dividion) {
		super();
		this.id = id;
		this.name = name;
		this.dividion = dividion;
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

	public Division getDividion() {
		return dividion;
	}

	public void setDividion(Division dividion) {
		this.dividion = dividion;
	}

}
