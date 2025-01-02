package oct5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeStream {

    public static void main(String[] args) {

        /*List<Integer> nums = new ArrayList<>(Arrays.asList(11,22,33,44,55,66,77,88,99));
        System.out.println(nums);

        //Stream<Integer> numStream = nums.stream();

        nums.stream().filter(n -> n%2 == 0).forEach(nums1 -> System.out.print(nums1+","));*/

        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student("Regina",12,Arrays.asList("12344","23456","687687587")),
                new Student("Thiru",22,Arrays.asList("123456","23456","456789")),
                new Student("Liya",33,Arrays.asList("12345678","456789","9087654"))
                ));

        System.out.println(studentList);

        List<String> phoneNo = studentList.stream().
                flatMap(stu -> stu.getPhoneNo().stream()).
                map(phone -> "+1" + phone).
                collect(Collectors.toList());

        System.out.println(phoneNo);


      /* List<Employee> employeeList = new ArrayList<>();
       employeeList.add(new Employee("Regina","Mani",30,"Apple",85000));
        employeeList.add(new Employee("Thiru","Velu",35,"Meta",70000));
        employeeList.add(new Employee("Liya","Vivi",25,"Microsoft",65000));
        employeeList.add(new Employee("Peter","Raj",40,"ATesla",95000));
        employeeList.add(new Employee("Vennila","Mani",50,"Anetflix",100000));

        for (Employee employee:employeeList)
        System.out.println(employee);

        List<String> employees = employeeList
                .stream()
                .filter(n -> n.getSalary()>80000)
                .filter(n -> n.getCompanyName().startsWith("A"))
                .map(n -> n.getFirstName())
                .collect(Collectors.toList());

        System.out.println(employees);
*/

    }
}
