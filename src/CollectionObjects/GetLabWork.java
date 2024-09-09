package CollectionObjects;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

import static java.time.LocalTime.*;

public class GetLabWork {
    Scanner scanner;

    public GetLabWork(Scanner scanner) {
        this.scanner = scanner;
    }

    public LabWork build(Long id) {
        LabWork labWork = new LabWork();

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        labWork.setId(id);
        labWork.setCreationDate(zonedDateTime);
        try {
            System.out.print("Введите название лабораторной работы: ");
            String name = this.scanner.nextLine();
            if (name == null || name.isEmpty()) {
                throw new Exception("Название дисциплины не может быть null или пустой строкой!");
            }
            labWork.setName(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

        try {
            System.out.print("Введите баллы лабораторной работы: ");
            String line = this.scanner.nextLine();
            Float minimalpoint = Float.valueOf(line);
            if (minimalpoint <= 0) {
                throw new Exception("Балл должен быть больше 0!");
            }
            labWork.setMinimalPoint(minimalpoint);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

        try {
            System.out.println("Введите координаты: ");
            GetCoordinates getCoordinates = new GetCoordinates(this.scanner);
            labWork.setCoordinates(getCoordinates.build());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

        try {
            System.out.print("Введите наcтройку работы: ");
            String line1 = this.scanner.nextLine();
            Long tunedInWorks = Long.valueOf(line1);
            if (tunedInWorks == null) {
                throw new Exception("Настройка работы не может быть null!");
            }
            labWork.setTunedInWorks(tunedInWorks);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

        try {
            System.out.println("Введите сложность лабораторной работы (EASY, NORMAL, IMPOSSIBLE, INSANE, HOPELESS): ");
            String line2 = this.scanner.nextLine().toUpperCase();
            Difficulty difficulty = Difficulty.valueOf(line2);
            labWork.setDifficulty(difficulty);

        } catch (Exception e) {
            System.out.println("Неверный ввод!");
            System.out.println(e.getMessage());
            return null;
        }

        try {
            GetDiscipline getDiscipline = new GetDiscipline(this.scanner);
            labWork.setDiscipline(getDiscipline.build());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return labWork;
    }
}






