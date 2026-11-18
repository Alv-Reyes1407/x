module cl.alv.pokemon {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens cl.alv.pokemon.controller to javafx.fxml;
    opens cl.alv.pokemon.model to com.google.gson, javafx.base;
    exports cl.alv.pokemon;
}
