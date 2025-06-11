package computers;

import java.util.ArrayList;

public class Computerladen {
    private final ArrayList<Computer> computers = new ArrayList<>();

    public double gewinnBerechnen(){
        double gewinn = 0;
        for (Computer computer : computers) {
            gewinn += computer.holeGewinn();
        }
        return gewinn;
    }

    public void hinzufuegeComputer(Computer computer) {
        if(!computers.contains(computer)){
            computers.add(computer);
        }
    }

    public int holeComputerAnzahl() {
        return computers.size();
    }

    public Computer holeAktuellenComputer(){
        return computers.getLast();
    }
}
