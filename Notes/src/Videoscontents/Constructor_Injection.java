package Videoscontents;

/*
 *---------Constructor-Injection----------------
 *Create one Person class in new pckg
 *define some property in Person class;
    private String name;
	private int personId;
	private Certi certi;
	private List<String>list;
*Make One Constructor in Person class itself;
public Person(String name,int personId,Certi certi,List<String>list)
	{
		this.name=name;
		this.personId=personId;
		this.certi=certi;
		this.list=list;
		
	}

*Make to string method by clicking on source then Generate toString()
@Override
	public String toString() {
		return this.name+" : "+this.personId+""+this.certi.name+""+"  "
				+ "   "+this.list;
		
	}
*create one configuration xml file;
*open xml file,write following code in xml configuration file.
<bean class="constructor_Injection.Certi" name="cer">
    		<constructor-arg value=" Android using kotlin"/>
    	</bean>
   <bean class="constructor_Injection.Person" name="person">
   	<constructor-arg value="MONU_VERMA"/>
   	<constructor-arg value="12" type="int"/>
   	<constructor-arg ref="cer"/>
   			<constructor-arg>
   		 <list>
         <value>Monu</value>
          <value>Shuaib</value>
         <value>Mukul</value>
         <value>Ritik</value> 
         </list>
   	</constructor-arg>	
   </bean>  
*define one Certi class for the reference type concept .
*And give this code there
public class Certi {
	String name;

	public Certi(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
*create one Test class and give following code for printing its object
ApplicationContext context=new ClassPathXmlApplicationContext("constructor_Injection/CIConfigue.xml");
        Person p=(Person) context.getBean("person");
        System.out.println(p);
*
*/
public class Constructor_Injection {

}
