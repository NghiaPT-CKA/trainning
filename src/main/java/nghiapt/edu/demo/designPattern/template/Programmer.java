package nghiapt.edu.demo.designPattern.template;

public class Programmer extends Employee {
	 
    @Override
    void work() {
        System.out.println("Viết code.");
    }
 
    @Override
    void takePause() {
        System.out.println("Nghỉ một chút sau khi viết code.");
    }
 
    @Override
    void getPaid() {
        System.out.println("Được trả tiền lương sau khi hoàn thành dự án.");
    }
}
