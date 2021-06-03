package lesson4.task1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human {
    private String lastname;
    private String firstname;
    private Date birthDate;

    private final String LAST_NAME = "фамилии";
    private final String FIRST_NAME = "имени";
    private final String BIRTH_DATE = "даты рождения";
    private final String VALUE_CHECK = "^[А-Я][а-я]{2,}$";
    private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    public Human() {
    }

    public void setLastName(String lastname) {
        if (lastname.matches(VALUE_CHECK)) {
            this.lastname = lastname;
            setCorrectPrint(LAST_NAME, lastname);
        } else {
            setIncorrectPrint(lastname);
        }
    }

    public void setFirstName(String firstname) {
        if (firstname.matches(VALUE_CHECK)) {
            this.firstname = firstname;
            setCorrectPrint(FIRST_NAME, firstname);
        } else {
            setIncorrectPrint(firstname);
        }
    }

    public void setBirthDate(Date birthDate) {
        Date today = new Date();
        if (birthDate.before(today)) {
            this.birthDate = birthDate;
            setCorrectPrint(BIRTH_DATE, DATE_FORMAT.format(birthDate));
        } else {
            setIncorrectPrint(DATE_FORMAT.format(birthDate));
        }
    }

    public String getFirstName() {
        getPrint(FIRST_NAME, firstname);
        return firstname;
    }

    public String getLastName() {
        getPrint(LAST_NAME, lastname);
        return lastname;
    }

    public Date getBirthDate() {
        getPrint(BIRTH_DATE, DATE_FORMAT.format(birthDate));
        return birthDate;
    }


    private void getPrint(String type, String value) {
        System.out.printf("Получено значение %s: %s%n", type, value);
    }

    private void setCorrectPrint(String type, String value) {
        System.out.printf("Установлено корректное значение %s: %s%n", type, value);
    }

    private void setIncorrectPrint(String value) {
        System.out.printf("Введенное значение некорректно: %s%n", value);
    }

}
