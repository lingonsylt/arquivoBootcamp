package org.blogsh.personalBlog.controller;

import java.util.List;
import org.blogsh.personalBlog.model.Themes;
import org.blogsh.personalBlog.repository.ThemesRepository;
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
@RequestMapping("/themes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ThemesController{
	@Autowired
	private ThemesRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Themes>> findAllThemes(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Themes> findThemesById(@PathVariable int id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/description/{descripion}")
	public ResponseEntity<List<Themes>> findByDescprition(@PathVariable
                                                          String description){
		return ResponseEntity.ok(repository.findAllByDescriptionContainingIgnoreCase(
                                                                 description));
	}
	
	@PostMapping
	public ResponseEntity<Themes> postTheme(@RequestBody Themes theme){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(
                                                                       theme));
	}
	
	@PutMapping
	public ResponseEntity<Themes> putTheme(@RequestBody Themes theme){
		return ResponseEntity.ok(repository.save(theme));
	}
	
	@DeleteMapping("/{id}")
	public void deleteTheme(@PathVariable int id){
		repository.deleteById(id);
	}

}
