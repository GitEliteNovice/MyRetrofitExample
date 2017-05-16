package com.lannet.taxifi.myretrofitexample.Retrofit;


import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.lannet.taxifi.myretrofitexample.model.Location;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarException;

public class TypeAdapter implements JsonDeserializer<List<Location>> {
    String elevation="a";
    String  id="a";
    String  latitude="a";
    String  longitude="a";
    String  name="a";
    String  region="a";
    String  unitaryAuthArea="a";
    @Override
    public List<Location> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray array = json.getAsJsonObject().getAsJsonObject("Locations").getAsJsonArray("Location");

        List<Location> list = new ArrayList<>();

        for (JsonElement element : array) {
            extractMovie(list, element);
        }

        return list;
    }

    private void extractMovie(List<Location> list, JsonElement element) {
        JsonObject j = element.getAsJsonObject();

        try
{


//    elevation = j.get("elevation").getAsString();
          id = j.get("id").getAsString();
          latitude = j.get("latitude").getAsString();
          longitude  = j.get("longitude").getAsString();
        name = j.get("name").getAsString();
       //  region = j.get("region").getAsString();
//         unitaryAuthArea = j.get("unitaryAuthArea").getAsString();
}catch (JsonIOException e){
    e.printStackTrace();
}
   /*     JsonElement poster = j.get("poster_path");
        if (poster instanceof JsonNull) {
            return;
        }

        String posterUrl = "http://image.tmdb.org/t/p/w300/" + poster.getAsString();
        JsonElement backdrop = j.get("backdrop_path");
        if (backdrop instanceof JsonNull) {
            return;
        }
        String  backdropUrl = "http://image.tmdb.org/t/p/w500/" + backdrop.getAsString();
        float vote = j.get("vote_average").getAsFloat();
        String  id = j.get("id").getAsString();
        String  description = j.get("overview").getAsString();

*/

        list.add(new Location(elevation, id, latitude, longitude, name, region, unitaryAuthArea));
    }
}


