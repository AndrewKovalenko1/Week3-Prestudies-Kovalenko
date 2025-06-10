package computers;

import java.util.Scanner;

public class Computer {

    //region Variables
    private String manufacturerName;  // Manufacturer name
    private int procSpeed;            // Processor speed in MHz
    private int hardMemory;           // Hard drive size in gigabytes
    private int ramMemory;            // RAM size in gigabytes
    private int numberUSBPorts;      // Number of USB ports
    private int screenSize;          // Screen size in inches (if available)
    private ComputerType computerType;// Computer type (e.g., desktop computer, laptop)
    private boolean isPreinstalledOS; // Preinstalled operating system: Yes/No
    private int garantie;             // Garantie in months
    private double purchasePrice;     // Purchase price in format 0.00
    private double sellingPrice;      // Selling price in format 0.00
    static Scanner scanner = new Scanner(System.in);

    //endregion

    //region Constructors
    //Constructor for predefined variant
    public Computer() {
        this.manufacturerName = "HP";
        this.computerType = ComputerType.LAPTOP;
        this.procSpeed = 4000;
        this.hardMemory = 1024;
        this.ramMemory = 8;
        this.numberUSBPorts = 3;
        this.screenSize = 24;
        this.isPreinstalledOS = true;
        this.garantie = 36;
        this.purchasePrice = 400.00;
        this.sellingPrice = 600.00;

    }

    //Constructor with the minimum values of manufacturer name, screen size,
    //and preinstalled operating system
    public Computer( String manufacturerName, int screenSize, boolean isPreinstalledOS) {
        this.manufacturerName = manufacturerName;
        this.screenSize = screenSize;
        this.isPreinstalledOS = isPreinstalledOS;
        this.computerType = ComputerType.LAPTOP;
        this.procSpeed = 6000;
        this.hardMemory = 2048;
        this.ramMemory = 16;
        this.numberUSBPorts = 4;
        this.garantie = 36;
        this.purchasePrice = 500.00;
        this.sellingPrice = 800.00;
    }

    //Constructor requiring all values
    public Computer(String manufacturerName, int screenSize, boolean isPreinstalledOS,
                    ComputerType computerType, int procSpeed, int hardMemory,
                    int ramMemory, int numberUSBPorts,  int garantie) {
        this.manufacturerName = manufacturerName;
        this.screenSize = screenSize;
        this.isPreinstalledOS = isPreinstalledOS;
        this.computerType = computerType;
        this.procSpeed = procSpeed;
        this.hardMemory = hardMemory;
        this.ramMemory = ramMemory;
        this.numberUSBPorts = numberUSBPorts;
        this.garantie = garantie;
        this.purchasePrice = 600.00;
        this.sellingPrice = 1000.00;
    }
    //endregion

    //region Getters and Setters
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getProcSpeed() {
        return procSpeed;
    }

    public void setProcSpeed(int procSpeed) {
        this.procSpeed = procSpeed;
    }

    public int getHardMemory() {
        return hardMemory;
    }

    public void setHardMemory(int hardMemory) {
        this.hardMemory = hardMemory;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public int getNumberUSBPorts() {
        return numberUSBPorts;
    }

    public void setNumberUSBPorts(byte numberUSBPorts) {
        this.numberUSBPorts = numberUSBPorts;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(byte screenSize) {
        this.screenSize = screenSize;
    }

    public ComputerType getComputerType() {
        return computerType;
    }

    public void setComputerType(ComputerType computerType) {
        this.computerType = computerType;
    }

    public boolean isPreinstalledOS() {
        return isPreinstalledOS;
    }

    public void setPreinstalledOS(boolean preinstalledOS) {
        isPreinstalledOS = preinstalledOS;
    }

    public int getGarantie() {
        return garantie;
    }

    public void setGarantie(int garantie) {
        this.garantie = garantie;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    //endregion

    //region Static inputs for fields
    public static String inputManufacturerName() {
        return EnterText(scanner, "Please enter your manufacturer name: ");
    }

    public static ComputerType inputComputerType() {
        return inputComputerType(scanner);
    }

    public static int inputProcSpeed(){
        return EnterPositiveIntNumber(scanner, "Please enter processor speed in Mhz: ");
    }

    public static int inputHardMemory(){
        return EnterPositiveIntNumber(scanner, "Please enter hard memory capacity in Gb: ");
    }
    public static int inputRAMSize(){
        return EnterPositiveIntNumber(scanner, "Please enter RAM size in Gb: ");
    }

    public static int inputGarantie(){
        return EnterPositiveIntNumber(scanner, "Please enter garantie termin in months: ");
    }

    public static int inputNumberUSB(){
        return EnterNotTooBigPositiveNumber(scanner, "Please enter number of USB ports (0-8): ", 8);
    }

    public static int inputScreenSize(){
        return EnterNotTooBigPositiveNumber(scanner, "Please enter screen size in inches (to 32 inches): ", 32);
    }

    public static boolean chooseIsPreinstalledOS (){
        return EnterBoolean(scanner, "Please chose if preinstalled OS): ");
    }
    //endregion

    //region Methods for input with validation

    private static int EnterPositiveIntNumber(Scanner scanner, String text) {
        int number = -1;
        do {
            System.out.print(text);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Please, enter only positive integer values");
                }
            } else {
                System.out.println("Please, enter only positive integer values");
                scanner.next();
            }
        }while (number < 0);
        return number;
    }

    private static String EnterText(Scanner scanner, String text) {
        String name;
        do {
            System.out.print(text);
            name = scanner.nextLine();
        } while (name.isBlank());
        return name;
    }

    private static boolean EnterBoolean(Scanner scanner, String text) {
        boolean value = false, isBooleanValue = false;

        do {
            System.out.print(text);
            if (scanner.hasNextBoolean()) {
                value = scanner.nextBoolean();
                isBooleanValue = true;
            } else {
                System.out.println("Please, enter only 'true' or 'false'");
                scanner.next();
            }
        } while (!isBooleanValue);
        return value;
    }

    private static int EnterNotTooBigPositiveNumber(Scanner scanner, String text, int biggestPossibleValue) {
        int value;
        do {
            value = EnterPositiveIntNumber(scanner, text);
            if (value > biggestPossibleValue) {
                System.out.printf("Value cant be more than %d \n",biggestPossibleValue);
            }
        } while (value < 0 || value > biggestPossibleValue);
        return value;
    }

    private static ComputerType inputComputerType(Scanner scanner){
        do {
            System.out.println("""
                     Please chose correct computer type.
                     Input one of four variants:
                     1 - Desktop,
                     2 - Laptop,
                     3 - Server,
                     4 - Transformer
                    """);
            System.out.print("Select the type: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    return ComputerType.DESKTOP;
                case"2":
                    return ComputerType.LAPTOP;
                case"3":
                    return ComputerType.SERVER;
                case"4":
                    return ComputerType.TRANSFORMER;
                default:
            }
        }while (true);
    }

    //endregion

    @Override
    public String toString() {
        return "Computer configuration \n"+
                "   Manufacturer name: " + manufacturerName + "\n" +
                "   Computer type: " + computerType.showName() + "\n" +
                "   Processor speed: " + procSpeed + " Mhz\n" +
                "   Hard drive size: " + hardMemory + " Gb\n" +
                "   RAM size: " + ramMemory + " Gb\n" +
                "   Number of USB ports: " + numberUSBPorts + "\n" +
                "   Screen size: " + screenSize + " inch \n" +
                "   Preinstalled operating system: Yes/No: " + (isPreinstalledOS ? "Yes" : "No") + "\n" +
                "   Garantie " + garantie + " months\n" +
                "   Price " + String.format("%.2f",sellingPrice);
    }

    public static Computer createBasicConfiguration(){
        System.out.println("Please, enter basic parameters yours computer");
        String manufacturerName = inputManufacturerName();
        int screenSize = inputScreenSize();
        boolean isPreinstalledOS = chooseIsPreinstalledOS();
        return new Computer(manufacturerName, screenSize, isPreinstalledOS);
    }

    public static Computer createCustomConfiguration(){
        System.out.println("Please, enter all parameters of your computer");
        String manufacturerName = inputManufacturerName();
        int screenSize = inputScreenSize();
        boolean isPreinstalledOS = chooseIsPreinstalledOS();
        ComputerType computerType = inputComputerType();
        int procSpeed = inputProcSpeed();
        int hardMemory = inputHardMemory();
        int ramMemory = inputRAMSize();
        int numberUSBPorts = inputNumberUSB();
        int garantie = inputGarantie();

        return new Computer(manufacturerName, screenSize, isPreinstalledOS,
                computerType, procSpeed, hardMemory, ramMemory, numberUSBPorts, garantie);
    }

    public double getProfit() {
        return this.sellingPrice - this.purchasePrice;
    }

    public void changeCharacteristics(){
        String menu = """
                You can choose which characteristic you want to change:
                Choose operation you want to run:
                1 - RAM size
                2 - Hard drive size
                3 - Screen size
                4 - Preinstalled OS
                m - Show menu
                Any other enter - end the changes
               \s""";

        System.out.print(menu);
        Scanner scanner = new Scanner(System.in);
        String choice;
        boolean isContinued = true;
        do {
            System.out.print("\nYour change choice: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Current RAM size is: " + this.ramMemory + " Gb");
                    this.ramMemory = inputRAMSize();
                    break;
                case "2":
                    System.out.println("Current Hard drive is: " + this.hardMemory + " Gb");
                    this.ramMemory = inputHardMemory();
                    break;
                case "3":
                    System.out.println("Current screen size is: " + this.screenSize + " inches");
                    this.screenSize = inputScreenSize();
                    break;
                case "4":
                    System.out.println("Current choice of preinstalled OS option: " + (isPreinstalledOS ? "Yes" : "No"));
                    this.isPreinstalledOS = chooseIsPreinstalledOS();
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
