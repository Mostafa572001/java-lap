package inheritance_cir_cly;

public class Circle {

    protected int rad;

//    public Circle(int rad) {
//        this.rad = rad;
//    }
    

    public void setRad(int rad) {
        this.rad = rad;
    }

    public double Area() {
        return rad * rad * 3.14;
    }

}
