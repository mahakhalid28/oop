import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.Node;
import javafx.stage.Stage;

public class MemberTableController {
    private ArrayList<Member> members;
    private Button backButton = new Button();
    private MemberTable memberTable;
    private HBox root = new HBox();

    public MemberTableController(ArrayList<Member> members) {
        this.members = members;
        memberTable = new MemberTable(members);
        Label title = new Label("Member list");
        title.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
        root.getChildren().add(title);
        root.getChildren().add(backButton);

        backButton.setOnAction((event) -> {
            handleBackButton(event);
        });
        root.getChildren().add(memberTable);
        root.setSpacing(10);

    }

    public void handleBackButton(ActionEvent event) {
        ManagerController managerController = new ManagerController(members);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(managerController.getScene());
        stage.show();

    }

    public Scene getScene() {
        return new Scene(root);
    }

}
