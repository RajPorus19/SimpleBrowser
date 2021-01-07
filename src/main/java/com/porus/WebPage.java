package com.porus;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebPage {

	public static Scene load(String url) {
		Stage window = new Stage();
		window.setTitle(url);

		WebView webView = new WebView();
		webView.getEngine().setJavaScriptEnabled(true);
		webView.getEngine().load(url);

		StackPane layout = new StackPane();

		layout.getChildren().add(webView);

		Scene scene = new Scene(layout, 1000, 1000);
		// window.setScene(scene);
		// window.show();
		return scene;
	}
}
