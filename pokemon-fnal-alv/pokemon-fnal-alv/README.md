
## Estructura

```
src/main/java/cl/alv/pokemon/
├── Main.java                  # JavaFX Application
├── Launcher.java              # Entry point alternativa
├── module-info.java
├── controller/MainController.java
├── dao/PokemonDAO.java
├── dao/PokemonDAOFileImpl.java
└── model/
    ├── Pokemon.java           # ¡Clase padre abstracta!
    ├── PokemonAgua.java       # (antes Perro)
    ├── PokemonFuego.java      # (antes Gato)
    └── Intercambiable.java    # (antes Adoptable)
src/main/resources/cl/alv/pokemon/
├── view.fxml
└── css/styles.css
```
