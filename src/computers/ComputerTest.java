package computers;

import java.util.Scanner;

public class ComputerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        boolean isContinued = true;
        Computer computer = null;
        String menu = """
                Computer shop
                Choose operation you want to run:
                1 - Choose computer with predefined configuration
                2 - Choose computer with your own basic parameters
                3 - Select your own configuration
                4 - Upgrade characteristics
                5 - Show profit
                m - Show menu
                Any other enter - end the program
               \s""";
        System.out.print(menu);
        do {
            System.out.print("\nYour choice: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("You chose computer with predefined configuration \n");
                    computer = new Computer();
                    System.out.println(computer);
                    break;
                case "2":
                    System.out.println("You chose computer with your own basic parameters \n");
                    computer = Computer.createBasicConfiguration();
                    System.out.println(computer);
                    break;
                case "3":
                    System.out.println("Select your own configuration \n");
                    computer = Computer.createCustomConfiguration();
                    System.out.println(computer);
                    break;
                case "4":
                    if (computer ==null){
                        System.out.println("To upgrade characteristics first you have to choose a configuration,\n" +
                                "you want to upgrade with 1, 2 or 3 punkts of menu");
                        break;
                    }
                    System.out.println("Select your own configuration \n");
                    computer.changeCharacteristics();
                    System.out.println(computer);
                    break;
                case "5":
                    if (computer ==null){
                        System.out.println("To show profit first you have to choose a configuration with 1, 2 or 3 punkts of menu");
                        break;
                    }
                    System.out.println("Profit is: " + String.format("%.2f",computer.getProfit()));
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
}
