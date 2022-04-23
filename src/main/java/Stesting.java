import java.util.Objects;

public class Stesting {


   public static String merge(String s1, String s2)
    {
        StringBuilder result = new StringBuilder();
        if (Objects.equals(s1, "") || Objects.equals(s2, ""))
            return "error";
        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
            if (i < s1.length())
                result.append(s1.charAt(i));
            if (i < s2.length())
                result.append(s2.charAt(i));
        }
        return result.toString();
    }


}