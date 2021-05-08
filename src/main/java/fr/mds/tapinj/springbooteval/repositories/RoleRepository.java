package fr.mds.tapinj.springbooteval.repositories;

import fr.mds.tapinj.springbooteval.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
