package org.blogsh.personalBlog.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.blogsh.personalBlog.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PostsRepository extends JpaRepository<Posts, Integer>{
	public List<Posts> findAllByPostTitleIgnoringCase(String postTitle);
	public List<Posts> findAllByPostIgnoringCase(String post);
}