package org.ms.usermanagementportal.resource;

import org.ms.usermanagementportal.exception.domain.EmailExistException;
import org.ms.usermanagementportal.exception.domain.ExceptionHandling;
import org.ms.usermanagementportal.exception.domain.UserNotFoundException;
import org.ms.usermanagementportal.exception.domain.UsernameExistException;
import org.ms.usermanagementportal.model.User;
import org.ms.usermanagementportal.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = {"/","/user"})
public class UserResource extends ExceptionHandling {

    private UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) throws UserNotFoundException, EmailExistException, UsernameExistException {
        User loginUser =userService.register(user.getFirstName(), user.getLastName(), user.getUsername(), user.getEmail());
        return new ResponseEntity<>(loginUser, HttpStatus.OK);
    }

}
