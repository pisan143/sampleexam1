
import java.lang.Math;

public class SampleExam1 {

    public static void calc(int nickels, int dimes, int quarters) {
        int total = nickels * 5 + dimes * 10 + quarters * 25;
        int dollars = total / 100;
        int cents = total % 100;
        System.out.print("$" + dollars + ".");
        if (cents < 9) {
            System.out.print("0");
        }
        System.out.println(cents);
    }

    public static double calcCalories(double ageYears, double weightPounds, double heartBPM, double timeMinutes) {
        double calories = ((ageYears * 0.2757) + (weightPounds * 0.03295) + (heartBPM * 1.0781) - 75.4991) * timeMinutes
                / 8.368;
        return calories;
    }

    public int smallest(int a, int b, int c) {
        if (a > 0 && a <= b && a <= c) {
            return a;
        }
        if (b > 0 && b <= a && b <= c) {
            return b;
        }
        return c;
    }

    public int smallest2(int a, int b, int c) {
        int min = Integer.MAX_VALUE;
        if (a > 0 && a < min) {
            min = a;
        }
        if (b > 0 && b < min) {
            min = b;
        }
        if (c > 0 && c < min) {
            min = c;
        }
        return min;
    }

    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isGood(String s) {
        if (s.length() < 12) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                return true;
            }
        }
        return false;
    }

    public int mostFrequent(int[] nums) {
        int maxAppears = 1;
        int num = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int appears = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    appears++;
                }
            }
            if (appears > maxAppears) {
                maxAppears = appears;
                num = nums[i];
            }
        }
        return num;
    }

    public void printArr(int[] nums) {
        System.out.print("<");
        if (nums.length > 0) {
            System.out.print(nums[0]);
        }
        for (int i = 1; i < nums.length; i++) {
            System.out.print("," + nums[i]);
        }
        System.out.println(">");
    }

    public int midArray(int[] nums) {
        int left = 0;
        int right = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        right = total - nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (left == right) {
                return i;
            }
            left += nums[i];
            right -= nums[i];
        }
        return -1; // should never get here
    }

    public void setIntersection(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }

    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9 && carry == 1) {
                digits[i] = 0;
            } else {
                digits[i] += carry;
                carry = 0;
            }
        }
        if (carry == 1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                newDigits[i + 1] = digits[i];
            }
            return newDigits;
        }
        return digits;
    }

    public int[] arrForm(int num) {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = num % 10;
            num /= 10;
        }
        return arr;
    }

    public boolean hasDupe(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public void zeroEnd(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (i < j && nums[i] != 0) {
                i++;
            }
            while (i < j && nums[j] == 0) {
                j--;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }

    public void freq(String str) {
        for (char c = 'a'; c <= 'z'; c++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(c + " " + count);
            }
        }
    }

    public int fibN(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        calc(0, 0, 4);
        Chair c = new Chair();
        int x = 10;
        x += 5;
        x = 20;
        x = x * 2 + 1;
        x = 30;
        x %= 4;
        x = 40;
        x++;
        x = 50;
        x = 10 + x / 2;
        x = 8;
        x = x / 3;
        x = 3;
        x = (int) Math.pow(x, 2);
        x = 7654;
        x = x % 100;
        x = 10;
        double d = x * 2.5;
        x = 20;
        d = x / 3;

    }
}
