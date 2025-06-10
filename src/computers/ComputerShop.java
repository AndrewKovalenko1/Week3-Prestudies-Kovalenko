package computers;

import java.util.ArrayList;

public class ComputerShop {
    private final ArrayList<Computer> computers = new ArrayList<>();

    public double calculateProfit(){
        double profit = 0;
        for (Computer computer : computers) {
            profit += computer.getProfit();
        }
        return profit;
    }

    public void addComputer(Computer computer) {
        if(!computers.contains(computer)){
            computers.add(computer);
        }
    }

    public int getComputersQuantity() {
        return computers.size();
    }
}
