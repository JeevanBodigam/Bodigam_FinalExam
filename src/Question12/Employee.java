/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

/**
 *
 * @author Jeevan Bodigam
 */
public class Employee implements Comparable<Employee> {

    private int empId;
    private String empName;
    private double empSalary;

    public Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return this.empId + " " + this.getEmpName() + " " + this.getEmpSalary();
    }

    @Override
    public int compareTo(Employee emp) {
        return Integer.compare(this.empId, emp.getEmpId());
    }

}
