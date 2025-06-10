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
        System.out.format("Hello! My name is %s. I'm %d years old.\nMy address is: %s\n",
                name, age, address);
    }
}
