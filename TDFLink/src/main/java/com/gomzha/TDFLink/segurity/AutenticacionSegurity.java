package com.gomzha.TDFLink.segurity;

import okhttp3.*;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Objects;

public class AutenticacionSegurity {


    private String idCliente = "b8d9fbb0-f2ec-4e7d-9ba9-2cf8964784f6";

    public String autenticacion() throws IOException, JSONException {
        OkHttpClient client = new OkHttpClient();

        String jsonData = "{\"key\": \"value\"}"; // Ejemplo de datos JSON
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), jsonData);

        Request request = new Request.Builder()
                .url("https://h.api.redlink.com.ar/redlink/homologacion/t3-comercio/v1/autorizar")
                .post(requestBody)
                .addHeader("x-ibm-client-id", idCliente)
                .addHeader("accept", "application/json")
                .build();

        Response response = client.newCall(request).execute();
//        System.out.println("display 1: " + response.toString());
//        System.out.println("display 3: " + response.body().string());
//        System.out.println("display 4: " + response.message());
//        System.out.println("display 5: " + response.cacheControl());
//        System.out.println("display 6: " + response.networkResponse());
//        System.out.println("display 7: " + response.request());
//        System.out.println("display 7: " + response.message());
//        System.out.println("display 8: " + response.body().toString());

        JSONObject jsonObject = new JSONObject(Objects.requireNonNull(response.body()).string());
        // Convertimos el objeto JSON a una cadena
        String access_token = jsonObject.getString("access_token");
        String expiration = jsonObject.getString("expiracion");

        // Imprimimos la cadena string del access_token
        System.out.println("access_token: " + access_token);

        return access_token;
    }
}
