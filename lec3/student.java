 package lec3;

public class student extends person   {
    
	String studid;
	
public student(String name,String address, String studid) {
		super(name,address);
		this.studid = studid;
	}

public void showDetails() {
	super.showDetails();
	System.out.println( "id: " + studid);
	}

}
