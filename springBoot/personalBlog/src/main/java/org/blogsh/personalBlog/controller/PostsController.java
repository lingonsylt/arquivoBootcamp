package org.blogsh.personalBlog.controller;

import java.util.List;
import org.blogsh.personalBlog.model.Posts;
import org.blogsh.personalBlog.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostsController{

    @Autowired
    private PostsRepository repository;

    @GetMapping
    public ResponseEntity<List<Posts>> findAllPostagem(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Posts> findByPostId(@PathVariable int id){
        return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).
               orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/titles/{postTitle}")
    public ResponseEntity<List<Posts>> getAllByPostTitle(@PathVariable String
                                                                    postTitle){
        return ResponseEntity.ok(repository.findAllByPostTitleIgnoringCase(
                                                                   postTitle));
    }

    @GetMapping("/posts/{post}")
    public ResponseEntity<List<Posts>> getByPost(@PathVariable String post){
        return ResponseEntity.ok(repository.findAllByPostIgnoringCase(post));
    }
}
