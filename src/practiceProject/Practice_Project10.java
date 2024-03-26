package practiceProject;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice_Project10 {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        String patternString = "fox";

        // Using Pattern and Matcher
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Found '" + patternString + "' in the text");
        } else {
            System.out.println("Did not find '" + patternString + "' in the text");
        }

        // Using String.matches()
        if (text.matches(".*" + patternString + ".*")) {
            System.out.println("Found '" + patternString + "' in the text");
        } else {
            System.out.println("Did not find '" + patternString + "' in the text");
        }
    }
}
