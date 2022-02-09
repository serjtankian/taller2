package Ships;

/**
 * ShipClaseA representa las funcionalidades y caracteristicas de una nave no tripulada.
 * @author Sebastian Arias
 */
public class ShipClaseA extends Ship implements IUnmannedShip  {
    private String destinationPlanet;
    /**
     * Crea una nave recibiendo como parametros sus caracteristicas.
     * @param power potencia 
     * @param speed velocidad 
     * @param push  empuje 
     * @param weight peso 
     * @param mission mision 
     * @param destinationPlanet planeta de destino de la nave
     */
    public ShipClaseA(float power, float speed, float push, float weight,String typeOfFuil, String mission, String destinationPlanet) {
        super(power, speed, push, weight,typeOfFuil , mission);
        this.destinationPlanet=destinationPlanet;

    }
/**
 * Metodo abstracto heredado de la superClase Ship y sobrescrito.
 * Toma el valor actual de velocidad y lo concatena
 */
    @Override
    public void propulsionSystem() {
      System.out.println("Mediante celulas fotovoltaicas se desplaza a una velocidad de "+getSpeed()+" km/h.");
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
 * Metodo abstracto implementado desde la interface IUnmannedShip ysobrescrito.
 * Toma el valor actual de planeta de destino y lo concatena
 */
    @Override
    public void deployOffRoadExplorer() {
      System.out.println("Despliegue de Todoterreno en la superficie de "+getDestinationPlanet()+" para tomar muestras de rocas.");
        
    }
/**
 * Metodo abstracto implementado desde la interface IUnmannedShip y sobrescrito.
 * Toma el valor actual de planeta de destino y lo concatena 
 */
    @Override
    public void approachToPlanetOrbit() {
     System.out.println(" Aproximarse a la orbita de "+getDestinationPlanet()+" para investigacion .");
        
    }
    /**
     * Actualiza el valor de planeta de destino.
     * @param destinationPlanet valor de planeta de destino
     */
public void setDestinationPlanet(String destinationPlanet) {
    this.destinationPlanet = destinationPlanet;
}
/**
 * Retorna el valor actual de planeta de destino.
 * @return
 */
public String getDestinationPlanet() {
    return destinationPlanet;
}
  
}
