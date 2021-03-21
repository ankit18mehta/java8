package collectionsLambda;

public class Employee {

    public int empId;

    public String empName;

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Employee(int empId, String empName) {
        super();
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[empId=");
        builder.append(empId);
        builder.append(", empName=");
        builder.append(empName);
        builder.append("]");
        return builder.toString();
    }

}
