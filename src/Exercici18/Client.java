package Exercici18;


public class Client {
    public static void main(String[] args) {
        Figure f = new Line(1,2);
        Interact i = ((Line) f).createInteract();
        System.out.println("X:" + ((LineInteract) i).line.x + "Y: " + ((LineInteract) i).line.y);
        i.move();
        System.out.println("X:" + ((LineInteract) i).line.x + "Y: " + ((LineInteract) i).line.y);
        }
    }

