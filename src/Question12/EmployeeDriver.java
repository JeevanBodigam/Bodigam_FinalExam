/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Jeevan Bodigam
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee(123, "Tchala", 125000);
        Employee emp2 = new Employee(463, "Steve Rogers", 100000);
        Employee emp3 = new Employee(987, "Bucky", 25000);
        Employee emp4 = new Employee(109, "Shuri", 120000);
        Employee emp5 = new Employee(923, "John Walker", 113000);
        Employee emp6 = new Employee(764, "Zemo", 250000);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        System.out.println("--------Deafult Order-----------");
        printList(empList);
        Collections.sort(empList);
        System.out.println("--------Sorting By empId-----------");
        printList(empList);
        System.out.println("-------Sorting By Salary------------");
        Collections.sort(empList, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return Double.compare(emp1.getEmpSalary(), emp2.getEmpSalary());
            }

        });
        printList(empList);
        System.out.println("--------Sorting By Name-----------");
        Collections.sort(empList, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getEmpName().compareTo(emp2.getEmpName());
            }

        });
        printList(empList);

    }

    public static void printList(List<Employee> l) {
        l.forEach(emp -> {
            System.out.println(emp);
        });
    }

}
