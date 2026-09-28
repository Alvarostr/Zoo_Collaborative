# Collaborative Zoo — Git/GitHub Exercise with Inheritance and Interfaces

Initial repository for the collaborative exercise of the Java OOP unit.
Each student creates their own `Animal` subclass and incorporates it into
the project through a Pull Request, touching only their reserved line in
`Main.java`.

## Structure

```
src/
└── com/
    └── virreymorcillo/
        └── zoo/
            ├── model/
            │   ├── Animal.java   (abstract class — do not modify)
            │   └── Pet.java       (interface — do not modify)
            └── app/
                └── Main.java      (only touch your own reserved line)
```

## Rules for students

1. Create a new file in `src/com/virreymorcillo/zoo/model/`, named after your
   assigned animal, extending `Animal`.
2. If your animal is a "pet" (according to the teacher's roster), also
   implement the `Pet` interface.
3. In `Main.java`, write **a single line** inside your assigned marker
   `// --- LINE N ---`. Do not modify any other part of the file.
4. Do not add any `import`: `Main.java` already imports the whole `model`
   package.
5. Compile and run locally to check that your animal appears.
6. Add your changes to remote repository.

Your Pull Request's diff should show exactly two changes: your new file,
and the line added at your marker in `Main.java`.

## Technical contract for the subclass

- Package: `com.virreymorcillo.zoo.model`.
- `extends Animal`.
- Public constructor with a `String name` parameter, calling `super(name)`.
- Overrides `makeSound()`.
- If applicable: `implements Pet` and overrides `play()`.
