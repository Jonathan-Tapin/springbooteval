package fr.mds.tapinj.springbooteval.controllers;


import fr.mds.tapinj.springbooteval.dto.RoleDto;
import fr.mds.tapinj.springbooteval.entities.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(RoleController.BASE_ROUTE)
public class RoleController extends BaseCrudController<Role, Role> {
    public static final String TEMPLATE_NAME = "role";
    public static final String BASE_ROUTE = "role";

    public RoleController() {
        super(TEMPLATE_NAME);
    }

    protected  Role preCreatePost(RoleDto roleDto) {
        Role role = new Role();
        role.setName(roleDto.getName());
        return role;
    }
}
