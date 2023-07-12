  package test1;

/**
 * @author HP
 *
 */
public class Student {
	private int studentId;
	private String name;
	private String degree;
	private String mobile;
	
	private static int max = 100;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public Student(String name, String degree, String mobile) {
		super();
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
	}
	
	public Student() {
		super();
	}


	public void print() {
		System.out.println("Name : " + getName() +"   Degree :" + getDegree() +"    id :"+ getNextStudentId() +"   Mobile :" +getMobile());
		//System.out.println("Name : " + getName() +"\nDegree :" + getDegree() +"  id :"+ getNextStudentId() +"\nMobile :" +getMobile());
		//System.out.println();
	}
    
	public static int getNextStudentId() {
		return ++max;
	}
}
