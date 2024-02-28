package modules;

public class PersonController {
    private int id;
    private String name;
    private int age;
    private String email;

    // Constructor without id (used to create a new person before saving to the database)
    public Person(String name, int age, String email) {
        setName(name);
        setAge(age);
        setEmail(email);
    }

    // Constructor with id (used when obtaining data about a person from the database)
    public Person(int id, String name, int age, String email) {
        this(name, age, email); // Calls the first constructor to set name, age and email
        setId(id); // Additionally sets the person's id
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Overridden toString() method for beautifully printing information about a person
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}

