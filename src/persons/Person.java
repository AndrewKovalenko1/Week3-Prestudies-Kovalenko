package persons;

public class Person {
    private String name;
    private int age;
    private String address;

    //region Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //endtregion

    public void introduce() {
        StringBuilder text = new StringBuilder("Hello! ");
        if (name == null) {
            text.append("I dont have name yet. ");
        } else {
            text.append("My name is %s. ").append(name);
        }

        if (age == 0) {
            text.append("I dont have age yet.\n");
        } else {
            text.append("I'm ").append(age).append(" years old.\n");
        }

        if (address == null) {
            text.append("I dont have address yet. ");
        } else {
            text.append("My address is: ").append(address);
        }
        System.out.println(text);
    }
}
