public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

// passes 1036/1045. just gunna be more edge case garbage.
class Solution {
    public int reverse(int x) {
        int ans = 0;

        while (x != 0) {
            ans *= 10;
            ans += (x % 10);
            x /= 10;
        }
        return ans;
    }
}


// handle min/max int scenarios
class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}