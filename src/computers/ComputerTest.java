package computers;

import java.util.Scanner;

public class ComputerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wahl;
        boolean istFortgesetzt = true;
        Computerladen computerladen = new Computerladen();
        String menue = """
                  Computerladen
                    Wählen Sie die Aktion, die Sie ausführen möchten:
                    1 - Computer mit vordefinierter Konfiguration wählen
                    2 - Computer mit eigenen Basisparametern wählen
                    3 - Eigene Konfiguration auswählen
                    4 - Merkmale des aktuellen Computers verbessern
                    5 - Gewinn für aktuellen Computer anzeigen
                    6 - Gewinn aus dem Verkauf aller Computer anzeigen
                    m - Menü anzeigen
                    Jede andere Eingabe - Programm beenden
                \s""";
        System.out.print(menue);
        do {
            System.out.print("\nIhre Wahl: ");
            wahl = scanner.nextLine();
            switch (wahl) {
                case "1":
                    hinzufuegeVordefinierteKonfiguration(computerladen);
                    break;
                case "2":
                    hinzufuegeBasisKonfiguration(computerladen);
                    break;
                case "3":
                    hinzufuegeEigeneKonfiguration(computerladen);
                    break;
                case "4":
                    aendereMerkmale(computerladen);
                    break;
                case "5":
                    zeigeGewinnAktuellerCompute(computerladen);
                    break;
                case "6":
                    zeigeLadenGewinn(computerladen);
                    break;
                case "m":
                    System.out.println(menue);
                    break;
                default:
                    istFortgesetzt = false;
                    scanner.close();
                    break;
            }
        } while (istFortgesetzt);

    }

    //region Menu methods
    public static void hinzufuegeVordefinierteKonfiguration(Computerladen computerladen) {
        System.out.println("Sie haben einen Computer mit vordefinierter Konfiguration gewählt. \n");
        Computer computer = new Computer();
        System.out.println(computer);
        computerladen.hinzufuegeComputer(computer);
    }

    public static void hinzufuegeBasisKonfiguration(Computerladen computerladen) {
        System.out.println("Sie haben einen Computer mit eigenen Basisparametern gewählt. \n");
        Computer computer = Computer.erstelleBasisKonfiguration();
        System.out.println(computer);
        computerladen.hinzufuegeComputer(computer);
    }

    public static void hinzufuegeEigeneKonfiguration(Computerladen computerladen) {
        System.out.println("Wählen Sie Ihre eigene Konfiguration aus. \n");
        Computer computer = Computer.erstelleBenutzerdefinierteKonfiguration();
        System.out.println(computer);
        computerladen.hinzufuegeComputer(computer);
    }

    public static void aendereMerkmale(Computerladen computerladen) {
        if (computerladen.holeComputerAnzahl() == 0){
            System.out.println("Um Merkmale zu verbessern, müssen Sie zuerst eine Konfiguration auswählen,\n" +
                    "die Sie mit 1, 2 oder 3 Punkten im Menü verbessern möchten.");
            return;
        }
        Computer computer = computerladen.holeAktuellenComputer();
        computer.aendereMerkmale();
        System.out.println(computer);
    }

    private static void zeigeGewinnAktuellerCompute(Computerladen computerladen) {
        if (computerladen.holeComputerAnzahl() == 0){
            System.out.println("Um den Gewinn anzuzeigen, müssen Sie zuerst eine Konfiguration mit 1, 2 oder 3 Punkten im Menü auswählen.");
            return;
        }
        Computer computer = computerladen.holeAktuellenComputer();
        System.out.println("Der Gewinn ist: " + String.format("%.2f",computer.holeGewinn()));
    }

    private static void zeigeLadenGewinn(Computerladen computerladen) {
        if (computerladen.holeComputerAnzahl() ==0){
            System.out.println("Sie haben noch keinen Computer verkauft. Der Gewinn beträgt 0.");
            return;
        }
        System.out.printf("Gewinn aus dem Verkauf von %d Computern beträgt %.2f\n",
                computerladen.holeComputerAnzahl(), computerladen.gewinnBerechnen());
    }
    //endregion
}
