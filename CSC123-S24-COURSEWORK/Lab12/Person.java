import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Person(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("MM/dd/yy"));
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);
        return period.getYears();
    }

    public static void main(String[] args) {
        Person person = new Person("Jared", "Asuncion", "07/04/03");
        System.out.println("Full Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());
    }
}

