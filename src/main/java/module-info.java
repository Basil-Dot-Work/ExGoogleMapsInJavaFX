module work.basil.example.exgooglemapsinjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens work.basil.example.exgooglemapsinjavafx to javafx.fxml;
    exports work.basil.example.exgooglemapsinjavafx;
}