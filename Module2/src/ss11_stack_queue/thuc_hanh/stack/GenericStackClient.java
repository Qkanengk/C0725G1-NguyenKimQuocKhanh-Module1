package ss11_stack_queue.thuc_hanh.stack;

public class GenericStackClient {
    private static void stackOfStrings() {
        MyGenericStack<String> stackOfStrings = new MyGenericStack<>();
        stackOfStrings.push("one");
        stackOfStrings.push("two");
        stackOfStrings.push("three");
        stackOfStrings.push("four");
        stackOfStrings.push("five");
        System.out.println("Size of stack of Strings after push = " + stackOfStrings.size());
        while (!stackOfStrings.isEmty()) {
            stackOfStrings.pop();
            System.out.println("Popped!");
        }
        System.out.println("Size of stack of Strings after pop = " + stackOfStrings.size());

    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stackOfIntegers = new MyGenericStack<>();
        stackOfIntegers.push(1);
        stackOfIntegers.push(1);
        stackOfIntegers.push(3);
        stackOfIntegers.push(4);
        stackOfIntegers.push(5);
        System.out.println("Size of stack of Strings after push = " + stackOfIntegers.size());
        while (!stackOfIntegers.isEmty()) {
            stackOfIntegers.pop();
            System.out.println("Popped!");
        }
        System.out.println("Size of stack of Integers after pop = " + stackOfIntegers.size());

    }

    public static void main(String[] args) {
        System.out.println("1. Stack of Strings");
        stackOfStrings();
        System.out.println("\n2. Stack of integers");
        stackOfIntegers();
    }
}
