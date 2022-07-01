package ba.sum.fpmoz.informatika.fpmozbegonijacvjecara.controller;

import ba.sum.fpmoz.informatika.fpmozbegonijacvjecara.model.User;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UserController {
    @FXML
    TextField nameTxt;

    @FXML
    TextField surnameTxt;

    @FXML
    TextField uidTxt;

    @FXML
    TextField roleTxt;

    @FXML
    protected void saveUser () throws Exception {
        User newUser = new User ();
        newUser.setName(this.nameTxt.getText());
        newUser.setLastname(this.surnameTxt.getText());
        newUser.setUid(this.uidTxt.getText());
        newUser.setRole(this.uidTxt.getText());
        newUser.save();
    }
}
