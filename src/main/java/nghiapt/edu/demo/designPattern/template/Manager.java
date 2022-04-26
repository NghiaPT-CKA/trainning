package nghiapt.edu.demo.designPattern.template;

public class Manager extends Employee {
	 
    @Override
    void work() {
        System.out.println("Quản lý các nhân viên.");
    }
 
    @Override
    void takePause() {
        System.out.println("Tạm nghỉ việc quản lý nhân viên.");
    }
 
    @Override
    void getPaid() {
        System.out.println("Được trả tiền lương cho việc quản lý nhân viên.");
    }
}
