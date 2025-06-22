class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        this.table1 = t1;
        this.table2 = t2;
    }

    public boolean canSeat(int numPeople) {
        return (table1.getNumSeats() + table2.getNumSeats()) >= numPeople;
    }

    public double getDesirability() {
        double avgDesirability = (table1.getDesirability() + table2.getDesirability()) / 2.0;

        if (table1.getHeight() == table2.getHeight()) {
            return avgDesirability;
        } else {
            return avgDesirability - 10.0;
        }
    }
}

class Table {
    private String name;
    private int height;
    private ArrayList<CombinedTable> CombinedTables;

    public Table(String name, int id) {
        this.name = name;
        this.height = height;
        CombinedTables = new ArrayList<>();
    }

    public void addCombinedTable(CombinedTable CombinedTable) {
        CombinedTables.add(CombinedTable);
    }

    public void removeCombinedTable(CombinedTable CombinedTable) {
        CombinedTables.remove(CombinedTable);
    }
    public int getNumSeats(CombinedTable CombinedTable) {
        return CombinedTable.getNumSeats();
    }
    public int getHeight(int height){
        return height;
    }
    public double getViewQuality(){
        return viewQuality;
    }
    public void setViewQuality (double value){
        this.value = value;
    }

}

public class Main {
    public static void main(String[] args) {
        Table table = new Table("c1", 4);
        table.addCombinedTable(new CombinedTable("Math", 3));
        table.addCombinedTable(new CombinedTable("Science", 4));
        System.out.println(table.getTranscript());
        
    }
}
