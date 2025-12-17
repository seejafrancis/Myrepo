package exampleString;

public class Bufferbuilder {

	public static void main(String[] args) {
		
// TODO Auto-generated method stub
		StringBuffer s= new StringBuffer("hello");
		System.out.println(s);
		StringBuilder s1= new StringBuilder("hi");
		System.out.println(s1);
//insert()
		s1.insert(0, "Good morning");
		System.out.println(s1);
//append()
		s1.append("Madam");
System.out.println(s1);
	//replace()
s1.replace(0, 4,"fantastic");
System.out.println(s1);
//reverse()
s1.reverse();
System.out.println(s1);
//delete()
s1.delete(5, 14);
System.out.println(s1);










	
	}
}
