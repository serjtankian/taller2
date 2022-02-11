package Ships;

/**
 * Clase principal.
 * @author Sebastian Arias
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
   
try (/**
     * Se instancia el objeto Scanner para poder ingresar inputs dinamicamente.
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    Scanner read = new Scanner(System.in)) {
        /**
         * Se introduce la condicion de corte en el ciclo while.
         */
         float power=0;
         float speed=0;
         float push=0;
         float weight=0;
         String typeOfFuil="";
         String mission="";



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
                  power= read.nextFloat();
                  System.out.println("ingrese velocidad");
                  speed= read.nextFloat();
                  System.out.println("ingrese empuje");
                  push= read.nextFloat();
                  System.out.println("ingrese peso");
                  weight= read.nextFloat();
                  System.out.println("tipo de combustible");
                  typeOfFuil=br.readLine();
                  System.out.println("ingrese misión");
                  mission= read.nextLine();
                  System.out.println("ingrese f o v");
                  Boolean dock=read.nextBoolean();
                  System.out.println("ingrese satélite a abordar");
                  String satelite=read.nextLine();
                  ShipClaseD claseD=new ShipClaseD(power, speed, push, weight,typeOfFuil, mission, dock, satelite);
                             claseD.RepairAndMaintenance();
    
                      break;
                  case 2:
                  System.out.println("ingrese potencia");
                  power= read.nextFloat();
                  System.out.println("ingrese velocidad");
                  speed= read.nextFloat();
                  System.out.println("ingrese empuje");
                  push= read.nextFloat();
                  System.out.println("ingrese peso");
                  weight= read.nextFloat();
                  System.out.println("ingrese tipo de combustible");
                  typeOfFuil=br.readLine();
                  System.out.println("ingrese misión");
                  mission= br.readLine();
                  System.out.println("¿el módulo lunar está listo para aterrizar? true/false");
                  Boolean lunarModuleReady=read.nextBoolean();
                  System.out.println("capacidad para transportar tripulación");
                  int crewCapacity=read.nextInt();
                  ShipClaseB claseB=new ShipClaseB(power, speed, push, weight, typeOfFuil, mission, lunarModuleReady, crewCapacity);
                            claseB.approachToLunarOrbit();
                            claseB.lunarSurfaceLanding();
                      break;
        
                  case 3:
                  System.out.println("ingrese potencia");
                  power= read.nextFloat();
                  System.out.println("ingrese velocidad");
                  speed= read.nextFloat();
                  System.out.println("ingrese empuje");
                  push= read.nextFloat();
                  System.out.println("ingrese peso");
                  weight= read.nextFloat();
                  System.out.println("tipo de combustible");
                  typeOfFuil=br.readLine();
                  System.out.println("ingrese misión");
                  mission= read.nextLine();
                  System.out.println("ingrese destinationPlanet");
                  String destinationPlanet= read.nextLine();
        
                  ShipClaseA claseA=new ShipClaseA(power, speed, push, weight,typeOfFuil, mission, destinationPlanet);
                      
                      break;
                  case 4: 
                  System.out.println("ingrese power");
                  power= read.nextFloat();
                  System.out.println("ingrese speed");
                  speed= read.nextFloat();
                  System.out.println("ingrese push");
                  push= read.nextFloat();
                  System.out.println("ingrese weight");
                  weight= read.nextFloat();
                  System.out.println("ingrese tipo de combustible");
                  typeOfFuil=read.nextLine();
                  System.out.println("ingrese misión");
                  mission= read.nextLine();
                  System.out.println("altura maxima alcanzada");
                  int maximumHeight=read.nextInt();
        
                  ShipClaseC claseC=new ShipClaseC(power, speed, push, weight, typeOfFuil, mission, maximumHeight);
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
                read.close();
                br.close();
            }
              
            }
    }
       
    }
}
