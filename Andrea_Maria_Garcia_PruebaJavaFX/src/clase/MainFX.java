package clase;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class MainFX extends Application {
	

	private AnchorPane rootLayout;
	public Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {		// empieza el programa
		try {
			
			this.primaryStage = primaryStage;	// ponerlo
			this.primaryStage.setTitle("Profile");	// Titulo
			this.primaryStage.setX(100);	// posicion de la ventana
			this.primaryStage.setY(100);

			primaryStage.show();		// Para mostrar
			
			initRootLayout();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void initRootLayout() {	// abre la pantalla 
		try {
			
			
			
			
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();	
			loader.setLocation(MainFX.class.getResource("../vista/Profile.fxml"));
			rootLayout = (AnchorPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);	// Medidas no necesarias

			primaryStage.setScene(scene);	// Colocar escena dentro del escenario
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {	// el main ejecuta launch con los argumentos
		launch(args);
	}
}