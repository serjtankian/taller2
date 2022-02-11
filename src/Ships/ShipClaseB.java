package Ships;

/**
 * ShipsClaseB representa las funcionalidades y caracteristicas de una nave tripulada de tipo exploradora.
 *  @author Sebastian Arias
 */
public class ShipClaseB extends Ship implements IMannedShip{
/**
 *  atributos propios de la clase ShipClaseB
 */
    
    private int crewCapacity;
    /**
     * Crea una nave recibiendo por parametro sus caracteristicas.
     * @param power  potencia
     * @param speed velocidad
     * @param push  empuje
     * @param weight peso
     * @param typeOfFuil tipo de combustible
     * @param mission mision
     * @param crewCapacity capacidad de tripulantes de la nave
     */
    public ShipClaseB(float power, float speed, float push, float weight, String typeOfFuil, String mission,int crewCapacity) {
        /**
         * atributos ya inicializados en la clase padre.
         */
        super(power, speed, push, weight, typeOfFuil, mission);
        /**
         * inicializacion de los atributos propios de la clase
         */
    
        this.crewCapacity=crewCapacity;
    }
   /**
   * Metodo abstracto heredado de la superClase Ship y sobrescrito.
   * Toma el valor actual de tipo de combustible, peso y capacidad de tripulacion y los concatena.
   */
    @Override
    public void propulsionSystem() {
       System.out.println("Maniobra de arrivo con propulsion de cohetes utilizando "+getTypeOfFuil()+" y transportando una unidad de "+getweight()+" con capacidad para una tripulacion de "+getCrewCapacity()+" miembros.");
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
    * Metodo abstracto implementado desde la interface IMannedShip y sobrescrito.
    * Toma el valor actual del booleano lunarModuleReady y realiza un condicional.
    */
    @Override
    public void approachToLunarOrbit() {
            System.out.println("Iniciar arrivo de superficie lunar");
     }
    /**
    * Sobrecarga del metodo.
    * @param distanceKm variable numerica introducida por parametro.
    */
    public void approachToLunarOrbit(float distanceKm){
         System.out.println("La nave se encuentra a "+distanceKm+" km de la orbita lunar");
     }
    /**
    * Metodo abstracto implementado desde la interface IMannedShip y sobrescrito.
    * Toma los valores actuales de mision y lunarModuleReady y realiza un condicional.
    */
    @Override
    public void lunarSurfaceLanding() {
          System.out.println("Procediendo con la mision: "+getMission());
    }
    
    /**
     * Actualiza el valor de la tripulacion.
     * @param crewCapacity cantidad de miembros de la tripulacion
     */
    public void setCrewCapacity(int crewCapacity) {
        this.crewCapacity = crewCapacity;
    }
    /**
     * Retorna la cantidad actual de la tripulacion.
     * @return
     */
    public int getCrewCapacity() {
        return crewCapacity;
    }
    }

