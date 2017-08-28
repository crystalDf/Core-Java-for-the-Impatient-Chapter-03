package ch03.sec08;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private String name;

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

        if (middleName != null) {
            this.name = firstName + " " + middleName + " " + lastName;
        } else {
            this.name = firstName + " " + lastName;
        }
    }

    public Person(String name) {
        this.name = name;

        String[] names = name.split(" ");

        this.firstName = names[0];
        this.lastName = names[names.length - 1];

        if (names.length == 3) {
            this.middleName = names[1];
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
