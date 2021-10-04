package se.iths.java21.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CsvReader {
    public static void main(String[] args) {

        String homePath = System.getProperty("user.home");
        Path csvPath = Path.of(homePath, "test", "cakes.csv");

        List<Cake> cakes = List.of();

       try(Stream<String> lines = Files.lines(csvPath)){
        cakes = lines.skip(1)
                .map(CsvReader::createCake)
                .collect(Collectors.toList());
       } catch (IOException e) {
           e.printStackTrace();
       }

       cakes.forEach(System.out::println);
    }

    private static Cake createCake(String line){
        String[] arr = line.split(",");
        return new Cake(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]));
    }
}
