public class Medic extends Hero implements HavingSuperAbility{
    private int healPoints = 30;
    public void applySuperAbility(){
        System.out.println("Medic healed person");
    };
    public int increaseExperience(){
         double doublePersentage = 0.10;
         int additional = (int) (healPoints * doublePersentage);
         return healPoints += additional;
    };

    public int getHealPoints() {
        return healPoints;
    }
}
