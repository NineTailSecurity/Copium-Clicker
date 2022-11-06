//set up timer and if mouse click it doesn't count down / subtract but if not movement it subtracts and keeps subtracting
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    Button button;
    int count = 0;
    private Label countLabel = new Label();
    private Label countLabel2 = new Label();


    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // stage
        primaryStage.setTitle("WELCOME TO COPIUM 1.0!");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 600, Color.GREY);

        // label
        // could use CSS file instead
        countLabel.setText(String.valueOf(count));
        countLabel2.setText(String.valueOf(count));
        //Bell Gothic Std
        countLabel.setFont(Font.font("Bell Gothic Std", FontWeight.BOLD, FontPosture.REGULAR, 85));
        countLabel.setTextFill(Color.WHITESMOKE);
        countLabel2.setFont(Font.font("Bell Gothic Std", FontWeight.BOLD, FontPosture.REGULAR, 90));
        countLabel2.setTextFill(Color.BLACK);


        //Creating a graphic (image)
        Image img = new Image("C:/Users/Logan/IdeaProjects/Pantry-Pet/Images/copium.png");
        ImageView view = new ImageView(img);
        view.setFitHeight(150);
        view.setPreserveRatio(true);

        //button create and config
        button = new Button();
        button.setPrefSize(150, 150);
        button.setTranslateX(0);
        button.setTranslateY(200);
        button.setGraphic(view);
        //button.setText("CLICK ME DUMMY! 2.0");
        button.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                count++;
                countLabel.setText(String.valueOf(count));
                countLabel2.setText(String.valueOf(count));
            }

        });


        VBox vb = new VBox(-124);
        vb.setAlignment(Pos.CENTER);
        vb.setPrefWidth(scene.getWidth());
        // vb.setLayoutY(30);
        vb.getChildren().addAll(countLabel2, countLabel);
        vb.getChildren().add(button);
        root.getChildren().add(vb);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}