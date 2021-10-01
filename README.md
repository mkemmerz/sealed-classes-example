# Java's sealed classes
A small and easy understandable example of a sealed-class, new with Java 15. For further information see: https://openjdk.java.net/jeps/360
A sealed class only allows a pre-defined amount of subclasses. The keyword 'permits' is used to define those subclasses.

Subclasses of a sealed have different behaviors. A 'non-sealed' subclass can be extended by every other class. A 'final' subclass can't be extended by anyone.
