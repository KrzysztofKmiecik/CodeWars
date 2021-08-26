public class TheFeastOfManyBeasts {
    public static void main(String[] args) {
        boolean feast = feast("great blue heron","garlic nann");
        System.out.println(feast);
    }

    public static boolean feast(String beast, String dish) {

        String beastTrimmed=beast.replaceAll("\\s+","");
        String beastStarts = beastTrimmed.substring(0,1);
        String beastEnds = beastTrimmed.substring((beastTrimmed.length()-1));

        String dishTrimmed=dish.replaceAll("\\s+ ","");
        String dishStarts = dishTrimmed.substring(0,1);
        String dishEnds = dishTrimmed.substring((dishTrimmed.length()-1));

        return ((beastStarts.equals(dishStarts)) && (beastEnds.equals(dishEnds)));

    }
}
