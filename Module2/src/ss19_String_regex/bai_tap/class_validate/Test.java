package ss19_String_regex.bai_tap.class_validate;

public class Test {
    private static final String[] validName = {"C0223G", "A0323K"};
    private static final String[] inValidName = {"M0318G", "P0323A"};

    public static void main(String[] args) {

        for (String name: validName){
            System.out.println(name+" is valid: "+ Validate.classNameValidate(name));
        }

        for (String name: inValidName){
            System.out.println(name+" is valid: "+ Validate.classNameValidate(name));
        }
    }


}
