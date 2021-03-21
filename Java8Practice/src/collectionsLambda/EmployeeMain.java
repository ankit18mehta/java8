package collectionsLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeMain {

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(100, "D"));
        empList.add(new Employee(50, "F"));
        empList.add(new Employee(700, "A"));
        empList.add(new Employee(500, "C"));
        empList.add(new Employee(200, "B"));
        empList.add(new Employee(101, "E"));

        System.out.println(empList);

        Comparator<Employee> comp = (e1, e2) -> {
            return (e1.empId > e2.empId) ? 1 : (e1.empId < e2.empId) ? -1 : 0;
        };

        Collections.sort(empList, comp);

        System.err.println(empList);
    }

}
