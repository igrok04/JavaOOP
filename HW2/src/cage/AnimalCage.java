package cage;

import animals.Animal;

public interface AnimalCage<T extends Animal> {

    void addAnimalToCage(T animal);

    void giveFoodToCage(int weightOfFood);

    void cleanCage();

    void getAnimalFromCage();

}
