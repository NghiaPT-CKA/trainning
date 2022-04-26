package nghiapt.edu.demo.designPattern.mvc.view;

public class EmployeeView {
	public void printEmployeeInformation(String employeeName, int employeeId) {
		System.out.println("Thông tin nhân viên: ");
		System.out.println("ID: " + employeeId);
		System.out.println("Tên: " + employeeName);
	}
}
