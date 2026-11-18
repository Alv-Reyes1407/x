package cl.alv.pokemon.dao;

import cl.alv.pokemon.model.Pokemon;
import java.util.List;

public interface PokemonDAO {
    List<Pokemon> obtenerTodos();
    boolean guardar(Pokemon pokemon);
    boolean eliminar(Pokemon pokemon);
}
