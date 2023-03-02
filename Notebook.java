import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor

public class Notebook {
    String model;
    Integer hardDiskVolume;
    Integer operMemory;
    String operSystem;
    Integer diagonal;
    Integer price;

    @Override
    public String toString() {
        return String.format("Model: %s\n" +
                "Hard disk volume: %d\n" +
                "Oper memory: %d\n" +
                "Oper system: %s\n" +
                "Diagonal: %d\n" +
                "Price: %d\n", model, hardDiskVolume, operMemory, operSystem, diagonal, price);
    }

    public static List getList() {
        Notebook n1 = new Notebook("Apple", 1024, 16, "MacOS", 16, 280000);
        Notebook n2 = new Notebook("Apple", 512, 32, "MacOS", 16, 260000);
        Notebook n3 = new Notebook("Apple", 256, 8, "MacOS", 13, 120000);
        Notebook n4 = new Notebook("Lenovo", 512, 16, "Windows", 15, 85000);
        Notebook n5 = new Notebook("MSI", 1024, 32, "Windows", 18, 120000);
        Notebook n6 = new Notebook("Asus", 256, 8, "Linux", 15, 45000);
        Notebook n7 = new Notebook("Lenovo", 512, 16, "Linux", 15, 85000);
        Notebook n8 = new Notebook("Asus", 512, 16, "Windows", 17, 85000);
        List<Notebook> notebookslist = new ArrayList<>();
        notebookslist.add(n1);
        notebookslist.add(n2);
        notebookslist.add(n3);
        notebookslist.add(n4);
        notebookslist.add(n5);
        notebookslist.add(n6);
        notebookslist.add(n7);
        notebookslist.add(n8);
        return notebookslist;
    }

}
