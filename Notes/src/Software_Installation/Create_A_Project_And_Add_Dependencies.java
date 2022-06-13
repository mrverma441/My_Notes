package Software_Installation;

/*
 * -------Creating a New Project---------
 * Click on file
 * click on new 
 * click on Maven project
 * click on next 
 * select Internal from list
 * select quickstart
 * click on next
 * Give groupid
 * Give artifact id
 * Give package name
 * click on finish
 ----------Add dependencies----------
 *open pom.xml
 *search "spring core maven" ,for core dependencies in chrome browser
 *click on first link in browser.
 *select any version of dependecies
 *click on any version
 *copy the code 
 *paste it to pom.xml between <dependencies>  <dependency>
 *search "spring context" for context dependencies in chrome browser
 *select the same version that you have selected for core dependencies
 *paste it to pom.xml after down to previous dependencies.
 *Now we are able to perform any practical related to dependencies.
 *This will be fetch from the internet into our project.
 *If still any error persist in your code 
 *Then follow these steps:
 *click on maven project
 *right click on maven
 *click on update project
 *select your project
 *click on ok
 *---------Creating beans -Java pojo->beans is just nothing its a java class
 which contains some properties and contains the getters setters
 methods.
 *Right click on your package of your project
 *click on new
 *click on class
 *give any name to the class.
 *Now this is your beans class this can hold the data.
 *take some properties like -private int StudentId;
 *Now we will have to generate getters and setters and then constructor.
 *click on source in eclipse menu bar or select all your properties
 and right click and click on generate getters and setters
 *click on generate getter and setters.
 *click on selectall
 *click on generate.
 *now for generating constructor
 *click on source again in eclipse menu bar
 *click on "generate constructor using fields"
 *click on generate.
 *now for generate super class constructor.
 *click on source
 *click on generate constructor for super class.
 *click on generate.
 *Now here we have Getters and setters.
 *we have two constructors here one is default and one is paramerized.
 *Now we have to generate to string method
 *click on source.
 *click on generate tostring()
 *click on generate.
 toString() method-when we will print the object or its reference variable 
 then all the values of its properties like studentid,studentname will
 get printed with the help of this method.
 
 *---------creating configuration file-Configue.xml----------------
 name of xml file could be anything.
 *right click on our src/main/java 
 *click on new
 *click on other
 *search xml
 *click on XML File
 *click on next
 *give any name to your xml file
 *click on finish.
 *Now first of all you will have to defined namespace in this xml file
 *so get this by the documentation itself available on the internet.
 *search "spring 5 documentation pdf"
 *save this pdf for your reference.
 *click on first link
 *and open pdf.
 *click on configuration metadata in pdf which is in core technologies.
 *scroll down the pdf little bit
 *there will be one heading like "The following example shows the basic
 Structure of XML-based configuration metadata:
 *copy the beans code only or only this namespace.
 <?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
	xmlns:p="http://www.springframework.org/schema/p"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">    
    
      	 

   
    

</beans>


 *Give this code inside beans,
    <!--  this is our beans -->    
    <bean class="com.springcore.Student/Packagename.classname" name="student1">
    	<property name="studentId">
    		<value>22344</value>
    	</property>    	
    	<property name="studentName">
    		<value>John</value>
    	</property>
    	
    	<property name="studentAddress">
    		<value>
    			Lucknow
    		</value>
    	</property>
    
    </bean>
*Setter injection we already have done
*Main class :Which can pull the object and use.
*ApplicationContext context=new ClassPathXmlApplicationContext("Configue.xml");
        Student student1=(Student) context.getBean("student1");
        System.out.println(student1);
        
        
        *************--------------
                  Video-Property injection using p schema and using 
                  value as attribute-------------------*********
*    	
*    Here we are using value attribute to give the value to our properties.
*    
    <property name="studentId" value="23424"/>
    <property name="studentName" value="Monu Verma"/>
    <property name="studentAddress" value="Lucknow"/>
************Using p schema*********
Before using this method we have to pass this link
	xmlns:p="http://www.springframework.org/schema/p"

    <bean class="com.springcore.Student" name="student1" p:studentId="23421" p:studentName="Ram" p:studentAddress="Kotdwara"/>

*    
*        

*    

 */
public class Create_A_Project_And_Add_Dependencies {

}
