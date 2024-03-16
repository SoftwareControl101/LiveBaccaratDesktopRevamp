package modules.Functionality;

import pages.DealerTable;
import pages.TableLimit;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Component;
import utilities.objects.CustomAssert;

public class FuncTest17 extends Functionality {

    static String oldTableLimit, oldTableName, oldRoundID;

    public static void enterOtherTableLimitTable() {
        oldTableLimit = GetHandler.getText(DealerTable.Button.TableLimit);
        oldTableName = GetHandler.getText(DealerTable.Label.TableName);
        oldRoundID = GetHandler.getText(DealerTable.Label.GameId);
        Component tableLimits = TableLimit.Method.getTableLimits(false);
        EventHandler.click(tableLimits, GetHandler.getElementByRandom(tableLimits));
        WaitHandler.wait(2);
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 17");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(DealerTable.Label.PlaceYourBetsPlease, 5);

        String newTableLimit = GetHandler.getText(DealerTable.Button.TableLimit);
        CustomAssert.assertNotEquals(oldTableLimit, newTableLimit,
                "** Table Limit is Changed: " + oldTableLimit + " --> " + newTableLimit,
                "** Table Limit is Not Changed: " + oldTableLimit + " --> " + newTableLimit);

        String newTableName = GetHandler.getText(DealerTable.Label.TableName);
        CustomAssert.assertNotEquals(oldTableName, newTableName,
                "** Table Name is Changed: " + oldTableName + " --> " + newTableName,
                "** Table Name is Not Changed: " + oldTableName + " --> " + newTableName);

        String newRoundID = GetHandler.getText(DealerTable.Label.TableName);
        CustomAssert.assertNotEquals(oldRoundID, newRoundID,
                "** Round ID is Changed: " + oldRoundID + " --> " + newRoundID,
                "** Round ID is Not Changed: " + oldRoundID + " --> " + newRoundID);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}
