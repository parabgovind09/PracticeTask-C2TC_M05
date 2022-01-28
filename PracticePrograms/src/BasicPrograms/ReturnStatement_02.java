package BasicPrograms;

class SumReturn  
{  
    private int a; 
    //constructor
    public SumReturn(int i)  
    {  
    	System.out.println("This is Parameterized Constructor");
        a = i;  
    }  
    //class name as return type
    public SumReturn addition()  
    {  
    	System.out.println("This is a class method with classname as return type");
        SumReturn result = new SumReturn(a + 100);  
  
        return result;  
    }  
    public void display()  
    {  
        System.out.println("Additon result: " + a);  
    }  
}  
public class ReturnStatement_02  
{  
    public static void main(String[] args)  
    {  
        SumReturn obj1 = new SumReturn(50);//a=50  
        SumReturn obj2;  
        obj2 = obj1.addition();  //a=a+100
        obj2.display();  
    }  
}  
/*
Output:-

This is Parameterized Constructor
This is a class method with classname as return type
This is Parameterized Constructor
Additon result: 150

*/