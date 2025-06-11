package computers;

public enum ComputerTyp {
    DESKTOP("Desktop"),
    LAPTOP("Laptop"),
    SERVER("Server"),
    TRANSFORMER("Convertible");

    private final String name;
    ComputerTyp(String name) {
        this.name = name;
    }

    public String zeigeName(){
        return this.name;
    }
}
