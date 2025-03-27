import javafx.application.Application;
import javafx.scene.Scene;
// import javafx.scene.control.CheckBoxTreeItem;
// import javafx.scene.control.TreeItem;
// import javafx.scene.control.TreeView;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class TaskManager extends Application {
    @Override
    public void start(Stage primaryStage) {
        TreeItem<String> rootItem = new TreeItem<>("Root");
        rootItem.setExpanded(true);

        try {
            List<String> lines = Files.readAllLines(Paths.get("tasks.txt"));
            
            for (String line : lines) {
                if (line.endsWith(":")) { // Заголовок
                    TreeItem<String> headerItem = new TreeItem<>(line);
                    rootItem.getChildren().add(headerItem);
                } else if (line.startsWith("\t- ") && !rootItem.getChildren().isEmpty()) { // Задача
                    TreeItem<String> lastHeader = rootItem.getChildren().get(rootItem.getChildren().size() - 1);
                    CheckBoxTreeItem<String> taskItem = new CheckBoxTreeItem<>(line.trim().substring(2));
                    lastHeader.getChildren().add(taskItem);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // TreeItem<String> task1 = new TreeItem<>("Task 1");
        // TreeItem<String> task2 = new TreeItem<>("Task 2");
        // rootItem.getChildren().addAll(task1, task2);

        /*
        for (int i = 1; i <= 5; i++) {
            CheckBoxTreeItem<String> subTask1 = new CheckBoxTreeItem<>("Subtask " + i);
            CheckBoxTreeItem<String> subTask2 = new CheckBoxTreeItem<>("Subtask " + (i + 5));
            task1.getChildren().add(subTask1);
            task2.getChildren().add(subTask2);
        }
        */

        TreeView<String> treeView = new TreeView<>(rootItem);
        treeView.setShowRoot(false);

        // Set cell factory to render checkboxes
        treeView.setCellFactory(tv -> new TreeCell<>() {
            private final CheckBox checkBox = new CheckBox();
            private final HBox hbox = new HBox(checkBox);

            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                    setGraphic(null);
                } else {
                    setText(item);
                    TreeItem<String> treeItem = getTreeItem();
                    if (treeItem instanceof CheckBoxTreeItem) {
                        checkBox.setText(null);
                        checkBox.setSelected(((CheckBoxTreeItem<String>) treeItem).isSelected());
                        checkBox.selectedProperty().bindBidirectional(
                                ((CheckBoxTreeItem<String>) treeItem).selectedProperty());
                        setGraphic(hbox);
                    } else {
                        setGraphic(null);
                    }
                }
            }
        });

        Scene scene = new Scene(treeView, 600, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TreeView with Checkboxes");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}