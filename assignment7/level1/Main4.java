public class Main4 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("E123", "IT", 50000.0);
        employee1.displayEmployeeDetails();

        employee1.setSalary(55000.0);
        System.out.println("Updated Salary: " + employee1.getSalary());

        Manager manager1 = new Manager("M456", "HR", 70000.0);
        manager1.displayManagerDetails();
    }
}
