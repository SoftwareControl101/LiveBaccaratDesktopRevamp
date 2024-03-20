import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                monochrome = true,
                plugin = {
                        "pretty",
                        "html:test-output",
                        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                dryRun = false,
                features = "src/test/resources",
                glue = "steps",

                // ! Short Run
                //tags = "@BetInformation"
                //tags = "@UserInterface"

                // ! Long Run
                //tags= "@Payout"
                //tags= "@Gameplay"
                //tags= "@Functionality"
                //tags= "@ResultAndStatistics"

                // ! Full Run
                //tags = "@Payout or @BetInformation or @Gameplay or @Functionality or @UserInterface"

                // ! Re Run
                //tags = "@FunctionalityTest28 or @FunctionalityTest41 or @FunctionalityTest43"

                // ! Maintenance
                tags = "@Maintenance"

                /*

                 TODO: RUN THE SIC BO TEST CASES THAT CONSISTS 2 DIFFERENT BATCHES

                 ! THERE ARE 2 DIFFERENT BATCHES THAT RUNS DIFFERENT FEATURE FILES
                 ! BATCH 1: USER INTERFACE AND BET INFORMATION
                 ! BATCH 2: PAYOUT, GAMEPLAY, FUNCTIONALITY, AND RESULT & STATISTICS

                 ? BATCH 1 IS THE FASTEST BATCH AND CAN RUN ANYTIME
                 ? BATCH 2 HOWEVER WILL TAKE MORE TIME (MORE THAN AN HOUR)
                 ? +++ AND ROULETTE TABLES MUST HAVE LOWER THAN 20 TOTAL OF ROUNDS BEFORE RUNNING
                 ?
                 ? FULL RUN: BOTH BATCH 1 AND BATCH 2 WILL RUN AT THE SAME TIME
                 ? +++ WILL RUN BASED ON THESE PRIORITIES:
                 ? +++ - PAYOUT
                 ? +++ - BET INFORMATION
                 ? +++ - GAMEPLAY
                 ? +++ - FUNCTIONALITY
                 ? +++ - RESULT & STATISTICS
                 ? +++ - USER INTERFACE

                 * HOW TO RUN:
                 * COMMENT THE LINE CODE WITH 'tags' WHERE YOU DON'T WANT TO RUN
                 * +++ SAMPLE: //tags
                 * REMOVE THE COMMENT THE LINE WITH 'tags' WHERE YOU WANT TO RUN
                 * +++ SAMPLE: tags
                 * NOTES: ONLY ONE 'tags' MUST HAVE NO COMMENT '//'

                 */
        )

public class Runner { }