package PrimerParcial1314.Exercici2;

public class Controller {
    private Resolution res;
    private Document document;

    public void visualize(){
        Visualizer v;
        if(res.res.equals("HiRes")){
            v = new HiResFactory().createVisualizer();
        }else{
            v =  new LowResFactory().createVisualizer();
        }
        v.visualize(this.document);
    }
}
