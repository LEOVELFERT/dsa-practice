package groupBy.dto;

public class Student {

    private String name;
    private int age;
    private int ranking;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    public Student(String name, int age, int ranking) {
        this.name = name;
        this.age = age;
        this.ranking = ranking;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ranking=" + ranking +
                '}';
    }
}
