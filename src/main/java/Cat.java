/**
 * This class is set as 'final' to no allow any sub-classes of Cat's.
 */
public final class Cat implements Animal {

    @Override
    public String makeSound() {
        return "miau";
    }
}
