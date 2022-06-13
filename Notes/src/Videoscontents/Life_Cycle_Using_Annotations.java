package Videoscontents;

/*
 *@PostConstruct-work like init
 *@PreDestroy-
 create one bean class called it Example name.
 * give property subject;
 * generate getter and setters in source option
 * generate Constructor from superclass
 * make to string method to print the properties.
 this is the code of Example class.
-----code for xml class-----
	<bean class="life_cycle.Example" name="example">
   		<property name="subject" value="Math"/>
   		
   	</bean>
  -----code for test class------
  Example e1=(Example) context.getBean("example");
		System.out.println(e1);
for adding the dependency for annotation
search "PostConstruct String" in chrome brwoser
open first link
scroll down 
copy the code given in java 9+
paste it to your pom xml
save.
 *
 */
public class Life_Cycle_Using_Annotations {

}
