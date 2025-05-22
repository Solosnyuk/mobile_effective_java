package Animals;

public abstract class Animal {
    private String name;
    private int swimLimit;
    private int runLimit;
    private static int countAnimal = 0;

    public Animal(String name, int swimLimit, int runLimit){
        this.name = name;
        this.swimLimit = swimLimit;
        this.runLimit = runLimit;
        countAnimal++;
    }
    public String getName(){
        return name;
    }
    public int getRunLimit() {
        return runLimit;
    }
    public int getSwimLimit() {
        return swimLimit;
    }

    public abstract void swim(int distance);

    public abstract void run(int distance);

    public static void getCount(){
        System.out.println("Всего животных: " + countAnimal);
    }
}
