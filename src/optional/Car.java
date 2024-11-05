package optional;

import java.util.Optional;

public class Car {
    private String name;
    private Optional<Insurance> insurance;

    public Car(String name,Insurance insurance){
        this.name=name;
        this.insurance=Optional.ofNullable(insurance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Insurance> getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = Optional.ofNullable(insurance);
    }


}
