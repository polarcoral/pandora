package pandora.spring.config;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class MonicaBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
	 protected Class getBeanClass(Element element) {  
	        return StorageBean.class;  
	    }  
	 
	 protected void doParse(Element element, BeanDefinitionBuilder bean) {  
	        String name = element.getAttribute("name");  	     
	        if (StringUtils.hasText(name)) {  
	            bean.addPropertyValue("name", name);  
	        }  
	       
	    }  
}
