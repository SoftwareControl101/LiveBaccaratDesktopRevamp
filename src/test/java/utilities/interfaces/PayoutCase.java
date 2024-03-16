package utilities.interfaces;

/*********************************************************************************************************************
 ** This interface represents the process for 'Payout' module and is utilized with lambda expressions.
 *********************************************************************************************************************/

@SuppressWarnings("unused")
public interface PayoutCase {
    int getTestCase();
    void setBetOption();
    void getBetOption();
    void computeTestCase(String[] roundResult);
    void saveTestCase(String[] roundResult);
}
