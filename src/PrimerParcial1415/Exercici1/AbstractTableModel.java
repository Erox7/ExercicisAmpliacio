package PrimerParcial1415.Exercici1;

public abstract class AbstractTableModel implements TableModel{
    public abstract int getRowCount();
    public abstract int getColumnCount();
    public abstract Object getValueAt(int i, int s);

}
