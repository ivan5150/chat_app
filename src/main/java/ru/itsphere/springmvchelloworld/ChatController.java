package ru.itsphere.springmvchelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
}