package arraylistDemo;

import java.util.ArrayList;
import java.util.List;

public class ArraylistClass {
	
	public static void main(String[] args) {
	List<String> namelist= new ArrayList<String>();
	
<<<<<<< HEAD
	List<String> namelist1= new ArrayList<String>();
	List<String> namelist2= new ArrayList<String>();
	
	
=======
	List<String> namelist2= new ArrayList<String>();
	
>>>>>>> c4ddb5651f5a3224a1939e59e37e1a8fc120fe2a
	//add element
	namelist.add("Ajeet");
	namelist.add("Harry");
	namelist.add("Chaitanya");
	namelist.add("Steve");
	namelist.add("Anuj");
	
	
	//add element
	namelist2.add("Ajeet");
		namelist2.add("Harry");
		namelist2.add("Chaitanya");
		namelist2.add("Steve");
		namelist2.add("Anuj");
	
	//displaying name
	System.out.println("original ArrayList");
	for(String str:namelist){
		System.out.println(str);
	}
	
	System.out.println("original ArrayList");
	for(String str:namelist){
		System.out.println(str);
	}
	
	//adding items on given positon
	namelist.add(3,"parul" );
	namelist.add(5, "rinki");
	System.out.println("changed arraylist");
	System.out.println(namelist);
	
	//deleting items
	namelist.remove(2);
	namelist.remove("parul");
	System.out.println(namelist);

}

}
