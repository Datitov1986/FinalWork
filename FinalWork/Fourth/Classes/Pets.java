package FinalWork.Fourth.Classes;

/**
 * Абстрактный класс домашние животные, наследующий от абстрактного класса Animal
 */
abstract public class Pets extends Animal {

    public Pets(String name) {
        super(name);
        super.setTypeAnimal("Pets");
    }
}