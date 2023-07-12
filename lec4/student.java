package lec4;

public class student {
	
	static int a=3;
	static int b;
	
	static void meth(int x) {
		System.out.println("x =" + x);
		System.out.println("a =" + a);
		System.out.println("b =" + b);
	}
	
	static {
		System.out.println("Static block initalized .");
		b= a * 4;
	}

	/*
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
        meth(42);
        Main.meth(3);
	}
    */
}
