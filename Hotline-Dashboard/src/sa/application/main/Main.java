package sa.application.main;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {

		Insets Standard = new Insets(10);

		Label lbl_user = new Label("User: ");
		Label lbl_password = new Label("Password: ");

		TextField txt_user = new TextField();
		PasswordField txt_pw = new PasswordField();

		Button btn_login = new Button("Login");
		btn_login.setMinSize(50, 25);
		Button btn_create = new Button("Create");
		btn_create.setMinSize(50, 25);
		Button btn_exit = new Button("Exit");
		btn_exit.setMinSize(50, 25);
		btn_exit.setOnAction(e -> {
			System.exit(1);
		});

		GridPane GP = new GridPane();
		GP.setMinSize(250, 110);
		GP.setVgap(5);
		GP.setHgap(5);

		GP.add(lbl_user, 0, 1);
		GP.add(txt_user, 1, 1);

		GP.add(lbl_password, 0, 2);
		GP.add(txt_pw, 1, 2);

		GP.setAlignment(Pos.CENTER);

		VBox vb = new VBox();
		HBox hb = new HBox();

		hb.getChildren().addAll(btn_create, btn_login, btn_exit);
		hb.setAlignment(Pos.CENTER);
		hb.setSpacing(25);
		hb.setPadding(Standard);

		vb.getChildren().addAll(GP, hb);

		Scene login_Scene = new Scene(vb);

		primaryStage.setScene(login_Scene);
		primaryStage.setTitle("Login");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
