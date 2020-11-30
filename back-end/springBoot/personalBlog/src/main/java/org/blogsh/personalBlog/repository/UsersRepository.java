package org.blogsh.personalBlog.repository;

import java.util.Optional;
import org.blogsh.personalBlog.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer>{
	public Optional<Users> findByEmail(String user);
}
