package session;

//is logical entity and user defined data types
public class Person {
	//property is defined by our meber varriable
	String name;
	String id;
	static int a=10;
	Person(String name,String id){
		this.name=name;
		this.id=id;
		System.out.print(name+""+id);
	}
     public void display() {
    	 a=20;
    	 System.out.print(this.name+""+this.id);
     }
     
}
