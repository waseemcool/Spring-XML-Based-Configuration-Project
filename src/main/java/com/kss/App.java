package com.kss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );

        //Student student = new Student();
        //student.show();

        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

        //Student student = context.getBean(Student.class);
        Student student = (Student) context.getBean("st1");

        //student.show();

        //student.age = 20;
        //System.out.println(student.age);

        //student.setAge(20);
        //System.out.println(student.getAge());

        //System.out.println(student.getAge());
        //System.out.println(student.getRollNo());

        student.writeExam();
    }
}
