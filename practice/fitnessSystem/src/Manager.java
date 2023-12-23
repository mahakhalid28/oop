import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.geometry.*;

public class Manager {
    private Button addNewMember = new Button("Add New Member");
    private Button ViewMembers = new Button("View Members");
    private HBox root = new HBox();

    public Manager() {
        root.setSpacing(30);
        root.setPadding(new Insets(100, 100, 100, 100));
        Label title = new Label("Fitness Management System");
        root.getChildren().add(title);
        addNewMember.setOnAction((event) -> {
            handleAddNewMember(event);
        });

    }

    public void handleAddNewMember(ActionEvent event) {
        System.out.println("Add new member button clicked");
    }

    public void handleViewMembers(ActionEvent event) {
        System.out.println("Add view members button clicked");
    }

}
