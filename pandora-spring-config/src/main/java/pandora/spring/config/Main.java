package pandora.spring.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/META-INF/spring/applicationContext.xml");  
		StorageBean p = (StorageBean)ctx.getBean("diskStorage");  
		System.out.println("storage:         "+p.getName());
	}
}
