package lesson2.exampl3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {

    public static boolean expression(String s) {
        Pattern p = Pattern.compile("^\\+7\\(\\d{3}\\)\\d{3}\\-\\d{2}\\-\\d{2}");
        Matcher m = p.matcher(s);
        return m.matches();

    }

    public static void main(String[] args) {
        System.out.println(expression("+7(912)632-10-64"));
        System.out.println(expression("7(910)423-73-12"));
        System.out.println(expression("89215310934"));
        System.out.println(expression("+5(911)310-12-74"));
        System.out.println(expression("+7(9fg)125-42-99"));
        System.out.println(expression("+7(122)2342343"));


    }
}
