package nghiapt.edu.demo.designPattern.template;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Programmer();
        employee.comeToWork();
 
        System.out.println();
 
        employee = new Manager();
        employee.comeToWork();
        System.out.println("------------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}
