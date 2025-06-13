package computers;

import java.util.Scanner;

public class Computer {

    //region Variablen
    private String herstellerName; // Herstellername
    private int procGeschwindigkeit; // Prozessorgeschwindigkeit in MHz
    private int festplattenSpeicher; // Festplattengröße in Gigabyte
    private int ramSpeicher; // RAM-Größe in Gigabyte
    private int anzahlUSBPorts; // Anzahl der USB-Ports
    private int bildschirmGroesse; // Bildschirmgröße in Zoll (falls vorhanden)
    private ComputerTyp computerTyp; // Computertyp (z.B. Desktop-Computer, Laptop)
    private boolean istVorinstalliertesOS; // Vorinstalliertes Betriebssystem: Ja/Nein
    private int garantie; // Garantie in Monaten
    private double kaufpreis; // Kaufpreis im Format 0.00
    private double verkaufspreis; // Verkaufspreis im Format 0.00
    static Scanner scanner = new Scanner(System.in);

    //endregion

    //region Konstruktoren
    //Konstruktor für vordefinierte Variante
    public Computer() {
        this.herstellerName = "HP";
        this.computerTyp = ComputerTyp.LAPTOP;
        this.procGeschwindigkeit = 4000;
        this.festplattenSpeicher = 1024;
        this.ramSpeicher = 8;
        this.anzahlUSBPorts = 3;
        this.bildschirmGroesse = 24;
        this.istVorinstalliertesOS = true;
        this.garantie = 36;
        this.kaufpreis = 400.00;
        this.verkaufspreis = 600.00;

    }

    //Konstruktor mit den Mindestwerten für Herstellernamen, Bildschirmgröße
    //und vorinstalliertes Betriebssystem
    public Computer(String herstellerName, int bildschirmGroesse, boolean istVorinstalliertesOS) {
        this.herstellerName = herstellerName;
        this.bildschirmGroesse = bildschirmGroesse;
        this.istVorinstalliertesOS = istVorinstalliertesOS;
        this.computerTyp = ComputerTyp.LAPTOP;
        this.procGeschwindigkeit = 6000;
        this.festplattenSpeicher = 2048;
        this.ramSpeicher = 16;
        this.anzahlUSBPorts = 4;
        this.garantie = 36;
        this.kaufpreis = 500.00;
        this.verkaufspreis = 800.00;
    }

    //Konstruktor, der alle Werte benötigt
    public Computer(String herstellerName, int bildschirmGroesse, boolean istVorinstalliertesOS,
                    ComputerTyp computerTyp, int procGeschwindigkeit, int festplattenSpeicher,
                    int ramSpeicher, int anzahlUSBPorts, int garantie) {
        this.herstellerName = herstellerName;
        this.bildschirmGroesse = bildschirmGroesse;
        this.istVorinstalliertesOS = istVorinstalliertesOS;
        this.computerTyp = computerTyp;
        this.procGeschwindigkeit = procGeschwindigkeit;
        this.festplattenSpeicher = festplattenSpeicher;
        this.ramSpeicher = ramSpeicher;
        this.anzahlUSBPorts = anzahlUSBPorts;
        this.garantie = garantie;
        this.kaufpreis = 600.00;
        this.verkaufspreis = 1000.00;
    }
    //endregion

    //region Getters und Setters. Muss wegen Aufgabe sein. Ich hab änderung mit anderem Weg gemacht
    // ich nutze aendereMerkmale(). Aber diese Metoden können später nutyen werden.
    public String getHerstellerName() {
        return herstellerName;
    }

    public void setHerstellerName(String herstellerName) {
        this.herstellerName = herstellerName;
    }

    public int getProcGeschwindigkeit() {
        return procGeschwindigkeit;
    }

    public void setProcGeschwindigkeit(int procGeschwindigkeit) {
        this.procGeschwindigkeit = procGeschwindigkeit;
    }

    public int getFestplattenSpeicher() {
        return festplattenSpeicher;
    }

    public void setFestplattenSpeicher(int festplattenSpeicher) {
        this.festplattenSpeicher = festplattenSpeicher;
    }

    public int getRamSpeicher() {
        return ramSpeicher;
    }

    public void setRamSpeicher(int ramSpeicher) {
        this.ramSpeicher = ramSpeicher;
    }

    public int getAnzahlUSBPorts() {
        return anzahlUSBPorts;
    }

    public void setAnzahlUSBPorts(byte anzahlUSBPorts) {
        this.anzahlUSBPorts = anzahlUSBPorts;
    }

    public int getBildschirmGroesse() {
        return bildschirmGroesse;
    }

    public void setBildschirmGroesse(byte bildschirmGroesse) {
        this.bildschirmGroesse = bildschirmGroesse;
    }

    public ComputerTyp getComputerType() {
        return computerTyp;
    }

    public void setComputerType(ComputerTyp computerTyp) {
        this.computerTyp = computerTyp;
    }

    public boolean getIstVorinstalliertesOS() {
        return istVorinstalliertesOS;
    }

    public void setIstVorinstalliertesOS(boolean istVorinstalliertesOS) {
        this.istVorinstalliertesOS = istVorinstalliertesOS;
    }

    public int getGarantie() {
        return garantie;
    }

    public void setGarantie(int garantie) {
        this.garantie = garantie;
    }

    public double getKaufpreis() {
        return kaufpreis;
    }

    public void setKaufpreis(double kaufpreis) {
        this.kaufpreis = kaufpreis;
    }

    public double getVerkaufspreis() {
        return verkaufspreis;
    }

    public void setVerkaufspreis(double verkaufspreis) {
        this.verkaufspreis = verkaufspreis;
    }
    //endregion

    //region Statische Eingaben für Felder
    public static String eingabeHerstellerName() {
        return eingabeText(scanner, "Bitte geben Sie Ihren Herstellernamen ein: ");
    }

    public static int eingabeProcGeschwindigkeit(){
        return eingabePositiveGanzzahl(scanner, "Bitte geben Sie die Prozessorgeschwindigkeit in MHz ein: ");
    }

    public static int eingabeFestplattenSpeicher(){
        return eingabePositiveGanzzahl(scanner, "Bitte geben Sie die Festplattengröße in GB ein: ");
    }
    
    public static int eingabeRamGroesse(){
        return eingabePositiveGanzzahl(scanner, "Bitte geben Sie die RAM-Größe in GB ein: ");
    }

    public static int eingabeGarantieDauer(){
        return eingabePositiveGanzzahl(scanner, "Bitte geben Sie die Garantiedauer in Monaten ein: ");
    }

    public static int eingabeAnzahlUsb(){
        return eingabeBegrenztePositiveZahl(scanner, "Bitte geben Sie die Anzahl der USB-Anschlüsse ein (0–8): ", 8);
    }

    public static int eingabeBildschirmgroesse(){
        return eingabeBegrenztePositiveZahl(scanner, "Bitte geben Sie die Bildschirmgröße in Zoll ein (bis zu 32 Zoll): ", 32);
    }

    public static boolean waehleIstBetriebssystemVorinstalliert(){
        return eingabeBoolean(scanner, "Bitte wählen Sie, ob das Betriebssystem vorinstalliert ist: ");
    }
    //endregion

    //region Methoden zur Eingabe mit Validierung

    private static int eingabePositiveGanzzahl(Scanner scanner, String text) {
        int number = -1;
        do {
            System.out.print(text);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Bitte geben Sie nur positive ganze Zahlen ein.");
                }
            } else {
                System.out.println("Bitte geben Sie nur positive ganze Zahlen ein.");
                scanner.next();
            }
        }while (number < 0);
        return number;
    }

    private static String eingabeText(Scanner scanner, String text) {
        String name;
        do {
            System.out.print(text);
            name = scanner.nextLine();
        } while (name.isBlank());
        return name;
    }

    private static boolean eingabeBoolean(Scanner scanner, String text) {
        boolean wert = false, istBooleanWert = false;

        do {
            System.out.print(text);
            if (scanner.hasNextBoolean()) {
                wert = scanner.nextBoolean();
                istBooleanWert = true;
            } else {
                System.out.println("Bitte geben Sie nur 'true' oder 'false' ein");
                scanner.next();
            }
        } while (!istBooleanWert);
        return wert;
    }

    private static int eingabeBegrenztePositiveZahl(Scanner scanner, String text, int groesstmoeglicherWert) {
        int wert;
        do {
            wert = eingabePositiveGanzzahl(scanner, text);
            if (wert > groesstmoeglicherWert) {
                System.out.printf("Der Wert darf nicht größer als %d sein.\n",groesstmoeglicherWert);
            }
        } while (wert < 0 || wert > groesstmoeglicherWert);
        return wert;
    }

    public static ComputerTyp eingabeComputerTyp(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("""
                 Bitte wählen Sie den korrekten Computertyp aus.
                    Geben Sie eine der vier Varianten ein:
                    1 – Desktop,
                    2 – Laptop,
                    3 – Server,
                    4 – Transformer
                """);
            System.out.print("Wählen Sie den Typ aus: ");
            String auswahl = scanner.nextLine();
            switch (auswahl){
                case "1":
                    return ComputerTyp.DESKTOP;
                case"2":
                    return ComputerTyp.LAPTOP;
                case"3":
                    return ComputerTyp.SERVER;
                case"4":
                    return ComputerTyp.TRANSFORMER;
                default:
            }
        }while (true);
    }

    //endregion

    @Override
    public String toString() {
        return "Computerkonfiguration \n" +
                "   Herstellername: " + herstellerName + "\n" +
                "   Computertyp: " + computerTyp.zeigeName() + "\n" +
                "   Prozessorgeschwindigkeit: " + procGeschwindigkeit + " MHz\n" +
                "   Festplattengröße: " + festplattenSpeicher + " GB\n" +
                "   RAM-Größe: " + ramSpeicher + " GB\n" +
                "   Anzahl der USB-Anschlüsse: " + anzahlUSBPorts + "\n" +
                "   Bildschirmgröße: " + bildschirmGroesse + " Zoll\n" +
                "   Vorinstalliertes Betriebssystem: Ja/Nein: " + (istVorinstalliertesOS ? "Ja" : "Nein") + "\n" +
                "   Garantie: " + garantie + " Monate\n" +
                "   Preis: " + String.format("%.2f", verkaufspreis);
    }

    public static Computer erstelleBasisKonfiguration(){
        System.out.println("Bitte geben Sie die Grundparameter Ihres Computers ein.");
        String herstellerName = eingabeHerstellerName();
        int bildschirmGroesse = eingabeBildschirmgroesse();
        boolean istVorinstalliertesOS = waehleIstBetriebssystemVorinstalliert();
        return new Computer(herstellerName, bildschirmGroesse, istVorinstalliertesOS);
    }

    public static Computer erstelleBenutzerdefinierteKonfiguration(){
        System.out.println("Bitte geben Sie alle Parameter Ihres Computers ein.");
        String manufacturerName = eingabeHerstellerName();
        int bildschirmGroesse = eingabeBildschirmgroesse();
        boolean istVorinstalliertesOS = waehleIstBetriebssystemVorinstalliert();
        ComputerTyp computerTyp = eingabeComputerTyp();
        int procGeschwindigkeit = eingabeProcGeschwindigkeit();
        int festplattenSpeicher = eingabeFestplattenSpeicher();
        int ramSpeicher = eingabeRamGroesse();
        int anzahlUSBPorts = eingabeAnzahlUsb();
        int garantie = eingabeGarantieDauer();

        return new Computer(manufacturerName, bildschirmGroesse, istVorinstalliertesOS,
                computerTyp, procGeschwindigkeit, festplattenSpeicher, ramSpeicher, anzahlUSBPorts, garantie);
    }

    public double holeGewinn() {
        return this.verkaufspreis - this.kaufpreis;
    }

    public void aendereMerkmale(){
        String menue = """
                Sie können auswählen, welche Eigenschaft Sie ändern möchten:
                  Wählen Sie die gewünschte Aktion aus:
                  1 – RAM-Größe
                  2 – Festplattengröße
                  3 – Bildschirmgröße
                  4 – Vorinstalliertes Betriebssystem
                  m – Menü anzeigen
                  Jede andere Eingabe – Änderungen beenden
               \s""";

        System.out.print(menue);
        Scanner scanner = new Scanner(System.in);
        String auswahl;
        boolean istFortgesetzt = true;
        do {
            System.out.print("\nIhre Änderungswahl: ");
            auswahl = scanner.nextLine();
            switch (auswahl) {
                case "1":
                    System.out.println("Aktuelle RAM-Größe: " + this.ramSpeicher + " GB");
                    this.ramSpeicher = eingabeRamGroesse();
                    break;
                case "2":
                    System.out.println("Aktuelle Festplattengröße: " + this.festplattenSpeicher + " GB");
                    this.ramSpeicher = eingabeFestplattenSpeicher();
                    break;
                case "3":
                    System.out.println("Aktuelle Bildschirmgröße: " + this.bildschirmGroesse + " Zoll");
                    this.bildschirmGroesse = eingabeBildschirmgroesse();
                    break;
                case "4":
                    System.out.println("Aktuelle Auswahl der Option vorinstalliertes Betriebssystem: " + (istVorinstalliertesOS ? "Ja" : "Nein"));
                    this.istVorinstalliertesOS = waehleIstBetriebssystemVorinstalliert();
                    break;
                case "m":
                    System.out.println(menue);
                    break;
                default:
                    istFortgesetzt = false;
                    break;
            }
        } while (istFortgesetzt);
    }

}
