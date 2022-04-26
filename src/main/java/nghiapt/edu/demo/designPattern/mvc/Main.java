package nghiapt.edu.demo.designPattern.mvc;

import nghiapt.edu.demo.designPattern.mvc.controller.EmployeeController;
import nghiapt.edu.demo.designPattern.mvc.model.Employee;
import nghiapt.edu.demo.designPattern.mvc.view.EmployeeView;

public class Main {
	public static void main(String[] args) {
		Employee employee = getEmployeeFromDatabase();
		EmployeeView view = new EmployeeView();
		EmployeeController controller = new EmployeeController(employee, view);

		controller.updateView();

		controller.setEmployeeId(5);
		System.out.println("--------------------------------------");
		System.out.println("Sau khi update:");
		System.out.println("--------------------------------------");
		controller.updateView();

		System.out.println("------------------------------------");
		System.out.println("Chương trình này được đăng tại Freetuts.net");
	}

	// simulating a database
	public static Employee getEmployeeFromDatabase() {
		Employee employee = new Employee();
		employee.setEmployeeName("Quyền");
		employee.setEmployeeId(1);
		return employee;
	}
}
