import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interlmed.Avion;
import interlmed.Moto;
import interlmed.Yate;
import interlmed.Vehiculo;
public class App {
    public static void main(String[] args) throws Exception {

        Moto moto = new Moto("Rojo", " BMW ", "200CC", 2);
        Moto moto2 = new Moto();
        moto2.setColor(" Verde ");
        moto2.setMarca(" Yamaha ");
        moto2.setCombustible(" 187CC ");
        moto2.setNumeroRuedas(2);

        moto.rodar();
        System.out.println(moto.toString());
        System.out.println(moto2.toString());
        System.out.println("**************************************************************************************");
        Avion avion = new Avion(" Negro ", " Jet ", " 250 galones ", 3);
        Avion avion2 = new Avion();
        avion2.setColor("Azul");
        avion2.setMarca("Airbus");
        avion2.setCombustible("480 galones");
        avion2.setNumeroTurbinas(4);

        avion.Volar();
        System.out.println(avion.toString());
        System.out.println(avion2.toString());
        System.out.println("**************************************************************************************");
        Yate yate = new Yate("Blanco", "Benetti", "380 galones ", 2);
        Yate yate2 = new Yate();
        yate2.setColor("Morado");
        yate2.setMarca("Lürssen");
        yate2.setCombustible("823 galones ");
        yate2.setNumeroMotores(6);

        yate.Navegar();
        System.out.println(yate.toString());
        System.out.println(yate2.toString());
        System.out.println("**************************************************************************************");
  
        List<Vehiculo> ListaVehiculos = new  ArrayList<Vehiculo>();
        //CreateMoto();
        Vehiculo vehiculo1 = new Moto("Rojo", " BMW ", "200CC", 2);
        Vehiculo vehiculo2 = new Yate("Blanco", "Benetti", "380 galones ", 2);
       ListaVehiculos.add(vehiculo1);
       ListaVehiculos .add(vehiculo2);
       for (Vehiculo objeto : ListaVehiculos ) {
        System.out.println(objeto.toString());
        
       }
    }
    

    /**
     * 
     */
    public static  void CreateMoto(){

    
        Moto moto = new Moto();

        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la marca de la moto");
        moto.setMarca(dato.nextLine());
        System.out.println(moto.getMarca());
        System.out.println("Ingrese el color de la moto");
        moto.setColor(dato.nextLine());
        System.out.println(moto.getColor());
        System.out.println("Ingrese el combustible que lleva ");
        moto.setCombustible(dato.nextLine());
        System.out.println(moto.getCombustible());
        System.out.println("Ingrese el numero de ruedas ");
        moto.setNumeroRuedas(dato.nextInt());
        System.out.println(moto.getNumeroRuedas());
    }

}
