public class Person {
    private String firstName;
    private String secondName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age < 0 || age > 100) ? 0 : age;
    }

    public boolean isTeen () {
        return (this.age > 12 && this.age < 20);
    }

    public String getFullName () {
        if (this.firstName.isEmpty() && this.secondName.isEmpty()) return "";
        else if (this.firstName.isEmpty() && !this.secondName.isEmpty()) return this.secondName;
        else if (!this.firstName.isEmpty() && this.secondName.isEmpty()) return this.firstName;
        return this.firstName + " " + this.secondName;
    }
}
