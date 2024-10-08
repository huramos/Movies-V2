package exp2_s4.movies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exp2_s4.movies.model.Pelicula;
import exp2_s4.movies.repository.PeliculaRepository;

@Service
public class PeliculaServiceImpl implements PeliculaService {
    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getAllPeliculas() {
        return peliculaRepository.findAll();
    }

    @Override
    public Optional<Pelicula> getPeliculaById(Long id) {
        return peliculaRepository.findById(id);
    }

    @Override
    public Pelicula createPelicula(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    @Override
    public Pelicula updatePelicula(Long id, Pelicula pelicula) {
        if (peliculaRepository.existsById(id)) {
            pelicula.setId(id);
            return peliculaRepository.save(pelicula);
        } else {
            return null;
        }
    }

    @Override
    public void deletePelicula(Long id) {
        peliculaRepository.deleteById(id);
    }
}
