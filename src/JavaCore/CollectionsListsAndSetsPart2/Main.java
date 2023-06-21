package JavaCore.CollectionsListsAndSetsPart2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1, вариант 1:");
        // Здесь я использую цикл for-each для прохода по всем элементам списка
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums1) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nЗадание 1, вариант 2");
        // Здесь я использую цикл for и метод get() для прохода по всем элементам списка
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        int lastIndex = nums1.size() - 1;
        for (int i = 0; i < nums2.size(); i++) {
            Integer num = nums2.get(i);
            if (num % 2 != 0) {
                if (i == lastIndex) {
                    System.out.print(num);
                } else {
                    System.out.print(num + ", ");
                }
            }
        }

        System.out.println("\nЗадание 1, вариант 3");
        // Здесь я использую стрим
        List<Integer> nums3 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        String result = nums3.stream().filter(num -> num % 2 != 0).map(Object::toString).collect(Collectors.joining(", "));
        if (!result.isEmpty()) {
            System.out.print(result);
        }

        System.out.println("\nЗадание 2");
        // Здесь я использую TreeSet, так как данный вариант гарантирует сортировку элементов
        List<Integer> nums4 = new ArrayList<>(List.of(10, 8, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> numbers = new TreeSet<>();
        for (Integer num : nums4) {
            if (num % 2 == 0) {
                numbers.add(num);
            }
        }
        System.out.println(numbers);

        System.out.println("Задание 3");
        // Здесь я использую HashSet, так как данный вариант более эффективен при работе с большим объемов данных
        String text = "Несмотря на то, что война продолжалась уже несколько лет, " + "жизнь в столице шла своим чередом. Вокруг все было как обычно: " + "люди спешили на работу, гуляли по паркам и садам, слушали концерты и балагурили на приемах. " + "Но за всей этой обыденностью скрывалось нечто невиданное - угроза войны всегда висела над страной, " + "напоминая о тех мучительных временах, когда люди вынуждены были бороться за свою жизнь и свободу.";

        Set<String> words = new HashSet<>();
        Collections.addAll(words, text.split("[^\\p{L}\\p{Nd}]+"));
        System.out.println(words);

        System.out.println("Задание 4");
        // Здесь я использую HashMap для подсчета количества повторений каждого элемента списка
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> countRepetition = new HashMap<>();
        for (String s : strings) {
            if (countRepetition.containsKey(s)) {
                countRepetition.put(s, countRepetition.get(s) + 1);
            } else {
                countRepetition.put(s, 1);
            }
        }
        for (Integer value : countRepetition.values()) {
            System.out.println(value);
        }
    }
}
