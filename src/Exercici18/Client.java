package Exercici18;

// https://sophia.javeriana.edu.co/~lcdiaz/ADOO2006-3/GoF_FactoryMethod.pdf
public class Client {
    public static void main(String[] args) {
        Figure f = new Line(1,2);
        Interact i = ((Line) f).createInteract();
        System.out.println("X:" + ((LineInteract) i).line.x + "Y: " + ((LineInteract) i).line.y);
        i.move();
        System.out.println("X:" + ((LineInteract) i).line.x + "Y: " + ((LineInteract) i).line.y);
        }
    }

