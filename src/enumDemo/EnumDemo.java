package enumDemo;

public class EnumDemo {
    public static void main(String[] args) {
        Fruits[] fruitsValues = Fruits.values();
        for(Fruits fruits:fruitsValues){
            System.out.println("The fruit "+fruits.name()+" colur is "+fruits.getColour());
        }
    }
}
