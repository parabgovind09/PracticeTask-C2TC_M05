package Interface;

interface Printable{  
void print();  
}  

interface Showable{  
void show();  
}  

public class InterfaceProgram_03 implements Printable,Showable{  
    public void print(){
    	System.out.println("Hello");
    }  
    public void show(){
    	System.out.println("Welcome");
    }  
  
public static void main(String args[]){  
	InterfaceProgram_03 obj = new InterfaceProgram_03();  
    obj.print();  
    obj.show();  
    }  
}  
