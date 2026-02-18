package streamapi;

public class Student {
	private int id;
	private String name;
	private String branch;
	private String college;
	private String city;
	public Student(int id, String name, String branch, String college, String city) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.college = college;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getBranch() {
		return branch;
	}
	public String getCollege() {
		return college;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", college=" + college + ", city=" + city
				+ "]";
	}
	

}
