package com.dmai.spring.config;

import com.dmai.spring.bean.Cat;
import com.dmai.spring.bean.Person;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

@Import({Person.class, MainConfig.MyImportRegister.class})
@Configuration
public class MainConfig {

//	@Bean
//	public Person person() {
//		Person person = new Person();
//		person.setName("lcd");
//		return person;
//	}

	// BeanDefinitionRegistry : Bean定义信息注册中心; 图纸中心, 里面都是BeanDefinition
	static class MyImportRegister implements ImportBeanDefinitionRegistrar {
		@Override
		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
			// BeanDefinition
			RootBeanDefinition catBeanDefinition = new RootBeanDefinition();
			// Spring 这个BeanDefinition的类型， 名字
			catBeanDefinition.setBeanClass(Cat.class);
			registry.registerBeanDefinition("tomcat",catBeanDefinition);
		}
	}
}
