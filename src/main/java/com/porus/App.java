package com.porus;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class App extends Application implements EventHandler<ActionEvent> {
	Button button, button2;
	WebView webView;
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage window) {
		window.setTitle("JavaFX WebView Example");
		StackPane layout = new StackPane();
		button = new Button();
		button2 = new Button();
		button.setText("duck");
		button.setOnAction(this);
		button2.setText("js");
		button2.setOnAction(this);
		webView = new WebView();
		webView.getEngine().setJavaScriptEnabled(false);
		webView.getEngine().load("https://4channel.org/g/");
		ScrollPane scrollPane = new ScrollPane();

		VBox vBox = new VBox(webView);
		scrollPane.setContent(vBox);
		layout.getChildren().add(webView);
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 3000, 3000);
		// Sets the scene
		window.setScene(scene);
		window.show();
	}

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == button) {
			webView.getEngine().load("https://duckduckgo.com");
			AlertBox.display("Horny ducks only", "Welcome to duckduckgo");
		}
		if (event.getSource() == button2) {
			webView.getEngine().setJavaScriptEnabled(true);
			System.out.println(webView.getEngine().getLocation());
			webView.getEngine().load(webView.getEngine().getLocation());

		}
	}
}
