class Person {
    private String name;

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                "}";
    }

    public Object getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    };

    public Person(String name) {
        this.name = name;
    }

}

class Home {
    Person[] family = { new Person("Hammad"), new Person("Maha"), new Person("Ahmed") };

    public Person getPerson(String name) {
        for (Person p : family) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

}

public class TestArrayFind {

    public static void main(String[] args) {
        Home home = new Home();
        Person p = home.getPerson("Hammad");
        System.out.println(p);
    }

}