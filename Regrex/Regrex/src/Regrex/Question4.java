package Regrex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question4 {

    public static void main(String[] args)
    {
        String text = "Contact us at support@example.com and info@company.org";
        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
        {
            System.out.println(matcher.group());
        }
    }
}

