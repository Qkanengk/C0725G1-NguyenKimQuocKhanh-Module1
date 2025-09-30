package ss19_String_regex.bai_tap.class_validate;

public class Validate {
    public static boolean classNameValidate(String className){
        return className.matches("^[CAP][0-9]{4}[GHIK]$");
    }
}
