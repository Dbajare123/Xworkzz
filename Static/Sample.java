class Sample{
	int i;
	static int j;
	double a;
	static double b;
	static int k=25;
	
	static{
	j=25;
	b=55.55;
	System.out.println("static block1....");
	}
	
	Sample(){
	System.out.println("default constructor...");
	}
	
    
	static{
	System.out.println("Static  block2...");	
	}
	
}	
	class Tester{
	public static void main(String arg[]){
	System.out.println("main method started");

	System.out.println(Sample.k);
	Sample s1=new Sample();
	System.out.println(s1.a+"\t"+s1.i);
	
	System.out.println("j="+Sample.j);
	System.out.println("b="+Sample.b);
	}
	}