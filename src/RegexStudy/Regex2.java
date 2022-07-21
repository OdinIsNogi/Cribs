package RegexStudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        String s1 = "AAABBaeCFCFBabcABABCD ABab5c8C2CE ABABCFABwtCABCDGA354BCHABC";
        Pattern pattern1 = Pattern.compile("[abcd][efgh3-8]");


        Matcher matcher = pattern1.matcher(s1);

        while ((matcher.find())) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
