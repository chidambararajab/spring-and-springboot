package com.chid.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    AuthenticationLogin authenticationLogin;

    public LoginController(AuthenticationLogin authenticationLogin) {
        this.authenticationLogin = authenticationLogin;
    }

    @RequestMapping(value="login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String gotoWelcomePagea(@RequestParam String name, @RequestParam String password, ModelMap model) {

        if(authenticationLogin.authenticateLogin(name, password)){
            model.put("name", name);
            return "welcome";
        }

        model.put("error", "Invalid Credentials");
        return "login";
    }
}
