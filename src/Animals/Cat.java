package Animals;

public class Cat extends Animal {
    private static int catCount = 0;

    public Cat(String name) {
        super(name, 0, 200);
        catCount++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не может плавать");
    }

    @Override
    public void run(int distance) {
        if(distance > getRunLimit()) {
            System.out.println(getName() + " может пробежать не более " + getRunLimit() +  " м");
        } else if (distance < 0) {
            System.out.println(distance + " неверное значение");
        } else
            System.out.println(this.getName() + " пробежал " + distance + "м");
    }

    public static void getCount(){
        System.out.println("Всего котов " + catCount);
    }
}
