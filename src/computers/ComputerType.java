package computers;

public enum ComputerType {
    DESKTOP("Desktop"),
    LAPTOP("Laptop"),
    SERVER("Server"),
    TRANSFORMER("Transformer");

    private final String name;
    ComputerType(String name) {
        this.name = name;
    }

    public String showName(){
        return this.name;
    }
}
