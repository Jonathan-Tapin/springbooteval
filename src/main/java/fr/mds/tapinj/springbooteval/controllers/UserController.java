package fr.mds.tapinj.springbooteval.controllers;

import fr.mds.tapinj.springbooteval.dto.UserDto;
import fr.mds.tapinj.springbooteval.entities.Role;
import fr.mds.tapinj.springbooteval.entities.User;
import fr.mds.tapinj.springbooteval.services.RoleService;
import fr.mds.tapinj.springbooteval.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(UserController.BASE_ROUTE)
public class UserController extends BaseCrudController<User, UserDto> {

    public static final String TEMPLATE_NAME = "user";
    public static final String BASE_ROUTE = "user";

    public UserController() {
        super(TEMPLATE_NAME);
    }

    @Autowired
    private UserService service;

    @Autowired
    private RoleService roleService;

    @Override
    protected void preCreateGet(final Model model) {
        model.addAttribute("roles", this.roleService.findAll());
    }

    @Override
    protected User preCreatePost(UserDto dto) throws Exception {
        User user = new User();
        user.setFirstname(dto.getFirstname());
        user.setLastname(dto.getLastname());

        if (dto.getRoleId() != null) {
            Role role = this.roleService.findRole(dto.getRoleId());
            if (role == null) {
                throw new Exception("None corresponding role");
            }
            user.setRole(role);
        }

        return user;
    }
}
