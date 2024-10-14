package groupBy;

import groupBy.dto.Student;
import groupBy.dto.StudentRankDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByUsingStreamDemo {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("leo",26,1));
        students.add(new Student("leo",26,1));
        students.add(new Student("leo",25,1));
        students.add(new Student("leo",25,1));
        students.add(new Student("leo",22,1));
        students.add(new Student("leo",22,1));
        Map<Integer, List<StudentRankDto>> groupByAgeMap = groupByAge(students);
        System.out.println("the group by Age Map------>"+groupByAgeMap);
    }

    private static Map<Integer, List<StudentRankDto>> groupByAge(List<Student> students) {
        //returning groupByAgeMap
        return students.stream().collect(Collectors.groupingBy(Student::getAge, Collectors.mapping(
                student -> new StudentRankDto(student.getName(), student.getRanking()), Collectors.toList()
        )));
    }
}
