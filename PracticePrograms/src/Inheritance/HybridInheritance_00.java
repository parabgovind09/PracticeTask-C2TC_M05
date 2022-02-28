package Inheritance;

class HumanBody
{
   public void displayHuman()
   {
     System.out.println("Method defined inside HumanBody class");
   }
}
interface Male
{
 public void male_name();
}
interface Female
{
 public void female_name();
}

public class HybridInheritance_00 extends HumanBody implements Male, Female
{
 public void show()
 {
   System.out.println("Implementation of male_name() and female_name method defined in interfaces Male and Female");
 }  
 
 public void displayChild()
 {
   System.out.println("Method defined inside Child class");
 }
 

@Override
public void female_name() {
	System.out.println("Ankita");
}

@Override
public void male_name() {
	System.out.println("Govind");
}
public static void main(String[]args)
{
  HybridInheritance_00 obj = new HybridInheritance_00();
  System.out.println("Implementation of Hybrid Inheritance in Java");
  obj.displayHuman();
  obj.displayChild();
  obj.show();
  obj.male_name();
  obj.female_name();
}
}
