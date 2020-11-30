package org.blogsh.personalBlog.repository;

import java.util.List;
import org.blogsh.personalBlog.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends JpaRepository<Posts, Integer>{
	public List<Posts> findAllByPostTitleContainingIgnoreCase(String postTitle);
	public List<Posts> findAllByPostContainingIgnoreCase(String post);
}
