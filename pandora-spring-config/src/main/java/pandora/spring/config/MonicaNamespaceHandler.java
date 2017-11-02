package pandora.spring.config;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MonicaNamespaceHandler extends NamespaceHandlerSupport{

	public void init() {
		 registerBeanDefinitionParser("storage", new MonicaBeanDefinitionParser());  
		
	}

}
