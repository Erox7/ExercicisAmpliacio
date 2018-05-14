package Exercici18;

public class LineInteract extends Interact {
    public Line line;

    public LineInteract(Line line) {
        this.line = line;
    }

    @Override
    public void drop() {

    }

    @Override
    public void move() {
        this.line.x += 1;
        this.line.y += 2;
    }

    @Override
    public void scale() {

    }
}
