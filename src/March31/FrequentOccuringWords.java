package March31;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FrequentOccuringWords {
    /*  Problem: You have a list of Sentences. Each sentence contains a list of words.
         Write a Stream pipeline to find the top
          3 most frequently occurring words (case-insensitive)
           across all sentences, excluding common "stop words" (e.g., "the", "a", "is").
           The java is fun
           Java is coding and java is fast
           powerful in java is fun
     */
    public static void main(String[] args){
        List<List<String>> list = List.of(List.of("The", "Java", "is", "fun"),
                List.of("Java", "is", "coding", "and", "java", "is", "fast"),
                List.of("powerful", "in", "java", "is", "fun"));
        List<String> stop = List.of("the", "a", "is");

        Predicate<String> p = s -> !stop.contains(s);
        Map<String, Long> map = list.stream().flatMap(s -> s.stream())
                .filter(p)
                .collect(Collectors.groupingBy(word -> word.toLowerCase(), Collectors.counting()));

        map.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .forEach(i -> System.out.println(i.getKey() + " : " + i.getValue()));
    }
}
