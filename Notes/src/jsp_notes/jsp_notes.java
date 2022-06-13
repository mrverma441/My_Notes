package jsp_notes;
/*
 * ---------------------27-Introduction to jsp------------------------
 * jsp is the extension of servlet technology but JSP provides more functionality
 than servlet.
 
 *---------------------------28-Why jsp ? Disadvantages of servlet---------------
 * 1-static content are generated by java from inside servlet,Designing in servlet
  is difficult.
 * 2-for every request in servlet you have to write service method which is very
  tiresome process.
 * 3-Whenever modification is made in static content then servlet needs to 
 recompiled and redeployed.
 * ---------------------------29-Important Tags of JSP----------------------
 * Declaration tag
 * <%! variables;
 * Methods; %>
 * Scriptlet tag
 * <% java source code %>
 * Expression tag <%= statement %>
 * -----------------------------30-JSP directive|Directive tags in jsp------------
 * 1-Page directive
 * 2-Include directive
 * 3-Taglib directive-is used when we want to use other tag library in our jsp page
 such as JSTL(JSP standard tag library )
 * ---------------------------31-JSP taglib directive---------------------
 * ---------------------------32-Error handling in jsp--------------------
 * ---------------------------34-Creating custom tags in JSP---------------
 * create a TagHandler class
 * Create a TLD(Tag Lib Descriptor) file
 * ---------------------------35-Custom tag with attribute in jsp---------------
 * ---------------------------36-JSP implicit object----------------------------
 * SP implicit objects are created during the translation phase of JSP to the servlet.
 * These objects can be directly used in scriptlets that goes in the service method
 * they are created by the container automatically,and they can be accessed using objects.
 * --------------------------37-How to redirect from one page to another page in jsp-------------
 * --------------------------38-Filters---------------------------------------
 * a filter is an object that is invoked at the preprocessig and postprocessing of a request
 * Before and after servlet execution for filter data.
 * The servlet filter is pluggable,i.e.its entry is defined in the web.xml file
 ,If we remove the entry of filter from the web.xml file,filter will be removed automatically
 and we dont need to change the servlet.
 -------usage of filters---------
 Authentication and authorization  of request for resources.
 Formatting of request body or header before sending it to the servlet.
 Compressing the response data sent to the client.
 Alter response by adding some cookies,header information etc.

 *---------Filter API----------------
 *Filter
 *FilterChain 
 * FilterConfig
 * -------------------------------41-JSTL-----------------------------
 * JSP standard tag library
 * The JSP standard Tag library is a collection of predefined tags to simply the jsp development.
 * Advantages of JSTL:
 * Fast development JSTL provides many tags that simplify the JSP.
 * Code Reusability we can use the JSTL tags on various pages
 * No need to use scriptlet tag it avoids the use of scriptlet tag.
 * Why JSTL IS needed ?
 * Core tags-Variable support,URL management,flow control etc.
 * Functional tags-:String manupulation
 * Formatting tas-Use for formatting like date formatting.
 * XML tags-:For XML documents;
 * SQL tags:The JSTL SQL tags provide SQL support.
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class jsp_notes {

}
