import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> criteriaMap = Criteria.getCriteria();
        System.out.println("Welcome to online notebooks store. Possible filter options are listed below.");

        for (Map.Entry<Integer, String> entry : criteriaMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        getResult();
    }

    public static Map getUserChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of filter criteria. To stop entry enter 0.");

        Map<Integer, Integer> userFilter = new HashMap<>();
        Map<Integer, String> models = Criteria.modelsMap();
        Map<Integer, String> operSystem = Criteria.operSystemMap();

        Integer criteria = -1;
        do {
            System.out.print("Enter criterion number: ");
            criteria = sc.nextInt();
            if (criteria == 1) {
                System.out.print("Enter a model: ");
                System.out.println(models);
                Integer criteria1 = sc.nextInt();
                userFilter.putIfAbsent(criteria, criteria1);
            } else if (criteria == 2) {
                System.out.print("Enter hard disk volume (without 'Gb'): ");
                System.out.println(Criteria.hardDiskVolumeList());
                Integer criteria2 = sc.nextInt();
                userFilter.putIfAbsent(criteria, criteria2);
            } else if (criteria == 3) {
                System.out.print("Enter operation memory (without 'Gb'): ");
                System.out.println(Criteria.operMemoryList());
                Integer criteria3 = sc.nextInt();
                userFilter.putIfAbsent(criteria, criteria3);
            } else if (criteria == 4) {
                System.out.print("Enter operation system: ");
                System.out.println(operSystem);
                Integer criteria4 = sc.nextInt();
                userFilter.put(criteria, criteria4);
            } else if (criteria == 5) {
                System.out.print("Enter diagonal value (without 'inches'): ");
                System.out.println(Criteria.diagonalList());
                Integer criteria5 = sc.nextInt();
                userFilter.put(criteria, criteria5);
            } else if (criteria == 6) {
                System.out.print("Enter maximum price (without 'rub'): ");
                System.out.println(Criteria.priceList());
                Integer criteria6 = sc.nextInt();
                userFilter.put(criteria, criteria6);
            } else {
                if (criteria != 0) {
                    System.out.println("Wrong value, try again");
                }
            }
        } while (criteria != 0);
        sc.close();
        return userFilter;
    }

    public static void getResult() {
        List<Notebook> computersList = Notebook.getList();
        Map<Integer, Integer> userChoiceMap = getUserChoice();
        Integer count = 0;
        for (int i = 0; i < computersList.size(); i++) {
            Map<Integer, Integer> notebook = new HashMap<>();
            if (computersList.get(i).getModel().equals(Criteria.modelsMap().get(1))) {
                notebook.put(1, 1);
            } else if (computersList.get(i).getModel().equals(Criteria.modelsMap().get(2))) {
                notebook.put(1, 2);
            } else if (computersList.get(i).getModel().equals(Criteria.modelsMap().get(3))) {
                notebook.put(1, 3);
            } else
                notebook.put(1, 4);

            notebook.put(2, computersList.get(i).getHardDiskVolume());
            notebook.put(3, computersList.get(i).getOperMemory());

            if (computersList.get(i).getOperSystem().equals(Criteria.operSystemMap().get(1))) {
                notebook.put(4, 1);
            } else if (computersList.get(i).getOperSystem().equals(Criteria.operSystemMap().get(2))) {
                notebook.put(4, 2);
            } else
                notebook.put(4, 3);

            notebook.put(5, computersList.get(i).getDiagonal());
            notebook.put(6, computersList.get(i).getPrice());

            Map<Integer, Integer> result = new HashMap(notebook);
            result.entrySet().retainAll(userChoiceMap.entrySet());
            if (result.size() == userChoiceMap.size()) {
                System.out.println();
                System.out.println(computersList.get(i));
            } else
                count--;
        }

        if (count <= -8)
            System.out.println("\nNo notebooks found according to the criteria");
    }

}
