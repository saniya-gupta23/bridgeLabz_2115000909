import java.util.ArrayList;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee: " + name;
    }
}

class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    @Override
    public String toString() {
        return "Department: " + name + ", Employees: " + employees;
    }
}

class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department dept : departments) {
            if (dept.toString().contains(departmentName)) {
                dept.addEmployee(employeeName);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Company: " + name + ", Departments: " + departments;
    }
}

public class CompanyManagement {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");
        company.addDepartment("Engineering");
        company.addDepartment("HR");
        
        company.addEmployeeToDepartment("Engineerong", "Saniya");
        company.addEmployeeToDepartment("Engineering", "Samiksha");
        company.addEmployeeToDepartment("HR", "Shivangi");
        
        System.out.println(company);
    }
}






