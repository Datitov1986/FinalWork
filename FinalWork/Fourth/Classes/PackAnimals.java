package FinalWork.Fourth.Classes;


/**
 * Абстрактный класс вьючные животные, наследующий от абстрактного класса Animal
 */
abstract public class PackAnimals extends Animal {

    public PackAnimals(String name) {
        super(name);
        super.setTypeAnimal("Pack Animal");
    }
}
