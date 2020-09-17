package lesson5;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Мартин Лютер Кинг", "афрокот", 2);
        Cat cat2 = new Cat("Борис Николаевич", "рыжий", 7);

        Cat cat3 = new Cat("Лютик");

        cat3.setColor("Белый");
        System.out.println(cat3.getColor());

//        Cat[] cats = {cat1, cat2, cat3};

        cat2 = null;
        System.gc();

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

        System.out.println("Кол-во котов: " + Cat.countCat);
    }
}
