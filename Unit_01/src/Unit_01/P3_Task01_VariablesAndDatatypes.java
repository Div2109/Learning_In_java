package Unit_01;

public class P3_Task01_VariablesAndDatatypes{
	
	static int q=11;
	int p=10;

	public static void main(String[] args) {
		
		//Valid declarations
		int a,b,c;
		float pi;
		double d;
		char e;
		
		//Valid initializations
		pi=3.14f;
		d=20.22d;
		e='v';
		
		a=10;
		b=10;
		c=10;
		
		System.out.println("The value of a is=");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(e);
		
		int myNum =5; //Integer (Whole number)
		float myFLoatNum=5.99f; //FLoating point number
		char myLetter='0'; //Character
		boolean myBool=true; //Boolean
		String myText = "Hello";  //String
		
		System.out.println(myNum);
		System.out.println(myFLoatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		
		/*
		 * Java Variable Type Conversion & Type casting:Details are in OneNote
		 */
		
		double f;
		int i=10;
		f=i; //Type casting
		
		double g=10;
		int j;
		j=(int) g; //type casting
		
		System.out.println(f);
		System.out.println(i);
		System.out.println(g);
		System.out.println(j);
		 
		byte k=10; //1byte
		boolean l=true;// 1 bit=true or false only
		long m=10L;
		float n=1.2f;
		double o=1.2d;
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		System.out.println(ABC.j); //data + functions//methods
		//ABC.display();
		
		ABC obj1=new ABC();
		System.out.println(obj1.i++);
		System.out.println(obj1.i);
		
		ABC obj2=new ABC();
		System.out.println(obj2.i);
		
		/*System.out.println(obj1.j++);
		 * System.out.println(obj1.j);
		 System.out.println(obj2.j);*/
		System.out.println(ABC.j++);
		System.out.println(ABC.j);
		
		ABC.typeConversionAndTypeCasting();
	}
	int r=10;
	void display() {
		int a=5; //local variable
		System.out.println("This is Display Method");
		System.out.println(a);
	}

}
class ABC{
	static int j=10;//class Variable/static variable
	int i=10;//Instance Variable
	
	static void display() {
		int a=5;
		System.out.println("This is Diplay method");
		System.out.println(a);
	  }
	
	static void typeConversionAndTypeCasting() {
		/*
		 * double f; //8 bytes=64 bits/slots int i=10;//4 bytes =32 bits/slots f=i //Type Conversion System.out.println(f);
		 * 
		 * double g =10;//64 int l; //32 j=(int)g; 		 */
		
		double f; //64 slots
		int i=10;//32 slots
		f=i;//Type conversion
		System.out.println(f);
		
		double g=10;
		int j;
		j=(int)g;//type casting
		//32 bits =64 bits
		
		System.out.println(i);
		System.out.println(j);
		
	}
}