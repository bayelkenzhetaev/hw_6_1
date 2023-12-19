public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(100000);
        boss.setDamage(5000);
        Weapon bossWeapon = new Weapon(WeaponType.AK,"AK for Ainazik");
        boss.setWeapon(bossWeapon);
        System.out.println(boss.info());
    }
}
