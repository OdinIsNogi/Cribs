package RegexStudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy,Russia, Moskow, Lenin Street, 51, Flat 48," +
                "email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;" +
                "Petrova Mariya, Ykraine, Kiyev,Lomonosov Street,33,Flat 18," +
                "email: masha@yandex.ru, Postcode: YKR54, Phone Number: +987654321;" +
                "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                "email: chuck@gmail.com, Postcode: USA23, Phone number: +136478952.";

        Pattern pattern = Pattern.compile("\\D{2,}");
        Matcher matcher = pattern.matcher(s);

        while(matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}

