package CollectionObjects;

import java.util.Scanner;

public class GetCoordinates {
    Scanner scanner;

    public GetCoordinates(Scanner scanner){
        this.scanner = scanner;
    }

    public void build(Coordinates coordinates) {

        try {
            System.out.print("Введите x: ");
            Double x = this.scanner.nextDouble();
            if (x == null) {
                throw new Exception("Значение x не может быть null!");
            }
            coordinates.setX(x);


            System.out.print("Введите y: ");
            Float y = this.scanner.nextFloat();
            if (y == null || y < -516) {
                throw new Exception("Значение y не может быть меньше -516");
            }
            coordinates.setY(y);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}