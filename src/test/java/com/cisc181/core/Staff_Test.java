package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() throws PersonException {
		
		ArrayList<Staff> staffList= new ArrayList<Staff>();
        
		Staff Staff1= new Staff("Jake", "Stephen", "Screen", new Date(1998,6,31), "12 Privet Drive Foxborough massachusetts 02035", "508-826-1920", "jscreen@udel.edu", "12-6pm", 1, 50000.00, new Date(2017,7,29), eTitle.MR);
        
		Staff Staff2= new Staff("Anton", "Tom", "Hovanec", new Date(1997,7,25), "101 Panorama Drive Newark Delaware 19711", "389-407-3458", "ahovanec@udel.edu", "2-5pm", 2, 1000.00, new Date(2017,7,29), eTitle.MR);
        
		Staff Staff3= new Staff("Steephan", "Willard", "Sheehan", new Date(1996,1,27), "35 New York Road New York New York 19581", "785-030-2320", "tbahadur@udel.edu", "8-11pm", 3, 750000.00, new Date(2017,7,29), eTitle.MR);
        
		Staff Staff4= new Staff("Travis", "Thomas", "Bahadur", new Date(1999,9,21), "567 first street Baltimore Maryland 19741", "386-521-5478", "ssheehan@udel.edu", "11-4pm", 4, 500.00, new Date(2017,7,29), eTitle.MR);
        
		Staff Staff5= new Staff("Spencer", "Elliot", "Frederick", new Date(1995,2,26), "652 Second Avenue Los Angeles California 89755", "203-985-3651", "sfrederick@udel.edu", "6-5pm", 5, 6000.00, new Date(2017,7,29), eTitle.MR);
		
		double totalSalary = 0;
		
		staffList.add(Staff1);
		staffList.add(Staff2);
		staffList.add(Staff3);
		staffList.add(Staff4);
		staffList.add(Staff5);
		
		for(Staff s : staffList) {
			totalSalary += s.getSalary();
		}
		int averageSalary = (int) totalSalary/staffList.size();
		assertEquals(averageSalary, 161500);
		
	}
	@Test(expected = PersonException.class)
	public void TestDateException() throws PersonException {
		Staff Staff1= new Staff("Jake", "Stephen", "Screen", new Date(1900,6,31), "12 Privet Drive Foxborough massachusetts 02035", "508-826-1920", "jscreen@udel.edu", "12-6pm", 1, 50000.00, new Date(2017,7,29), eTitle.MR);
	}
	@Test(expected = PersonException.class)
	public void TestPhoneNumberException() throws PersonException {
		Staff Staff1= new Staff("Jake", "Stephen", "Screen", new Date(1998,6,31), "12 Privet Drive Foxborough massachusetts 02035", "508-86-1920", "jscreen@udel.edu", "12-6pm", 1, 50000.00, new Date(2017,7,29), eTitle.MR);
	}

}
