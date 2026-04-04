package GroupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person("p1", "US");
        Person p2 = new Person("p2", "AU");
        Person p3 = new Person("p3", "US");
        Person p4 = new Person("p4", "AU");
        Person p5 = new Person("p5", "NZ");
        Person p6 = new Person("p6", "CA");

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);

        Map<Boolean, List<Person>> map = list.stream().collect(Collectors.groupingBy(p -> p.country.equals("US")));
        Map<String, List<Person>> map2 =
                list.stream().collect(Collectors.groupingBy(person -> person.country, Collectors.toList()));

        System.out.println(map2);
    }
}
