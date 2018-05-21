package Recuperacio1617_Patrons;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

public class LinesIterator implements Iterator<String> {
    BufferedReader br;

    public LinesIterator(BufferedReader br){
        this.br = br;
    }

    @Override
    public boolean hasNext() {
        return br.readLine() != null;
    }

    @Override
    public String next() {
        return br.readLine();
    }

    @Override
    public void remove() throws UnsupportedOperationException{
    }
}
