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
            System.out.print(e.getMessage());
            return null;
        }

        try {
            System.out.print("Введите баллы лабораторной работы: ");
            Float minimalpoint = this.scanner.nextFloat();
            if (minimalpoint <= 0) {
                throw new Exception("Балл должен быть больше 0!");
            }
            labWork.setMinimalPoint(minimalpoint);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            return null;
        }

        try {
            System.out.print("Введите координаты: ");
            Coordinates coordinates = new Coordinates();
            GetCoordinates getCoordinates = new GetCoordinates(this.scanner);
            getCoordinates.build(coordinates);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            return null;
        }

        try {
            System.out.print("Введите наcтройку работы: ");
            Long tunedInWorks = this.scanner.nextLong();
            if (tunedInWorks == null) {
                throw new Exception("Настройка работы не может быть null!");
            }
            labWork.setTunedInWorks(tunedInWorks);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            return null;
        }

        try {
            System.out.print("Введите сложность лабораторной работы (EASY, NORMAL, IMPOSSIBLE, INSANE, HOPELESS):");
            String dif = this.scanner.nextLine();
            if (dif == "NORMAL") {
                labWork.setDifficulty(Difficulty.NORMAL);
            }
            if (dif == "EASY") {
                labWork.setDifficulty(Difficulty.EASY);
            }
            if (dif == "IMPOSSIBLE") {
                labWork.setDifficulty(Difficulty.IMPOSSIBLE);
            }
            if (dif == "INSANE") {
                labWork.setDifficulty(Difficulty.INSANE);

            }
            if (dif == "HOPELESS") {
                labWork.setDifficulty(Difficulty.HOPELESS);
            } else{
                throw new Exception("Неверный ввод!");
            }

        } catch (Exception e) {
            System.out.print(e.getMessage());
            return null;
        }
        return labWork;
    }
}






