package semana4;

public class calculator {
    public int sumar (int numA, int numB) {
    return numA + numB;
}
    public int sumar (int numA, int numB, int numbC) {
    return numA + numB + numbC;
}



    public static void main(String[] args) {
        calculator cal = new calculator();
        System.out.println("suma de 2 a 4: "+ cal.sumar (2,4));
        System.out.println("suma de 2, 4 y 6: "+ cal.sumar (2,4,6 ));
    }

    
}