package service;

import model.User;
import web.dto.UserRegistrationDto;

public interface UserService {

    User save(UserRegistrationDto userRegistrationDto);
}
