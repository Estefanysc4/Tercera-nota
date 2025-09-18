package semana4.unidad2.pasoporreferencia;

public class Main {
    public static void ChangeBox(Box newBox){
        newBox.size = 20;
    }
    public static void main(String[] args) {
        Box box = new Box(50);
        System.out.println(box.size);
        ChangeBox(box);
        System.out.println(box.size);
    }
}