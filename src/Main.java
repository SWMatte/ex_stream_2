import Models.Address;
import Models.MobileNumber;
import Models.Student;
import Models.TempStudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(
                "Jayesh",
                20,
                new Address("1234"),
                Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

        Student student2 = new Student(
                "Khyati",
                20,
                new Address("1235"),
                Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

        Student student3 = new Student(
                "Jason",
                20,
                new Address("1236"),
                Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

        List<Student> students = Arrays.asList(student1, student2, student3);


        //  Get student with exact match name "jayesh"

        /*
         students.stream()
                .filter(student -> student.getName().equals("Jayesh"))
                .forEach(x-> System.out.println(x));
         */


        // Get student with matching address "1235"
/*


        students.stream()
                .filter(student -> student.getAddress().getZipcode().equals("1235"))
                .forEach(x-> System.out.println(x));
 */


        // Get all student having mobile numbers 3333.
/*
        students.stream()
                .filter(student -> student.getMobileNumbers().stream()
                        .anyMatch(mobileNumber -> mobileNumber.getNumber().equals("3333")))
                .forEach(System.out::println);
*/

        /*


        //  Get all student having mobile number 1233 and 1234
        students.stream()
                .filter(student -> student.getMobileNumbers().stream()
                        .anyMatch(mobileNumber -> (mobileNumber.getNumber().equals("1233")  || mobileNumber.getNumber().equals("1234")) ))
                .forEach(System.out::println);
        */


        /*


       // Create a List<Student> from the List<TempStudent>

        TempStudent tmpStud1 = new TempStudent(
                "Jayesh1",
                201,
                new Address("12341"),
                Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));

        TempStudent tmpStud2 = new TempStudent(
                "Khyati1",
                202,
                new Address("12351"),
                Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));
        List<TempStudent> tmpStudents = Arrays.asList(tmpStud1, tmpStud2);

        List<Student> newList = new ArrayList<>();
        newList =  tmpStudents.stream()
                .map(newStud-> new Student(newStud.name, newStud.age, newStud.address,newStud.mobileNumbers)).collect(Collectors.toList());

        newList.forEach(x-> System.out.println(x));
         */

/*
        // Convert List<Student> to List<String> of student name

        List<String> stringNames;

        stringNames = students.stream()
                .map(onlyNames -> new String(onlyNames.getName())).collect(Collectors.toList());

        stringNames.forEach(x -> System.out.println(x));


        // Sort List<String> (reversed)
        stringNames.stream()
                .sorted(Comparator.reverseOrder()).forEach(x -> System.out.println(x));
*/









    }
}