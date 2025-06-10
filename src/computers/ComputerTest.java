package computers;

import java.util.Scanner;

public class ComputerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        boolean isContinued = true;
        ComputerShop computerShop = new ComputerShop();
        String menu = """
                Computer shop
                Choose operation you want to run:
                1 - Choose computer with predefined configuration
                2 - Choose computer with your own basic parameters
                3 - Select your own configuration
                4 - Upgrade characteristics of current computer
                5 - Show profit for current computer
                6 - Show profit for selling all computers
                m - Show menu
                Any other enter - end the program
               \s""";
        System.out.print(menu);
        do {
            System.out.print("\nYour choice: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addPredefinedConfiguration(computerShop);
                    break;
                case "2":
                    addBasicConfiguration(computerShop);
                    break;
                case "3":
                    addOwnConfiguration(computerShop);
                    break;
                case "4":
                    changeCharacteristics(computerShop);
                    break;
                case "5":
                    showProfitCurrentComputer(computerShop);
                    break;
                case "6":
                    showShopProfit(computerShop);
                    break;
                case "m":
                    System.out.println(menu);
                    break;
                default:
                    isContinued = false;
                    break;
            }
        } while (isContinued);

    }

    //region Menu methods
    public static void addPredefinedConfiguration(ComputerShop computerShop) {
        System.out.println("You chose computer with predefined configuration \n");
        Computer computer = new Computer();
        System.out.println(computer);
        computerShop.addComputer(computer);
    }

    public static void addBasicConfiguration(ComputerShop computerShop) {
        System.out.println("You chose computer with your own basic parameters \n");
        Computer computer = Computer.createBasicConfiguration();
        System.out.println(computer);
        computerShop.addComputer(computer);
    }

    public static void addOwnConfiguration(ComputerShop computerShop) {
        System.out.println("Select your own configuration \n");
        Computer computer = Computer.createCustomConfiguration();
        System.out.println(computer);
        computerShop.addComputer(computer);
    }

    public static void changeCharacteristics(ComputerShop computerShop) {
        if (computerShop.getComputersQuantity() == 0){
            System.out.println("To upgrade characteristics first you have to choose a configuration,\n" +
                    "you want to upgrade with 1, 2 or 3 punkts of menu");
            return;
        }
        Computer computer = computerShop.getCurrentComputer();
        computer.changeCharacteristics();
        System.out.println(computer);
    }

    private static void showProfitCurrentComputer(ComputerShop computerShop) {
        if (computerShop.getComputersQuantity() == 0){
            System.out.println("To show profit first you have to choose a configuration with 1, 2 or 3 punkts of menu");
            return;
        }
        Computer computer = computerShop.getCurrentComputer();
        System.out.println("Profit is: " + String.format("%.2f",computer.getProfit()));
    }

    private static void showShopProfit(ComputerShop computerShop) {
        if (computerShop.getComputersQuantity() ==0){
            System.out.println("You didnt sell yet any computer. Profit is 0");
            return;
        }
        System.out.printf("Profit for selling %d computers is %.2f\n",
                computerShop.getComputersQuantity(), computerShop.calculateProfit());
    }
    //endregion
}
