package curso.issfa.capacitacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.issfa.capacitacion.models.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
    
}
