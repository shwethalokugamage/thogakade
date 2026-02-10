package controller.orderManagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class OrderManagementFormController {

    @FXML
    private Button btnRefresh;

    @FXML
    private Button btnViewDetails;

    @FXML
    private TableColumn<?, ?> colOrderCustomer;

    @FXML
    private TableColumn<?, ?> colOrderDate;

    @FXML
    private TableColumn<?, ?> colOrderId;

    @FXML
    private TableColumn<?, ?> colOrderTotal;

    @FXML
    private TableView<?> tblOrders;

    @FXML
    private TextField txtSearchOrder;

    @FXML
    void btnRefreshOnAction(ActionEvent event) {

    }

    @FXML
    void btnViewDetailsOnAction(ActionEvent event) {

    }

}
