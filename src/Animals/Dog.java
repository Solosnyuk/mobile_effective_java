package Animals;

public class Dog extends Animal {
    private static int countDog = 0;

    public Dog(String name) {
        super(name, 10, 500);
        countDog++;
    }

    @Override
    public void swim(int distance) {
        if(distance > getSwimLimit()) {
            System.out.println(getName() + " может проплыть не более " + getSwimLimit() + "м");
        } else if (distance < 0) {
            System.out.println(distance + " неверное значение");
        } else
        System.out.println(this.getName() + " проплыл " + distance + "м");
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
        System.out.println("Всего собак: " + countDog);
    }
}
