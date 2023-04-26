package org.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dto.Person;

/**
 * @author chengyongw
 * @Package org.springframework
 * @date 2023/4/26 20:25
 * @description
 */
public class Main {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person.getName());
	}
}