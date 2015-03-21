package lunaris;

import java.util.Arrays;

import lunaris.service.ExampleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class Start {

	public static ApplicationContext context;

	@Autowired
	protected ExampleService exampleService;

	public static void main(String[] args) {

		Start start = new Start();

		start.context = new ClassPathXmlApplicationContext("applicationContext.xml");
		String[] beanDefinitionNames = start.context.getBeanDefinitionNames();
		System.out.println("*************************************************");
		for (String obj : Arrays.asList(beanDefinitionNames)) {
			System.out.println(obj);
		}
		System.out.println("*************************************************");
		System.out.println(start.exampleService);
		ExampleService exampleService = (ExampleService) start.context.getBean("exampleServiceImpl");
		System.out.println(exampleService.getInfo());
		return;

	}

}
