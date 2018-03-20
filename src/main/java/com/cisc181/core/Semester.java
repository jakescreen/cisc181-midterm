package com.cisc181.core;

import java.util.UUID;
import java.util.Date;


public class Semester {
	
	private UUID SemsterID;
	
	private Date StartDate;
	
	private Date EndDate;

	public Semester(UUID semsterID, Date startDate, Date endDate) {
		super();
		SemsterID = semsterID;
		StartDate = startDate;
		EndDate = endDate;
	}

	public UUID getSemsterID() {
		return SemsterID;
	}

	private void setSemsterID(UUID semsterID) {
		SemsterID = semsterID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	private void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	private void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
	

}
