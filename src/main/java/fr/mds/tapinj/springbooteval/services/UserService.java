package fr.mds.tapinj.springbooteval.services;

import fr.mds.tapinj.springbooteval.entities.User;
import fr.mds.tapinj.springbooteval.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return this.userRepository.findAll();
	}

//	public void save(User user) {
//		this.repository.save(user);
//	}

	public void generateUsers(final Integer nb) {
		for (int i = 0; i < nb; i++) {
			User user = new User();
			user.setFirstname("fname"+i);
			user.setLastname("Lname"+i);

			this.userRepository.save(user);
		}
	}
}
