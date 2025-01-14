package consturctor;

public class Person {
    private String name;
    private int personid;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personid=" + personid +
                '}';
    }

    public Person(String name, int personid) {
        this.name = name;
        this.personid = personid;
    }
}
