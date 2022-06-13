package servlet_notes;
/*
 * ------------------1-Introduction to servlet --------------------------
 * Servlet is simple java program that runs on server and capable of handling 
 request and generating dynamic response.
 *--------------------2-Installing Apache Tomcat server----------------------
 *--------------------3-Configuration Apache Tomcat with Netbeans--------------
 *---------------------4-creating servlet using javax.servlet.Servlet Interface---------------
 *javax.servlet-package
 *Servlet-Interface
 *It has 5 nethods
 *1-init(lifecycle)-
 *2-getServletConfig(non-lifecycle)
 *3-service(lifecycle)
 *4-getServletInfo(non-lifecycle)
 *5-destroy(lifecycle)
 *class MyServlet Implements Servlet
 {
 override all the methods
 }
 *for executing this servlet we will have to do mapping
 *for this we will use web.xml-Deployment descriptor.
 *------------------------5-creating Servlet using GenericSeervlet class-----------
 *------------------------6-Create Servlet using HttpServlet-------------------------
 *------------------------7-Life-Cycle of Servlet----------------------------------
 *Load and instantiate
 *call init() method for server initialization.
 *service() method  get called for processing the request.
 *destroy() method
 *Service() method is responsible for processing logic.this is most important method of servlet.
 *-------------------------8-Submit form to Servlet------------------------------
 *-------------------------9-Welcome File list &RequestDispatcher--------------------------------
 *Welcome file list or welcome file are the tags in web.xml that is used for configure the home page of your site
 *RequestDispatcher -It is responsible for dispatching the request to another resource it may be html,servlet or jsp.
 *---------------------------10-Internal working of servlet-------------------------
 *---------------------------11-what is deployment descriptor?|web.xml--------------------
 *File that contains configuration of your java web application.
 *It resides in the WEB-INF folder
 *<web-app>
 
 servlet declaration
 servlet-mapping
 ibitialization parameter
 welcome file config
 filter
 listener
 session config
 etc............
 *----------------------12-Parameters in java web application-----------------
 *Parameter -These are those values which are provided by user to any servlet to
 process the request during the request operation.
 *Servlet only read that value for request processing.
 *Parameter mostly data send using form,initialization parameter etc.
 *How to get initialization parameter:
 String name=request.getParameter("Name_Of_Your_Parameter");
 Now process your request.
 *-----------------------------13-what are the attributes in java web application?-----------
 *Attributes-these are the objects that are attached by one servlet to object(session,request,config,context etc)
 *and other servlet can fetch that object process the logic.
 *servlet can easily modify,add and remove the content of attribute when required.
 *How to perform operation with attributes.
 *setAttribute(String name,String value)
 *Object value=getAttribute(String name)
 *removeAttribute(String name)
 *----------------------------14-Session Tracking in servlet|State management in servlet-----------------
 *Session tracking is a way to maintain state(data)of an user.
 *It is also known as state management.
 *Session Tracking Techniques -:
 *There are four techniques used in session tracking:
 *1-Cookies
 *2-Hidden form field.
 *URL rewriting
 *HttpSession
 *---------------------------15-Why to track session?--------------------------
 *---------------------------16-Cookies in servlet---------------------------
 *cookies are the textual information which are stored in key value pair format to the client's browser during multiple requests.
 *How to use cookies in java.
 *In order to use cookies in java, there is a cookie class in java present in 
 javax.servlet.http package.
 *To make cookie just create a object of cookie class and pass name and its value.
 *How to add cookies to response
 *To add cookie in response just use addCookie(cookie) method of response interface.
 *------------------------------17-Cookie Example------------------------------
 *------------------------------18-Registration Module#0----------------------
 *-------------------------------19-Registration module#1--------------------
 *-------------------------------20-Registration module#2---------------------
 *-------------------------------23-URL Rewriting using java servlet--------------------------
 *URL rewriting is a process of appending or modifying any url structure while loading a page.
 *s1?name=john&value=101
 *------------------------------24-URL REWRITING EXAMPLE--------------------------------
 *------------------------------25-Hidden form field in java servlet-----------------------
 *Hidden form field is a hidden(invisible) textfield is used for maintaining the state of an user
 *<input type="hidden" name="user_name" value="Monu Verma"/>
 *---------------------------------Session tracking using HttpSession----------------------
 *Session simply means small interval of time.
 *used for state management
 *
 *
 *
 *
 *
 
 
 
 
 </web-app>
 *
 */
public class notes {

}
