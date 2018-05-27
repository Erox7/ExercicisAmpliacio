package PrimerParcial1415.Exercici2;

public abstract class RecordsProcessor {
    private String loadNext(){
     return "";
    }
    private void save(String s){

    }

    public void ProcessRecords(){
        String next = loadNext();
        while(next != null){
            Record record = decode(next);
            transform(record);
            String processed = encode(record);
            save(processed);
            next = loadNext();
        }
    }
    protected abstract Record decode(String s);
    protected abstract String encode(Record r);
    protected abstract void transform(Record r);
}
