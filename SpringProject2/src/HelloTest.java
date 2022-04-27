import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class HelloTest
{
	public static void main(String[] args)
	{
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory f=new XmlBeanFactory(r);
		Hello h=(Hello)f.getBean("info");
		h.display();
		Hello1 h1=(Hello1)f.getBean("info1");
		h1.show();
		
	}
}
