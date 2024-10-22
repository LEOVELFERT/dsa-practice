package streamapi.sorting;

import streamapi.Student;

import java.util.*;
import java.util.stream.Collectors;

public class AsendingOrder {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("leo", "arun", "kamaraj", "thaamarai"));
        List<String> reverseOrderList = stringList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("The reverse Order List---->"+reverseOrderList);
        List<String> sortedList = stringList.stream().sorted().toList();
        System.out.println("The order list---->"+sortedList);

        Student student1=new Student(1,"leo");
        Student student2=new Student(2,"gopi");
        Student student3=new Student(3,"vimal");
        Student student4=new Student(4,"kamal");

        List<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Map<Integer, String> idSortedMap = students.stream()
                .distinct()
                .sorted(Comparator.comparingInt(x -> x.getId() % 2))
                .skip(0)
                .limit(1)
                .collect(Collectors.toMap(Student::getId, Student::getName));

        System.out.println("id sorted Map------>"+idSortedMap);


    }
}
