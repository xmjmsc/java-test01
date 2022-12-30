package generic;

import java.util.ArrayList;
import java.util.Comparator;

@SuppressWarnings("all")
public class GenericH {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 32222, new MyData(1997, 6, 12)));
        employees.add(new Employee("jack", 36236, new MyData(1998, 8, 11)));
        employees.add(new Employee("andy", 296.0, new MyData(2000, 9, 11)));

        System.out.println("employees=" + employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    System.out.println("类型不正确");
                    return 0;
                }
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0) {
                    return i;
                }
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        System.out.println("employees=" + employees);
    }
}
