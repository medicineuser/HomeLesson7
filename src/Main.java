// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] abilities = { new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i <  abilities.length; i++){
            abilities[i].applySuperAbility();
            if(abilities[i] instanceof Medic){
                System.out.println(((Medic)abilities[i]).increaseExperience());
            };
        }
    }
}