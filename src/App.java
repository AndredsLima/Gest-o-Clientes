import Controllers.Agenda; // Importa a classe Agenda do pacote Controllers
import Views.Home.HomeControl; // Importa a classe HomeControl do pacote Views.Home
import javafx.application.Application; // Importa a classe Application do JavaFX
import javafx.stage.Stage; // Importa a classe Stage do JavaFX

// Classe principal da aplicação que estende Application do JavaFX
public class App extends Application {

    // Método principal que inicia a aplicação JavaFX
    public static void main(String[] args) {
        launch(args); // Método para iniciar a aplicação JavaFX
    }

    // Método start, chamado quando a aplicação é inicializada
    @Override
    public void start(Stage primaryStage) throws Exception {
        Agenda agenda = Agenda.getInstance(); // Obtém a instância da Agenda

        // Cria uma instância do HomeControl passando a instância da Agenda
        HomeControl homeControl = new HomeControl(agenda);
        homeControl.start(new Stage()); // Inicia o HomeControl em um novo Stage
    }
}
