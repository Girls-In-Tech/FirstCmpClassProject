package physics;

public class Formula extends Physics{

    void accessingGravity(){
        System.out.println(getGravity());
        setGravity(9.98f);
        System.out.println(getGravity());
    }
    float potentialEnergy(float mass, float height, float gravity){
        return multiply(mass, height, gravity);
    }

    float kineticEnergy(float mass, float velocity){
        return divide(1,2) * multiply(mass, powTwo(velocity));
    }
    
    float gravitationalForce(float mass, float gravity){
        return multiply(mass, gravity)
    }
    
    float Force(float mass, float acceleration){
        return multiply(mass, acceleration)
    }
    
}
