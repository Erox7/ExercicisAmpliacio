package PrimerParcial1314.Exercici2;

public class HiResFactory extends RepresentationAbstractFactory{
    @Override
    public Visualizer createVisualizer() {
        return new VisualizerHiRes();
    }

    @Override
    public Printer createPrinter() {
        return new PrinterHiRes();
    }
}
