package animals;

public abstract class Animal {
    private String name;
    int swimLimit;
    int runLimit;
    private static int countAnimal = 0;

    public Animal(String name){
        this.name = name;
        countAnimal++;
    }
    public String getName(){
        return name;
    }

    public abstract void swim(int distance);

    public abstract void run(int distance);

    public static void getCount(){
        System.out.println("Всего животных: " + countAnimal);
    }
}
