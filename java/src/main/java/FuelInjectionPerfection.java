import java.math.BigInteger;

public class FuelInjectionPerfection {

    public static int solution(String x) {
        // Your code here
        return resolve(x, 0);
    }

    public static int resolve(String str, int count) {
        if (str.equals("1")) {
            return count;
        }
        if (isEvenNumber(str)) {
            str = div(str);
            count++;
            return resolve(str, count);
        } else {
            String sub = plusOrSub(str, -1);
            String plus = plusOrSub(str, 1);
            count += 1;
            if (sub.equals("2")) {
                return resolve(sub, count);
            } else {
                String str1 = div(sub);
                if (isEvenNumber(str1)) {
                    return resolve(sub, count);
                } else {
                    return resolve(plus, count);
                }
            }
        }
    }

    public static boolean isEvenNumber(String x) {
        char c = x.charAt(x.length() - 1);
        return c == '0' || c == '2' || c == '4' || c == '6' || c == '8';
    }

    public static String plusOrSub(String str, int s) {
        BigInteger m = new BigInteger(str);
        BigInteger result = m.add(new BigInteger(String.valueOf(s)));
        return result.toString();
    }

    public static String div(String str) {
        BigInteger m = new BigInteger(str);
        BigInteger result = m.divide(new BigInteger("2"));
        return result.toString();
    }

}
