package CollectionObjects;

import java.util.Scanner;

public class GetDiscipline {
    public void build(Discipline discipline) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите название дисциплины: ");
                String name = scanner.nextLine();
                if (name == null || name.isEmpty()) {
                    System.out.println("Название дисциплины не может быть null или пустой строкой!");
                } else {
                    discipline.setName(name);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Ошибка!!! Вводить надо тип String.");
            }
        }

        while (true) {

            try {
                System.out.print("Введите лекторские часы: ");
                Long lectureHours = Long.parseLong(scanner.nextLine());
                if (lectureHours < 1) {
                    System.out.print("Ошибка!!! Лекторские часы не могут быть меньше 1.");
                } else {
                    discipline.setLectureHours(lectureHours);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка!!! Вводить надо тип Long.");

            }
        }
    }
}
