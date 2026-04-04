package GroupingBy;

public class Person {
    public String name;
    public String country;
    public Person(String name, String country){
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
