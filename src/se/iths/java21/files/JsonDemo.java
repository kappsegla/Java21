package se.iths.java21.files;

import java.util.List;

public class JsonDemo {
    public static void main(String[] args) {

        List<Cake> cakes = List.of(
                new Cake(1, "KanelBulle", 20),
                new Cake(2, "Kärleksmums", 15),
                new Cake(3, "Chokladboll", 45));

        JsonDemo demo = new JsonDemo();
        String json = demo.toJson(cakes);
        System.out.println(json);

        List<Cake> jsonCakesList = demo.fromJson(json);
        jsonCakesList.forEach(System.out::println);
    }

    private  String toJson(List<Cake> cakes) {
        return "";
    }


    private List<Cake> fromJson(String jsonData){
        return List.of();
    }

}
