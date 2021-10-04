package se.iths.java21.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        String homeFolder = System.getProperty("user.home");
        Path path = Path.of(homeFolder,"test", "fil1.txt");
        Files.createDirectories(path.getParent());
        System.out.println(Files.exists(path));
        System.out.println(path.toAbsolutePath());

        Files.writeString(path,"This is a test with åäö ûü");
       // List<String> strings = List.of("First Line","Second Line", "Third Line");
       // Files.write(path,strings, StandardOpenOption.APPEND, StandardOpenOption.CREATE);

        System.out.println(Files.exists(path));
    }
}
