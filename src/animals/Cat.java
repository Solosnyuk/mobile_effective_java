package animals;

public class Cat extends Animal {
    private static int catCount = 0;
    private int runLimit = 200;
    private int swimLimit = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не может плавать");
    }

    @Override
    public void run(int distance) {
        if(distance > runLimit) {
            System.out.println(getName() + " может пробежать не более " + runLimit +  " м");
        } else if (distance < 0) {
            System.out.println(distance + " неверное значение");
        } else
            System.out.println(this.getName() + " пробежал " + distance + "м");
    }

    public static void getCount(){
        System.out.println("Всего котов " + catCount);
    }
}
