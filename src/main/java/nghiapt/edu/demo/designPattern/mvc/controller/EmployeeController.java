package nghiapt.edu.demo.designPattern.mvc.controller;

import nghiapt.edu.demo.designPattern.mvc.model.Employee;
import nghiapt.edu.demo.designPattern.mvc.view.EmployeeView;

public class EmployeeController {
	private Employee employee;
	private EmployeeView employeeView;

	public EmployeeController(Employee employee, EmployeeView employeeView) {
		this.employee = employee;
		this.employeeView = employeeView;
	}

	public String getEmployeeName() {
		return employee.getName();
	}

	public void setEmployeeName(String name) {
		employee.setEmployeeName(name);
	}

	public int getEmployeeId() {
		return employee.getEmployeeId();
	}

	public void setEmployeeId(int id) {
		employee.setEmployeeId(id);
	}

	public void updateView() {
		employeeView.printEmployeeInformation(employee.getName(), employee.getEmployeeId());
	}
}
