class Employee {

    private int empId;

    public void setEmpId(int id) {
        empId = id;
    }

    public int getEmpId() {
        return empId;
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.setEmpId(101);

        System.out.println("Employee ID: " + e.getEmpId());

    }
}
