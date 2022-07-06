public class Circle {
    double radius;
    simpleCircle(){
        radius = 1;
    }
    simpleCircle(double newradius){
        radius = newradius;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    void setRadius (double newRadius) {
        radius = newRadius;
    }
}
