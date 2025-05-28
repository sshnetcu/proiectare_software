package ro.ulbs.paradigme.lab9;

import java.util.*;
import java.util.stream.*;

public class Application {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> numbers = IntStream.range(0, 10)
                .map(i -> 5 + random.nextInt(21))
                .boxed()
                .toList();
        System.out.println("Lista originala: " + numbers);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Suma elementelor: " + sum);

        int max = numbers.stream().max(Integer::compareTo).orElseThrow();
        int min = numbers.stream().min(Integer::compareTo).orElseThrow();
        System.out.println("Maxim: " + max + ", Minim: " + min);

        List<Integer> filtered = numbers.stream()
                .filter(n -> n >= 10 && n <= 20)
                .toList();
        System.out.println("Valori intre 10 si 20: " + filtered);

        List<Double> doubleList = numbers.stream()
                .map(Integer::doubleValue)
                .toList();
        System.out.println("Lista Double: " + doubleList);

        boolean contains12 = numbers.contains(12);
        System.out.println("Lista contine 12? " + contains12);

        List<Integer> list2 = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> squaresDistinct = list2.stream()
                .map(n -> n * n)
                .distinct()
                .toList();
        System.out.println("Patrate distincte: " + squaresDistinct);

        List<String> words = Arrays.asList("Acesta", "este", "un", "program", "scris", "cu", "java", "8", "si", "expresii", "lambda");

        List<String> longWords = words.stream()
                .filter(w -> w.length() >= 5)
                .toList();
        System.out.println("Cuvinte cu >= 5 caractere: " + longWords);

        List<String> sortedWords = longWords.stream()
                .sorted()
                .toList();
        System.out.println("Cuvinte ordonate: " + sortedWords);

        Optional<String> startsWithP = words.stream()
                .filter(w -> w.startsWith("p"))
                .findFirst();
        startsWithP.ifPresent(w -> System.out.println("Primul cuvant cu 'p': " + w));
    }
}
