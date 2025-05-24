package animals;

public class Dog extends Animal {
    private static int countDog = 0;
    private int swimLimit = 10;
    private int runLimit = 500;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    public void swim(int distance) {
        if(distance > swimLimit) {
            System.out.println(getName() + " может проплыть не более " + swimLimit + "м");
        } else if (distance < 0) {
            System.out.println(distance + " неверное значение");
        } else
        System.out.println(this.getName() + " проплыл " + distance + "м");
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
        System.out.println("Всего собак: " + countDog);
    }
}
