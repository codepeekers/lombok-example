package com.codepeekers;

public class EmployeeController {

  public static void main(String[] args) {
    Employee employee = new Employee(100, "Jim", "Finance");
    System.out.println(employee);
    LombokEmployee lombokEmployee = new LombokEmployee();
  }
}
