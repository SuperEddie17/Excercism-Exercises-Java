import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SqueakyClean {
    public static String clean(String identifier) {
        // Task 1: Replace spaces with underscores
        String step1 = identifier.replaceAll("\\s", "_");
        // Task 2: Convert kebab-case to camelCase
        Matcher matcher = Pattern.compile("-(\\w)").matcher(step1);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        String step2 = sb.toString();
        // Task 3: Convert leetspeak to normal text
        String step3 = step2.replaceAll("4", "a")
                .replaceAll("3", "e")
                .replaceAll("0", "o")
                .replaceAll("1", "l")  // Corrected replacement for '1'
                .replaceAll("7", "t");
        // Task 4: Omit non-letter characters
        String step4 = step3.replaceAll("[^a-zA-Z_]", "");
        return step4;
    }
}

