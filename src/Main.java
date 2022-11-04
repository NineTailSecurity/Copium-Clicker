import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    Button button;
    int count = 0;
    private Label countLabel = new Label();


    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // stage
        primaryStage.setTitle("WELCOME TO COPIUM 1.0!");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250);

        // label
        countLabel.setText(String.valueOf(count));
        countLabel.setTextFill(Color.BLUE);
        countLabel.setStyle("-fx-font-size: 4em;");

        //button create and config
        button = new Button();
        button.setText("CLICK ME DUMMY! 2.0");
        button.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                count++;
                countLabel.setText(String.valueOf(count));;
            }

        });


        VBox vb = new VBox(20);
        vb.setAlignment(Pos.CENTER);
        vb.setPrefWidth(scene.getWidth());
        vb.setLayoutY(30);
        vb.getChildren().addAll(button, countLabel);
        root.getChildren().add(vb);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}