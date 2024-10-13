package com.example.taskmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TaskManagerApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/task_manager_ui.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Task Manager");
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}