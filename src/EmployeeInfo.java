import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.Scanner;

class Employee {
    int eid;
    String eFirstName,eLastName;
    String eEmail;
    int ePhoneNumber;
    int eDate;
    double eSalary;
    String eJobTitle,eDepartment;
    int managerId;
    double eCommission;
    String eEmployeeType;

    Scanner sc = new Scanner(System.in);

    void addEmployee(){
        try {
            System.out.print("Enter the Employee Id: ");
            eid = sc.nextInt();

            System.out.print("Enter the FirstName: ");
            eFirstName = sc.next();

            System.out.print("Enter the LastName: ");
            eLastName = sc.next();

            System.out.print("Enter the Email: ");
            eEmail = sc.next();

            System.out.print("Enter the PhoneNumber: ");
            ePhoneNumber = sc.nextInt();

            System.out.print("Enter the HireDate: ");
            eDate = sc.nextInt();

            System.out.print("Enter the Salary: ");
            eSalary = sc.nextDouble();

            System.out.print("Enter the JobTitle: ");
            eJobTitle = sc.next();

            System.out.print("Enter the Department: ");
            eDepartment = sc.next();

            System.out.print("Enter the ManagerId: ");
            managerId = sc.nextInt();

            System.out.print("Enter the Commission: ");
            eCommission = sc.nextDouble();

            System.out.print("Enter the EmployeeType: ");
            eEmployeeType = sc.next();

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/employee_payroll","sekar","Sekar2002@");

            PreparedStatement ps = c.prepareStatement("insert into emp_info values(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,eid);
            ps.setString(2,eFirstName);
            ps.setString(3,eLastName);
            ps.setString(4,eEmail);
            ps.setInt(5,ePhoneNumber);
            ps.setInt(6,eDate);
            ps.setDouble(7,eSalary);
            ps.setString(8,eJobTitle);
            ps.setString(9,eDepartment);
            ps.setInt(10,managerId);
            ps.setDouble( 11,eCommission);
            ps.setString(12,eEmployeeType);

            int result = ps.executeUpdate();

            System.out.print(result>0 ? "Data Inserted": "Data not saved");
        }
        catch (Exception e){
            System.out.print(e);

        }
    }
    void updateEmployee(){
        try {
            System.out.print("Enter the Employee Id: ");
            eid = sc.nextInt();

            System.out.print("Enter the FirstName: ");
            eFirstName = sc.next();

            System.out.print("Enter the LastName: ");
            eLastName = sc.next();

            System.out.print("Enter the Email: ");
            eEmail = sc.next();

            System.out.print("Enter the PhoneNumber: ");
            ePhoneNumber = sc.nextInt();

            System.out.print("Enter the HireDate: ");
            eDate = sc.nextInt();

            System.out.print("Enter the Salary: ");
            eSalary = sc.nextDouble();

            System.out.print("Enter the JobTitle: ");
            eJobTitle = sc.next();

            System.out.print("Enter the Department: ");
            eDepartment = sc.next();

            System.out.print("Enter the ManagerId: ");
            managerId = sc.nextInt();

            System.out.print("Enter the Commission: ");
            eCommission = sc.nextDouble();

            System.out.print("Enter the EmployeeType: ");
            eEmployeeType = sc.next();

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/employee_payroll","sekar","Sekar2002@");

            PreparedStatement ps = c.prepareStatement("update emp_info set(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,eid);
            ps.setString(2,eFirstName);
            ps.setString(3,eLastName);
            ps.setString(4,eEmail);
            ps.setInt(5,ePhoneNumber);
            ps.setInt(6,eDate);
            ps.setDouble(7,eSalary);
            ps.setString(8,eJobTitle);
            ps.setString(9,eDepartment);
            ps.setInt(10,managerId);
            ps.setDouble( 11,eCommission);
            ps.setString(12,eEmployeeType);

            int result = ps.executeUpdate();

            System.out.print(result>0 ? "Data Updated": "Data not saved");
        }
        catch (Exception e){
            System.out.print(e);

        }
    }
}

class EmployeeInfo{
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.addEmployee();
        employee.updateEmployee();
    }

}
