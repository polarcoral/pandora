package pandora.bootstrap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import monica.starter.server.ServerStarter;
import pandora.spring.config.StorageBean;

public class PandoraServerBootstrap {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/META-INF/spring/applicationContext.xml");  
		StorageBean p = (StorageBean)ctx.getBean("diskStorage");  
		System.out.println("storage:         "+p.getName());
		ServerStarter container = new ServerStarter();
		try {
			container.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
