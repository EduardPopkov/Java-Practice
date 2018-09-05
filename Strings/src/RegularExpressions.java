import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        String str = "hello?good!bye.sorry,have boy";
        String[] arrStr = str.split("\\s*(\\s|!|\\?|,|\\.)\\s*");
        for(String s : arrStr){
            System.out.println(s);
        }

        //matches()
        str = "+12341251231";
        boolean result = str.matches("(\\+*)\\d{11}");
        if(result){
            System.out.println("it is a phone number");
        } else {
            System.out.println("it is not a phone number");
        }

        //Pattern and Mathcer
        str = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern = Pattern.compile("Java(\\w*)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

        //replaceAll
        String newStr = matcher.replaceAll("HTML");
        System.out.println(newStr);

        ////////////////////////////////////////////////////
        str = "Крещение Руси произошло в 988 году! Не так ли?" ;
        String template = "(.*)(\\d+)(.*)";

        pattern = Pattern.compile(template);

        matcher = pattern.matcher(str);
        if(matcher.find()){
            System.out.println("найдено значение: " + matcher.group(0));
            System.out.println("найдено значение: " + matcher.group(1));
            System.out.println("найдено значение: " + matcher.group(2));
        } else {
            System.out.println("Не совпадает");
        }
    }
}
