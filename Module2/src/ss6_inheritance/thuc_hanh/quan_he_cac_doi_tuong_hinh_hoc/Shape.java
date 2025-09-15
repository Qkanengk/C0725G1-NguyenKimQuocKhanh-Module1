package ss6_inheritance.thuc_hanh.quan_he_cac_doi_tuong_hinh_hoc;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    Shape() {

    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        if (isFilled()) {
            return "A Shape with color of " + getColor() + " and filled";
        }else return "A Shape with color of " + getColor() + " and not filled";
    }
}
