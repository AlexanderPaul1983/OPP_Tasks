package Wiederholung;

public class Animal implements GiveAnimalSound {
    private GiveAnimalSound animal;

    public void setAnimal(GiveAnimalSound animal) {
        this.animal = animal;
    }

    public Animal(GiveAnimalSound animal){
        this.animal = animal;
        }

    @Override
    public void lauteGeben() {
        animal.lauteGeben();
    }
}

