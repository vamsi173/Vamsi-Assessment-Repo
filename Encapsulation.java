class Employee {
    private int id;
    private int salary;
    private String designation;
    public void setId(int id) 
    {
        this.id = id;
    }
    public void setSalary(int salary) 
    {
        this.salary = salary;
    }
    public void setDesignation(String designation) 
    {
        this.designation = designation;
    }
    public int getId() 
    {
        return id;
    }
    public int getSalary() 
    {
        return salary;
    }
    public String getDesignation() 
    {
        return designation;
    }
}
public class Encapsulation 
{
    public static void main(String[] args) 
    {
        Employee emp = new Employee();
        emp.setId(999);
        emp.setSalary(75000);
        emp.setDesignation("AI Engineer");
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Salary: " + emp.getSalary());
        System.out.println("Employee Designation: " + emp.getDesignation());
    }
}