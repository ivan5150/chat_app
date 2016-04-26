package ru.itsphere.springmvchelloworld;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class MessageFormValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return MessageForm.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "author", "valid.author.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "text", "valid.text.empty");
        MessageForm message = (MessageForm) o;
        if (message.getAuthor().length() < 2 || message.getAuthor().length() > 20) {
            errors.rejectValue("author", "valid.author.length");
        }
        if (message.getText().length() < 2 || message.getText().length() > 20) {
            errors.rejectValue("text", "valid.text.length");
        }
    }
}




