package Videoscontents;

/*
 * create one package with name life_cycle
 * create one bean class called it Samosa name.
 * give property price;
 * generate getter and setters in source option
 * generate Constructor from superclass
 * make to string method to print the properties.
 this is the code of samosa class.
 public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
}
*copy xml file or create one new xml file and paste it to life_cycle package.
*Here it is the xml code.
<bean class="life_cycle.Samosa" name="s1" init-method="init" destroy-method="destroy">
   	<property name="price" value="10"/>
create one test class which contain our main method
AbstractApplicationContext context=new ClassPathXmlApplicationContext("life_cycle/Configue.xml");
        context.registerShutdownHook();

		Samosa s1=(Samosa) context.getBean("s1");
        System.out.println(s1);
        
 *Make two methods in bean class 
 public void init()
	{
		System.out.println("We are inside init method");
	}
	public void destroy()
	{
		System.out.println("We are inside destroy method");
	}
	Then define these methods in configue xml file
	        context.registerShutdownHook();
give this method for destroy method which is in AbstractApplicationContext
 * 
 */
public class Implementing_Life_Cycle_M_Using_XML {

}
