package Videoscontents;

/*
 * There are some already defined scope.
 * Singleton
 * prototype
 * request
 * session
 * globalsession
 request and session used for web application specifically.
 Singleton-It is apply by default automatically.
 Spring container will create singleton object by default.
 when we configure any class ,and then we ask its object to ioc container
 then ioc container make only single object,and whenever we called it
 ,ioc container will give the reference of this object again and again
 one object per application we can say like that.
 prototype means everytime you will get a new object.
 globalsession is used for ported application.
 
 Everytime you will call for an object to spring container it will give
 you same object.
 ApplicationContext con=new ClassPathXmlApplicationContext("Stereotype/StereoConfigue.xml");
		Student student=(Student)con.getBean("student");
System.out.println(student.hashCode());
		Student s2=con.getBean("student",Student.class);
		System.out.println(s2.hashCode());
 so basically this is what singleton scope means is.
 But if everytime you want a new object so you will have to change by default singleton
 to prototype.
 We can configure bean scope by two ways;
 one is xml
 other is annoation
 for annotation
 @Scope("prototype")
this annotation will be used with @Component only

 
 */
public class Bean_Scope24 {

}
