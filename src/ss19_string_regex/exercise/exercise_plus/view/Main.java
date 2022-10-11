package ss19_string_regex.exercise.exercise_plus.view;

import furama_resort.utils.exception.CheckExceptionsUtils;
import ss19_string_regex.exercise.exercise_plus.controller.ManagerController;
import ss19_string_regex.exercise.exercise_plus.ultis.CheckInputException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, CheckExceptionsUtils, CheckInputException {
        ManagerController.menuManageData();
    }
}
