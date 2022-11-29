package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Contador extends Application {//Aula 373

	private int contador = 0;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");
		
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		
		Button botaoDecremento = new Button("-");
		Button botaoIncremento = new Button("+");
		
		botaoDecremento.setOnAction(e -> {
		contador--;
		labelNumero.setText(Integer.toString(contador));/*Passei um valor
		inteiro porque ele vai converter para String*/
		
		botaoIncremento.setOnAction(a -> {
		contador++;
		labelNumero.setText(Integer.toString(contador));
		});
		
		
		});
		
		
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);//distancia entre os botoes
		boxBotoes.getChildren().add(botaoDecremento);		
		boxBotoes.getChildren().add(botaoIncremento);		
		
		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(10);//distancia entre o titulo, num e botão
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);
		
		//Importanto css
			String caminhoCss = getClass() 
					// p/ forma externa q seria o caminho completo
					.getResource("/basico/Contador.css").toExternalForm();
		
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		cenaPrincipal.getStylesheets().add(caminhoCss);/*Stylesheets é
		exatamente os arquivos css e depois eu passo o caminho do css
		para adicionar. Fazendo essa L63 eu já tenho um aquivo css*/
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css?family=Oswald");
		 
		/*Lembre do coceito teatro: um palco pode receber diferentes
		 * cenas*/
		
		primaryStage.setScene(cenaPrincipal);/*passando a cenaPrincipal
		p/ o palco*/
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
}
