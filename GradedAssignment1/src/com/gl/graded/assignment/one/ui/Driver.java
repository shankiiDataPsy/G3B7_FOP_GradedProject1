package com.gl.graded.assignment.one.ui;

import com.gl.graded.assignment.one.services.AdminDepartment;
import com.gl.graded.assignment.one.services.HrDepartment;
import com.gl.graded.assignment.one.services.SuperDepartment;
import com.gl.graded.assignment.one.services.TechDepartment;

public class Driver {
	
	public static void main(String[] args) {
		SuperDepartment superObj = new SuperDepartment();
		
		System.out.println("\n\nOutput from - Super Department");
		System.out.println("'departmentName' : " + superObj.departmentName());
		System.out.println("'getTodaysWork' : " + superObj.getTodaysWork());
		System.out.println("'getWorkDeadline' : " + superObj.getWorkDeadline());
		System.out.println("'isTodayAHoliday' : " + superObj.isTodayAHoliday());
		
		AdminDepartment adminObj = new AdminDepartment();

		System.out.println("\n\nOutput from - Admin Department");
		System.out.println("'departmentName' : " + adminObj.departmentName());
		System.out.println("'getTodaysWork' : " + adminObj.getTodaysWork());
		System.out.println("'getWorkDeadline' : " + adminObj.getWorkDeadline());
		
		HrDepartment hrObj = new HrDepartment();
		
		System.out.println("\n\nOutput from - HR Department");
		System.out.println("'departmentName' : " + hrObj.departmentName());
		System.out.println("'getTodaysWork' : " + hrObj.getTodaysWork());
		System.out.println("'getWorkDeadline' : " + hrObj.getWorkDeadline());
		System.out.println("'doActivity' : " + hrObj.doActivity());
		
		TechDepartment techObj = new TechDepartment();
		
		System.out.println("\n\nOutput from - Tech Department");
		System.out.println("'departmentName' : " + techObj.departmentName());
		System.out.println("'getTodaysWork' : " + techObj.getTodaysWork());
		System.out.println("'getWorkDeadline' : " + techObj.getWorkDeadline());
		System.out.println("'getTechStackInformation' : " + techObj.getTechStackInformation());
		
	}

}
