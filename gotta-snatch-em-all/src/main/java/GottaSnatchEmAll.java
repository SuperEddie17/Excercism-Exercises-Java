import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> set = new HashSet<String>();
        for (String card : cards) {set.add(card);
        }
        return set;
    }

    static boolean addCard(String card, Set<String> collection) {
        if (collection.contains(card)) {
            return false;
        };
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonCards = new HashSet<>(collections.get(0));
       for (Set<String> collection : collections) {
           commonCards.retainAll(collection);
       }
        return commonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> alLCards = new HashSet<String>();
        for (Set<String> collection : collections) {
            alLCards.addAll(collection);

        }
        return alLCards;
    }
}
