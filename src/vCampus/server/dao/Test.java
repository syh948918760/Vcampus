package vCampus.server.dao;

import vCampus.vo.Student;

public class Test {

	public static void main(String[] args) {
		StudentDaoImpl StudentDaoImpl1=new StudentDaoImpl();
		Student std1=StudentDaoImpl1.findByName("213170821");
		Student std2=StudentDaoImpl1.findByNameAndPassword("213160822", "szx123");
		System.out.println(std1.getUserName()+" "+std1.getPassword());
		
	}

}
