package Streams;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");

        List<String> containsT =
                list.stream().filter(s -> s.toLowerCase().contains("t"))
                        .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(containsT);
        System.out.println(containsT.stream().allMatch(s -> s.toLowerCase().contains("t")));
        System.out.println(containsT.stream().anyMatch(String::isEmpty));


        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        Integer reduced = integers.stream().reduce(0, (a, b) -> a + b / 2);
        System.out.println(reduced);


        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);


        System.out.println(streamOfArrayFull.findFirst().get());
        System.out.println(streamOfArrayPart.findFirst().get());


        Stream<String> streamGenerated =
                Stream.generate(() -> "Hi").limit(10);
        System.out.println(streamGenerated.collect(Collectors.toList()));


        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
        System.out.println(streamIterated.collect(Collectors.toList()));

        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);
        System.out.println(intStream.boxed().collect(Collectors.toList()));
        System.out.println(longStream.boxed().collect(Collectors.toList()));


        Path path = Paths.get("D:\\file.txt");
        try {
            Stream<String> streamOfStrings = Files.lines(path);

            Stream<String> streamWithCharset =
                    Files.lines(path, StandardCharsets.UTF_8);

            System.out.println(streamOfStrings.collect(Collectors.toList()));
            System.out.println(streamWithCharset.collect(Collectors.toList()));
        } catch (IOException e) {
            System.out.println(e);
        }


        System.out.println(Stream.of("abcd", "bbcd", "cbcd").skip(1).collect(Collectors.toList()));
        System.out.println(
                Stream.of("abcdeef", "bbcdeef", "cbcdeef")
                .skip(1)
                .map(element -> element.substring(0, 3))
                .collect(Collectors.toList())
        );

        List<String> list1 = Arrays.asList("abc1", "abc2", "abc3");
        counter = 0;
        List<String> testFilter = list1.stream().filter(element -> {
            wasCalled();
            return element.contains("2");
        }).collect(Collectors.toList());
        System.out.println(counter);


        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));
        String listToString = productList.stream().map(Product::getName)
                .collect(Collectors.joining(", ", "{{", "}}"));
        System.out.println(listToString);

        IntSummaryStatistics statistics = productList.stream()
                .collect(Collectors.summarizingInt(Product::getPrice));

        System.out.println(statistics);
    }

    private static long counter;

    private static void wasCalled() {
        counter++;
    }

    public static Stream<String> streamOf(List<String> list) {
        return list == null ? Stream.empty() : list.stream();
    }
}
