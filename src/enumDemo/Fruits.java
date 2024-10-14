package enumDemo;

public enum Fruits {
    APPLE("red"),
    MANGO("yellow"),
    GUVA("GREEN");

    public String getColour() {
        return colour;
    }

    private String colour;

    private Fruits(String colour){
        this.colour=colour;
    }

}
