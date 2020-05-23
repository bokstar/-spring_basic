package com.example.websocket2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@SpringBootApplication
public class Websocket2Application {


	public static void main(String[] args) {
		SpringApplication.run(Websocket2Application.class, args);
	}

}
