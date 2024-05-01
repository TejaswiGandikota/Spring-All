package com.spring.fifteen.dao;

import java.util.List;

import com.spring.fifteen.StudentBean;

public interface StudentDao {
           public int saveStudent(StudentBean StudentBean);
           public StudentBean viewStudentOne(int id);
           public void updateStudent(StudentBean StudentBean);
           public void deleteStudent(int id);
           public List<StudentBean> StudentAll();
           
}
