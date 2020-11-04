package org.blogsh.personalBlog.repository;

import java.util.List;
import org.blogsh.personalBlog.model.Posts;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PostsRepository extends JpaRepository<Posts, Integer>{
	public List<Posts> findAllByContainingTitleIgnoringCase(String title);
	public List<Posts> findAllByContainingPostIgnoringCase(String post);
}
