package Videoscontents;

/*
 * InitializingBean
 * DisposableBean
 * create one bean class called it Pepsi name.
 * give property price;
 * generate getter and setters in source option
 * generate Constructor from superclass
 * make to string method to print the properties.
 this is the code of Pepssi class.
 
 public class Pepsi implements InitializingBean ,DisposableBean{

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Taking pepsi: Init");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Taking pepsi: Destroy");

		
	}
	
}

---Code for test class-------
System.out.println("+++++++++++++++++++++");
        Pepsi p1=(Pepsi) context.getBean("p1");
        System.out.println(p1);
-----Code for xml file-------
<bean class="life_cycle.Pepsi" name="p1">
	<property name="price" value="5"/>


 */
public class LifeCycleMethod_UsingInterfaces {

}
