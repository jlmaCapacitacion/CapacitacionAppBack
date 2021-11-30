package curso.issfa.capacitacion.repositories;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import curso.issfa.capacitacion.models.Post;
 
@SpringBootTest
@RunWith(SpringRunner.class)
public class PostRepositoryTest {
    @Autowired
    private PostRepository postRepository;
    @Test
    public void guardar(){
        Post post = new Post();
        post.setTitle("title");
        postRepository.save(post);      
        Assert.assertEquals(post.getTitle(), postRepository.save(post).getTitle());
    }
}