package nghiapt.edu.demo.designPattern.dao;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDao = new EmployeeDAOImpl();
 
        for(Employee employee : employeeDao.getAllEmployees()) {
            System.out.println("Thông tin nhân viên: |Tên: " + employee.getName() + ", ID: " + employee.getEmployeeId() + "|");
        }
 
        System.out.println("--------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}