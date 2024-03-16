package utilities.features;

import org.testng.SkipException;
import utilities.handlers.DirectoryHandler;
import utilities.objects.Printer;
import utilities.objects.TestResult;
import settings.AutomationSetup;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class TextFileFeature extends AutomationSetup {

    /*********************************************************************************************************************
     ** These are the variables and constants used to write and read a text file with test results.
     *********************************************************************************************************************/

    private static final String DATA_FILE = "\\data.txt";

    /*********************************************************************************************************************
     ** The 'setTestResult' method is used to add test results to the list.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void setTestResult(String module, int testCase, int division, String roundResult,
                                     String expectedResult, String actualResult, String tableInfo, String otherInfo) {
        try {
            TestResult result = new TestResult();
            result.setModule(module);
            result.setTestCase(testCase);
            result.setDivision(division);
            result.setRoundResult(roundResult);
            result.setExpectedResult(expectedResult);
            result.setActualResult(actualResult);
            result.setTableInfo(tableInfo);
            result.setOtherInfo(otherInfo);
            testResultList.add(result);
            System.out.println("    Test Case " + testCase +
                    (division == 0 ? "" : " in Division " + division) + " of " + module + " is Completed.");
        } catch (Exception e) {
            Printer.printError("Failed to set test result for test case " + testCase +
                    (division == 0 ? "" : " division " + division + " of " + module));
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** The 'write' method is used for both writing data and creating a file within the test directory.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void write() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DirectoryHandler.getTextFilePath() + DATA_FILE))) {
            for (TestResult result : sortTestResults(testResultList)) {
                writer.write(
                    "Module: " + result.getModule() + " , " +
                    "Test Case: " + result.getTestCase() + " , " +
                    "Division: " + result.getDivision() + " , " +
                    "Round Result: " + result.getRoundResult() + " , " +
                    "Expected Result: " + result.getExpectedResult() + " , " +
                    "Actual Result: " + result.getActualResult() + " , " +
                    "Table Information: " + result.getTableInfo() + " , " +
                    "Other Information: " + result.getOtherInfo()
                );
                writer.newLine();
            }
        } catch (IOException e) { e.printStackTrace(); }
    }

    /*********************************************************************************************************************
     ** The 'sortTestResults' method is used for organizing result data.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    private static List<TestResult> sortTestResults(List<TestResult> results) {
        return results.stream()
                .sorted(Comparator.comparing(TestResult::getModule)
                        .thenComparing(TestResult::getTestCase)
                        .thenComparing(TestResult::getDivision))
                .collect(Collectors.toList());
    }

    /*********************************************************************************************************************
     ** The 'getTestResult' method is used to fetch test results from the list.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static TestResult getTestResult(String module, int testCase, int division) {
        try {
            testResultList = read();
            Optional<TestResult> resultOptional = testResultList
                    .stream()
                    .filter(result -> Objects.equals(result.getModule(), module))
                    .filter(result -> result.getTestCase() == testCase)
                    .filter(result -> result.getDivision() == division)
                    .findFirst();
            return resultOptional.orElseThrow();
        } catch (NoSuchElementException e) {
            Printer.printError("No round result found for test case " + testCase +
                    (division == 0 ? "" : " division " + division + " of " + module));
            throw new SkipException(e.getMessage(), e);
        } catch (Exception e) {
            Printer.printError("Failed to get test result for test case " + testCase +
                    (division == 0 ? "" : " division " + division + " of " + module));
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** The 'read' method is used for both reading data and returning a list of test results from the data file.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    private static List<TestResult> read() {
        List<TestResult> resultList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(DirectoryHandler.getTextFilePath() + DATA_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" , ");
                if (parts.length == 8) {
                    TestResult result = TextFileFeature.toTestResults(parts);
                    resultList.add(result);
                }
            }
        } catch (IOException e) { e.printStackTrace(); }
        return resultList;
    }

    /*********************************************************************************************************************
     ** The 'toTestResults' method is used for converting read data into a list of test results from the data file.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    private static TestResult toTestResults(String[] parts) {
        String module = parts[0].replace("Module: ", "");
        int testCase = Integer.parseInt(parts[1].replace("Test Case: ", ""));
        int division = Integer.parseInt(parts[2].replace("Division: ", ""));
        String roundResult = parts[3].replace("Round Result: ", "");
        String expectedResult = parts[4].replace("Expected Result: ", "");
        String actualResult = parts[5].replace("Actual Result: ", "");
        String tableInfo = parts[6].replace("Table Information: ", "");
        String otherInfo = parts[7].replace("Other Information: ", "");

        TestResult result = new TestResult();
        result.setModule(module);
        result.setTestCase(testCase);
        result.setDivision(division);
        result.setRoundResult(roundResult);
        result.setExpectedResult(expectedResult);
        result.setActualResult(actualResult);
        result.setTableInfo(tableInfo);
        result.setOtherInfo(otherInfo);
        return result;
    }

}
