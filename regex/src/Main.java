import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        // 1st way to use Pattern and Matcher classes
        Pattern p = Pattern.compile(".s"); // . represents a single character
        Matcher m = p.matcher("as");
        boolean b = m.matches();
        System.out.println("b: " + b);

        // 2nd way: Using compile(), matcher(), and matches() in one line
        boolean b2 = Pattern.compile(".s").matcher("as").matches();

        // 3rd way: Using Pattern.matches() directly
        boolean b3 = Pattern.matches(".s", "as");

        // Printing results of the three methods
        System.out.println(b + " " + b2 + " " + b3);

        // Testing different regex patterns
        System.out.println(Pattern.matches(".s", "as")); // true (2nd char is s)
        System.out.println(Pattern.matches(".s", "mk")); // false (2nd char is not s)
        System.out.println(Pattern.matches(".s", "mst")); // false (has more than 2 chars)
        System.out.println(Pattern.matches(".s", "amms")); // false (has more than 2 chars)
        System.out.println(Pattern.matches("..s", "mas")); // true (3rd char is s)

        // Character class [amn]
        System.out.println(Pattern.matches("[amn]", "abcd")); // false (not a or m or n)
        System.out.println(Pattern.matches("[amn]", "a")); // true (among a or m or n)
        System.out.println(Pattern.matches("[amn]", "ammmna")); // false (m and a come more than once)

        // Quantifiers
        System.out.println("? quantifier ....");
        System.out.println(Pattern.matches("[amn]?", "a")); // true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?", "aaa")); // false (a comes more than once)
        System.out.println(Pattern.matches("[amn]?", "aammmnn")); // false (a, m, and n come more than once)
        System.out.println(Pattern.matches("[amn]?", "aazzta")); // false (a comes more than once)
        System.out.println(Pattern.matches("[amn]?", "am")); // false (a or m or n must come one time)

        System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+", "a")); // true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aaa")); // true (a comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aammmnn")); // true (a, m, or n come more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta")); // false (z and t are not matching pattern)

        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[amn]*", "ammmna")); // true (a, m, or n may come zero or more times)

        // Metacharacters \d and \D
        System.out.println(Pattern.matches("\\d", "abc")); // false (non-digit)
        System.out.println(Pattern.matches("\\d", "1")); // true (digit and comes once)
        System.out.println(Pattern.matches("\\d", "323abc")); // false (digit and char)
        System.out.println(Pattern.matches("\\d", "323abc")); // false (digit and char)
        System.out.println("metacharacters \\D...."); // \D means non-digit
        System.out.println(Pattern.matches("\\D", "abc")); // false (non-digit but comes more than once)
        System.out.println(Pattern.matches("\\D", "1")); // false (digit)
        System.out.println(Pattern.matches("\\D", "4443")); // false (digit)
        System.out.println(Pattern.matches("\\D", "323abc")); // false (digit and char)
        System.out.println(Pattern.matches("\\D", "m")); // true (non-digit and comes once)
        System.out.println("metacharacters \\D with quantifier....");
        System.out.println(Pattern.matches("\\D*", "mak")); // true (non-digit and may come 0 or more times)

        // Character classes and quantifiers
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32")); // true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32")); // false (more than 6 chars)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2")); // true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2")); // false ($ is not matched)

        // Phone number validation
        System.out.println("by character classes and quantifiers ...");
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949")); // true
        System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949")); // true
        System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490")); // false (11 characters)
        System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949")); // false (starts from 6)
        System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949")); // true

        System.out.println("by metacharacters ...");
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949")); // true
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949")); // false (starts from 3)
//        1. [abc]
////        Matches any one of the characters a, b, or c.
        System.out.println(Pattern.matches("[abc]", "a")); // true
        System.out.println(Pattern.matches("[abc]", "b")); // true
        System.out.println(Pattern.matches("[abc]", "c")); // true
        System.out.println(Pattern.matches("[abc]", "d")); // false
        System.out.println(Pattern.matches("[abc]", "ab")); // false (only matches one character)
        //[^abc] Matches any character except a, b, or c.
        System.out.println(Pattern.matches("[^abc]", "d")); // true
        System.out.println(Pattern.matches("[^abc]", "e")); // true
        System.out.println(Pattern.matches("[^abc]", "a")); // false
        System.out.println(Pattern.matches("[^abc]", "b")); // false
        System.out.println(Pattern.matches("[^abc]", "c")); // false
        System.out.println(Pattern.matches("[^abc]", "ab")); // false (only matches one character)
//[a-zA-Z]Matches any one character from a to z or A to Z (case insensitive).
        System.out.println(Pattern.matches("[a-zA-Z]", "a")); // true
        System.out.println(Pattern.matches("[a-zA-Z]", "Z")); // true
        System.out.println(Pattern.matches("[a-zA-Z]", "g")); // true
        System.out.println(Pattern.matches("[a-zA-Z]", "G")); // true
        System.out.println(Pattern.matches("[a-zA-Z]", "1")); // false
        System.out.println(Pattern.matches("[a-zA-Z]", "@")); // false
        System.out.println(Pattern.matches("[a-zA-Z]", "az")); // false (only matches one character)
//[a-d[m-p]]Matches any one character from a to d or from m to p (union).
        System.out.println(Pattern.matches("[a-d[m-p]]", "a")); // true
        System.out.println(Pattern.matches("[a-d[m-p]]", "c")); // true
        System.out.println(Pattern.matches("[a-d[m-p]]", "m")); // true
        System.out.println(Pattern.matches("[a-d[m-p]]", "p")); // true
        System.out.println(Pattern.matches("[a-d[m-p]]", "e")); // false
        System.out.println(Pattern.matches("[a-d[m-p]]", "z")); // false
        System.out.println(Pattern.matches("[a-d[m-p]]", "am")); // false (only matches one character)
//[a-z&&[def]]Matches any one character that is both in the range a to z and in the set [def] (intersection).
        System.out.println(Pattern.matches("[a-z&&[def]]", "d")); // true
        System.out.println(Pattern.matches("[a-z&&[def]]", "e")); // true
        System.out.println(Pattern.matches("[a-z&&[def]]", "f")); // true
        System.out.println(Pattern.matches("[a-z&&[def]]", "a")); // false
        System.out.println(Pattern.matches("[a-z&&[def]]", "z")); // false
        System.out.println(Pattern.matches("[a-z&&[def]]", "de")); // false (only matches one character)

//[a-z&&[^bc]]Matches any one character from a to z, except for b and c (subtraction).

        System.out.println(Pattern.matches("[a-z&&[^bc]]", "a")); // true
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "d")); // true
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "b")); // false
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "c")); // false
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "z")); // true
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "ad")); // false (only matches one character)
//[a-z&&[^m-p]]Matches any one character from a to z, except for m to p (subtraction).
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "a")); // true
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "l")); // true
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "m")); // false
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "p")); // false
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "q")); // true
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "z")); // true
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "am")); // false (only matches one character)
//        X? - X occurs once or not at all - Matches if X appears zero or one time.
        // Example: "a?" matches strings with zero or one 'a'
        System.out.println(Pattern.matches("a?", ""));   // true (zero 'a')
        System.out.println(Pattern.matches("a?", "a"));  // true (one 'a')
        System.out.println(Pattern.matches("a?", "aa")); // false (more than one 'a')

//        X+ - X occurs once or more times - Matches if X appears one or more times.
        // Example: "a+" matches strings with one or more 'a'
        System.out.println(Pattern.matches("a+", "a"));    // true (one 'a')
        System.out.println(Pattern.matches("a+", "aaa"));  // true (three 'a's)
        System.out.println(Pattern.matches("a+", ""));     // false (zero 'a')
//        X* - X occurs zero or more times -Matches if X appears zero or more times.
        // Example: "a*" matches strings with zero or more 'a'
        System.out.println(Pattern.matches("a*", ""));     // true (zero 'a')
        System.out.println(Pattern.matches("a*", "a"));    // true (one 'a')
        System.out.println(Pattern.matches("a*", "aaa"));  // true (three 'a's)
        System.out.println(Pattern.matches("a*", "b"));    // true (zero 'a')
//        X{n} - X occurs exactly n times
//        Matches if X appears exactly n times.

        // Example: "a{2}" matches strings with exactly two 'a's
        System.out.println(Pattern.matches("a{2}", "a"));     // false (one 'a')
        System.out.println(Pattern.matches("a{2}", "aa"));    // true (two 'a's)
        System.out.println(Pattern.matches("a{2}", "aaa"));   // false (three 'a's)

//        X{n,} - X occurs n or more times
//        Matches if X appears n or more times.

// Example: "a{2,}" matches strings with at least two 'a's
        System.out.println(Pattern.matches("a{2,}", "a"));     // false (one 'a')
        System.out.println(Pattern.matches("a{2,}", "aa"));    // true (two 'a's)
        System.out.println(Pattern.matches("a{2,}", "aaa"));   // true (three 'a's)
        System.out.println(Pattern.matches("a{2,}", ""));      // false (zero 'a')

//        X{y,z} - X occurs at least y times but less than z times
//        Matches if X appears at least y times but fewer than z times.

        // Example: "a{2,4}" matches strings with at least two but less than four 'a's
        System.out.println(Pattern.matches("a{2,4}", "a"));    // false (one 'a')
        System.out.println(Pattern.matches("a{2,4}", "aa"));   // true (two 'a's)
        System.out.println(Pattern.matches("a{2,4}", "aaa"));  // true (three 'a's)
        System.out.println(Pattern.matches("a{2,4}", "aaaa")); // true (four 'a's)
        System.out.println(Pattern.matches("a{2,4}", "aaaaa"));// false (five 'a's)

//. - Any character (may or may not match terminator)
//        Matches any single character except newline characters.
        // Example: "." matches any single character
        System.out.println(Pattern.matches(".", "a"));  // true (any single character)
        System.out.println(Pattern.matches(".", "1"));  // true (any single character)
        System.out.println(Pattern.matches(".", "!"));  // true (any single character)
        System.out.println(Pattern.matches(".", "ab"));// false (more than one character)
//\d - Any digit, shorthand for [0-9]Matches any single digit.
        // Example: "\d" matches any single digit
        System.out.println(Pattern.matches("\\d", "5"));   // true (a digit)
        System.out.println(Pattern.matches("\\d", "a"));   // false (not a digit)
        System.out.println(Pattern.matches("\\d", "12"));  // false (more than one digit)
        System.out.println(Pattern.matches("\\d", "!"));   // false (not a digit)
//\D - Any non-digit, shorthand for [^0-9]
//        Matches any single character that is not a digit.

// Example: "\D" matches any single non-digit
        System.out.println(Pattern.matches("\\D", "a"));   // true (a non-digit)
        System.out.println(Pattern.matches("\\D", "1"));   // false (a digit)
        System.out.println(Pattern.matches("\\D", "!"));   // true (a non-digit)
        System.out.println(Pattern.matches("\\D", " "));   // true (a non-digit space)
        System.out.println(Pattern.matches("\\D", "12"));  // false (more than one character)

//        \s - Any whitespace character, shorthand for [\t\n\x0B\f\r]
//        Matches any single whitespace character.

        // Example: "\s" matches any single whitespace character
        System.out.println(Pattern.matches("\\s", " "));   // true (a space)
        System.out.println(Pattern.matches("\\s", "\t"));  // true (a tab)
        System.out.println(Pattern.matches("\\s", "\n"));  // true (a newline)
        System.out.println(Pattern.matches("\\s", "a"));   // false (not a whitespace)
        System.out.println(Pattern.matches("\\s", "  "));  // false (more than one character)

//        \S - Any non-whitespace character, shorthand for [^\s]
//        Matches any single character that is not a whitespace.

        // Example: "\S" matches any single non-whitespace character
        System.out.println(Pattern.matches("\\S", "a"));   // true (a non-whitespace character)
        System.out.println(Pattern.matches("\\S", "1"));   // true (a non-whitespace character)
        System.out.println(Pattern.matches("\\S", "!"));   // true (a non-whitespace character)
        System.out.println(Pattern.matches("\\S", " "));   // false (a whitespace character)
        System.out.println(Pattern.matches("\\S", "ab"));  // false (more than one character)
//\w - Any word character, shorthand for [a-zA-Z_0-9]
//        Matches any single alphanumeric character or underscore.

        // Example: "\w" matches any single word character
        System.out.println(Pattern.matches("\\w", "a"));   // true (an alphabetic character)
        System.out.println(Pattern.matches("\\w", "A"));   // true (an alphabetic character)
        System.out.println(Pattern.matches("\\w", "1"));   // true (a digit)
        System.out.println(Pattern.matches("\\w", "_"));   // true (an underscore)
        System.out.println(Pattern.matches("\\w", "!"));   // false (a non-word character)
        System.out.println(Pattern.matches("\\w", "ab"));  // false (more than one character)

//\W - Any non-word character, shorthand for [^\w]
//        Matches any single character that is not a word character.
// Example: "\W" matches any single non-word character
        System.out.println(Pattern.matches("\\W", "!"));   // true (a non-word character)
        System.out.println(Pattern.matches("\\W", " "));   // true (a whitespace character)
        System.out.println(Pattern.matches("\\W", "a"));   // false (a word character)
        System.out.println(Pattern.matches("\\W", "1"));   // false (a word character)
        System.out.println(Pattern.matches("\\W", "_"));   // false (a word character)
        System.out.println(Pattern.matches("\\W", "!!"));  // false (more than one character)

//\b - A word boundary
//        Matches the position between a word character and a non-word character.

        // Example: "\b" matches a word boundary position
        System.out.println(Pattern.compile("\\bis\\b").matcher("This is a test").find());  // true (matches "is")
        System.out.println(Pattern.compile("\\bis\\b").matcher("This isn't a test").find()); // false (doesn't match "isn't")
        System.out.println(Pattern.compile("\\bis\\b").matcher("Thisis a test").find());  // false (no boundary before "is")
        System.out.println(Pattern.compile("\\bis\\b").matcher("is this a test").find()); // true (matches "is")
//\B - A non-word boundary
//        Matches the position where there is no word boundary.
// Example: "\B" matches a non-word boundary position
        System.out.println(Pattern.compile("\\Bis\\B").matcher("Thisis a test").find()); // true (matches "is" within "Thisis")
        System.out.println(Pattern.compile("\\Bis\\B").matcher("This is a test").find()); // false (no "is" without boundaries)
        System.out.println(Pattern.compile("is\\B").matcher("Thisis a test").find()); // true (matches "is" within "Thisis")
        System.out.println(Pattern.compile("\\Bis").matcher("Thisis a test").find()); // true (matches "is" within "Thisis")


        // Interactive regex matching using Scanner
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter regex pattern:");
            Pattern pattern = Pattern.compile(sc.nextLine());
            System.out.println("Enter text:");
            Matcher matcher = pattern.matcher(sc.nextLine());
            boolean found = false;
            while (matcher.find()) {
                System.out.println("I found the text '" + matcher.group() + "' starting at index " +
                        matcher.start() + " and ending at index " + matcher.end());
                found = true;
            }
            if (!found) {
                System.out.println("No match found.");
            }
        }

    }
}
