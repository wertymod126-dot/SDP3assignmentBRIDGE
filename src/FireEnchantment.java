public class FireEnchantment implements Enchantment {
    @Override
    public void onHit() {
        System.out.println("Ignites the target for burning damage");
    }
    @Override
    public int getBonusDamage() {
        return 15;
    }
}
