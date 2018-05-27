package PrimerParcial1314.Exercici2;

public class LowResFactory extends RepresentationAbstractFactory{
    @Override
    public Visualizer createVisualizer() {
        return new VisualizerLowRes();
    }

    @Override
    public Printer createPrinter() {
        return new PrinterLowRes();
    }
}
