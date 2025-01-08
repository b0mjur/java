package EasyLessons;

public class Human {
    int age = 10;

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getAge(5, 0.2, true, human));
    }
    int getAge (int i, double d, boolean bool, Human human) {
        return human.age;
    }
}
