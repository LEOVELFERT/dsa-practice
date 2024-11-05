package optional;

import java.util.Optional;

public class Person {
    private String name;
    private Optional<Car> car;


    public Person(String name, Car car) {
        this.name = name;
        this.car = Optional.ofNullable(car);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Car> getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = Optional.ofNullable(car);
    }

    public String getInsuranceName(Person person){
        Optional<Person> optPerson = Optional.ofNullable(person);

        return optPerson
                .flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("one of the value is null");
    }
}
