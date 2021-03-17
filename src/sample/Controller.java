package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Controller {
    public Label helloWorld;
    public GridPane grid;

    public void btnHelloWorld(ActionEvent actionEvent) {
        helloWorld.setText("Hello World!");
        grid.setStyle("-fx-background-color: #FFCCCB");

    }
}
