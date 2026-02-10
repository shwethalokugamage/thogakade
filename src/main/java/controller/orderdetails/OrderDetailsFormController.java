package controller.orderdetails;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class OrderDetailsFormController {

    @FXML
    private TableColumn<?, ?> colDetailDescription;

    @FXML
    private TableColumn<?, ?> colDetailItemCode;

    @FXML
    private TableColumn<?, ?> colDetailLineTotal;

    @FXML
    private TableColumn<?, ?> colDetailQty;

    @FXML
    private TableColumn<?, ?> colDetailUnitPrice;

    @FXML
    private TableView<?> tblOrderDetails;

    @FXML
    private TextField txtOrderId;

}
