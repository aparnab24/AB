package Java;

public class Test1 {

		public static void main(String[] args) {
		
			int a = 5;
			System.out.println(a); //output will be 5

			int x = 100; 
			System.out.println(x); //output will be 100
			
			 x = 200; //Local Variable - override
			System.out.println(x); //output will be 200
			
			char c = 'a'; //char type Local Variable should be placed in single quote
			System.out.println(c); //output will be a
			
			boolean b = true; //defining a Variable
			b = false; //override
			System.out.println(b); //output will be false
			
			System.out.println(3>10); //False
			System.out.println(10>5); //True
			
			int e = 100; //local variable
			int f = 200; //local variable
			
			boolean z = e > f; 
			System.out.println(z); //false

}

}