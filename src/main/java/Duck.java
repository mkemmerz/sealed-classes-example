/**
 * 'non-sealed' allows every class to extend from the class it is declared on.
 * The sealed interface 'Animal' can't pretend this from happening.
 * So every class can extend from Duck now.
 */
public non-sealed class Duck implements Animal {

    @Override
    public String makeSound() {
        return "quack";
    }
}
