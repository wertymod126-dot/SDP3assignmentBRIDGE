public class IceEnchantment implements Enchantment {
    @Override
    public void onHit() {
        System.out.println("Ice attack! Freezing the enemy dealing frost damage");
    }
    @Override
    public int getBonusDamage() {
        return 17;
    }
}
