package ObjectsAndClassesEx.OrderByAge07;

public class Person {
    private String name;
    private String id;
    private int age;

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " with ID: " + id + " is " + age + " years old.";
    }
    //Stefan with ID: 524244 is 10 years old.
}
