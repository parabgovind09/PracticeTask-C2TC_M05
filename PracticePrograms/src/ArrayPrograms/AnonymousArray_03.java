package ArrayPrograms;
//Anonymous array is created and initialized in the same line.
public class AnonymousArray_03 {

	//one dimensional array
	static void print(int a[])
	{
	  for(int i=0;i<a.length;++i)
	   System.out.print(a[i]+" ");
	}
	 
	//two dimensional array
	static void print(int a[][])
	{
	  for(int i=0;i<a.length;++i)
	  {
	   for(int j=0;j<a[i].length;++j)
	    System.out.print(a[i][j]+" ");
	 
	   System.out.println("");
	  }
	}
	
	//jagged array
	static void jagged(int a[][])
	{
	  for(int i=0;i<a.length;++i)
	  {
	   for(int j=0;j<a[i].length;++j)
	    System.out.print(a[i][j]+" ");
	 
	   System.out.println("");
	  }
	}
	  
	public static void main(String...s)
	{
	  //1d anonymous array
	  AnonymousArray_03.print(new int[]{10,20,30,40});
	 
	  System.out.println("\n");
	  
	  //2d anonymous array
	  AnonymousArray_03.print(new int[][]{{10,20},{30,40},{50,60}});
	  
	  System.out.println("\n");
	  
	  //anonymous jagged array
	  AnonymousArray_03.jagged(new int[][]{{10,20,30, 35},{30,40},{50,55,60}});  
	}
}
/*
 * Output:-
 * 
 * 10 20 30 40 

10 20 
30 40 
50 60 


10 20 30 35 
30 40 
50 55 60 


*/
