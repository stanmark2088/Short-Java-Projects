package com.company;

import com.company.employee.Employee;
import com.company.employee.Mentor;
import com.company.employee.Sales;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student sorin = new Student("Sorin", new Date(93,5,11),"07432423435");
        Student mark = new Student("Mark",new Date(88,7,9),"0722254345");
        Student iris = new Student("Iris",new Date(84,9,30),"0740214252");

        School harvard = new School();
        harvard.acceptStudent(sorin);
        harvard.acceptStudent(mark);
        harvard.acceptStudent(iris);

        Mentor iulia = new Mentor("Iulia",new Date(1934,10,10),"07412434431") ;
        Mentor adam = new Mentor("Adam",new Date(1935,10,6),"0741244321") ;

//        Sales obiwan_Kenobi = new Sales("Obi",new Date(1921,06,21),"073434431") ;

        harvard.hireMentor(iulia);
        harvard.hireMentor(adam);

       for(Student student:harvard.listStudentsByModule(Student.Module.PROBASICS)){
            System.out.println(student);

        }




    }
}
