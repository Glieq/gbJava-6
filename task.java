import java.util.ArrayList;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<notebooks> notebooksList = new ArrayList<>();
        notebooks notebook1 = new notebooks("ASUS", "gamepro", 40000, 16, true);
        notebooks notebook2 = new notebooks("MSI", "OfficeWork", 20000, 8, true);
        notebooks notebook3 = new notebooks("Huawei", "MateBook-15", 55000, 32, false);
        notebooksList.add(notebook1);
        notebooksList.add(notebook2);
        notebooksList.add(notebook3);
        System.out.println("Введите минимальный объём оперативной памяти: ");
        int filter = scanner.nextInt();
        for (notebooks eachNotebook : notebooksList) {
            eachNotebook.filterInfo(filter);
        }

        scanner.close();
    }
}
