import java.util.Scanner;

class AreaOfRectangle 
{
	int l;
	int b;
	public AreaOfRectangle(int l, int b){
	this.l=l;
	this.b=b;
}

public int returnArea(){
int area=l*b;

return area;
}
public static void main(String[] args){
Scanner ob=new Scanner(System.in);
System.out.println("Enter  length of Rectangle :- ");
int length=ob.nextInt();

System.out.println("Enter  breadth of Rectangle :- ");
int breadth=ob.nextInt();


AreaOfRectangle ar=new AreaOfRectangle(length,breadth);


System.out.println("Area  of rectangle is: "+ar.returnArea());
}

} 