public abstract class Hero implements HavingSuperAbility{
    private int health;
    private int damage;
    private String typeAbility;



    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String typeAbility(){
        return typeAbility;
    }

    public void typeAbility(String damageType) {
        this.typeAbility = damageType;
    }
}
