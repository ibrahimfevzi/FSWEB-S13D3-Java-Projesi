public class Person {

    String firstName;
    String lastName;
    int age;
    int height;
    String job;
    String address;

        //constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    //constructor chaining
    public Person(String firstName, String lastName, int age, int height, String job, String address) {
        this(firstName, lastName, age);
        this.height = height;
        this.job = job;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if (age > 13 && age < 19) {
            return true;
        } else {
            return false;
        }
    }



}
