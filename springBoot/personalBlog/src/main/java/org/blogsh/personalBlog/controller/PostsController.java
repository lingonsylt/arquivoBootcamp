package org.blogsh.personalBlog.controller;

import java.util.List;

import org.blogsh.personalBlog.model.Posts;
import org.springframework.http.ResponseEntity;
import org.blogsh.personalBlog.repository.PostsRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<Posts> findByIdPostagem(@PathVariable int id){
        return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).
               orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<List<Posts>> getAllByTitulo(@PathVariable
                                                      String title){
        return ResponseEntity.ok(repository.
               findAllByContainingTitleIgnoringCase(title));
    }

    @GetMapping("/posts/{post}")
    public ResponseEntity<List<Posts>> getByTexto(@PathVariable String post){
        return ResponseEntity.ok(repository.
               findAllByContainingPostIgnoringCase(post));
    }

}
