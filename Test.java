import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main1(String[] args) {
        HashMap map = new HashMap();
        map.put("age", null);
        map.put("name", "xy");
        System.out.println(map.size());
    }

    public static void main2(String[] args) {
        int result = 0;
        int i = 2;
        switch (2) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        System.out.println(result); // 10
    }

    public static void main3(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                pong();
            }
        };
        thread.run();
        System.out.println("peng");
        // 输出 pong peng
    }

    private static void pong() {
        System.out.println("pong");
    }
}

class TestDemo {
    public static void main4(String[] args) {
        // 给定一个数组 A[0, 1, ..., n - 1], 请构建一个数组 B[0, 1, ..., n - 1].
        // 其中 B 中的元素 B[i] = A[0] * A[1] * ... * A[i-1] * A[i+1] * ... * A[n-1]
        // ps: 1.不能使用除法 2. B[i] = A[n - 1]!(除了 A[i])

    }
    public int[] multiply(int[] A) {
        int[] B= new int[A.length];
        int tmp = 1; // 存储 B[i]
        for (int i = 0; i < A.length; i++) {
            tmp = 1;
            for (int j = 0; j < A.length; j++) {
                if (i != j) {
                    tmp = A[j] * tmp;
                }
            }
            B[i] = tmp;
        }
        return B;
    }

    public static void main(String[] args) {
        // 给定一个 k 位整数 N = dk - 1 * 10k - 1 + ... + d1 * 101 + d0 (0 <= di <= 9, i = 0,..., k - 1, dk - 1 > 0)
        // 请编写程序统计每种不同的个位数字出现的次数
        // 对 N 中每一种不同的个位数字，以 D : M 的格式在一行中输出该位数字 D 及其在 N 中出现的次数 M, 要求按 D 的升序输出
        // 例如：给定 N = 100311，则有 2 个 0，3 个 1，和 1 个 3
        // 输出: 0:2 1:3 3:1

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int[] conut = new int[10];
        for (int i = 0; i < n.length(); i++) {
            switch (n.charAt(i)) {
                case '0':
                    conut[0]++;
                    break;
                case '1':
                    conut[1]++;
                    break;
                case '2':
                    conut[2]++;
                    break;
                case '3':
                    conut[3]++;
                    break;
                case '4':
                    conut[4]++;
                    break;
                case '5':
                    conut[5]++;
                    break;
                case '6':
                    conut[6]++;
                    break;
                case '7':
                    conut[7]++;
                    break;
                case '8':
                    conut[8]++;
                    break;
                case '9':
                    conut[9]++;
                    break;
                default:
                    return;
            }
        }
        for (int j = 0; j < 10; j++) {
            if (conut[j] != 0) {
                System.out.println(j + ":" + conut[j]);
            }
        }
    }
}