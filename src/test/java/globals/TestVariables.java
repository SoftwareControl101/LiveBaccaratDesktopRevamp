package globals;

import pages.DealerTable;
import utilities.objects.Component;

public class TestVariables {

    /***************************************************************************************************************
     * These constants are used to find specific betting options in the Live Roulette Revamp Game.
     ***************************************************************************************************************/

    public static final String PLAYER = "PLA";
    public static final String PLAYER_PAIR = "PPR";
    public static final String PLAYER_DRAGON_BONUS = "PDB";
    public static final String BANKER = "BAN";
    public static final String BANKER_PAIR = "BPR";
    public static final String BANKER_DRAGON_BONUS = "BDB";
    public static final String NATURAL_WIN = "NWN";
    public static final String NATURAL_TIE = "NTE";
    public static final String TIE = "TIE";
    public static final String FORTUNE_SIX = "FSX";

    public static final Component[] ALL_BET_OPTIONS = {
            DealerTable.BettingOption.Player,
            DealerTable.BettingOption.Tie,
            DealerTable.BettingOption.Banker,
            DealerTable.BettingOption.PlayerDragonBonus,
            DealerTable.BettingOption.PlayerPair,
            DealerTable.BettingOption.FortuneSix,
            DealerTable.BettingOption.BankerPair,
            DealerTable.BettingOption.BankerDragonBonus
    };

    public static final Component[] ALL_BET_CHIPS = {
            DealerTable.BettingChip.Player,
            DealerTable.BettingChip.Tie,
            DealerTable.BettingChip.Banker,
            DealerTable.BettingChip.PlayerDragonBonus,
            DealerTable.BettingChip.PlayerPair,
            DealerTable.BettingChip.FortuneSix,
            DealerTable.BettingChip.BankerPair,
            DealerTable.BettingChip.BankerDragonBonus
    };

    public static Component[] ACTION_BUTTONS = {
            DealerTable.Button.Undo,
            DealerTable.Button.Cancel,
            DealerTable.Button.Double,
            DealerTable.Button.Confirm
    };

}
