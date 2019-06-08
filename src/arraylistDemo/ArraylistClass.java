package arraylistDemo;

import java.util.ArrayList;
import java.util.List;

public class ArraylistClass {
	
	public static void main(String[] args) {
	List<String> namelist= new ArrayList<String>();
	
	//add element
	namelist.add("Ajeet");
	namelist.add("Harry");
	namelist.add("Chaitanya");
	namelist.add("Steve");
	namelist.add("Anuj");
	
	//displaying name
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
