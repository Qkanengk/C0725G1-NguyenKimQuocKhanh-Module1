package ss10_DSA_list.thuc_hanh.basic_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myIntegerList = new MyList<>();
        myIntegerList.add(1);
        myIntegerList.add(2);
        myIntegerList.add(3);
        System.out.println(myIntegerList.get(0));
        System.out.println(myIntegerList.get(2));
    }
}
