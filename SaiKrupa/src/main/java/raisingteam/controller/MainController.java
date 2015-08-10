package raisingteam.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import raisingteam.service.exception.UserAlreadyExistsException;
import raisingteam.domain.SignUp;
import raisingteam.domain.User;
import raisingteam.repository.UserRepository;
import raisingteam.service.LoginServiceI;

import javax.inject.Inject;
import javax.validation.Valid;

import java.util.List;

@RestController
@RequestMapping(value = "/mainController", produces = MediaType.APPLICATION_JSON_VALUE)
public class MainController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
    private final LoginServiceI userServiceI;

    @Inject
    public MainController(final LoginServiceI userServiceI) {
        this.userServiceI = userServiceI;
    }
    
    @Autowired
    protected UserRepository userRepository;

    

    @RequestMapping(value = "/validateLogin", method = RequestMethod.POST)
    public Response listUsers(@RequestBody @Valid final User user) {
        LOGGER.debug("Received request to list all users");
        //userServiceI.getUser(user.getId());
   
        return userServiceI.validateLoginUser(user);
        
    }
    
    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public Response signUp(@RequestBody @Valid final SignUp signUp) {
        LOGGER.debug("Received request to create the {}", signUp);
        return userServiceI.signUp(signUp);
    }


    @ExceptionHandler
    @ResponseStatus(HttpStatus.CONFLICT)
    public String handleUserAlreadyExistsException(UserAlreadyExistsException e) {
        return e.getMessage();
    }

   

}
