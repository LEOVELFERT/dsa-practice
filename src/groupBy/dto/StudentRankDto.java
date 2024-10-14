package groupBy.dto;

public class StudentRankDto {
    private String name;
    private int age;
    public StudentRankDto(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public StudentRankDto(){
    }

    @Override
    public String toString() {
        return "StudentRankDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
