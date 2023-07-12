package lec1;

public class Student {
	String name,ditNo,address;

	public Student() {
		super();
		System.out.println("----------------------------------------");
        }
	
	public Student(String name, String ditNo, String address) {
		super();
		this.name = name;
		this.ditNo = ditNo;
		this.address = address;
	}
 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDitNo() {
		return ditNo;
	}

	public void setDitNo(String ditNo) {
		this.ditNo = ditNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void GetDetails() {
		
		System.out.println("I am a student \nname :" + getName() + "\nfrom " + getAddress() + "id : "  +getDitNo());
	}

}
