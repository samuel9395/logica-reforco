package testes;

public class Names {
    private String firstName;
    private String lastName;

    public Names(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return completeName("Complete name: " + firstName + " " + lastName);
    }

    private String completeName(String s) {
        return s;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

