class Employee {
    // Private variables
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    // Setter methods
    public void setEmployeeId(int id) {
        employee_id = id;
    }

    public void setEmployeeName(String name) {
        employee_name = name;
    }

    public void setEmployeeSalary(double salary) {
        employee_salary = salary;
    }

    // Getter methods
    public int getEmployeeId() {
        return employee_id;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    // Getter for salary (formatted)
    public String getEmployeeSalary() {
        return "Salary: ₹" + employee_salary;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee();

        // Setting values
        emp.setEmployeeId(101);
        emp.setEmployeeName("Sachin");
        emp.setEmployeeSalary(50000);

        // Getting values
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getEmployeeName());
        System.out.println(emp.getEmployeeSalary());
    }
}
