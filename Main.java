import java.util.ArrayList;

class SingleTable {
    private int number_of_seats;
    private double desirability;
    private int height;

    public SingleTable(int number_of_seats, double desirability, int height) {
        this.number_of_seats = number_of_seats;
        this.desirability = desirability;
        this.height = height;
    }
    public int getNumber_of_seats() {
        return number_of_seats;
    }
    public double getDesirability() {
        return desirability;
    }
    public int getHeight() {
        return height;
    }
}
class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        this.table1 = t1;
        this.table2 = t2;
    }

    public boolean canSeat(int numPeople) {
        return (table1.getNumber_of_seats() + table2.getNumber_of_seats()) >= numPeople;
    }

    public double getDesirability() {
        double avgDesirability = (table1.getDesirability() + table2.getDesirability()) / 2.0;

        if (table1.getHeight() == table2.getHeight()) {
            return avgDesirability;
        } else {
            return avgDesirability - 10.0;
        }
    }
    public int getNumber_of_seats(){
        return table1.getNumber_of_seats() + table2.getNumber_of_seats();
    }
}

class Table {
    private String name;
    private int height;
    private ArrayList<CombinedTable> combinedTables;

    public Table(String name, int height) {
        this.name = name;
        this.height = height;
        this.combinedTables = new ArrayList<>();
    }

    public void addCombinedTables(CombinedTable combinedTables) {
        combinedTables.add(combinedTables);
    }

    public void removeCombinedTables(CombinedTables combinedTables) {
        combinedTables.remove(combinedTables);
    }
    public int getNumSeats(CombinedTables CombinedTables) {
        return CombinedTables.getNumber_of_seats();
    }
    public int getHeight(int height){
        return height;
    }
    public double getViewQuality(){
        return viewQuality;
    }
    public void setViewQuality (double value){
        this.viewQuality = value;
    }
    public String get_Transcript(){
        StringBuilder sb = new StringBuilder();
        sb.append("Table: ").append(name).append("\n");
        sb.append("Height: ").append(height).append("\n");
        sb.append("View Quality: ").append(viewQuality).append("\n");
        sb.append("Combined table").append(CombinedTables.size()).append("\n");
        for (int i = 0; i < CombinedTables.size(); i++) {
            CombinedTables ct = CombinedTables.get(i);
            sb.append(" [").append(i + 1).append("] Seats: ").append(ct.getNumber_of_seats()).append(", Desirability: ").append(ct.getDesirability()).append("\n");
        }
        return sb.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        SingleTable t1 = new SingleTable(4, 8.5, 5);
        SingleTable t2 = new SingleTable(2, 9.5, 4);
        CombinedTables ct1 = new CombinedTables(t1, t2);
        Table table = new Table("Table 1", 450);
        table.setViewQuality(9.5);
        table.addCombinedTables(ct1);
        System.out.println(table.get_Transcript());
    }
}
