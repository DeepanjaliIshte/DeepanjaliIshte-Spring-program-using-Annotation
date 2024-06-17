package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.beans.Student;

public class Main {

	public static void main(String[] args) {
		String resource_file_path="/in/resource/applicationcontext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext();
		
		Student std=(Student)context.getBean("student");
		std.display();
	}
}
