package nghiapt.edu.demo.designPattern.interator;

public class EmployeeRepository implements Sector {
    public String[] employees = {"Quyền", "Tiến", "Sơn", "Hòa", "Thành"};
 
    @Override
    public Iterator getIterator() {
        return new EmployeeIterator();
    }
 
    private class EmployeeIterator implements Iterator {
        int index;
 
        @Override
        public boolean hasNext() {
            if(index < employees.length) {
                return true;
            }
            return false;
        }
 
        @Override
        public Object next() {
            if(this.hasNext()) {
                return employees[index++];
            }
            return null;
        }
    }
}