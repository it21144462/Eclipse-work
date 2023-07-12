package lec1;

public class Test {

	public static void main(String[] args) {
		
		
		Student s1 = new Student(); //object
		s1.name ="Sanath";
		s1.ditNo ="IT21144";
		s1.address ="matara";
		
		System.out.println("NAme :" + s1.name + " ditno :" +s1.ditNo + " address :" + s1.address);
		
		/*----------------------------------------------------------------------------------------------*/
		
		Student s2 = new Student(); //object
		
		s2.name ="tharusha";
		s2.ditNo ="IT20000";
		s2.address ="Galle";
		
		System.out.println("NAme :" + s2.name + " ditno :" +s2.ditNo + " address :" + s2.address);
		
		/*----------------------------------------------------------------------------------------------*/
		
		Student s3 =new Student("kamu","rgg","fhgfg");
		System.out.println("NAme :" + s3.name + " ditno :" +s3.ditNo + " address :" + s3.address);
		
		/*----------------------------------------------------------------------------------------------*/
		
		Student s4 = new Student();
		s4.setName("thru");
		s4.setDitNo("it3456");
		s4.setAddress("weherahena ");
		
		System.out.println("NAme :" + s4.getName() + " ditno :" +s4.getDitNo() + " address :" + s4.getAddress());
		
		/*----------------------------------------------------------------------------------------------*/
		
		Student s5 = new Student();
		s5.setName("KUMARA");
		s5.setDitNo("IT211454634");
		s5.setAddress("Jaffna ");
		s5.GetDetails();
		//Student s3 = new Student();
		//s3.Student();
	}

}
