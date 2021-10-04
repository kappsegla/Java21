package se.iths.java21.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        String homeFolder = System.getProperty("user.home");
        Path path = Path.of(homeFolder, "test", "fil1.txt");
        Files.createDirectories(path.getParent());
        System.out.println(Files.exists(path));
        System.out.println(path.toAbsolutePath());

        // Files.writeString(path,"This is a test with åäö ûü");
        List<String> strings = List.of("First Line", "Second Line", "Third Line");
        Files.write(path, strings, StandardOpenOption.APPEND, StandardOpenOption.CREATE);

        System.out.println(Files.exists(path));

        // String s = Files.readString(path);
        // System.out.println(s);

        //   List<String> stringList = Files.readAllLines(path);
        //   stringList.forEach(System.out::println);

        Stream<String> stream = Files.lines(path);
        stream.filter(l -> l.startsWith("F"))
                .forEach(System.out::println);

    }
}
