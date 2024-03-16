package utilities.objects;

/*********************************************************************************************************************
 ** This object class contains all information regarding test results.
 ** It is mainly used to generate a .txt file containing all data for each round in the project.
 *********************************************************************************************************************/

@SuppressWarnings("unused")
public class TestResult {

    /*********************************************************************************************************************
     ** These are the variables for each test result to generate a data file.
     *********************************************************************************************************************/

    private int testCase, division;
    private String module, roundResult, expectedResult, actualResult, tableInfo, otherInfo;

    /*********************************************************************************************************************
     ** These methods are meant for getting and setting the variables for each test result to generate a data file.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public String getModule() { return module; }

    @SuppressWarnings("unused")
    public void setModule(String module) { this.module = module; }

    @SuppressWarnings("unused")
    public int getTestCase() { return testCase; }

    @SuppressWarnings("unused")
    public void setTestCase(int testCase) { this.testCase = testCase; }

    @SuppressWarnings("unused")
    public int getDivision() { return division; }

    @SuppressWarnings("unused")
    public void setDivision(int division) { this.division = division; }

    @SuppressWarnings("unused")
    public String getRoundResult() { return roundResult; }

    @SuppressWarnings("unused")
    public void setRoundResult(String roundResult) { this.roundResult = roundResult; }

    @SuppressWarnings("unused")
    public String getExpectedResult() { return expectedResult; }

    @SuppressWarnings("unused")
    public void setExpectedResult(String expectedResult) { this.expectedResult = expectedResult; }

    @SuppressWarnings("unused")
    public String getActualResult() { return actualResult; }

    @SuppressWarnings("unused")
    public void setActualResult(String actualResult) { this.actualResult = actualResult; }

    @SuppressWarnings("unused")
    public String getTableInfo() { return tableInfo; }

    @SuppressWarnings("unused")
    public void setTableInfo(String tableInfo) { this.tableInfo = tableInfo; }

    @SuppressWarnings("unused")
    public String getOtherInfo() { return otherInfo; }

    @SuppressWarnings("unused")
    public void setOtherInfo(String otherInfo) { this.otherInfo = otherInfo; }

}
