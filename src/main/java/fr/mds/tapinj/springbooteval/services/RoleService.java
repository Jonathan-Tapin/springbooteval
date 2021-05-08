package fr.mds.tapinj.springbooteval.services;

import fr.mds.tapinj.springbooteval.entities.Role;
import fr.mds.tapinj.springbooteval.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> findAll() {
        return  this.roleRepository.findAll();
    }

    public void createRole(Role role) {
        this.roleRepository.save(role);
    }

    public Role findRole(final Long roleId) {
        return this.roleRepository.findById(roleId).orElse(null);
    }
}
