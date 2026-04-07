package Json_Hashmap;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URL;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://pokeapi.co/api/v2/pokemon/pikachu");

        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> pokemon = mapper.readValue(url, Map.class);

        System.out.println("Nombre: " + pokemon.get("name"));
        System.out.println("Peso: " + pokemon.get("weight"));
    }
}