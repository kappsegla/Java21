package se.iths.java21.lab2;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LabDemo {

    List<Mobile> collection = new ArrayList<>();

    public static void main(String[] args) throws URISyntaxException {
        LabDemo demo = new LabDemo();
        demo.run();
    }

    private void run() throws URISyntaxException {
     //Path path = Path.of("resources","test.txt");
        Path path = Path.of(ClassLoader.getSystemResource("test.txt").toURI());

        try {
            System.out.println(Files.readString(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Mobile mobile = new Mobile("Sony",2021);
        Console.printMobile(mobile);
        var result = collection.stream().filter(m-> m.getYear() == 2021).findFirst();
        collection.forEach(System.out::println);
    }


}
