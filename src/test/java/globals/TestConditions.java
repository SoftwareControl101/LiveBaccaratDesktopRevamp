package globals;

import utilities.objects.Helper;
import utilities.handlers.GetHandler;
import utilities.objects.Component;

public class TestConditions {

    /***************************************************************************************************************
     * These methods checks the results of each round in the Live Roulette Revamp Game.
     ***************************************************************************************************************/

    public static boolean isWin(Component component) {
        return GetHandler.getAttribute(component, "class").contains("win");
    }

    public static boolean isTieWin(String[] result) {
        return Helper.find(TestVariables.TIE, result);
    }

    public static boolean isNaturalTie(String[] result) {
        return Helper.find(TestVariables.NATURAL_TIE, result);
    }

    public static boolean isPlayerWin(String[] result) {
        return Helper.find(TestVariables.PLAYER, result);
    }

    public static boolean isPlayerPairWin(String[] result) {
        return Helper.find(TestVariables.PLAYER_PAIR, result);
    }

    public static boolean isPlayerDragonBonusNaturalWin(String[] result) {
        return Helper.contains(TestVariables.PLAYER_DRAGON_BONUS, result) &&
                Helper.find(TestVariables.NATURAL_WIN, result);
    }

    public static boolean isBankerWin(String[] result) {
        return Helper.find(TestVariables.BANKER, result);
    }

    public static boolean isBankerPairWin(String[] result) {
        return Helper.find(TestVariables.BANKER_PAIR, result);
    }

    public static boolean isBankerDragonBonusNaturalWin(String[] result) {
        return Helper.contains(TestVariables.BANKER_DRAGON_BONUS, result) &&
                Helper.find(TestVariables.NATURAL_WIN, result);
    }

    public static boolean isBankerDragonBonusDifferenceWin(String[] result, int difference) {
        if (Helper.find(TestVariables.NATURAL_WIN, result)) return false;
        if (Helper.contains(TestVariables.BANKER_DRAGON_BONUS, result))
            for (String res : result)
                if (res.contains(TestVariables.BANKER_DRAGON_BONUS))
                    if  (Integer.parseInt(Helper.getLastChar(res)) == difference) return true;
        return false;
    }

    public static boolean isPlayerDragonBonusDifferenceWin(String[] result, int difference) {
        if (Helper.find(TestVariables.NATURAL_WIN, result)) return false;
        if (Helper.contains(TestVariables.PLAYER_DRAGON_BONUS, result))
            for (String res : result)
                if (res.contains(TestVariables.PLAYER_DRAGON_BONUS))
                    if  (Integer.parseInt(Helper.getLastChar(res)) == difference) return true;
        return false;
    }

    public static boolean isFortuneSixWin(String[] result) {
        return Helper.contains(TestVariables.FORTUNE_SIX, result);
    }

    public static boolean isFortuneSixCardsWin(String[] result, int cards) {
        if (Helper.contains(TestVariables.FORTUNE_SIX, result))
            for (String res : result)
                if (res.contains(TestVariables.FORTUNE_SIX))
                    if (Integer.parseInt(Helper.getLastChar(res)) == cards) return true;
        return false;
    }

}
