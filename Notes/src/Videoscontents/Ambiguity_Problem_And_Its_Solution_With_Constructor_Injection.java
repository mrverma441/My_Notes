package Videoscontents;

/*
 * Create a class inside a package.
 * Give name as addition to this class.
 * declare two variable.
 * private int a;
 * private int b;
 After it write the following code to your addition class
 public Addition(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Constructor:int,int");
	}
	public Addition(double a,double b)
	{
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("Constructor:double,double");
	}
	public Addition(String a,String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Constructor: String,String");
		
	}
	public void doSum()
	{
		System.out.println("Sum is=  "+(this.a+this.b));
	}
}
After it write following code in your xml class

<bean class="ambiguity.Addition" name="add">
   	<constructor-arg value="12"/>
   	<constructor-arg value="34"/>
   		
   	
   	
   </bean>    	 

Call the method by writing following code in your main test class
ApplicationContext context=new ClassPathXmlApplicationContext("ambiguity/Configue.xml");
        Addition p=(Addition) context.getBean("add");

        p.doSum();


 */
public class Ambiguity_Problem_And_Its_Solution_With_Constructor_Injection {

}
