package com.virreymorcillo.zoo.app;

// Whole-package import (not one per class): this way, when a student adds
// their own class inside com.virreymorcillo.zoo.model, it is automatically
// visible here without having to touch this section.
import com.virreymorcillo.zoo.model.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Entry point of the collaborative exercise.
 *
 * This file CAN be modified, but ONLY on the reserved line the teacher has
 * assigned you (see the roster table). Do not touch any other line, not
 * even a classmate's, even if it is still empty, and do not add any import:
 * the import above already covers your new class.
 *
 * There are 10 reserved lines by default. If the group has more students,
 * the teacher must copy the "--- LINE N ---" block and add as many lines
 * as needed before publishing the initial repository.
 */
public class Main {
    public static void main(String[] args) {

        List<Animal> zoo = new ArrayList<>();

        // --- LINE 1 ---


        // --- LINE 2 ---


        // --- LINE 3 ---


        // --- LINE 4 ---


        // --- LINE 5 ---


        // --- LINE 6 ---
zoo.add(new Wolf("Lobo"));

        // --- LINE 7 ---


        // --- LINE 8 ---


        // --- LINE 9 ---


        // --- LINE 10 ---


        for (Animal a : zoo) {
            a.makeSound();
            if (a instanceof Pet) {
                Pet pet = (Pet) a;
                pet.play();
            }
        }
    }
}
