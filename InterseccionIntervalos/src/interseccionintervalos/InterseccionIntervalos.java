package interseccionintervalos;

public class InterseccionIntervalos {

    public static boolean hayInterseccion(double a1, double a2, double b1, double b2) {
        return a2 >= b1 && b2 >= a1; 
    }
    
    public static void main(String[] args) {
    }
    

}
