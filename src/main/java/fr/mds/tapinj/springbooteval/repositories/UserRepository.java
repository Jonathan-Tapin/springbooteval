package fr.mds.tapinj.springbooteval.repositories;

import fr.mds.tapinj.springbooteval.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
