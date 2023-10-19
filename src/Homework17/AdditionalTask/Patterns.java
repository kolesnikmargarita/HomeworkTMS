package Homework17.AdditionalTask;

import java.util.regex.Pattern;

public enum Patterns {
    DOC_NUMBER, PHONE_NUMBER, EMAIL, TXT_FILE;

    public Pattern getPattern() {
        return switch (this) {
            case DOC_NUMBER -> Pattern.compile("(\\d{4}-[A-Za-zА-Яа-я]{3}-){2}(\\d[A-Za-zА-Яа-я]){2}");
            case PHONE_NUMBER -> Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
            case EMAIL -> Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}");
            case TXT_FILE -> Pattern.compile("^.+\\.txt$");//("^(([А-Яа-я0-9]|\\w)+\\s*)+\\.txt$");
        };
    }
}
