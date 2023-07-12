package lec3;

public class person {

	String name,address;

	public person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public void showDetails() {
		System.out.println( "name :" +name +"\nadd: " + address);  
	}

}
