package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Title");
        Group root = new Group();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        Canvas canvas = new Canvas(800,600); //drawable canvas for window
        root.getChildren().add(canvas); //add the drawable canvas to the window
        GraphicsContext gc = canvas.getGraphicsContext2D(); //grab a GraphicsContext to be able to draw on the canvas

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                //clear the screen
                gc.setFill(Color.WHITE);
                gc.fillRect(0,0,800,600);
            }
        }.start();

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
