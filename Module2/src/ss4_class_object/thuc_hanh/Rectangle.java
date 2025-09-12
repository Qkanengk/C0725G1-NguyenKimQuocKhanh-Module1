package ss4_class_object.thuc_hanh;

class Rectangle {
    double height=10;
    double width=5;
    Rectangle(){

    }
    Rectangle(double height,double width){
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return this.height*this.width;
    }

    public double getPerimeter(){
        return (this.height+this.width)*2;
    }

    public void display(){
        System.out.println("chieu dai: "+this.height);
        System.out.println("Chieu rong: "+this.width);
        System.out.println("Chu vi: "+this.getPerimeter());
        System.out.println("Dien tich: "+this.getArea());
    }

    public static void main(String[] args) {
        Rectangle newR = new Rectangle();
        newR.display();;
    }

}

