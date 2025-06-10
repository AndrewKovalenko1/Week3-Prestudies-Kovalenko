package persons;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alex");
        person.setAge(12);
        person.setAddress("Floor Street 12");
        person.introduce();
    }
}
