package furama_resort.services.impl;

import furama_resort.models.Employee;
import furama_resort.services.IEmployeeService;
import furama_resort.utils.validata.ValidateUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void displayList() {

            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        }

    @Override
    public void addNew() {
        Employee employee = this.info();
        employeeList.add(employee);
        System.out.println("Successfully added new");
    }

    @Override
    public void edit() {
        System.out.println("Enter the employee code to edit");
        String code = scanner.nextLine();

        boolean isCode = true;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(code)) {
                Employee employee = this.info();
                employeeList.set(i, employee);
                isCode = false;
                break;
            }
        }
        if (isCode) {
            System.out.println("Can't find the code to fix");
        }

    }


    private Employee info() {
        String id = ValidateUtils.addCode();
        String name = ValidateUtils.addName();
        LocalDate dayOfBirth = ValidateUtils.addDayBirth();
        String gender = ValidateUtils.addGender();
        String identityCard = ValidateUtils.addidentityCard();
        String phoneNumber = ValidateUtils.addphoneNumber();
        String email = ValidateUtils.email();
        String level = ValidateUtils.level();
        String location = ValidateUtils.location();
        Double salary = ValidateUtils.salary();

        Employee employee = new Employee(id, name, dayOfBirth, gender, identityCard, phoneNumber, email, level, location, salary);
        return employee;

    }
}
