public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] input = null;
        int k = 95;
        boolean isKPresent = kFind(input, k);
        System.out.println("IsElementPresent = " + isKPresent);
    }

    public static boolean kFind(int[] input, int k) {
        if (input == null)
            return false;
        for (int i = 0; i < input.length; i++) {
            if (k == input[i])
                return true;
        }
        return false;
    }
}
