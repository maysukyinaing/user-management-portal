package org.ms.usermanagementportal.resource;

import org.ms.usermanagementportal.exception.domain.EmailExistException;
import org.ms.usermanagementportal.exception.domain.ExceptionHandling;
import org.ms.usermanagementportal.exception.domain.UserNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/","/user"})
public class UserResource extends ExceptionHandling {

    @GetMapping("/home")
    public String showUser() throws UserNotFoundException {
    //    return "Application works!";
        throw new UserNotFoundException("This user was not found");
    }

}
