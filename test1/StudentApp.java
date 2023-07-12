package test1;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Studarray[] = new Student[5];
		
		//creating object 1
		Studarray[0] = new Student ("kamal","IT","077-1234567");
		Studarray[0].print();
		
		//creating object 2
		Studarray[1] = new Student ();
		Studarray[1].setName("tharusha");
		Studarray[1].setDegree("SE");
		Studarray[1].setMobile("077-1234567");
		Studarray[1].print();
		
		//creating object 1
		Studarray[2] = new Student ("kumara","IT","077-1234567");
		Studarray[2].print();
				
		//creating object 1
		Studarray[3] = new Student ("dunil","CSNE","077-1234567");
		Studarray[3].print();
				
		//creating object 1
		Studarray[4] = new Student ("sanka","BS","077-1234567");
		Studarray[4].print();
		
		System.out.println();
		for(int i=0;i<5;i++) {
			//System.out.println(""Studarray[i].print()) ;
			Studarray[i].print();
		}
	}

}
