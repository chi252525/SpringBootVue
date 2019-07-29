package maxwell.springbootvuelast.controller;


import org.springframework.web.bind.annotation.*;

import maxwell.springbootvuelast.entity.*;
@RestController
@RequestMapping("/api")
public class LoginController {

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestParam String username,
                        @RequestParam String password) {
        if (username.equals("123") && password.equals("123")) {
        	
            return "successful";
        } else {
            return "failed";
        }
    }

    @RequestMapping(path = "/information", method = RequestMethod.GET)
    @ResponseBody
    public User information() {
        return new User();
    }
}

