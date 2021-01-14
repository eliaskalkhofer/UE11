/**
 * @class: ListController
 * @author: Elias Kalkhofer
 * @date: 14.01.2021
 */

package viewcontrol;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.Cardatabase;
import model.Vehicle;

public class ListController {
    Cardatabase cardat = new Cardatabase();
    @FXML
    private TextField textfield;
    @FXML
    private ListView listView;

    public ListController() {
    }

    public void search() {
        Vehicle[] searchfor1 = this.cardat.search(this.textfield.getText(), false);
        ArrayList<Vehicle> searchveh1 = new ArrayList();

        for(int i = 0; i < searchfor1.length; ++i) {
            searchveh1.add(searchfor1[i]);
        }

        this.listView.setItems(FXCollections.observableList(searchveh1));
    }

    public void searchExact() {
        Vehicle[] searchfor2 = this.cardat.search(this.textfield.getText(), true);
        ArrayList<Vehicle> searchveh2 = new ArrayList();

        for(int i = 0; i < searchfor2.length; ++i) {
            searchveh2.add(searchfor2[i]);
        }

        this.listView.setItems(FXCollections.observableList(searchveh2));
    }

    public void searchbtn() {
        this.search();
    }

    public void searchExactbtmbtm() {
        this.searchExact();
    }
}
