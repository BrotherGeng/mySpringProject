package org.lanqiao.test;

import org.lanqiao.entity.AllCollectionType;
import org.lanqiao.entity.Course;
import org.lanqiao.entity.Student;
import org.lanqiao.factory.CourseFactory;
import org.lanqiao.newinstance.ICourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tes01 {
	
	
	public static void springIoc() {
//		Student student = new Student();
//		student.setStuNo(1);
//		student.setStuName("zs");
//		student.setStuAge(23);
//		System.out.println(student);
		
		//Spring�����Ķ���conext
		ApplicationContext conext = new ClassPathXmlApplicationContext("applicationContext.xml") ;
		//ִ�д�springIOC�����л�ȡһ�� idΪstudent�Ķ���
		Student student = (Student)conext.getBean("student") ;
		System.out.println(student);
		//1.new
		//2.�������Եĸ���
		
	}
	
	public static void learnCourse() {
		Student student = new Student();
		student.learnHtml();
		student.learnJava(); 
	}
	
	public static void collectionDemo() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
		AllCollectionType type = (AllCollectionType)context.getBean("collectionDemo") ;
		System.out.println(type);
	}
	
	
	public static void testDI() {
		ApplicationContext conext = new ClassPathXmlApplicationContext("applicationContext.xml") ;
		Course course = (Course)conext.getBean("course") ;
		course.showInfo();
	}
	
	public static void learnCourseWithFactory() {
		Student student = new Student();
		student.learn("html");		
		
	}
	
	public static void learnCourseWithIoC() {
		ApplicationContext conext = new ClassPathXmlApplicationContext("applicationContext.xml") ;
		//��IOC��ȡѧ������
		Student student = (Student)conext.getBean("student") ;
		student.learn("javaCourse");
	}
	
	public static void main(String[] args) {

//		learnCourse();
//		learnCourseWithFactory();
//		learnCourseWithIoC();
		testDI();
//		collectionDemo();
		
		
		
	}
}
