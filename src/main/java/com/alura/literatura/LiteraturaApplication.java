package com.alura.literatura;

import static com.alura.literatura.utils.UserInput.getUserInt;
import static com.alura.literatura.utils.UserInterface.messageLoop;
import static com.alura.literatura.utils.UserInterface.showWelcomeMessage;

import com.alura.literatura.service.APIConsumer;
import com.alura.literatura.service.JsonDataConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {
	private final String URL_BASE = "http://gutendex.com/books";
	
	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(LiteraturaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		APIConsumer apiConsumer = new APIConsumer();
		JsonDataConverter dataConverter = new JsonDataConverter();
		boolean isExit = false;
		int option = 0;
		Scanner sc = new Scanner(System.in);

		showWelcomeMessage();

		while (!isExit){
			messageLoop();
			option = getUserInt(sc);

			switch (option) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					isExit = true;
					break;
				default:
					System.out.println("Opción no valida.");
					break;
			}
		}
	}
}
