package org.blogsh.personalBlog.security;

import java.util.Optional;

import org.blogsh.personalBlog.model.Users;
import org.blogsh.personalBlog.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService{
	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public UserDetails loadUserByUsername (String userName) throws UsernameNotFoundException {
		Optional<Users> users = usersRepository.findByEmail(userName);
		users.orElseThrow(() -> new UsernameNotFoundException(userName + " not found"));
		return users.map(UserDetailsImplementation::new).get();
	}
}
