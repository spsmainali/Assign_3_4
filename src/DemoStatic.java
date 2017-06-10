////2. Create a program to display the use of Static Variables and Methods in java.
public class DemoStatic {
		   public static void main(String args[]){
		     Student s1 = new Student();//every time object is created constructor method is automatically called
		     s1.showData(); 
		     Student s2 = new Student();
		     s2.showData();
		     Student.b++;
		     s1.showData();//on calling showdata method again it displays incrementd value of static variable a, b
		     Student.increment();
		  }
		}

		class Student {
		static int a; //initialized to zero
		static int b; //initialized to zero only when class is loaded not for each object created.

		  Student(){
		   //Constructor incrementing static variable b
		   b++;
		  }

		   public void showData(){
		      System.out.println("Value of a = "+a);
		      System.out.println("Value of b = "+b);
		   }
		public static void increment(){
		b++;
		System.out.println("static method is called with increment in b" + b);
		}

		}
