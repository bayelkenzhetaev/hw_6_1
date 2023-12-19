public class Boss extends GameEntity{
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String info(){
        return "Health: " + getHealth()+"\nDamage: " + getDamage() + "\nWeapon: "+ weapon.getWeaponType() + "\nName: " + weapon.getWeaponName();
    }
}
