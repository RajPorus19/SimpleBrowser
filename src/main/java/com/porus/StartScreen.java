package com.porus;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class StartScreen {
	static private Scene scene;
	static private WebView webView;
	static Stage window;
	public static Button goBackButton;
	public static void display() {
		window = new Stage();
		window.setTitle("SimpleBrowser");

		StackPane layout = new StackPane();

		goBackButton = new Button();
		goBackButton.setText("back");
		goBackButton.setOnAction(e -> goBack());

		Button duckButton = new Button();
		duckButton.setText("duckduckgo.com");
		duckButton.setOnAction(e -> {
			goToWebPage("https://duckduckgo.com");
			layout.getChildren().remove(duckButton);
			layout.getChildren().addAll(webView, goBackButton);
		});

		layout.getChildren().add(duckButton);

		scene = new Scene(layout, 500, 500);
		window.setScene(scene);
		window.show();
	}
	public static void goToWebPage(String link) {
		Scene scene = WebPage.load(link);
		window.setScene(scene);
		window.sizeToScene();
		window.show();

	}
	public static void goBack() {
		window.setScene(scene);
		window.sizeToScene();
		window.show();
	}

}
