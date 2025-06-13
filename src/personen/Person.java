package personen;

public class Person {
    private String name;
    private int alter;
    private String adresse;

    //region Getters und Setters. Muss wegen Aufgabe sein
    public String holeName() {
        return name;
    }

    public void setzeName(String name) {
        this.name = name;
    }

    public int holeAlter() {
        return alter;
    }

    public void setzeAlter(int age) {
        this.alter = age;
    }

    public String holeAdresse() {
        return adresse;
    }

    public void setzeAdresse(String address) {
        this.adresse = address;
    }
    //endtregion

    public void fuehreEin() {
        StringBuilder text = new StringBuilder("Hallo! ");
        if (name == null) {
            text.append("Ich habe noch keinen Namen. ");
        } else {
            text.append("Mein Name ist ").append(name).append(".");
        }

        if (alter == 0) {
            text.append(" Ich habe noch kein Alter.\n");
        } else {
            text.append(" Ich bin ").append(alter).append(" Jahre alt.\n");
        }

        if (adresse == null) {
            text.append(" Ich habe noch keine Adresse. ");
        } else {
            text.append(" Meine Adresse ist: ").append(adresse);
        }
        System.out.println(text);
    }
}
