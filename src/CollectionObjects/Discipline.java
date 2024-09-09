package CollectionObjects;

public class Discipline {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Long lectureHours; //Поле может быть null

    public void setName(String name) {
        this.name = name;
    }

    public void setLectureHours(Long lectureHours) {
        this.lectureHours = lectureHours;
    }

    public String getName() {
        return name;
    }

    public Long getLectureHours() {
        return lectureHours;
    }

    @Override
    public String toString() {
        return "Название дисциплины: " + name + "; Лекторские часы: " + lectureHours;
    }
}