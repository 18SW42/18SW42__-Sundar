import java.util.Scanner;
class Employee
{  
    int salary ;
	int noofhour;
	public void getInfo(int salary, int nbrofhour)
	{
		this.salary=salary;
		this.noofhour=noofhour;
	}
	public void addSalary()
	{
		if(salary>=500)
		{
			salary+=10;
		}
	}
	public void  addWorkHourBonus()
	{
		if(noofhour>5)
		{
			salary+=5;
		}
	}
	public void totalSalary()
	{
		System.out.println("Your Total Salary is "+salary);
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		 Employee emp= new Employee();
		 System.out.println("Enter Your Salary:");
		 int salary=sc.nextInt();
		 System.out.println("Enter Your Work hours per Day:");
		 int noofhour= sc.nextInt();
		 emp.getInfo(salary,noofhour);
		 emp.addSalary();
		 emp.addWorkHourBonus();
		 emp.totalSalary();
	}

} 