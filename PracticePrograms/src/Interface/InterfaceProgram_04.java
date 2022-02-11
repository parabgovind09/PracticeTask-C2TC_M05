package Interface;

interface p{  
void print();  
}  

interface s extends p{  
void show();  
}  

public class InterfaceProgram_04 implements s{  
	
    public void print(){
    	System.out.println("Hello");
    }  
    public void show(){
    	System.out.println("Welcome");
    	}  
  
public static void main(String args[]){  
	
	InterfaceProgram_04 obj = new InterfaceProgram_04();  
    obj.print();  
    obj.show();  
    
    }  
}
