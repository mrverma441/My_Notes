package spring_jdbc;
/*
 * Spring jdbc is a powerful mechanism to connect to the database and execute SQL queries.
 * Spring jdbc module(JdbcTemplate)
 * By using this module we can connect to the database,and once connection
 is established we can fire the sql queries,then we can perform such
 operations like 
 Insertion,updation,deletion,Select;
 *JDBC is an API to perform operation with database;
 *-----------problems of jdbc-------------
 *1-We need to write a lot of code
 Connection open
 statement
 execute
 connection close
 everytime we have to write all these steps;
 *2-Exception handling problem:Checked Exception-SQLException
 *3-Repeating of all these codes from one to another database logic
 is a time consuming task.
 *---------------Spring jdbc-------------------------
 *Solution of jdbc problems are provided by spring jdbc.
 *Spring jdbc provides class JdbcTemplate which has all the important methods to perform operation
 *with database.
 *We need JdbcTemplate object so we will be able to fire the queries.
 *It will need the object of dataSource.
 *DataSource is basically a interface.
 *this datasource contain all the information of database like url;
 *for this interface we have one implementation class called
 DriverManagerDataSource
 so we are going to inject the object of DriverManagerDataSource.
 information-
 driverClassName
 url
 username
 password
 we need to provide these following properties to our DriverManagerDataSource
 JdbcTemplate Methods->
 Update()->insert,update,delete
 execute()->select queries.
 
 
 */
public class Introduction_1_Tospring_jdbc {

}
