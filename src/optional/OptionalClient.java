package optional;

public class OptionalClient {

    public static void main(String[] args) {
//        Person person=new Person("leo",new Car("maruti",new Insurance("summa")));
//        String insuranceName = person.getInsuranceName(person);
//        System.out.println(insuranceName);

        Person person=new Person("leo",new Car("maruti",new Insurance(null)));
        String insuranceName = person.getInsuranceName(person);
        System.out.println(insuranceName);
    }
}
