public class Sword extends Weapon {
    public Sword(Enchantment enchantment) {
        super(enchantment);
    }

    @Override
    public void use() {
        int baseDamage = 25;
        int totalDamage = baseDamage + enchantment.getBonusDamage();
        System.out.print("Swinging Sword [ " + totalDamage + " damage ] - ");
        enchantment.onHit();
    }


}
