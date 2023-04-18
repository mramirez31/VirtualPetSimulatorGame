package VirtualPetSimulator;

public class VirtualPet {

    private String name;
    private int age;

    private PetNeeds petNeeds;

    public VirtualPet(String name, int age) {
        this.name = name;
        this.age = age;
        this.petNeeds = new PetNeeds();
    }

    private int getRandomNumber(int min, int max) {
        return (int)(Math.random() * (max - min + 1));
    }

    public void feed() {
        int increaseAmount = getRandomNumber(10, 20);
        petNeeds.increaseHunger(increaseAmount);
    }

    public void drink() {
        int increaseAmount = getRandomNumber(10, 20);
        petNeeds.increaseThirst(increaseAmount);
    }

    public void play() {
        int decreaseAmount = getRandomNumber(10, 20);
        petNeeds.decreaseHappiness(decreaseAmount);
    }

    public boolean isSick() {
        return petNeeds.getHunger() >= 100 || petNeeds.getThirst() >= 100;
    }

    public boolean isSad() {
        return petNeeds.getHappiness() <= 0;
    }

    public void printStatus() {
        System.out.println(name + " - Age: " + age);
        System.out.println("Hunger: " + petNeeds.getHunger() + "/100");
        System.out.println("Thirst: " + petNeeds.getThirst() + "/100");
        System.out.println("Happiness: " + petNeeds.getHappiness() + "/100");
        System.out.println();
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void getPetNeeds(){
        this.petNeeds = new PetNeeds();
    }

}
