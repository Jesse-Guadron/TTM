package com.example.taskmanagerapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class TaskManagerController {

    @FXML
    private TextField taskInputField;

    @FXML
    private ListView<String> taskListView;

    @FXML
    private Button addTaskButton;

    @FXML
    private Button removeTaskButton;

    @FXML
    public void initialize() {
        addTaskButton.setOnAction(e -> addTask());
        removeTaskButton.setOnAction(e -> removeTask());
    }

    private void addTask() {
        String task = taskInputField.getText();
        if (task != null && !task.trim().isEmpty()) {
            taskListView.getItems().add(task);
            taskInputField.clear();
        }
    }

    private void removeTask() {
        String selectedTask = taskListView.getSelectionModel().getSelectedItem();
        if (selectedTask != null) {
            taskListView.getItems().remove(selectedTask);
        }
    }
}