package Ships;
/**
 * ShipClaseC representa las funcionalidades y caracteristicas de una nave lanzadera.
 * @author Sebastian Arias
 */
public class ShipClaseC extends Ship implements ISpaceShuttle{
    /**
     * atributo propio de la clase.
     */
    protected int maximumHeight;
    /**
     * 
     * @param power potencia
     * @param speed velocidad
     * @param push empuje
     * @param weight peso
     * @param typeOfFuil tipo de combustible
     * @param mission mision
     * @param maximumHeight altura maxima alcanzada
     */
    public ShipClaseC(float power, float speed, float push, float weight, String typeOfFuil, String mission, int maximumHeight) {
        /**
         * atributos ya inicializados en la superClase.
         */
        super(power, speed, push, weight, typeOfFuil, mission);
        /**
         * inicializacion del atributo propio de la clase.
         */
        this.maximumHeight=maximumHeight;
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
   * Metodo abstracto heredado de la superClase Ship y sobrescrito.
   * Toma el valor actual de tipo de combustible, peso y capacidad de tripulacion y los concatena.
   */
    @Override
    public void propulsionSystem() {
      System.out.println("Sistema de combustion con "+getTypeOfFuil()+" y propulsión electromagnetica, alcanzando una potencia de "+getPower()+" caballos de fuerza");
    }
   /**
   * Metodo abstracto implementado desde la interface ISpaceShuttle y sobrescrito.
   * Toma el valor actual de la velocidad y lo concatena.
   */
    @Override
    public void propulsionOutEarth() {
        System.out.println("La lanzadera autopropulsada  transporta al satelite hacia el espacio a una velocidad de "+getSpeed()+ " km/h.");
        
    }
    public void propulsionOutEarth(String satelite){
    System.out.println("La lanzadera cruzará la atmosfera a una velocidad de "+getSpeed()+" alcanzando una altura maxima de "+getMaximumHeight()+" y transportando el satelite "+satelite);
    }
   /**
   * Metodo abstracto implementado desde la interface ISpaceShuttle y sobrescrito.
   * Toma el valor actual del peso de la nave y lo concatena.
   */
    @Override
    public void disassembleInSpace() {
        System.out.println("Al atravezar la atmosfera se desemsambla dejando libre al artefacto para que comience su misión. Luego vuelve a caer a la atmosfera con un peso de "+getweight()+" toneladas.");
    }
   /**
   * Actualiza el valor de la altura maxima.
   * @param maximumHeight valor de la altura maxima alcanzada
   */
    public void setMaximumHeight(int maximumHeight) {
        this.maximumHeight = maximumHeight;
    }
    /**
     * Retorna el valor actual de la altura maxima
     * @return
     */
    public int getMaximumHeight() {
        return maximumHeight;
    }

}
