package Recuperacio1617_Patrons;

public class MeanLength extends SequenceProcessor<String> {
    private int totalLength = 0;
    private int counter = 0;
    @Override
    protected void processElement(String element) {
        counter+=1;
        totalLength += element.length();
    }

    public double getMeanLenght() {
        return totalLength/counter;
    }
}
