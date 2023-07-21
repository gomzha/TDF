package com.gomzha.TDFLink;

import com.gomzha.TDFLink.segurity.AutenticacionSegurity;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class TdfLinkApplication {

	public static void main(String[] args) throws IOException, JSONException {
		SpringApplication.run(TdfLinkApplication.class, args);


		AutenticacionSegurity autenticacionSegurity = new AutenticacionSegurity();
		System.out.println(autenticacionSegurity.autenticacion());


	}
}
