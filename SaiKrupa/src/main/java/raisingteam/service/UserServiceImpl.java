package raisingteam.service;


import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;





import raisingteam.controller.Response;
import raisingteam.domain.SignUp;
import raisingteam.domain.User;
import raisingteam.repository.SignUpRepository;
import raisingteam.repository.UserRepository;

@Service
@Validated
public class UserServiceImpl implements LoginServiceI {

    //private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    //private final UserRepository repository;
	
	@Autowired
    protected UserRepository userRepository;
	
	@Autowired
	protected SignUpRepository signUpRepository;

    /*@Inject
    public UserServiceImpl(final UserRepository repository) {
        this.userRepository = repository;
    }
*/
    
    @Override
    @Transactional(readOnly = true)
    public Response validateLoginUser(User user) {
     //   LOGGER.debug("Retrieving the list of all users");
        //return repository.findUser(id);
       Response response=new Response();
       User userFromDb=userRepository.findOne(user.getId());
       if(user.getId().equals(userFromDb.getId()) && user.getPassword().equals(userFromDb.getPassword())){
       	response.setStatus("SUCCESS");
    	response.setLoggedInUser(user.getId());
       }
       System.out.println(userFromDb.getId()  + userFromDb.getPassword() );
      
    	return response;
    }
    
    
    @Override
    @Transactional
    public Response signUp(@NotNull @Valid final SignUp signUp) {
       // LOGGER.debug("Creating {}", user);
        SignUp existing = signUpRepository.findOne(signUp.getEmail());
        if (existing != null) {
            throw new raisingteam.service.exception.UserAlreadyExistsException(
                    String.format("There already exists a user with id=%s", signUp.getEmail()));
        }
        
        signUpRepository.save(signUp);
        
        User user=new User(signUp.getEmail(),signUp.getPassword());
        
        userRepository.save(user);
        Response response = new Response();
        response.setStatus("Success");
        return response;
    }


}
