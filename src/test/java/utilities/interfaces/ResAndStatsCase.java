package utilities.interfaces;

/*********************************************************************************************************************
 ** This interface represents the process for 'Result And Statistics' module and is utilized with lambda expressions.
 *********************************************************************************************************************/

@SuppressWarnings("unused")
public interface ResAndStatsCase {
    int getTestCase();
    int getDivision();
    void setStatistics();
    void saveTestCase(String[] roundResult);
}
