package PrimerParcial1415.Exercici1;

public class TableModelGroupAdapter extends AbstractTableModel{
    Group g;

    public TableModelGroupAdapter(Group g){
        this.g = g;
    }

    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount() {
        return g.numStudents();
    }

    @Override
    public Object getValueAt(int i, int s) {
        return g.getStudent(s);
    }
}
