import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class Criteria {
    public static Map getCriteria() {
        Map<Integer, String> mapCriteria = new HashMap<>();
        mapCriteria.put(1, "Model");
        mapCriteria.put(2, "Hard disk volume");
        mapCriteria.put(3, "Operation memory");
        mapCriteria.put(4, "Operation system");
        mapCriteria.put(5, "Diagonal");
        mapCriteria.put(6, "Price");

        return mapCriteria;
    }

    public static Map modelsMap() {
        Map<Integer, String> modelsMap = new HashMap<>();
        modelsMap.put(1, "Apple");
        modelsMap.put(2, "Asus");
        modelsMap.put(3, "MSI");
        modelsMap.put(4, "Lenovo");
        return modelsMap;
    }

    public static Map operSystemMap() {
        Map<Integer, String> operSystemMap = new HashMap<>();
        operSystemMap.put(1, "MacOS");
        operSystemMap.put(2, "Windows");
        operSystemMap.put(3, "Linux");
        return operSystemMap;
    }

    public static List hardDiskVolumeList() {
        ArrayList<String> hardDiskVolumeList = new ArrayList<>(Arrays.asList("256 Gb", "512 Gb", "1024 Gb"));
        return hardDiskVolumeList;
    }

    public static List operMemoryList() {
        ArrayList<String> operMemoryList = new ArrayList<>(Arrays.asList("8 Gb", "16 Gb", "32 Gb"));
        return operMemoryList;
    }

    public static List diagonalList() {
        ArrayList<String> diagonalList = new ArrayList<>(
                Arrays.asList("13 inches", "15 inches", "16 inches", "17 inches", "18 inches"));
        return diagonalList;
    }

    public static List priceList() {
        ArrayList<String> priceList = new ArrayList<>(
                Arrays.asList("45 000 rub", "85 000 rub", "120 000 rub", "260 000 rub", "280 000 rub"));
        return priceList;
    }
}
