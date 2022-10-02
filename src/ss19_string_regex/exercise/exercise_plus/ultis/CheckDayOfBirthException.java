package ss19_string_regex.exercise.exercise_plus.ultis;

import java.time.format.DateTimeFormatter;

public class CheckDayOfBirthException extends Exception {
    public CheckDayOfBirthException(DateTimeFormatter formatter ){
        super(String.valueOf(formatter));
    }
}
