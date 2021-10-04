package se.iths.java21.files;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

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
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        try {
            json = mapper.writeValueAsString(cakes);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }


    private List<Cake> fromJson(String jsonData){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(jsonData,new TypeReference<List<Cake>>(){});
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return List.of();
    }

}
