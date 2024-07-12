public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character){
        return character.toString();
    }
    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination destination){
        return destination.toString();
    }
    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod travelMethod){
        switch(travelMethod){

            case HORSEBACK:

                return "You're traveling to your destination on horseback.";
            case WALKING:
            default:
                return "You're traveling to your destination by walking.";



        }
    }

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character, Destination destination, TravelMethod travelMethod){
        return describe(character) + " " +describe(travelMethod) + " " + describe(destination);
    }
    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe (Character character, Destination destination){
        return describe(character) + " You're traveling to your destination by walking. " + describe(destination);
    }
}
