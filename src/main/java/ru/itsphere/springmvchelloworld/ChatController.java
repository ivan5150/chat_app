package ru.itsphere.springmvchelloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/")
public class ChatController {

    public static final String AUTHOR_ATTRIBUTE = "author";
    public static final String TEXT_ATTRIBUTE = "text";
    public static final String PAGE = "Message";

    @Autowired
    private MessageFormValidator messageFormValidator;

    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(messageFormValidator);
    }

    ArrayList<Message> list = new ArrayList<Message>();

    @RequestMapping(method = RequestMethod.GET)
    public String dispatchToHomePage() {
        return "Message";
    }

    @RequestMapping(value = "/showMessage", method = RequestMethod.POST)
    public String showMessage(@RequestParam String author, @RequestParam String text, ModelMap model) {
        list.add(new Message(author, text));
        model.addAttribute("messages", list);
        return PAGE;
    }

    @RequestMapping(value = "/showMessage", method = RequestMethod.POST)
    public String saveUser(@Validated MessageForm messageForm, BindingResult binding, ModelMap model) {
        return PAGE;
    }

    /*@RequestMapping(value = "/save/user", method = RequestMethod.POST)
    public String saveUser(@Validated UserForm userForm, BindingResult binding, ModelMap model) {
        if (binding.hasErrors()) {
            return SAVE_USER;
        }
        if (userForm.getId().equals("")) {
            service.insert(new UserDTO(0, userForm.getFirstName(), userForm.getSecondName()));
        } else {
            service.update(new UserDTO(Integer.parseInt(userForm.getId()), userForm.getFirstName(), userForm.getSecondName()));
        }
        return allUsers(model);
    }*/
}