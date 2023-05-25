
//providing code 
public class SubstringChecker {

    public static boolean isSubstringPresent(String str, String substring) {
        if (str == null || substring == null) {
            return false;
        }

        return str.contains(substring);
    }
}

//client demo code 
public class SubstringCheckerDemo {

    public static void main(String[] args) {
        String str = "Hello, world!";
        String substring1 = "world";
        String substring2 = "Java";

        boolean isSubstring1Present = SubstringChecker.isSubstringPresent(str, substring1);
        boolean isSubstring2Present = SubstringChecker.isSubstringPresent(str, substring2);

        System.out.println("Substring '" + substring1 + "' is present: " + isSubstring1Present);
        System.out.println("Substring '" + substring2 + "' is present: " + isSubstring2Present);
    }
}

/* output 

Substring 'world' is present: true
Substring 'Java' is present: false

*/
