package org.blogsh.personalBlog.repository;

import java.util.List;
import org.blogsh.personalBlog.model.Themes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThemesRepository extends JpaRepository<Themes, Integer>{
	public List<Themes> findAllByDescriptionContainingIgnoreCase(String description);
}
