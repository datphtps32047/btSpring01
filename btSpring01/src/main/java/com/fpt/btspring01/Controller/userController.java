package com.fpt.btspring01.Controller;

import com.fpt.btspring01.Model.user;
import com.fpt.btspring01.Service.Impl.userServiceImlp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    private userServiceImlp userService;
    public static final String REDIRECT_LOCATION = "redirect:/user/user-list";
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/user-list")
    public String list(Model model){
        model.addAttribute("listUser", userService.getAllUsers());
        return "user-list";
    }

    @GetMapping("/add-user")
    public String addUser(Model model){
        model.addAttribute("user", new user());
        return "add-user";
    }

    @PostMapping("/save-user")
    public String saveUser(@ModelAttribute user user, BindingResult result, Model model ){
        userService.saveUser(user);
        return REDIRECT_LOCATION;
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("userId") Long userId){
        userService.deleteUserById(userId);
        return REDIRECT_LOCATION;
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("userId") Long userId, Model model){
        user user = userService.getUserById(userId).orElse(null);
        model.addAttribute("user", user);
        return "update-user";
    }

    @PostMapping("/update-user")
    public String updateUser(@ModelAttribute user user, BindingResult result, Model model ){
        userService.saveUser(user);
        return REDIRECT_LOCATION;
    }

}
