package spring_jdbc;
/*
 * open mysql command line client
 * create new database in which we will work
 create database springjdbc;
 show databases;
 use springjdbc;
create table student(id int primary key ,name varchar(100) not null,city varchar(200)); * create table in which we will work
 *  show tables;
 * insert into student(id,name,city) values(222,'Monu Verma',"Kotdwara");
 * select *from student;
 * create one class give it name as Student
 * define all field in student class that we had given in our database
 * Generate getter nd setters
 * generate constructor from superclass
 * generate constructor using fields
 * generate tostring() methods
 * give following code after creating xml file
 <?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
	xmlns:p="http://www.springframework.org/schema/p"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">    
    	<bean class="org.springframework.jdbc.datasource.DriverManagerDataSource" name="ds">
    		<property name="driverClassName" value="com.mysql.cj.jdbc.Driver"/>
            <property name="url" value="jdbc:mysql://localhost:3306/springjdbc"/>
            <property name="username" value="root"/>
            <property name="password" value="7534050774"/>		
    	</bean>
    	<bean class="org.springframework.jdbc.core.JdbcTemplate" name="jdbcTemplate" p:dataSource-ref="ds"/>	
</beans>


 */
public class Database_3_setup {

}
