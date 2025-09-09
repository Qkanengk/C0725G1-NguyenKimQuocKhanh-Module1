package ss2_loop.bai_tap;

public class hien_thi_20_so_nguyen_to_dau_tien {
    public static void main(String[] args) {
        String str = new String();
        for(int i = 0;i<20;i++){
            if(i>=2){
                boolean check = true;
                int j = 2;
                while (j<=Math.sqrt(i)){
                    if(i%j==0){
                        check = false;
                        break;
                    }
                    j++;
                }
                if(check){
                    str+=Integer.toString(i);
                    str+="\n";
                }
            }
        }
        System.out.println(str);
    }
}
