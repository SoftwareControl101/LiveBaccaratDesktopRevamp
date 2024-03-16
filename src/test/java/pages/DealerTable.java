package pages;

import utilities.objects.Component;

public class DealerTable {

    /***************************************************************************************************************
     * These are the container components on the Dealer Table Page.
     ***************************************************************************************************************/

    public static class Container {
        public static Component Announcement = new Component(
                "Announcement",
                "Container",
                "Dealer Table Page",
                "//div[@class='news_ticker']"
        );
        public static Component BeadRoadMap = new Component(
                "Bead Road Map",
                "Container",
                "Dealer Table Page",
                "//div[@class='roadmap_area_container_left_first']"
        );
        public static Component BigRoadMap = new Component(
                "Big Road Map",
                "Container",
                "Dealer Table Page",
                "//div[@class='roadmap_area_container_left_second']"
        );
        public static Component BigEyeRoadMap = new Component(
                "Big Eye Road Map",
                "Container",
                "Dealer Table Page",
                "//div[@class='roadmap_area_container_right_first']"
        );
        public static Component SmallRoadMap = new Component(
                "Small Road Map",
                "Container",
                "Dealer Table Page",
                "//div[@class='roadmap_area_container_right_second']"
        );
        public static Component CockroachRoadMap = new Component(
                "Cockroach Road Map",
                "Container",
                "Dealer Table Page",
                "//div[@class='roadmap_area_container_right_third']"
        );
        public static Component PlayerSeats = new Component(
                "List of Player Seats",
                "Container",
                "Dealer Table Page",
                "//ul[@class='player_seats']//li"
        );
        public static Component Timer = new Component(
                "Timer",
                "Container",
                "Dealer Table Page",
                "//div[contains(@class, 'timer')]"
        );
        public static Component RedTimer = new Component(
                "Red Timer",
                "Container",
                "Dealer Table Page",
                "//div[@class='timer red EN_US']"
        );
        public static Component PlayerBettingChip = new Component(
                "Player Betting Chip",
                "Container",
                "Dealer Table Page",
                "//div[@class='chip_locate player_chip_locate_user']" +
                        "//div[contains(@class, 'chip chip_') and contains(@class, '_solid solid')]"
        );
        public static Component WinResult = new Component(
                "Win Result",
                "Container",
                "Dealer Table Page",
                "//div[contains(@class, 'result') and contains(@class, 'Win')]"
        );
        public static Component PlayerCards = new Component(
                "Player Cards",
                "Container",
                "Dealer Table Page",
                "//div[contains(@class, 'player')]//div[contains(@class, 'front')]"
        );
        public static Component BankerCards = new Component(
                "Banker Cards",
                "Container",
                "Dealer Table Page",
                "//div[contains(@class, 'banker')]//div[contains(@class, 'front')]"
        );
        public static Component Commission = new Component(
                "Commission",
                "Container",
                "Dealer Table Page",
                "//div[@class='btn_comm']//input"
        );
        public static Component Predictions = new Component(
                "List of Predictions",
                "Container",
                "Dealer Table Page",
                "//li[contains(@class, 'prediction')]"
        );
    }

    /***************************************************************************************************************
     * These are the button components on the Dealer Table Page.
     ***************************************************************************************************************/

    public static class Button {
        public static Component Back = new Component(
                "Back",
                "Button",
                "Dealer Table Page",
                "//button[@class='back_btn']"
        );
        public static Component LimitsPayout = new Component(
                "Limits Payout",
                "Button",
                "Dealer Table Page",
                "//button[@class='limits_payout_btn']"
        );
        public static Component TableLimit = new Component(
                "Table Limit",
                "Button",
                "Dealer Table Page",
                "//button[@class='tableLimit_btn']"
        );
        public static Component FullScreen = new Component(
                "Full Screen",
                "Button",
                "Dealer Table Page",
                "//div[@tooltiptext='Fullscreen']//button[@class='button']"
        );
        public static Component Video = new Component(
                "Video",
                "Button",
                "Dealer Table Page",
                "//div[@tooltiptext='Video']//button[@class='button']"
        );
        public static Component Music = new Component(
                "Music",
                "Button",
                "Dealer Table Page",
                "//div[@tooltiptext='Music']//button[@class='button']"
        );
        public static Component Voice = new Component(
                "Voice",
                "Button",
                "Dealer Table Page",
                "//div[@tooltiptext='Voice']//button[@class='button']"
        );
        public static Component MyBets = new Component(
                "My Bets",
                "Button",
                "Dealer Table Page",
                "//div[@tooltiptext='My Bets']//button[@class='button']"
        );
        public static Component Help = new Component(
                "Help",
                "Button",
                "Dealer Table Page",
                "//div[@tooltiptext='Help']//button[@class='button']"
        );
        public static Component HideShowBalance = new Component(
                "Hide/Show Balance",
                "Button",
                "Dealer Table Page",
                "//div[contains(@class, 'balance_btn')]"
        );
        public static Component User = new Component(
                "User",
                "Button",
                "Game Lobby Page",
                "//div[@class='user-setting_btn']"
        );
        public static Component SwitchTable = new Component(
                "Switch Table",
                "Button",
                "Dealer Table Page",
                "//button[@class='jump_table_btn']"
        );
        public static Component EditChips = new Component(
                "Edit Chips",
                "Button",
                "Dealer Table Page",
                "//div[@class='chip_set']//li[contains(@data-gtm, 'Btn_ClickChipCustomize')]"
        );
        public static Component ChipOptions = new Component(
                "List of Chip Options",
                "Button",
                "Dealer Table Page",
                "//div[@class='chip_set']//li[not(contains(@data-gtm, 'Btn_ClickChipCustomize'))]"
        );
        public static Component Undo = new Component(
                "Undo",
                "Button",
                "Dealer Table Page",
                "//div[@class='pattern']//button[contains(@class, 'btn_undo')]"
        );
        public static Component Cancel = new Component(
                "Cancel",
                "Button",
                "Dealer Table Page",
                "//div[@class='pattern']//button[contains(@class, 'btn_cancel')]"
        );
        public static Component Double = new Component(
                "Double",
                "Button",
                "Dealer Table Page",
                "//button[contains(@class, 'btn_double')]"
        );
        public static Component Confirm = new Component(
                "Confirm",
                "Button",
                "Dealer Table Page",
                "//button[contains(@class, 'btn_') and contains(@class, 'confirm')]"
        );
        public static Component ReBet = new Component(
                "Re-bet",
                "Button",
                "Dealer Table Page",
                "//button[@class='btn_rebet']"
        );
        public static Component Commission = new Component(
                "Commission",
                "Button",
                "Dealer Table Page",
                "//div[@class='btn_comm']"
        );
        public static Component RedPrediction = new Component(
                "Red Prediction",
                "Button",
                "Dealer Table Page",
                "//button[@class='red']"
        );
        public static Component BluePrediction = new Component(
                "Blue Prediction",
                "Button",
                "Dealer Table Page",
                "//button[@class='blue']"
        );
        public static Component PopUpConfirm = new Component(
                "Pop Up Confirm",
                "Button",
                "Dealer Table Page",
                "//div[@class='popUp']//button[normalize-space()='Confirm']"
        );
        public static Component PopUpNotNow = new Component(
                "Pop Up Not Now",
                "Button",
                "Dealer Table Page",
                "//div[@class='popUp']//button[normalize-space()='Not Now']"
        );
    }

    /***************************************************************************************************************
     * These are the label components on the Dealer Table Page.
     ***************************************************************************************************************/

    public static class Label {
        public static Component WelcomeAndGoodLuck = new Component(
                "Welcome and good luck.",
                "Label",
                "Dealer Table Page",
                "//p[contains(normalize-space(), 'Welcome and good luck')]"
        );
        public static Component ShowTimer = new Component(
                "Show Timer",
                "Label",
                "Dealer Table Page",
                "//p[@id='showTimer']"
        );
        public static Component PlaceYourBetsPlease = new Component(
                "Place your bets please",
                "Label",
                "Dealer Table Page",
                "//p[contains(normalize-space(), 'Place your bets please')]"
        );
        public static Component ShowDealing = new Component(
                "Show Dealing",
                "Label",
                "Dealer Table Page",
                "//p[@id='showDealingWording']"
        );
        public static Component NoMoreBets = new Component(
                "No more bets",
                "Label",
                "Dealer Table Page",
                "//p[contains(normalize-space(), 'No more bets')]"
        );
        public static Component TableName = new Component(
                "Table Name",
                "Label",
                "Dealer Table Page",
                "//p[@class='table_name']"
        );
        public static Component GameId = new Component(
                "Game ID",
                "Label",
                "Dealer Table Page",
                "//p[@class='game_id']"
        );
        public static Component TotalBet = new Component(
                "Total Bet",
                "Label",
                "Dealer Table Page",
                "//p[@class='total_bet']"
        );
        public static Component BalanceText = new Component(
                "Balance Text",
                "Label",
                "Dealer Table Page",
                "//div[contains(@class, 'balance_btn')]//p"
        );
        public static Component BalanceValue = new Component(
                "Balance Value",
                "Label",
                "Dealer Table Page",
                "//div[contains(@class, 'balance_btn')]//span[2]"
        );
        public static Component PlayerCounter = new Component(
                "Player Counter",
                "Label",
                "Dealer Table Page",
                "//div[@class='roadmap_stastic']//b[@class='blue circle']/ancestor::span"
        );
        public static Component BankerCounter = new Component(
                "Banker Counter",
                "Label",
                "Dealer Table Page",
                "//div[@class='roadmap_stastic']//b[@class='red circle']/ancestor::span"
        );
        public static Component TieCounter = new Component(
                "Tie Counter",
                "Label",
                "Dealer Table Page",
                "//div[@class='roadmap_stastic']//b[@class='green circle']/ancestor::span"
        );
        public static Component PlayerPairCounter = new Component(
                "Player Pair Counter",
                "Label",
                "Dealer Table Page",
                "//div[@class='roadmap_stastic']//b[@class='blue']/ancestor::span"
        );
        public static Component BankerPairCounter = new Component(
                "Balance Value",
                "Label",
                "Dealer Table Page",
                "//div[@class='roadmap_stastic']//b[@class='red']/ancestor::span"
        );
        public static Component TotalCounter = new Component(
                "Balance Value",
                "Label",
                "Dealer Table Page",
                "//div[@class='roadmap_stastic']//b[@class='gray']/ancestor::span"
        );
        public static Component ConfirmNow = new Component(
                "Confirm now?",
                "Label",
                "Dealer Table Page",
                "//p[@class='popUp_title']"
        );
        public static Component PlayerTotalPoints = new Component(
                "Player Total Points",
                "Label",
                "Dealer Table Page",
                "//div[contains(@class, 'player')]//div[@class='total_points']//p"
        );
        public static Component BankerTotalPoints = new Component(
                "Banker Total Points",
                "Label",
                "Dealer Table Page",
                "//div[contains(@class, 'banker')]//div[@class='total_points']//p"
        );
        public static Component YouWon = new Component(
                "You Won",
                "Label",
                "Dealer Table Page",
                "//p[@class='you_won_title']"
        );
        public static Component GiveItATry = new Component(
                "You haven't bet for a long time. Give it a try?",
                "Label",
                "Dealer Table Page",
                "//p[contains(normalize-space(), 'Give it a try?')]"
        );
        public static Component Shuffle = new Component(
                "Shuffle",
                "Label",
                "Dealer Table Page",
                "//div[contains(@class, 'shuffle')]"
        );
        public static Component VideoIcon = new Component(
                "Video Icon",
                "Label",
                "Dealer Table Page",
                "//div[@tooltiptext='Video']//div[@class='icon']//*[name()='use']"
        );
        public static Component MusicIcon = new Component(
                "Music Icon",
                "Label",
                "Dealer Table Page",
                "//div[@tooltiptext='Music']//div[@class='icon']//*[name()='use']"
        );
        public static Component VoiceIcon = new Component(
                "Voice Icon",
                "Label",
                "Dealer Table Page",
                "//div[@tooltiptext='Voice']//div[@class='icon']//*[name()='use']"
        );
        public static Component NonCommission = new Component(
                "List of Non-commission",
                "Label",
                "Dealer Table Page",
                "//p[normalize-space()='Banker']/following-sibling::span"
        );
        public static Component BetsAccepted = new Component(
                "Bets accepted.",
                "Label",
                "Dealer Table Page",
                "//p[contains(normalize-space(), 'Bets accepted.')]"
        );
        public static Component RememberedChipSettings = new Component(
                "We've remembered your chip settings.",
                "Label",
                "Dealer Table Page",
                "//p[contains(text(),'remembered your chip settings.')]"
        );
    }

    /***************************************************************************************************************
     * These are the betting options on the Dealer Table Page.
     ***************************************************************************************************************/

    public static class BettingOption {
        public static Component Player = new Component(
                "Player Betting Option",
                "Button",
                "Dealer Table Page",
                "//p[contains(text(),'Player')]/ancestor::li[contains(@class, 'main_bet blue')]"
        );
        public static Component Tie = new Component(
                "Tie Betting Option",
                "Button",
                "Dealer Table Page",
                "//p[contains(text(),'Tie')]/ancestor::li[contains(@class, 'main_bet green')]"
        );
        public static Component Banker = new Component(
                "Banker Betting Option",
                "Button",
                "Dealer Table Page",
                "//p[contains(text(),'Banker')]/ancestor::li[contains(@class, 'main_bet red')]"
        );
        public static Component PlayerDragonBonus = new Component(
                "Player Dragon Bonus Betting Option",
                "Button",
                "Dealer Table Page",
                "//p[contains(text(),'Dragon Bonus')]/ancestor::li[contains(@class, 'side_bet blue')]"
        );
        public static Component PlayerPair = new Component(
                "Player Pair Betting Option",
                "Button",
                "Dealer Table Page",
                "//p[contains(text(),'Player Pair')]/ancestor::li[contains(@class, 'side_bet blue')]"
        );
        public static Component FortuneSix = new Component(
                "Fortune Six Betting Option",
                "Button",
                "Dealer Table Page",
                "//p[contains(text(),'Fortune 6')]/ancestor::li[contains(@class, 'side_bet yellow')]"
        );
        public static Component BankerPair = new Component(
                "Banker Pair Betting Option",
                "Button",
                "Dealer Table Page",
                "//p[contains(text(),'Banker Pair')]/ancestor::li[contains(@class, 'side_bet red')]"
        );
        public static Component BankerDragonBonus = new Component(
                "Banker Dragon Bonus Betting Option",
                "Button",
                "Dealer Table Page",
                "//p[contains(text(),'Dragon Bonus')]/ancestor::li[contains(@class, 'side_bet red')]"
        );
    }

    /***************************************************************************************************************
     * These are the betting chips on the Dealer Table Page.
     ***************************************************************************************************************/

    public static class BettingChip {
        static String chipPath = "//div[contains(@class, 'chip_locate_user')]//div[contains(@class, 'chip_text')]";
        public static Component Player = new Component(
                "Player Betting Chip",
                "Container",
                "Dealer Table Page",
                "//p[contains(text(),'Player')]/ancestor::li[contains(@class, 'main_bet blue')]" + chipPath
        );
        public static Component Tie = new Component(
                "Tie Betting Chip",
                "Container",
                "Dealer Table Page",
                "//p[contains(text(),'Tie')]/ancestor::li[contains(@class, 'main_bet green')]" + chipPath
        );
        public static Component Banker = new Component(
                "Banker Betting Chip",
                "Container",
                "Dealer Table Page",
                "//p[contains(text(),'Banker')]/ancestor::li[contains(@class, 'main_bet red')]" + chipPath
        );
        public static Component PlayerDragonBonus = new Component(
                "Player Dragon Bonus Betting Chip",
                "Container",
                "Dealer Table Page",
                "//p[contains(text(),'Dragon Bonus')]/ancestor::li[contains(@class, 'side_bet blue')]" + chipPath
        );
        public static Component PlayerPair = new Component(
                "Player Pair Betting Chip",
                "Container",
                "Dealer Table Page",
                "//p[contains(text(),'Player Pair')]/ancestor::li[contains(@class, 'side_bet blue')]" + chipPath
        );
        public static Component FortuneSix = new Component(
                "Fortune Six Betting Chip",
                "Container",
                "Dealer Table Page",
                "//p[contains(text(),'Fortune 6')]/ancestor::li[contains(@class, 'side_bet yellow')]" + chipPath
        );
        public static Component BankerPair = new Component(
                "Banker Pair Betting Chip",
                "Container",
                "Dealer Table Page",
                "//p[contains(text(),'Banker Pair')]/ancestor::li[contains(@class, 'side_bet red')]" + chipPath
        );
        public static Component BankerDragonBonus = new Component(
                "Banker Dragon Bonus Betting Chip",
                "Container",
                "Dealer Table Page",
                "//p[contains(text(),'Dragon Bonus')]/ancestor::li[contains(@class, 'side_bet red')]" + chipPath
        );
    }

    /***************************************************************************************************************
     * These are the methods on the Dealer Table Page.
     ***************************************************************************************************************/

    public static class Method {
        public static Component getChip(String chipValue) {
            return new Component(
                    "#" + chipValue + " Chip",
                    "Button",
                    "Dealer Table Page",
                    "//div[@class='chip_set']//div[@class='chip_text'][normalize-space()='" + chipValue + "']/ancestor::div[1]"
            );
        }
    }

}
