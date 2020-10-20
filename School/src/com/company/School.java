package com.company;

import com.company.employee.Employee;
import com.company.employee.Mentor;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> studentList = new ArrayList<>();
    private List<Employee> employeeList = new ArrayList<>();

    public void hireMentor(Mentor mentor){
        employeeList.add(mentor);
    }

    public void acceptStudent(Student student){
        studentList.add(student);
    }

    public List<Student> listStudentsByModule(Student.Module module){
        List<Student> studentByModuleList = new ArrayList<>();
        for(Student student:studentList){
            if (student.getModule().equals(module))
                studentByModuleList.add(student);
        }
        return studentByModuleList;
    }



//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("School{");
//        sb.append("studentList=").append(studentList);
//        sb.append(", employeeList=").append(employeeList);
//        sb.append('}');
//        return sb.toString();
//    }
}
