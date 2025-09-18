package semana4.unidad2;
public class car {
    String brand;
    int year;
    public car ( String brand,int year){
        this.brand =brand;
        this.year = year;
    }
    
    public void ShowInfo(){
        System.out.println("La marca es: " + brand + " El año del auto es: " + year);
    }
}