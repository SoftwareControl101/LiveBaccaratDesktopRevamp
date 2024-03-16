package modules.Functionality;

import pages.DealerTable;
import pages.Help;
import utilities.enums.HandleCollection;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.Component;

public class FuncTest15 extends Functionality {

    public static void verify(boolean isClick) {
        if(isClick) {

            System.out.println();
            System.out.println("Module: FUNCTIONALITY");
            System.out.println("Test Case: 15");
            System.out.println("Actual Results: ");

            verifyHelpDisplay(Help.Button.Basics, Help.Container.Basics);
            verifyHelpDisplay(Help.Button.BetOptions, Help.Container.BetOptions);
            verifyHelpDisplay(Help.Button.GameControls, Help.Container.GameControls);
            verifyHelpDisplay(Help.Button.Likelihood, Help.Container.Likelihood);

        } else {

            verifyHelpHidden(Help.Button.Basics, Help.Container.Basics);
            verifyHelpHidden(Help.Button.BetOptions, Help.Container.BetOptions);
            verifyHelpHidden(Help.Button.GameControls, Help.Container.GameControls);
            verifyHelpHidden(Help.Button.Likelihood, Help.Container.Likelihood);

            System.out.println();
            EventHandler.click(Help.Button.Back);
            EventHandler.click(50, 50);
            EventHandler.click(DealerTable.Button.Back);

        }
    }

    private static void verifyHelpDisplay(Component button, Component container) {
        EventHandler.click(button, HandleCollection.WithScroll);
        VerificationHandler.verifyIfContained(container, "data-gtm", "Off", "Displayed");
    }

    private static void verifyHelpHidden(Component button, Component container) {
        EventHandler.click(button, HandleCollection.WithScroll);
        VerificationHandler.verifyIfNotContained(container, "data-gtm", "Off", "Hidden");
    }

}
