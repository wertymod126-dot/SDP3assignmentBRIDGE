public class Main {
    public static void main(String[] args) {
        Enchantment fire = new FireEnchantment();
        Enchantment ice = new IceEnchantment();

        Weapon fireSword = new Sword(fire);
        Weapon iceWaraxe = new Waraxe(ice);


        System.out.println("---- Attacks ----");
        fireSword.use();
        iceWaraxe.use();


        System.out.println("\n---- Switching Enchantments ----");
        fireSword.setEnchantment(ice);
        fireSword.use();
        iceWaraxe.setEnchantment(fire);
        iceWaraxe.use();




    }
}
