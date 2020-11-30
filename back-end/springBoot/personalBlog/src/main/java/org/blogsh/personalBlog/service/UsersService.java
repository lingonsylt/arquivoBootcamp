package org.blogsh.personalBlog.Service;

import java.nio.charset.Charset;
import java.util.Optional;
import org.apache.commons.codec.binary.Base64;
import org.blogsh.personalBlog.model.UserLogin;
import org.blogsh.personalBlog.model.Users;
import org.blogsh.personalBlog.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
	@Autowired
	private UsersRepository repository;

	public Users signUp(Users users) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String passwordEncoder = encoder.encode(users.getPassword());
		users.setPassword(passwordEncoder);

		return repository.save(users);
	}

	public Optional<UserLogin> signIn(Optional<UserLogin> user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<Users> users = repository.findByEmail(user.get().getEmail());
		
		if(user.isPresent()) {
			if(encoder.matches(user.get().getPassword(), users.get().getPassword())) {
				String auth = user.get().getEmail() + ":" + user.get().getPassword();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				
				user.get().setToken(authHeader);
				user.get().setName(users.get().getName());
				
				return user;
			}
		}
		return null;
	}
}
