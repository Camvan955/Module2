package furama_resort.utils.exception;


import java.util.ArrayList;
import java.util.List;

public class CheckExceptions extends Exception {
    public static List<String> stringList = new ArrayList<>();

    public CheckExceptions(String mesage) {
        super(mesage);
    }


    public static boolean nameCheck(String name) {
        try {
            String regex = "^([A-ZĐ][a-záàảãạăâắằấầặẵẫêậẩéèẻẽẹếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+[ ])+[A-ZĐ][a-záàảãạăâắằấầặẵẫậéèẻẽẹếềểễệóòêỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+$";

            if (!name.matches(regex)) {
                throw new CheckExceptions("Không đúng định dạng, mời nhập lại");
            }
            return true;
        } catch (CheckExceptions e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean codeCheck(String code) {
        try {
            String regex = "^[N][V][0-9]{3,6}$";
            if (!code.matches(regex)) {
                throw new CheckExceptions("Không đúng định dạng, mời nhập lại");
            }
            return true;
        } catch (CheckExceptions e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean genderCheck(String gender) {
        try {
            String regex = "^[NKamhngữô]+$";
            if (!gender.matches(regex)) {
                throw new CheckExceptions("Không đúng định dạng, mời nhập lại");
            }
            return true;
        } catch (CheckExceptions e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean idCardCheck(String addidentityCard) {
        try {
            String regex = "^[0-9]{9}$";
            if (!addidentityCard.matches(regex)) {
                throw new CheckExceptions("Không đúng định dạng, mời nhập lại");
            }
            return true;
        } catch (CheckExceptions e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean phoneNumberCheck(String phoneNumber) {
            try {
                String regex = "^[0][0-9]{9}$";
                if (!phoneNumber.matches(regex)) {
                    throw new CheckExceptions("Không đúng định dạng, mời nhập lại");
                }
            return true;
            } catch (CheckExceptions e) {
                System.out.println(e.getMessage());
                return false;
            }
        }

    public static boolean emailCheck(String email) {
            try {
               String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
                if (!email.matches(regex)) {
                    throw new CheckExceptions("Không đúng định dạng, mời nhập lại");
                }
                return true;
            } catch (CheckExceptions e) {
                System.out.println(e.getMessage());
                return false;
            }
        }

    public static boolean salaryCheck(Double salary) {
            try {
                if (salary <= 0) {
                    throw new CheckExceptions("Không đúng định dạng, mời nhập lại");
                }
                return true;
            } catch (CheckExceptions e) {
                System.out.println(e.getMessage());
                return false;
            }
        }

    }


