package Day27;

public class AllStrings {

	public static void main(String[] args) {
		
//StringBuffer=provides mutability and thread-safe and faster than string does changes on original string rather then creating new object
		//creating obj of string buffer
		StringBuffer b=new StringBuffer("Shweta");
		b.append(" kadam");
		//replace shweta by aryan
		b.replace(0,6,"Aryan");
		//to delete chara by index
		b.delete(7,9);
		System.out.println(b);
//String Builder=mutability and no synchronisation and faster than string buffer and does changes on original string rather then creating new object
		StringBuilder c=new StringBuilder("Vighnesh");
		c.append(" kamath");
		c.replace(0,7,"Nikita");
		System.out.println(c);
		
	}

}
