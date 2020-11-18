package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {
    Button button;
    Button button2;
    Button button3;
    VBox vBox;

    int i = 3;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        button = new Button("Click Me");
        button2 = new Button("2ND Button");
        button3 = new Button("create button");
        button.setOnAction(this);
        button2.setOnAction(this);
        button3.setOnAction(this);
        vBox = new VBox();
        vBox.getChildren().add(button);
        vBox.getChildren().add(button2);
        vBox.getChildren().add(button3);
//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);
//        layout.getChildren().add(button2);
        primaryStage.setScene(new Scene(vBox, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource()==button){
            System.out.println("touch me again please");
        }
        if(actionEvent.getSource()==button2){
            System.out.println("touch me baby one more time");
        }
        if(actionEvent.getSource()==button3){
            Button i= new Button("new");
            vBox.getChildren().add(i);

        }


    }
}
