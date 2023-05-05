package physics;

public class Physics {

  private float gravity = 9.98f;

  public float getGravity() {
    return gravity;
  }

  public void setGravity(float gravity) {
    this.gravity = gravity;
  }

  float multiply(float numberOne, float numberTwo) {
    return numberOne * numberTwo;
  }

  float divide(float numberOne, float numberTwo) {
    return numberOne / numberTwo;
  }
  
  float add(float numberOne, float numberTwo) {
    return numberOne + numberTwo;
  }

  float powTwo(float number) {
    return number * number;
  }
}
