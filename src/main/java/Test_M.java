import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

import static org.apache.commons.lang3.StringUtils.isNumeric;
import static org.apache.commons.lang3.StringUtils.reverse;

public class Test_M {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter an input");
        String word = x.nextLine();

        System.out.println(StringUtils.swapCase(word));
        System.out.println(reverse(word));
        System.out.println(isNumeric(word));



    }
}
