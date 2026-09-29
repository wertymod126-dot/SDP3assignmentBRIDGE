public class Waraxe extends Weapon {
    public Waraxe(Enchantment enchantment) {
        super(enchantment);
    }

    @Override
    public void use() {
        int baseDamage = 30;
        int totalDamage = baseDamage + enchantment.getBonusDamage();
        System.out.print("Swinging Waraxe [ " + totalDamage + " damage ] - ");
        enchantment.onHit();
    }

}
