public class IonFluxRelabeling {

    public static int[] solution(int h, int[] q) {
        // Your code here
        int[] p = new int[q.length];
        for (int i = 0; i < q.length; i++) {
            p[i] = find(h, q[i]);
        }
        return p;
    }

    public static int find(int h, int i) {

        int max = (int) Math.pow(2, h) - 1;
        if (i >= max) {
            return -1;
        }

        int compensation = (max - 1) / 2;

        if (i == compensation || i == 2 * compensation) {
            return max;
        }

        if (i < compensation) {
            compensation = 0;
        }
        return compensation + find(h - 1, i - compensation);
    }

}
