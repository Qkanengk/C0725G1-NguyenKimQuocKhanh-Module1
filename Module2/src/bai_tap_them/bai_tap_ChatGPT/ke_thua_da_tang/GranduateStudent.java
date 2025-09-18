package bai_tap_them.bai_tap_ChatGPT.ke_thua_da_tang;

public class GranduateStudent extends Student{
    private String theSisTitle = "Non-title";

    public GranduateStudent() {
    }

    public GranduateStudent(String name, int age, String studentId,String theSisTitle) {
        super(name, age, studentId);
        this.theSisTitle = theSisTitle;
    }

    public String getTheSisTitle() {
        return theSisTitle;
    }

    public void setTheSisTitle(String theSisTitle) {
        this.theSisTitle = theSisTitle;
    }
}
