package computers;

import java.util.Scanner;

public class ComputerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        boolean isContinued = true;
        Computer computer;
        String menu = """
                Computer shop
                Choose operation you want to run:
                1 - Choose computer with predefined configuration
                2 - Choose computer with your own basic parameters
                3 - Select your own configuration
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
