package Final_exersize_java;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FilterNotebook {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();

        // Создаем и добавляем ноутбуки в множество
        notebooks.add(new Notebook(16, 1000, "Windows 10", "Черный"));
        notebooks.add(new Notebook(8, 500, "macOS", "Серебристый"));
        notebooks.add(new Notebook(12, 2000, "Windows 10", "Красный"));
        notebooks.add(new Notebook(32, 1000, "Ubuntu", "Черный"));

        // Запрашиваем критерий фильтрации
        System.out.println("Введите цифру, соответствующую критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем Жёсткого диска");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        Scanner scanner = new Scanner(System.in);
        int criterion = scanner.nextInt();

        // Запрашиваем минимальное значение для выбранного критерия
        System.out.println("Введите минимальное значение для выбранного критерия:");
        int minValue = scanner.nextInt();

        // Фильтруем ноутбуки по выбранному критерию и минимальному значению
        Set<Notebook> filteredNotebooks = new HashSet<>();
        for (Notebook laptop : notebooks) {
            switch (criterion) {
                case 1:
                    if (laptop.getRam() >= minValue) {
                        filteredNotebooks.add(laptop);
                    }
                    break;
                case 2:
                    if (laptop.getStorage() >= minValue) {
                        filteredNotebooks.add(laptop);
                    }
                    break;
                case 3:
                    if (laptop.getOs().equals(getOsChoice(minValue))) {
                        filteredNotebooks.add(laptop);
                    }
                    break;
                case 4:
                    if (laptop.getColor().equals(getColorChoice(minValue))) {
                        filteredNotebooks.add(laptop);
                    }
                    break;
            }
        }

        // Выводим отфильтрованные ноутбуки
        System.out.println("Результат фильтрации:");
        for (Notebook laptop : filteredNotebooks) {
            System.out.println(laptop);
        }
    }

    

    

    private static String getOsChoice(int choice) {
        switch (choice) {
            case 1:
                return "Windows 10";
            case 2:
                return "macOS";
            case 3:
                return "Ubuntu";
            default:
                return "";
        }
    }

    private static String getColorChoice(int choice) {
        switch (choice) {
            case 1:
                return "Черный";
            case 2:
                return "Серебристый";
            case 3:
                return "Красный";
            default:
                return "";
        }
    }
}