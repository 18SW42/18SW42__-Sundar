class Shape
{  
  void draw()
    {
	  System.out.println("DRAW");
	} 
  void erase()
    {
	  System.out.println("ERASE");
	} 
}  
class Square extends Shape{  
   void draw()
    { 
	   System.out.println("DRAW A SQUARE");
	}  
void erase()
   {
	 System.out.println("ERASE SQUARE");
	}
}  

class Triangle extends Shape
{  
  void draw()
    {
	  System.out.println("DRAW A TRIANGLE");
	}  
  void erase()
    { 
	  System.out.println("ERASE A TRIANGLE");
	}
}  
class UsingPolymorphism
 {  
    public static void main(String args[])
	{
      Shape s;  
      s=new Square();  
      s.draw();
      s.erase();  
      s=new Triangle();  
      s.draw();  
      s.erase();
 }  
 }   