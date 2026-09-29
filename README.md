# Assignment 3: Bridge Pattern Implementation

**Course:** Software Design Patterns  
**Topic:** Game Weapons & Enchantments  

---

## 1. Overview
This project implements the Bridge structural design pattern in Java[cite: 8]. It decouples the `Weapon` abstraction hierarchy from the `Enchantment` implementation hierarchy, allowing weapons and elemental effects to vary independently without class explosion.

---

## 2. Structural Mapping

### Abstraction Hierarchy
* **`Weapon` (Abstract Class):** Holds a reference to the `Enchantment` implementor interface and defines high-level combat operations.
* **`Sword` & `Waraxe` (Refined Abstractions):** Implement specific weapon behaviors, base damage calculations, and delegate elemental effects to the bridge.

### Implementation Hierarchy
* **`Enchantment` (Implementor Interface):** Declares low-level elemental operations (`onHit()` and `getBonusDamage()`).
* **`FireEnchantment` & `IceEnchantment` (Concrete Implementors):** Provide specific damage additions and status effects.

---

## 3. Clean Code Principles Justification

1. **Single Responsibility Principle (SRP):** `Weapon` subclasses handle base combat stats, while `Enchantment` classes handle elemental status effects.
2. **Open/Closed Principle (OCP):** New weapons or enchantments can be added without modifying existing code].
3. **Dependency Inversion Principle (DIP):** High-level weapon classes depend on the `Enchantment` interface rather than concrete elemental implementations.
4. **Don't Repeat Yourself (DRY):** Common state (`enchantment` field) and delegation methods (`setEnchantment`) are centralized in the `Weapon` abstract class].
5. **Meaningful Naming:** Domain and structural roles are clearly identified through explicit class and method names .

