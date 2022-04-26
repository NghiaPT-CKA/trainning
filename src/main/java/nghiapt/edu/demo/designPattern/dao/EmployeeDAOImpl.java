package nghiapt.edu.demo.designPattern.dao;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    List<Employee> employeeList;
 
    public EmployeeDAOImpl() {
        employeeList = new ArrayList<Employee>();
        Employee david = new Employee(5, "Quyền");
        Employee scott = new Employee(7, "Tiến");
        Employee jessica = new Employee(12, "linh");
        Employee rebecca = new Employee(16, "Hường");
        employeeList.add(david);
        employeeList.add(scott);
        employeeList.add(jessica);
        employeeList.add(rebecca);
    }
    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
    @Override
    public Employee getEmployeeById(int id) {
        return employeeList.get(id);
    }
    @Override
    public void addEmployee(Employee e) {
        employeeList.add(e);
        System.out.println("Thêm thành công " + e.getName());
    }
    @Override
    public void updateEmployee(Employee e) {
        employeeList.get(e.getEmployeeId()).setEmployeeName(e.getName());
        System.out.println("Cập nhật thành công, tên nhân viên có id: " + e.getEmployeeId());
    }
    @Override
    public void deleteEmployee(Employee e) {
        employeeList.remove(e.getEmployeeId());
        System.out.println("Đã xóa nhân viên thành công: " + e.getName() + "có ID là: " + e.getEmployeeId());
    }
}