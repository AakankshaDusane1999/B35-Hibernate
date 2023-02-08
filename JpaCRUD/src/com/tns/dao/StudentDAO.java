package com.tns.dao;

import com.tns.entities.Student;

public interface StudentDAO
{
	abstract void addStudent(Student student);
	abstract Student getStudentById(int ID);
	abstract void updateStudent(Student student);
	abstract void removeStudent(Student student);
	abstract void commitTransaction();
	abstract void beginTransaction();

}