package com.company;

import javax.print.DocFlavor;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        SalesPeople s1 = new SalesPeople("Mark","Logos");
        SalesPeople s2 = new SalesPeople("Sorin","Logos");
        SalesPeople s3 = new SalesPeople("Nonu","Logos");
        SalesPeople s4 = new SalesPeople("Florin","Logos");

        OfficeWorkers o1 = new OfficeWorkers("Iris","Cotroceni",SeniorityLevel.SENIOR);
        OfficeWorkers o2 = new OfficeWorkers("Erika","Cotroceni",SeniorityLevel.JUNIOR);
        OfficeWorkers o3 = new OfficeWorkers("Vanda","Cotroceni",SeniorityLevel.JUNIOR);
        OfficeWorkers o4 = new OfficeWorkers("Doru","Cotroceni",SeniorityLevel.SENIOR);

        GroupLeader g1 = new GroupLeader("Mark","Logos");
        GroupLeader g2 = new GroupLeader("Iris","Cotroceni");

        Group Logos = new Group("Logos",g1,"Sales");
        Group Cotroceni = new Group("Cotroceni",g2,"Workers");

        Logos.addEmployeeToGroup(s1);
        Logos.addEmployeeToGroup(s2);
        Logos.addEmployeeToGroup(s3);
        Logos.addEmployeeToGroup(s4);

        for(int i = 0; i <  12;i++){
            System.out.println("Month " + (i + 1));
            System.out.println("The team leader " + g1.getName() + " earns " + g1.paySalary(Logos.getEmployeeList().size()));
            for(Employee employee: Logos.getEmployeeList()){
                System.out.println("The employee "  + employee.getName() + " earns " + employee.getMonthlySalary());
            }
        }

        Cotroceni.addEmployeeToGroup(o1);
        Cotroceni.addEmployeeToGroup(o2);
        Cotroceni.addEmployeeToGroup(o3);
        Cotroceni.addEmployeeToGroup(o4);

        for(int i = 0; i < 12;i++){
            System.out.println("Month " + (i + 1));
            System.out.println("The team leader " + g2.getName() + " earns " + g2.paySalary(Cotroceni.getEmployeeList().size()));
            for(Employee employee: Cotroceni.employeeList){
                System.out.println("The employee " + employee.getName() + " earns " + employee.getMonthlySalary());
            }
        }



    }
    }
