package org.blogsh.personalBlog.controller;

import java.util.List;
import org.blogsh.personalBlog.model.Posts;
import org.blogsh.personalBlog.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostsController {
	@Autowired
	private PostsRepository repository;

	@GetMapping
	public ResponseEntity<List<Posts>> findAllPosts() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Posts> findPostById(@PathVariable int id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/titles/{postTitle}")
	public ResponseEntity<List<Posts>> findAllPostByTitle(@PathVariable String postTitle) {
		return ResponseEntity.ok(repository.findAllByPostTitleContainingIgnoreCase(postTitle));
	}

	@GetMapping("/posts/{post}")
	public ResponseEntity<List<Posts>> findByPost(@PathVariable String post) {
		return ResponseEntity.ok(repository.findAllByPostContainingIgnoreCase(post));
	}

	@PostMapping
	public ResponseEntity<Posts> postPost(@RequestBody Posts post) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(post));
	}

	@PutMapping
	public ResponseEntity<Posts> putPost(@RequestBody Posts post) {
		return ResponseEntity.ok(repository.save(post));
	}

	@DeleteMapping("/{id}")
	public void deletePost(@PathVariable int id) {
		repository.deleteById(id);
	}
}
