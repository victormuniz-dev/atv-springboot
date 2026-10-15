package biblioteca.biblioteca.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import biblioteca.biblioteca.Model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
    List<Livro> findByISBNContainigIgnoreCase(String ibns);
    List<Livro> findByTituloContainigIgnoreCase(String titulo);
}
