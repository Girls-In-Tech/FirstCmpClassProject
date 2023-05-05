package physics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PHYMain {
    public static void main(String[] args) {
        Formula formula = new Formula();
        Formula.accessingGravity();

        Scanner input = new Scanner(System.in);
        try{
            float mass = input.nextFloat();
            float height = input.nextFloat();
            float velocity = input.nextFloat();
            float acceleration = input.nextFloat();

            System.out.println(formula.potentialEnergy(mass, height, gravity));
        }catch (InputMismatchException ime){
            System.out.println("Enter a valid number");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
