package raisingteam.service;



import java.util.List;

import raisingteam.controller.Response;
import raisingteam.domain.SignUp;
import raisingteam.domain.User;

public interface LoginServiceI {


    Response validateLoginUser(User user);
    Response signUp(SignUp signUp);

}
