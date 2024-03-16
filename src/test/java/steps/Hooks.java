package steps;

import engine.Driver;
import io.cucumber.java.*;
import settings.HooksController;

public class Hooks {

    private final Driver driver;

    public Hooks(Driver driver) {
        this.driver = driver;
    }

    @Before()
    public void before() {
        driver.start();
        HooksController.beforeScenario();
    }

    @After()
    public void after() {
        driver.close();
        HooksController.afterScenario();
    }

    @SuppressWarnings("unused")
    @BeforeStep
    public void beforeStep(Scenario scenario) {
        HooksController.beforeStep(scenario);
    }

    @SuppressWarnings("unused")
    @AfterStep
    public void afterStep(Scenario scenario) {
        HooksController.afterStep(scenario);
    }

}
