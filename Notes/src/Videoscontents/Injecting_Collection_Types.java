package Videoscontents;

/*
 * Create one package by right click on src/main/java
 * give it name as collection or whatever your choice. 
 * Create one bean class in the newly created package.
 * give it any name let suppose Emp.
 * instantiate the variable or properties in emp (bean)class.
 * click on source.
 * click on generate getter and setters.
 * click on source 
 * click on generate constructors using fields
 * click on source 
 * click on generate constructor from super class.
 Paste below codes to your xml class.
  <bean name="emp1" class="collection.Emp">
  	<property name="name" value="Radhe"/>
<property name="phones">
      <list>
         <value>7534050774</value>
          <value>8534931380</value>
         <value>8057830417</value>
         <value>9760492166</value>
         
         </list>
         </property>
         <property name="addresses">
      <set>
         <value>Delhi</value>
          <value>Kotdwara</value>
         <value>Dhampur</value>
         <value>noida</value>
  
         
         </set>
         </property>
         
         
         <property name="courses">
  <map>
  <entry key="java" value="1month"/>
  <entry key="python" value="2month"/>
  <entry key="c" value="3month"/>
  	
  
  </map>
  </property>
         
     
     
  	
  </bean>    	 

   
*write below code to your main class
ApplicationContext context=new ClassPathXmlApplicationContext("collection/collection_configue.xml");
        Emp emp1=(Emp) context.getBean("emp1");
        System.out.println(emp1.getName());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getCourses());

 * 
 */
public class Injecting_Collection_Types {

}
