package com.yedam.generic;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		
	}
	
	public static void main(String[] args) {
		
		Course<Person> crsPerson = new Course<>("일반인과정", 5);
		crsPerson.add(new Person("일반인"));
		crsPerson.add(new Worker("직장인"));
		crsPerson.add(new Student("학생"));
		crsPerson.add(new HighStudent("고등학생"));
		
		
		Course<Worker> crsWorker = new Course<>("직장인과정", 5);
		crsWorker.add(new Worker("일반인1"));
		
		
		Course<Student> crsStudent = new Course<>("학생과정", 5);
		crsStudent.add(new Student("학생1"));
		crsStudent.add(new HighStudent("고등학생1"));
		
		Course<HighStudent> crsHighStudent = new Course<>("고등학생과정", 5);
		crsHighStudent.add(new HighStudent("고등학생2"));
		
		//일반인 등록가능. Course<?>
		registerCourse(crsPerson);
		registerCourse(crsWorker);
		registerCourse(crsStudent);
		registerCourse(crsHighStudent);
		
		//직장인 등록가능. Course<? super Wokker>
		registerCourseWorker(crsPerson);
		registerCourseWorker(crsWorker);
		
		//학생등록가능 Course<? extends Student>
		registerCourseStudent(crsStudent);
		registerCourseStudent(crsHighStudent);
		//고등학생가능.
		registerCourseStudent(crsHighStudent);
	}
}
