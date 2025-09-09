package ss2_loop.bai_tap;

public class cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        String str = new String();
        for (int i = 0; i <= 100; i++) {
            if (i >= 2) {
                boolean check = true;
                int j = 2;
                while (j <= Math.sqrt(i)) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                    j++;
                }
                if (check) {
                    str += Integer.toString(i) + " ";
                }
            }
        }
        System.out.println(str);
    }
}
