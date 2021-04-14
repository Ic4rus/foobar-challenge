public class BunnyWorkerLocations {

    public static String solution(long x, long y) {
        // Find length (or order number) of hypotenuse
        long n = x + y - 1;

        // Last number on the hypotenuse is the sum of the sequence of natural numbers 1..n
        long lastNumber = (n * (n + 1)) / 2;

        // Find ID by x
        long id = lastNumber - n + x;

        return id + "";
    }

}
