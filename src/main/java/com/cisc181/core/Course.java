package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course {
	
	private UUID CourseID;
	
	private String CourseName;
	
	private int GradePoints;
	
	private eMajor eMajor;

	public Course(UUID courseID, String courseName, int gradePoints,eMajor eMajor) {
		super();
		CourseID = courseID;
		CourseName = courseName;
		GradePoints = gradePoints;
		this.eMajor = eMajor;
	}

	public UUID getCourseID() {
		return CourseID;
	}

	private void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	private void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	private void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

	public eMajor geteMajor() {
		return eMajor;
	}

	private void seteMajor(eMajor eMajor) {
		this.eMajor = eMajor;
	}
	
	
	

}
