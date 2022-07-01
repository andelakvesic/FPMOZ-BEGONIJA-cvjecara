package ba.sum.fpmoz.informatika.fpmozbegonijacvjecara;

import ba.sum.fpmoz.informatika.fpmozbegonijacvjecara.model.Table;
import ba.sum.fpmoz.informatika.fpmozbegonijacvjecara.model.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class Program extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            Table.create(User.class);
        } catch (SQLException e) {
            System.out.println("Nastala je greška:" + e.getMessage());
        }

        FXMLLoader fxmlLoader = new FXMLLoader(Program.class.getResource("intro-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Dobrodošli na sustav!");
        stage.setScene(scene);
        stage.show();
    }

    public static void swapScene (Stage stage, String viewName, String title) throws IOException {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Program.class.getResource(viewName));
            Scene scene = new Scene(fxmlLoader.load(), 350, 270);
            stage.setTitle(title);
            stage.setScene(scene);
        } catch (IOException e) {
             // e.printStackTrace();
            System.out.println("Nastala je pogreška: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        launch();
    }
}