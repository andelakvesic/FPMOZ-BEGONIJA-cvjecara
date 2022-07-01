module ba.sum.fpmoz.informatika.fpmozbegonijacvjecara {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens ba.sum.fpmoz.informatika.fpmozbegonijacvjecara to javafx.fxml;
    exports ba.sum.fpmoz.informatika.fpmozbegonijacvjecara;
    exports ba.sum.fpmoz.informatika.fpmozbegonijacvjecara.controller;
    opens ba.sum.fpmoz.informatika.fpmozbegonijacvjecara.controller to javafx.fxml;
}