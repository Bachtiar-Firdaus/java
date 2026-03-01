package belajar.java.database;

import belajar.java.database.entity.Comment;
import belajar.java.database.repository.CommentRepository;
import belajar.java.database.repository.CommentRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RepositoryTest {

    private CommentRepository commentRepository;

    @BeforeEach
    void setUp(){
        commentRepository = new CommentRepositoryImpl();
    }

    @Test
    void testInsert(){
        Comment comment = new Comment("daus@emailtest.com", "test");
        commentRepository.insert(comment);

        Assertions.assertNotNull(comment.getId());
        System.out.println(comment.getId());
    }

    @Test
    void testFindById(){
        Comment comment = commentRepository.findById(2305);
        Assertions.assertNotNull(comment);
        System.out.println(comment.getId());
        System.out.println(comment.getEmail());
        System.out.println(comment.getComment());

//        Comment notFound = commentRepository.findById(100000);
//        Assertions.assertNotNull(notFound);
    }

    @Test
    void testFindAll(){
        List<Comment> comments = commentRepository.findAll();
        System.out.println(comments.size());
    }
    @Test
    void testFindByEmail(){
        List<Comment> comments = commentRepository.findAllByEmail("daus@emailtest.com");
        System.out.println(comments.size());
    }
}
