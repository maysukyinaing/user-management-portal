package org.ms.usermanagementportal.service;

import org.ms.usermanagementportal.exception.domain.EmailExistException;
import org.ms.usermanagementportal.exception.domain.UserNotFoundException;
import org.ms.usermanagementportal.exception.domain.UsernameExistException;
import org.ms.usermanagementportal.model.User;

import java.util.List;

public interface UserService {
    User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, EmailExistException, UsernameExistException;
    List<User> getUsers();
    User findUserByUsername(String username);
    User findUserByEmail(String email);
}
