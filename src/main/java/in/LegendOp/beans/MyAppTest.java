package in.LegendOp.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppTest {

	public static void main(String[] args) {

		ApplicationContext cxmt = new ClassPathXmlApplicationContext("spring-beans.xml");
	}
	
}
