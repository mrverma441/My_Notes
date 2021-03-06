package Videoscontents;
/*
 * --------Standalone Collections-----------
 * scope of stand alone collection is global,we can use it anywhere,but
 normally when we give collection type only in that bean we can use it.
 *for this reason we used stanalone collections.
 *We could also give the implementation class of these collection type
 by using standalone.
 *In normal collection type it gives any class which is set by default.
 *For Xml configuration.
 	<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
	xmlns:p="http://www.springframework.org/schema/p"
	xmlns:util="http://www.springframework.org/schema/util"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd
	http://www.springframework.org/schema/util
    http://www.springframework.org/schema/util/spring-util.xsd">
<util:list list-class="java.util.Vector" id="mybestfriends">
	<value>Aman</value>
	<value>Ram</value>
	<value>Hari</value>
	<value>Lucky</value>
</util:list>



<util:map map-class="java.util.HashMap" id="fees">
	<entry key="Spring Framework" value="8000"/>
	<entry key="Django Framework" value="5000"/>
	<entry key="Hibernate Framework" value="9000"/>
		
	
	
</util:map>
<util:properties id="dbconfig">
	<prop key="driver">com.mysql.jdbc.Driver </prop>
	<prop key="username">Monu</prop>
	<prop key="password">abc</prop>
	<prop key="url">mysql:jdbc://localhost:3306/database</prop>
	
	
</util:properties>
    
   <bean class="stand.beanclass" name="bc">
   	<property name="friends" ref="mybestfriends" />
   	<property name="fs" ref="fees" />
   	 <property name="properties" ref="dbconfig" />
   			
   	
   </bean>
   
     <bean class="stand.beanclass" name="bc2">
   	<property name="friends" ref="mybestfriends" />

   	
   </bean>
  

</beans>


 */
public class Spring_Standalone_Collections {

}
