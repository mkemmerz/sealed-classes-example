/**
 * The sealed class allows, same as Animal, another strictly defined sub-classes Dogs.
 * It is allowed to create Dog's of the type Labrador and Chihuahua.
 */
public sealed class Dog implements Animal permits Labrador, Chihuahua {

    @Override
    public String makeSound() {
        return "wuff";
    }
}
