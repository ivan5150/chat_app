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
    public static final String SAVE_FORM = "saveUser";

    @Autowired
    private MessageFormValidator messageFormValidator;

    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(messageFormValidator);
    }

    ArrayList<Message> list = new ArrayList<Message>();

    @RequestMapping(method = RequestMethod.GET)
    public String dispatchToHomePage() {
        return "chatUser";
    }

    @RequestMapping(value = "/showMessage", method = RequestMethod.GET)
    public String showMessage(ModelMap model) {
        model.addAttribute("messages", list);
        return PAGE;
    }

    @RequestMapping(value = "/save/message", method = RequestMethod.POST)
    public String saveUser(@Validated MessageForm messageForm, BindingResult binding, ModelMap model) {
        if (binding.hasErrors()) {
            return SAVE_FORM;
        }
        return SAVE_FORM;
    }

}