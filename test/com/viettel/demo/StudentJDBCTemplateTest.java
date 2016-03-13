package com.viettel.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by hienpt on 3/13/16.
 */
public class StudentJDBCTemplateTest {
    ApplicationContext context;
    StudentJDBCTemplate studentJDBCTemplate;

    @Before
    public void setUp() throws Exception {
         context = new ClassPathXmlApplicationContext("Beans.xml");
         studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");

    }

    @Test
    public void testGetStudent() throws Exception {
        Student t = studentJDBCTemplate.getStudent(1);
        assertNotNull(t);
    }

    @Test
    public void testListStudents() throws Exception {
       List<Student> students = studentJDBCTemplate.listStudents();
       assertEquals(9, students.size());
    }

    @Test
    public void testDelete() throws Exception {
    }

    @Test
    public void testUpdate() throws Exception {
    }
}