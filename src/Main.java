public class Main {
    public static void main(String[] args) {

        System.out.println("******Person******");

        Person person = new Person("Serkan", "Yilmaz", 25);

        Person person2 = new Person("Serkan", "Yilmaz", 25, 180, "Software Developer", "Istanbul");

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println(person.isTeen());

        System.out.println("******Wall******");

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());





    }
}