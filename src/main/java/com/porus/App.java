package com.porus;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage window) {
		StartScreen.display();
	}
	private void stuff() {
		System.out.println("hi");
	}
}
