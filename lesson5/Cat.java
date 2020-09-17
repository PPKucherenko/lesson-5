package lesson5;

public class Cat {

    public static int countCat = 0;

    protected String name;
    private String color;
    public int age;

    public Cat(String name, String color, int age) {
        countCat++;
        this.name = name != null ? name.toUpperCase() : null;
        this.color = color != null ? color.toUpperCase() : null;
        this.age = age;
    }

    public Cat(String name, String color) {
        this(name, color, 1);
    }

    public Cat(String name) {
        this(name, "разноцветный");
    }

    public Cat() {
        this("Иван");
    }

    @Override
    public String toString() {
        return "Параметры кота " + name + ": " + "color=" + color + ", age=" + age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color != null ? color.toUpperCase() : null;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name != null ? name.toUpperCase() : null;
    }

    public void finalize() {
        countCat--;
        System.out.println("Кот " + name + " покинул нас");
    }

}
