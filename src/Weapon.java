public abstract class Weapon {
    protected Enchantment enchantment;

    public Weapon(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    public abstract void use();

    public void setEnchantment(Enchantment enchantment) {
        this.enchantment = enchantment;
    }



}
