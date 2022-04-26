package nghiapt.edu.demo.designPattern.interator;

public class Main {
    public static void main(String[] args) {
 
        EmployeeRepository employeeRepository = new EmployeeRepository();
 
        System.out.println("Các nhân viên bao gồm:");
        for(Iterator iterator = employeeRepository.getIterator();
            iterator.hasNext();) {
            String employee = (String)iterator.next();
            System.out.println("Nhân viên: " + employee);
        }
 
        System.out.println("------------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}
