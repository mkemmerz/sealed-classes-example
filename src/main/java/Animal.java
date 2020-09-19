/**
 * A sealed interface only allows specific classes to implement the interface it is declared on.
 *
 * In this case only sub-Animal's of the type Cat, Dog or Duck are allowed.
 */
public sealed interface Animal permits Cat, Dog, Duck {

    String makeSound();
}
