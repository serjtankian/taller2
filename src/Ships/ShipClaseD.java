package Ships;


/**
 * ShipClaseD representa las funcionalidades y caracteristicas de una nave tripulada de mantenimiento de satelites. 
 * @author Sebastian Arias
 */

public class ShipClaseD extends Ship implements IMannedShip2{
    /**
     * atributos propios de la clase ShipClaseD
     */
  private boolean dock;
  private String satelite;
  /**
   * 
   * @param power potencia
   * @param speed velocidad
   * @param push empuje
   * @param weight peso
   * @param typeOfFuil tipo de combustible
   * @param mission mision 
   * @param dock booleano que representa al acomple entre naves
   * @param satelite satelite a reparar
   */
    public ShipClaseD(float power, float speed, float push, float weight, String typeOfFuil, String mission, boolean dock,String satelite) {
        super(power, speed, push, weight, typeOfFuil, mission);
     this.dock=dock;
     this.satelite=satelite;
    }
/**
 * Metodo abstracto heredado de la superClase Ship y sobrescrito.
 * Toma el valor actual de tipo de combustible, peso y capacidad de tripulacion y los concatena.
 */
    @Override
    public void propulsionSystem() {
    System.out.println("Potencia: "+getPower() +"\n"+ "Empuje: "+getPush()+"\n"+" Velocidad: "+getSpeed()+"\n"+"Combustible utilizado: "+getTypeOfFuil());
    }
/**
 * Metodo abstracto heredado de la superClase Ship y sobrescrito.
 * Retorna la mision actual de la nave
 */
    @Override
    public String getMission() {
   
        return mission;
    }
/**
 * Metodo abstracto implementado desde la interface IMannedShip2 y sobrescrito.
 * Toma el valor del satelite actual y lo concatena
 */
    @Override
    public void RepairAndMaintenance() {
        if(dock){
            System.out.println("Acomple y mantenimiento de "+getSatelite());
        }
        else{
            System.out.println("Esperando acomple exitoso...");
        }
       
    }
    /**
     * Metodo abstracto implementado desde la interface IMannedShip2 y sobrescrito.
     * Actualiza el estado actual del atributo de acomple
     */
    @Override
    public void dockWithOtherShips(boolean dock) {
    this.dock=dock;   
    }
/**
 * Retorna el estado actual del acomple
 * @return
 */
    public boolean getDock(){
        return dock;
    }
    /**
     * Actualiza el valor del satelite
     * @param satelite satelite a reparar
     */
    public void setSatelite(String satelite) {
        this.satelite = satelite;
    }
    /**
     * Retorna el satelite actual.
     * @return
     */
    public String getSatelite() {
        return satelite;
    }

}
