package Ships;

/**
 * Clase principal.
 * @author Sebastian Arias
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
   
/**
 * Se instancia el objeto Scanner para poder ingresar inputs dinamicamente.
 */
     Scanner read=new Scanner(System.in);
    
     
/**
 * Se introduce la condicion de corte en el ciclo while.
 */
      boolean exit=false;
      while (!exit) {

          /**
           * Menu de opciones
           */
        System.out.println("1. Crear Nave tripulada de mantenimiento de satélites");
        System.out.println("2. Crear Nave tripulada Explorer");
        System.out.println("3. Crear Nave no tripulada");
        System.out.println("4. Crear nave Lanzadera");
        System.out.println("5. Salir");
        try{
            System.out.println("Introduce un numero");
            int option=read.nextInt();
/**
 * Condicional switch case para seleccionar un caso por cada numero elegido.
 * Por cada caso se instancia una clase diferente con sus respectivos parametros.
 */
      switch (option) {

          case 1:
          System.out.println("ingrese potencia");
          float power= read.nextFloat();
          System.out.println("ingrese velocidad");
          float speed= read.nextFloat();
          System.out.println("ingrese empuje");
          float push= read.nextFloat();
          System.out.println("ingrese peso");
          float weight= read.nextFloat();
          System.out.println("ingrese tipo de combustible");
          String typeOfFuil4=read.nextLine();
          System.out.println("ingrese misión");
          String mission= read.nextLine();
          Boolean dock=read.nextBoolean();
          System.out.println("ingrese satélite a abordar");
          String satelite=read.nextLine();
          
          ShipClaseD claseD=new ShipClaseD(power, speed, push, weight, typeOfFuil4, mission, dock, satelite);
                    claseD.propulsionSystem();
              break;
          case 2:
          System.out.println("ingrese potencia");
          float power2= read.nextFloat();
          System.out.println("ingrese velocidad");
          float speed2= read.nextFloat();
          System.out.println("ingrese empuje");
          float push2= read.nextFloat();
          System.out.println("ingrese peso");
          float weight2= read.nextFloat();
          System.out.println("ingrese tipo de combustible");
          String typeOfFuil2=read.nextLine();
          System.out.println("ingrese misión");
          String mission2= read.nextLine();
          System.out.println("¿el módulo lunar está listo para aterrizar? true/false");
          Boolean lunarModuleReady=read.nextBoolean();
          System.out.println("capacidad para transportar tripulación");
          int crewCapacity=read.nextInt();
          ShipClaseB claseB=new ShipClaseB(power2, speed2, push2, weight2, typeOfFuil2, mission2, lunarModuleReady, crewCapacity);
                    
              break;

          case 3:
          System.out.println("ingrese potencia");
          float power1= read.nextFloat();
          System.out.println("ingrese velocidad");
          float speed1= read.nextFloat();
          System.out.println("ingrese empuje");
          float push1= read.nextFloat();
          System.out.println("ingrese peso");
          float weight1= read.nextFloat();
          System.out.println("tipo de combustible");
          String typeOfFuil=read.nextLine();
          System.out.println("ingrese misión");
          String mission1= read.nextLine();
          System.out.println("ingrese destinationPlanet");
          String destinationPlanet= read.nextLine();

          ShipClaseA claseA=new ShipClaseA(power1, speed1, push1, weight1,typeOfFuil, mission1, destinationPlanet);
              
              break;
          case 4: 
          System.out.println("ingrese power");
          float power3= read.nextFloat();
          System.out.println("ingrese speed");
          float speed3= read.nextFloat();
          System.out.println("ingrese push");
          float push3= read.nextFloat();
          System.out.println("ingrese weight");
          float weight3= read.nextFloat();
          System.out.println("ingrese tipo de combustible");
          String typeOfFuil3=read.nextLine();
          System.out.println("ingrese misión");
          String mission3= read.nextLine();
          System.out.println("altura maxima alcanzada");
          int maximumHeight=read.nextInt();

          ShipClaseC claseC=new ShipClaseC(power3, speed3, push3, weight3, typeOfFuil3, mission3, maximumHeight);
              break;

        case 5:
        /**
         * cuando se elige el caso 5 la condicion de corte se vuelve true y por lo tanto sale del ciclo while.
         */
              exit=true;
              break;
        default:
              System.out.println("Las opciones son entre 1-5");
              break;
      }
    }catch(InputMismatchException e){
        /**
         * Manejo de errores de input
         */
        System.out.println("Debes introducir un numero");
        /**
         * condicion para no entrar en ciclo infinito con la instancia del objeto Scanner.
         */
        read.next();
    }
      
    }
       
    }
}
