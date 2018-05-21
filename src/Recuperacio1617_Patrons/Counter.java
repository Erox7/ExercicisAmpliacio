package Recuperacio1617_Patrons;

public class Counter extends SequenceProcessor<String> {
    private int nElements;
    @Override
    protected void processElement(String element) {
        nElements += 1;
    }

    public int getnElements(){
        return nElements;
    }
}
