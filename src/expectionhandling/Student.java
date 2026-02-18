package expectionhandling;

public class Student {
	public String name;
	public int age;

	public Student fetchData(int id) throws DataNotFoundException {
		if (id == 4) {
			Student stu = new Student();
			stu.setName("Kartik");
			stu.setAge(20);
			return stu;
		}
		return null;
	}

	public void getAdmitCard() throws AdmitClassNotFoundException {
		System.out.println("Admit card");
		// throw new AdmitClassNotFoundException("10001"," forgot the admitcard");
		try {
			System.out.println(10/0);
		}catch(Exception e){
			//e.printStackTrace();
			throw new AdmitClassNotFoundException("10001"," forgot the admitcard",e);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
