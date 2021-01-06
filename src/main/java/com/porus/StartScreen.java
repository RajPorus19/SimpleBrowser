package com.porus;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class StartScreen {
	static private Scene scene;
	static private WebView webView;
	public static void display() {
		Stage window = new Stage();
		window.setTitle("SimpleBrowser");

		StackPane layout = new StackPane();

		Button goBackButton = new Button();
		goBackButton.setText("back");
		goBackButton.setOnAction(e -> layout.getChildren().remove(webView));

		Button duckButton = new Button();
		duckButton.setText("duckduckgo.com");
		duckButton.setOnAction(e -> {
			layout.getChildren().remove(duckButton);
			webView = WebPage.load("https://duckduckgo.com");
			layout.getChildren().addAll(webView, goBackButton);
		});

		layout.getChildren().add(duckButton);

		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.show();
	}


}
