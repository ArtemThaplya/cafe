import java.util.Date;

public class Waiter {
    private String firstName;
    private String lastName;
    private int age;
    private Date employmentDate;

    public Waiter(String firstName, String lastName, int age, Date employmentDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.employmentDate = employmentDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }
}
