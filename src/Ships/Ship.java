
package Ships;

/**SuperClase abstracta de donde se heredan las funcionalidades y caracteristicas comunes a todas la naves.
 * @author Sebastian Arias
 */
public abstract class Ship {
    
    private float power;
    private float speed;
    private float push;
    private float weight;
    private String typeOfFuil;
    protected String mission;
    /**
     * Recibe las caracteristicas de una nave tipo.
     * @param power Potencia de la nave
     * @param speed Velocidad de la nave
     * @param push  Empuje de la nave
     * @param weight  Peso de la nave  
     * @param typeOfFuil Tipo de combustible que utiliza
     * @param mission La mision que efectua la nave
     */
   public Ship (float power, float speed,float push, float weight, String typeOfFuil,String mission ){
    this.power=power;
    this.speed=speed;
    this.push=push;
    this.weight=weight;
    this.typeOfFuil=typeOfFuil;
    this.mission=mission;

   }
/**
 * Actualiza el valor de la potencia.
 * @param power Potencia de la nave
 */
    public void setPower(float power) {
        this.power = power;
    }
  /**
   * Retorna el valor actual de la potencia.
   * @return 
   */
    public float getPower() {
        return power;
    }
    /**
     * Retorna el valor actual de la velocidad.
     * @return 
     */
    public float getSpeed() {
        return speed;
    }
    /**
     * Actualiza el valor de la velocidad.
     * @param speed velocidad de la nave
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }
    /**
     * Retorna el valor actual del peso de la nave.
     * @return 
     */
    public float getweight() {
        return weight;
    }
    /**
     * Actualiza el valor del peso de la nave.
     * @param weight peso de la nave
     */
    public void setweight(float weight) {
        this.weight = weight;
    }
    /**
     * Retorna el valor actual del Empuje de la nave.
     * @return 
     */
    public float getPush() {
        return push;
    }
    /**
     * Actualiza el valor actual del Empuje de la nave.
     * @param push valor del empuje de la nave
     */
    public void setPush(float push) {
        this.push = push;
    }
    /**
     * Actualiza el valor actual del tipo de combustible de la nave.
     * @param typeOfFuil valor del tipo de combustible
     */
    public void setTypeOfFuil(String typeOfFuil) {
        this.typeOfFuil = typeOfFuil;
    }
    /**
     * Retorna el valor actual del tipo de combustible de la nave.
     * @return
     */
    public String getTypeOfFuil() {
        return typeOfFuil;
    }
  
    /**
     * Metodo abstracto a ser sobrescrito en las clases hijas.
     * @return
     */
   public abstract String getMission( );
   
   /**
    * Metodo abstracto a ser sobreescrito en las clases hijas.
    */
   public abstract void propulsionSystem();
}
