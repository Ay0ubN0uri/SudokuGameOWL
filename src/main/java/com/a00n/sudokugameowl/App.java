package com.a00n.sudokugameowl;

//import com.a00n.sudokugameowl.components.MenuComponent;
//import com.a00n.sudokugameowl.components.ScoreComponent;
//import com.a00n.sudokugameowl.components.SudokuComponent;
import com.a00n.sudokugameowl.components.MenuComponent;
import com.a00n.sudokugameowl.components.ScoreComponent;
import com.a00n.sudokugameowl.components.SudokuComponent;
import com.a00n.sudokugameowl.components.TitleComponent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static final String GAME_NAME = "Sudoku With OWL";

    public static final String GAME_ICON = "sudoku.png";

    public static final double SPACING_BOARD_MENU = 20;

    public static final double WINDOW_WIDTH = 1280;

    public static final double WINDOW_HEIGTH = 850;

    public static final String FONT_FAMILY = "Fira Code";

    public static final String TEST_AREA = "-fx-background-color: red";

    public static void main(String[] args) {
        launch(args);
    }

    private VBox buildLeftSide() {
        VBox vboxBoard = new VBox();
        HBox.setHgrow(vboxBoard, Priority.ALWAYS);
        vboxBoard.getChildren().addAll(
                new TitleComponent(GAME_NAME),
                new SudokuComponent(),
                new TitleComponent("Made with ❤ By Nouri Ayoub")
        );
        return vboxBoard;
    }

    private VBox buildRightSide() {
        VBox vboxMenu = new VBox();
        vboxMenu.setPrefWidth(250);
        vboxMenu.getChildren().addAll(
                new MenuComponent(),
                new ScoreComponent()
        );
        return vboxMenu;
    }

    @Override
    public void start(Stage stage) throws Exception {
        HBox root = new HBox(SPACING_BOARD_MENU);
        root.getChildren().addAll(
                buildLeftSide(),
                buildRightSide()
        );
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGTH);
        Image image = new Image(GAME_ICON);
        stage.setScene(scene);
        stage.setTitle(GAME_NAME);
        stage.getIcons().add(image);
        stage.show();
    }
}
