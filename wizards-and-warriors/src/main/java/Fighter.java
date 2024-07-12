 class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints() {
        return 1;
    }


}

// TODO: define the Warrior class
class Warrior extends Fighter {

    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }


    int getDamagePoints(Fighter opponent) {
        return opponent.isVulnerable() ? 10 : 6 ;
    }

}

// TODO: define the Wizard class
class Wizard extends Fighter {
    boolean  isSpellReady = false;

    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }

   void prepareSpell() {
       isSpellReady = true;
    }
    @Override
    boolean isVulnerable(){
        return !isSpellReady;
    }


    int getDamagePoints(Fighter fighter) {

        return (isSpellReady) ? 12 : 3;
    }






}