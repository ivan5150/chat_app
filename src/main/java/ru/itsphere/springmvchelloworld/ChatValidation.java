package ru.itsphere.springmvchelloworld;

import ru.itsphere.springmvchelloworld.Message;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ChatValidation implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Message.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "author", "valid.authorName.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "text", "valid.authorText.empty");
        Message message = (Message) o;
        if (message.getName().length() < 2 || message.getName().length() > 20) {
            errors.rejectValue("authorName", "valid.authorName.length");
        }
        if (message.getText().length() < 2 || message.getText().length() > 20) {
            errors.rejectValue("authorText", "valid.authorText.length");
        }
    }
}




