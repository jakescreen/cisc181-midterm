package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Student_Test {
	static ArrayList<Student> studentList = new ArrayList<Student>();
	static ArrayList<Section> sectionList = new ArrayList<Section>();
	static ArrayList<Semester> semesterList = new ArrayList<Semester>();
	static ArrayList<Course> courseList = new ArrayList<Course>();
	static ArrayList<Enrollment> enrollmentList = new ArrayList<Enrollment>();
	@BeforeClass
	public static void setup() throws PersonException {
		try {
			Course course1 = new Course(UUID.randomUUID(), "Science1", 81, eMajor.CHEM);
			Course course2 = new Course(UUID.randomUUID(), "Science2", 91, eMajor.PHYSICS);
			Course course3 = new Course(UUID.randomUUID(), "Science3", 35, eMajor.CHEM);
			courseList.add(course1);
			courseList.add(course2);
			courseList.add(course3);
			
			Semester semester1 = new Semester(UUID.randomUUID(), new Date(2017, 7, 29), new Date(2017, 12, 14));
			Semester semester2 = new Semester(UUID.randomUUID(), new Date(2018, 2, 4), new Date(2018, 5, 24));
			semesterList.add(semester1);
			semesterList.add(semester2);
			
			Section section1 = new Section(course1.getCourseID(), semester1.getSemsterID(), UUID.randomUUID(), 251);
			Section section2 = new Section(course1.getCourseID(), semester2.getSemsterID(), UUID.randomUUID(), 252);
			Section section3 = new Section(course2.getCourseID(), semester1.getSemsterID(), UUID.randomUUID(), 253);
			Section section4 = new Section(course2.getCourseID(), semester2.getSemsterID(), UUID.randomUUID(), 254);
			Section section5 = new Section(course3.getCourseID(), semester1.getSemsterID(), UUID.randomUUID(), 255);
			Section section6 = new Section(course3.getCourseID(), semester2.getSemsterID(), UUID.randomUUID(), 256);
			sectionList.add(section1);
			sectionList.add(section2);
			sectionList.add(section3);
			sectionList.add(section4);
			sectionList.add(section5);
			sectionList.add(section6);
			
			Student student1 = new Student("Spencer", "Elliot", "Frederick", new Date(1995,2,26), eMajor.CHEM,  "652 Second Avenue Los Angeles California 89755", "203-985-3651", "sfrederick@udel.edu");
			Student student2 = new Student("Spencer", "Elliot", "Frederick", new Date(1995,2,26), eMajor.CHEM,  "652 Second Avenue Los Angeles California 89755", "203-985-3651", "sfrederick@udel.edu");
			Student student3 = new Student("Spencer", "Elliot", "Frederick", new Date(1995,2,26), eMajor.CHEM,  "652 Second Avenue Los Angeles California 89755", "203-985-3651", "sfrederick@udel.edu");
			Student student4 = new Student("Spencer", "Elliot", "Frederick", new Date(1995,2,26), eMajor.CHEM,  "652 Second Avenue Los Angeles California 89755", "203-985-3651", "sfrederick@udel.edu");
			Student student5 = new Student("Spencer", "Elliot", "Frederick", new Date(1995,2,26), eMajor.CHEM,  "652 Second Avenue Los Angeles California 89755", "203-985-3651", "sfrederick@udel.edu");
			Student student6 = new Student("Spencer", "Elliot", "Frederick", new Date(1995,2,26), eMajor.CHEM,  "652 Second Avenue Los Angeles California 89755", "203-985-3651", "sfrederick@udel.edu");
			Student student7 = new Student("Spencer", "Elliot", "Frederick", new Date(1995,2,26), eMajor.CHEM,  "652 Second Avenue Los Angeles California 89755", "203-985-3651", "sfrederick@udel.edu");
			Student student8 = new Student("Spencer", "Elliot", "Frederick", new Date(1995,2,26), eMajor.CHEM,  "652 Second Avenue Los Angeles California 89755", "203-985-3651", "sfrederick@udel.edu");
			Student student9 = new Student("Spencer", "Elliot", "Frederick", new Date(1995,2,26), eMajor.CHEM,  "652 Second Avenue Los Angeles California 89755", "203-985-3651", "sfrederick@udel.edu");
			Student student10 = new Student("Spencer", "Elliot", "Frederick", new Date(1995,2,26), eMajor.CHEM,  "652 Second Avenue Los Angeles California 89755", "203-985-3651", "sfrederick@udel.edu");
			studentList.add(student1);
			studentList.add(student2);
			studentList.add(student3);
			studentList.add(student4);
			studentList.add(student5);
			studentList.add(student6);
			studentList.add(student7);
			studentList.add(student8);
			studentList.add(student9);
			studentList.add(student10);
			
			Enrollment enrollSec1Stu1 = new Enrollment(section1.getSectionID(), student1.getStudentID());
			Enrollment enrollSec1Stu2 = new Enrollment(section1.getSectionID(), student2.getStudentID());
			Enrollment enrollSec1Stu3 = new Enrollment(section1.getSectionID(), student3.getStudentID());
			Enrollment enrollSec1Stu4 = new Enrollment(section1.getSectionID(), student4.getStudentID());
			Enrollment enrollSec1Stu5 = new Enrollment(section1.getSectionID(), student5.getStudentID());
			Enrollment enrollSec1Stu6 = new Enrollment(section1.getSectionID(), student6.getStudentID());
			Enrollment enrollSec1Stu7 = new Enrollment(section1.getSectionID(), student7.getStudentID());
			Enrollment enrollSec1Stu8 = new Enrollment(section1.getSectionID(), student8.getStudentID());
			Enrollment enrollSec1Stu9 = new Enrollment(section1.getSectionID(), student9.getStudentID());
			Enrollment enrollSec1Stu10 = new Enrollment(section1.getSectionID(), student10.getStudentID());
			enrollSec1Stu1.setGrade(100.00);
			enrollSec1Stu2.setGrade(100.00);
			enrollSec1Stu3.setGrade(100.00);
			enrollSec1Stu4.setGrade(100.00);
			enrollSec1Stu5.setGrade(100.00);
			enrollSec1Stu6.setGrade(100.00);
			enrollSec1Stu7.setGrade(100.00);
			enrollSec1Stu8.setGrade(100.00);
			enrollSec1Stu9.setGrade(100.00);
			enrollSec1Stu10.setGrade(100.00);
			
			Enrollment enrollSec2Stu1 = new Enrollment(section2.getSectionID(), student1.getStudentID());
			Enrollment enrollSec2Stu2 = new Enrollment(section2.getSectionID(), student2.getStudentID());
			Enrollment enrollSec2Stu3 = new Enrollment(section2.getSectionID(), student3.getStudentID());
			Enrollment enrollSec2Stu4 = new Enrollment(section2.getSectionID(), student4.getStudentID());
			Enrollment enrollSec2Stu5 = new Enrollment(section2.getSectionID(), student5.getStudentID());
			Enrollment enrollSec2Stu6 = new Enrollment(section2.getSectionID(), student6.getStudentID());
			Enrollment enrollSec2Stu7 = new Enrollment(section2.getSectionID(), student7.getStudentID());
			Enrollment enrollSec2Stu8 = new Enrollment(section2.getSectionID(), student8.getStudentID());
			Enrollment enrollSec2Stu9 = new Enrollment(section2.getSectionID(), student9.getStudentID());
			Enrollment enrollSec2Stu10 = new Enrollment(section2.getSectionID(), student10.getStudentID());
			enrollSec2Stu1.setGrade(100.00);
			enrollSec2Stu2.setGrade(100.00);
			enrollSec2Stu3.setGrade(100.00);
			enrollSec2Stu4.setGrade(100.00);
			enrollSec2Stu5.setGrade(100.00);
			enrollSec2Stu6.setGrade(100.00);
			enrollSec2Stu7.setGrade(100.00);
			enrollSec2Stu8.setGrade(100.00);
			enrollSec2Stu9.setGrade(100.00);
			enrollSec2Stu10.setGrade(100.00);
			
			Enrollment enrollSec3Stu1 = new Enrollment(section3.getSectionID(), student1.getStudentID());
			Enrollment enrollSec3Stu2 = new Enrollment(section3.getSectionID(), student2.getStudentID());
			Enrollment enrollSec3Stu3 = new Enrollment(section3.getSectionID(), student3.getStudentID());
			Enrollment enrollSec3Stu4 = new Enrollment(section3.getSectionID(), student4.getStudentID());
			Enrollment enrollSec3Stu5 = new Enrollment(section3.getSectionID(), student5.getStudentID());
			Enrollment enrollSec3Stu6 = new Enrollment(section3.getSectionID(), student6.getStudentID());
			Enrollment enrollSec3Stu7 = new Enrollment(section3.getSectionID(), student7.getStudentID());
			Enrollment enrollSec3Stu8 = new Enrollment(section3.getSectionID(), student8.getStudentID());
			Enrollment enrollSec3Stu9 = new Enrollment(section3.getSectionID(), student9.getStudentID());
			Enrollment enrollSec3Stu10 = new Enrollment(section3.getSectionID(), student10.getStudentID());
			enrollSec3Stu1.setGrade(100.00);
			enrollSec3Stu2.setGrade(100.00);
			enrollSec3Stu3.setGrade(100.00);
			enrollSec3Stu4.setGrade(100.00);
			enrollSec3Stu5.setGrade(100.00);
			enrollSec3Stu6.setGrade(100.00);
			enrollSec3Stu7.setGrade(100.00);
			enrollSec3Stu8.setGrade(100.00);
			enrollSec3Stu9.setGrade(100.00);
			enrollSec3Stu10.setGrade(100.00);
			
			Enrollment enrollSec4Stu1 = new Enrollment(section4.getSectionID(), student1.getStudentID());
			Enrollment enrollSec4Stu2 = new Enrollment(section4.getSectionID(), student2.getStudentID());
			Enrollment enrollSec4Stu3 = new Enrollment(section4.getSectionID(), student3.getStudentID());
			Enrollment enrollSec4Stu4 = new Enrollment(section4.getSectionID(), student4.getStudentID());
			Enrollment enrollSec4Stu5 = new Enrollment(section4.getSectionID(), student5.getStudentID());
			Enrollment enrollSec4Stu6 = new Enrollment(section4.getSectionID(), student6.getStudentID());
			Enrollment enrollSec4Stu7 = new Enrollment(section4.getSectionID(), student7.getStudentID());
			Enrollment enrollSec4Stu8 = new Enrollment(section4.getSectionID(), student8.getStudentID());
			Enrollment enrollSec4Stu9 = new Enrollment(section4.getSectionID(), student9.getStudentID());
			Enrollment enrollSec4Stu10 = new Enrollment(section4.getSectionID(), student10.getStudentID());
			enrollSec4Stu1.setGrade(100.00);
			enrollSec4Stu2.setGrade(100.00);
			enrollSec4Stu3.setGrade(100.00);
			enrollSec4Stu4.setGrade(100.00);
			enrollSec4Stu5.setGrade(100.00);
			enrollSec4Stu6.setGrade(100.00);
			enrollSec4Stu7.setGrade(100.00);
			enrollSec4Stu8.setGrade(100.00);
			enrollSec4Stu9.setGrade(100.00);
			enrollSec4Stu10.setGrade(100.00);
			
			Enrollment enrollSec5Stu1 = new Enrollment(section5.getSectionID(), student1.getStudentID());
			Enrollment enrollSec5Stu2 = new Enrollment(section5.getSectionID(), student2.getStudentID());
			Enrollment enrollSec5Stu3 = new Enrollment(section5.getSectionID(), student3.getStudentID());
			Enrollment enrollSec5Stu4 = new Enrollment(section5.getSectionID(), student4.getStudentID());
			Enrollment enrollSec5Stu5 = new Enrollment(section5.getSectionID(), student5.getStudentID());
			Enrollment enrollSec5Stu6 = new Enrollment(section5.getSectionID(), student6.getStudentID());
			Enrollment enrollSec5Stu7 = new Enrollment(section5.getSectionID(), student7.getStudentID());
			Enrollment enrollSec5Stu8 = new Enrollment(section5.getSectionID(), student8.getStudentID());
			Enrollment enrollSec5Stu9 = new Enrollment(section5.getSectionID(), student9.getStudentID());
			Enrollment enrollSec5Stu10 = new Enrollment(section5.getSectionID(), student10.getStudentID());
			enrollSec5Stu1.setGrade(100.00);
			enrollSec5Stu2.setGrade(100.00);
			enrollSec5Stu3.setGrade(100.00);
			enrollSec5Stu4.setGrade(100.00);
			enrollSec5Stu5.setGrade(100.00);
			enrollSec5Stu6.setGrade(100.00);
			enrollSec5Stu7.setGrade(100.00);
			enrollSec5Stu8.setGrade(100.00);
			enrollSec5Stu9.setGrade(100.00);
			enrollSec5Stu10.setGrade(100.00);
			
			Enrollment enrollSec6Stu1 = new Enrollment(section6.getSectionID(), student1.getStudentID());
			Enrollment enrollSec6Stu2 = new Enrollment(section6.getSectionID(), student2.getStudentID());
			Enrollment enrollSec6Stu3 = new Enrollment(section6.getSectionID(), student3.getStudentID());
			Enrollment enrollSec6Stu4 = new Enrollment(section6.getSectionID(), student4.getStudentID());
			Enrollment enrollSec6Stu5 = new Enrollment(section6.getSectionID(), student5.getStudentID());
			Enrollment enrollSec6Stu6 = new Enrollment(section6.getSectionID(), student6.getStudentID());
			Enrollment enrollSec6Stu7 = new Enrollment(section6.getSectionID(), student7.getStudentID());
			Enrollment enrollSec6Stu8 = new Enrollment(section6.getSectionID(), student8.getStudentID());
			Enrollment enrollSec6Stu9 = new Enrollment(section6.getSectionID(), student10.getStudentID());
			Enrollment enrollSec6Stu10 = new Enrollment(section6.getSectionID(), student10.getStudentID());
			enrollSec6Stu1.setGrade(100.00);
			enrollSec6Stu2.setGrade(100.00);
			enrollSec6Stu3.setGrade(100.00);
			enrollSec6Stu4.setGrade(100.00);
			enrollSec6Stu5.setGrade(100.00);
			enrollSec6Stu6.setGrade(100.00);
			enrollSec6Stu7.setGrade(100.00);
			enrollSec6Stu8.setGrade(100.00);
			enrollSec6Stu9.setGrade(100.00);
			enrollSec6Stu10.setGrade(100.00);
			
			
			enrollmentList.add(enrollSec1Stu1);
			enrollmentList.add(enrollSec2Stu1);
			enrollmentList.add(enrollSec3Stu1);
			enrollmentList.add(enrollSec4Stu1);
			enrollmentList.add(enrollSec5Stu1);
			enrollmentList.add(enrollSec6Stu1);
			enrollmentList.add(enrollSec1Stu2);
			enrollmentList.add(enrollSec2Stu2);
			enrollmentList.add(enrollSec3Stu2);
			enrollmentList.add(enrollSec4Stu2);
			enrollmentList.add(enrollSec5Stu2);
			enrollmentList.add(enrollSec6Stu2);
			enrollmentList.add(enrollSec1Stu3);
			enrollmentList.add(enrollSec2Stu3);
			enrollmentList.add(enrollSec3Stu3);
			enrollmentList.add(enrollSec4Stu3);
			enrollmentList.add(enrollSec5Stu3);
			enrollmentList.add(enrollSec6Stu3);
			enrollmentList.add(enrollSec1Stu4);
			enrollmentList.add(enrollSec2Stu4);
			enrollmentList.add(enrollSec3Stu4);
			enrollmentList.add(enrollSec4Stu4);
			enrollmentList.add(enrollSec5Stu4);
			enrollmentList.add(enrollSec6Stu4);
			enrollmentList.add(enrollSec1Stu5);
			enrollmentList.add(enrollSec2Stu5);
			enrollmentList.add(enrollSec3Stu5);
			enrollmentList.add(enrollSec4Stu5);
			enrollmentList.add(enrollSec5Stu5);
			enrollmentList.add(enrollSec6Stu5);
			enrollmentList.add(enrollSec1Stu6);
			enrollmentList.add(enrollSec2Stu6);
			enrollmentList.add(enrollSec3Stu6);
			enrollmentList.add(enrollSec4Stu6);
			enrollmentList.add(enrollSec5Stu6);
			enrollmentList.add(enrollSec6Stu6);
			enrollmentList.add(enrollSec1Stu7);
			enrollmentList.add(enrollSec2Stu7);
			enrollmentList.add(enrollSec3Stu7);
			enrollmentList.add(enrollSec4Stu7);
			enrollmentList.add(enrollSec5Stu7);
			enrollmentList.add(enrollSec6Stu7);
			enrollmentList.add(enrollSec1Stu8);
			enrollmentList.add(enrollSec2Stu8);
			enrollmentList.add(enrollSec3Stu8);
			enrollmentList.add(enrollSec4Stu8);
			enrollmentList.add(enrollSec5Stu8);
			enrollmentList.add(enrollSec6Stu8);
			enrollmentList.add(enrollSec1Stu9);
			enrollmentList.add(enrollSec2Stu9);
			enrollmentList.add(enrollSec3Stu9);
			enrollmentList.add(enrollSec4Stu9);
			enrollmentList.add(enrollSec5Stu9);
			enrollmentList.add(enrollSec6Stu9);
			enrollmentList.add(enrollSec1Stu10);
			enrollmentList.add(enrollSec2Stu10);
			enrollmentList.add(enrollSec3Stu10);
			enrollmentList.add(enrollSec4Stu10);
			enrollmentList.add(enrollSec5Stu10);
			enrollmentList.add(enrollSec6Stu10);
			

		}
		catch(PersonException e){
			e.printStackTrace();
		}
		
	}
	

	@Test
	public void Stu1GPAtest() {
		
		double StuGPA = ((enrollmentList.get(0).getGrade() + enrollmentList.get(1).getGrade() + enrollmentList.get(3).getGrade()
				+ enrollmentList.get(4).getGrade() + enrollmentList.get(5).getGrade() + enrollmentList.get(6).getGrade())/100/6)*4;
		assertEquals(StuGPA, 4.00, .01);
	}
	@Test
	public void Stu2GPAtest() {
		
		double StuGPA = ((enrollmentList.get(7).getGrade() + enrollmentList.get(8).getGrade() + enrollmentList.get(9).getGrade()
				+ enrollmentList.get(10).getGrade() + enrollmentList.get(11).getGrade() + enrollmentList.get(12).getGrade())/100/6)*4;
		assertEquals(StuGPA, 4.00, .01);
	}
	@Test
	public void Stu3GPAtest() {
		
		double StuGPA = ((enrollmentList.get(13).getGrade() + enrollmentList.get(14).getGrade() + enrollmentList.get(15).getGrade()
				+ enrollmentList.get(16).getGrade() + enrollmentList.get(17).getGrade() + enrollmentList.get(18).getGrade())/100/6)*4;
		assertEquals(StuGPA, 4.00, .01);
	}
	@Test
	public void Stu4GPAtest() {
		
		double StuGPA = ((enrollmentList.get(19).getGrade() + enrollmentList.get(20).getGrade() + enrollmentList.get(21).getGrade()
				+ enrollmentList.get(22).getGrade() + enrollmentList.get(23).getGrade() + enrollmentList.get(24).getGrade())/100/6)*4;
		assertEquals(StuGPA, 4.00, .01);
	}
	@Test
	public void Stu5GPAtest() {
		
		double StuGPA = ((enrollmentList.get(25).getGrade() + enrollmentList.get(26).getGrade() + enrollmentList.get(27).getGrade()
				+ enrollmentList.get(28).getGrade() + enrollmentList.get(29).getGrade() + enrollmentList.get(30).getGrade())/100/6)*4;
		assertEquals(StuGPA, 4.00, .01);
	}
	@Test
	public void Stu6GPAtest() {
		
		double StuGPA = ((enrollmentList.get(31).getGrade() + enrollmentList.get(32).getGrade() + enrollmentList.get(33).getGrade()
				+ enrollmentList.get(34).getGrade() + enrollmentList.get(35).getGrade() + enrollmentList.get(36).getGrade())/100/6)*4;
		assertEquals(StuGPA, 4.00, .01);
	}
	@Test
	public void Stu7GPAtest() {
		
		double StuGPA = ((enrollmentList.get(37).getGrade() + enrollmentList.get(38).getGrade() + enrollmentList.get(39).getGrade()
				+ enrollmentList.get(40).getGrade() + enrollmentList.get(41).getGrade() + enrollmentList.get(42).getGrade())/100/6)*4;
		assertEquals(StuGPA, 4.00, .01);
	}
	@Test
	public void Stu8GPAtest() {
		
		double Stu1GPA = ((enrollmentList.get(43).getGrade() + enrollmentList.get(44).getGrade() + enrollmentList.get(45).getGrade()
				+ enrollmentList.get(46).getGrade() + enrollmentList.get(47).getGrade() + enrollmentList.get(48).getGrade())/100/6)*4;
		assertEquals(Stu1GPA, 4.00, .01);
	}
	@Test
	public void Stu9GPAtest() {
		
		double Stu1GPA = ((enrollmentList.get(49).getGrade() + enrollmentList.get(50).getGrade() + enrollmentList.get(51).getGrade()
				+ enrollmentList.get(52).getGrade() + enrollmentList.get(53).getGrade() + enrollmentList.get(54).getGrade())/100/6)*4;
		assertEquals(Stu1GPA, 4.00, .01);
	}
	@Test
	public void Stu10GPAtest() {
		
		double Stu1GPA = ((enrollmentList.get(55).getGrade() + enrollmentList.get(56).getGrade() + enrollmentList.get(57).getGrade()
				+ enrollmentList.get(58).getGrade() + enrollmentList.get(59).getGrade() + enrollmentList.get(59).getGrade())/100/6)*4;
		assertEquals(Stu1GPA, 4.00, .01);
	}
	@Test
	public void Course1AvgTest() {
		int avg = (int) (enrollmentList.get(0).getGrade() + enrollmentList.get(6).getGrade() + enrollmentList.get(12).getGrade() +
				enrollmentList.get(18).getGrade() + enrollmentList.get(24).getGrade() + enrollmentList.get(30).getGrade() +
				enrollmentList.get(36).getGrade() + enrollmentList.get(42).getGrade() + enrollmentList.get(48).getGrade() +
				enrollmentList.get(54).getGrade() + enrollmentList.get(1).getGrade() + enrollmentList.get(7).getGrade() + enrollmentList.get(13).getGrade() +
				enrollmentList.get(19).getGrade() + enrollmentList.get(25).getGrade() + enrollmentList.get(31).getGrade() +
				enrollmentList.get(37).getGrade() + enrollmentList.get(43).getGrade() + enrollmentList.get(49).getGrade() +
				enrollmentList.get(55).getGrade())/20;
		assertEquals(avg, 100);
	}
	@Test
	public void Course2AvgTest() {
		int avg = (int) (enrollmentList.get(2).getGrade() + enrollmentList.get(8).getGrade() + enrollmentList.get(14).getGrade() +
				enrollmentList.get(20).getGrade() + enrollmentList.get(26).getGrade() + enrollmentList.get(32).getGrade() +
				enrollmentList.get(38).getGrade() + enrollmentList.get(44).getGrade() + enrollmentList.get(50).getGrade() +
				enrollmentList.get(56).getGrade() + enrollmentList.get(3).getGrade() + enrollmentList.get(9).getGrade() + enrollmentList.get(15).getGrade() +
				enrollmentList.get(21).getGrade() + enrollmentList.get(27).getGrade() + enrollmentList.get(33).getGrade() +
				enrollmentList.get(39).getGrade() + enrollmentList.get(45).getGrade() + enrollmentList.get(51).getGrade() +
				enrollmentList.get(57).getGrade())/20;
		assertEquals(avg, 100);
	}
	@Test
	public void Course3AvgTest() {
		int avg = (int) (enrollmentList.get(4).getGrade() + enrollmentList.get(10).getGrade() + enrollmentList.get(16).getGrade() +
				enrollmentList.get(22).getGrade() + enrollmentList.get(28).getGrade() + enrollmentList.get(34).getGrade() +
				enrollmentList.get(40).getGrade() + enrollmentList.get(46).getGrade() + enrollmentList.get(52).getGrade() +
				enrollmentList.get(58).getGrade() + enrollmentList.get(5).getGrade() + enrollmentList.get(11).getGrade() + enrollmentList.get(17).getGrade() +
				enrollmentList.get(23).getGrade() + enrollmentList.get(29).getGrade() + enrollmentList.get(35).getGrade() +
				enrollmentList.get(41).getGrade() + enrollmentList.get(47).getGrade() + enrollmentList.get(53).getGrade() +
				enrollmentList.get(59).getGrade())/20;
		assertEquals(avg, 100);
	}

}