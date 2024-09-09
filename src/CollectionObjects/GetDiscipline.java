package CollectionObjects;

import java.util.Scanner;

public class GetDiscipline {
    Scanner scanner;
    public GetDiscipline(Scanner scanner){
        this.scanner = scanner;
    }
    public Discipline build() {
        Discipline discipline = new Discipline();


        try {
            System.out.print("Введите название дисциплины: ");
            String name = this.scanner.nextLine();
            if (name == null || name.isEmpty()) {
                throw new Exception("Название дисциплины не может быть null или пустой строкой!");
            }
            discipline.setName(name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.print("Введите лекторские часы: ");
            String line = (this.scanner.nextLine());
            Long lectureHours = Long.valueOf(line);
            if (lectureHours < 1) {
                throw  new Exception("Ошибка!!! Лекторские часы не могут быть меньше 1.");
            }
            discipline.setLectureHours(lectureHours);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return discipline;
    }
}
