package parqueadero;

import java.util.Scanner;

public class Parqueadero extends Vehiculo {

    Scanner miScanner=new Scanner(System.in);
    private int[] misVehiculos = new int[100];
    Vehiculo a = new Vehiculo();
    int i;
    

    public void ingresarVehiculo() {

        for (int i = 0; i < 100; i++) {

            misVehiculos[i] = (int) a.getCilindraje();

        }

    }
    
    public int retirarVehiculo(){
        
        System.out.println("Ingrese cilindraje a retirar");
        int x = miScanner.nextInt();
        System.out.println("Ingrese hora de llegada");
        int z = miScanner.nextInt();
        System.out.println("Ingrese hora de salida");
        int y = miScanner.nextInt();
        
        int vp = (z-y)*100;
        
        return vp;
        
        
    }
    
    


}
