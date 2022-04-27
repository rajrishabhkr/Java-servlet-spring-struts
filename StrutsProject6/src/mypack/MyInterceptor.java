package mypack;
import java.util.*;
import javax.servlet.*;
import org.apache.struts2.*;
import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;
public class MyInterceptor implements Interceptor 
{
         
         public void init() 
         {
         }
         public String intercept(ActionInvocation ai) throws Exception 
         {
        	 ValueStack vs=ai.getStack();
        	 ServletRequest request=ServletActionContext.getRequest();
        	 Enumeration<String> e=request.getParameterNames();
        	 while(e.hasMoreElements())
        	 {
        		 String pName=e.nextElement();
        		 String pValue=request.getParameter(pName);
        		 vs.setValue(pName, pValue);
        		 
        	 }
        	 String str=ai.invoke();
        	 return str;
         }
         public void destroy() 
         {	
         }
}
