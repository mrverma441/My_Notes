package Videoscontents;
/*
 * 
 * Create one package by right click on src/main/java
 * give it name as reference_Type or whatever your choice. 
 * Create one  class in the newly created package.
 * give it any name let suppose A.
 * create one more class and give it somename let suppose B.
 * generate getters and setters for class A
 * generate constructor from super class for class A
 * generate tostring method for class A.
 * generate getters and setters for class B
 * generate constructor from super class for class B
 * generate tostring method for class B.
 * now create one xml file in the same pckg
 * or we can copy-paste previous xml file to our newly created package
 Paste this code to your xml 
 <bean class="reference_type.B" name="bref">
   	<property name="y" value="90"/>

   	
   	
   </bean>    	 
   <bean class="reference_type.A" name="aref">
   	<property name="x" value="12"/>
   	<property name="ob" ref="bref">

   		
</property>

   		
   	

   	
   	
   </bean>

   
    
for access paste this code
 ApplicationContext context=new ClassPathXmlApplicationContext("reference_type/Ref_Configue.xml");
        A a=(A) context.getBean("aref");
        System.out.println(a.getX());
        System.out.println(a.getOb().getY());
        System.out.println(a);
       


 */


public class Injecting_Reference_Type {

}
