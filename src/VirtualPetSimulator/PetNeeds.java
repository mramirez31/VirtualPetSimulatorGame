package VirtualPetSimulator;

public class PetNeeds {

    //attributes or field

    private int hunger;
    private int thirst;
    private int happiness;

    //Constructor

    public PetNeeds(){
        hunger = 50;
        thirst = 50;
        happiness = 50;
    }

    /**
     * method: decreaseHunger
     * @param amount
     */

    public void increaseHunger(int amount){
        hunger += amount;
        if(hunger > 100){
            hunger = 100;
        }
    }

    public void increaseThirst(int amount) {
        thirst += amount;
        if (thirst > 100) {
            thirst = 100;
        }
    }

    public void decreaseHappiness(int amount) {
        happiness -= amount; //+=
        if (happiness < 0) { //happiness > 100
            happiness = 0; // 100
        }
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger){
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst){
        this.thirst = thirst;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness){
        this.happiness = happiness;
    }

}
