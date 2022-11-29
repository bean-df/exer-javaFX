package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application { 
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button botaoA = new Button("A");		
		Button botaoB = new Button("B");		
		Button botaoC = new Button("C");/*O C vai fechar o sistema*/		
		
		VBox box = new VBox();/*Como é um vertical box ele vai organizar os
	elementos na vertical*/
		
		botaoA.setOnAction(e -> System.out.println("A"));/*Quando acon_
		tecer  uma Action chame uma lambda que recebe um evento"e ->"*/
		botaoB.setOnAction(e -> System.out.println("B"));
		botaoC.setOnAction(e -> System.exit(0));/*O C vai fechar o 
		sistema*/
		
		box.setAlignment(Pos.CENTER);//Alinhamento no centro da tela
		box.setSpacing(10);//espaçãmento entre os botão
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		
		
		Scene unicacena = new Scene(box, 100, 150); /*o box é um componente de layout ele
		vai organizar os elementos na vertical assim como um Hbox vai orga_
		nizar os elementos na horizontal. 100L e 150A*/
	
		primaryStage.setScene(unicacena);
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
		
		
	}
}
