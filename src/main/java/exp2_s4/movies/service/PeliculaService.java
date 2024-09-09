package exp2_s4.movies.service;

import java.util.List;
import java.util.Optional;

import exp2_s4.movies.model.Pelicula;

public interface PeliculaService {

    List<Pelicula> getAllPeliculas();

    Optional<Pelicula> getPeliculaById(Long id);

    Pelicula createPelicula(Pelicula pelicula);

    Pelicula updatePelicula(Long id, Pelicula pelicula);

    void deletePelicula(Long id);

}
