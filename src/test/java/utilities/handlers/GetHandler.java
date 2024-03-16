package utilities.handlers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.enums.HandleCollection;
import utilities.objects.Component;
import utilities.objects.Printer;
import settings.AutomationSetup;

import java.util.List;
import java.util.Random;

@SuppressWarnings("unused")
public class GetHandler extends AutomationSetup {

    /*********************************************************************************************************************
     ** The 'getElementByRandom' method returns the retrieval of a random element after they are found.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static WebElement getElementByRandom(Component component) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
            List<WebElement> elements = driver.findElements(component.getPath());
            return elements.get(new Random().nextInt(elements.size()));
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to get random element of \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

    @SuppressWarnings("unused")
    public static WebElement getElementByRandom(Component component, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
                    List<WebElement> elements = driver.findElements(component.getPath());
                    return elements.get(new Random().nextInt(elements.size()));
                } catch (Exception e) { return null; }
            case WithScroll:
                try {
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(component.getPath()));
                    List<WebElement> elements = driver.findElements(component.getPath());
                    WebElement randElement = elements.get(new Random().nextInt(elements.size()));
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", randElement);
                    return randElement;
                } catch (Exception e) {
                    String name = component.getName();
                    String type = component.getType();
                    String page = component.getPage();
                    Printer.printError("Failed to get random element of \"" + name + "\" " + type + " on " + page + " with scroll");
                    throw e;
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

    /*********************************************************************************************************************
     ** The 'getElements' method returns the retrieval of a list of elements after they are found.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static List<WebElement> getElements(Component component) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(component.getPath()));
            return driver.findElements(component.getPath());
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to get the elements of \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

    @SuppressWarnings("unused")
    public static List<WebElement> getElements(Component component, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(component.getPath()));
                    return driver.findElements(component.getPath());
                } catch (Exception e) { return null; }
            case WithScroll:
                List<WebElement> elements = driver.findElements(component.getPath());
                for (WebElement element : elements) jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
                return elements;
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

    /*********************************************************************************************************************
     ** The 'getAttribute' method returns the attribute of elements after they are found.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static String getAttribute(Component component, String attribute) {
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(component.getPath()));
            return element.getAttribute(attribute);
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to get the attribute of \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

    @SuppressWarnings("unused")
    public static String getAttribute(Component component, String attribute, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(component.getPath()));
                    return element.getAttribute(attribute);
                } catch (Exception e) { return null; }
            case WithScroll:
                try {
                    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(component.getPath()));
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
                    return element.getAttribute(attribute);
                } catch (Exception e) {
                    String name = component.getName();
                    String type = component.getType();
                    String page = component.getPage();
                    Printer.printError("Failed to get the attribute of \"" + name + "\" " + type + " on " + page + " with scroll");
                    throw e;
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

    /*********************************************************************************************************************
     ** The 'getText' method returns the text of elements after they are found.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static String getText(Component component) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
            return element.getText();
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to get the text of \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

    @SuppressWarnings("unused")
    public static String getText(Component component, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
                    return element.getText();
                } catch (Exception e) { return null; }
            case WithScroll:
                try {
                    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(component.getPath()));
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
                    return element.getText();
                } catch (Exception e) {
                    String name = component.getName();
                    String type = component.getType();
                    String page = component.getPage();
                    Printer.printError("Failed to get the text of \"" + name + "\" " + type + " on " + page + " with scroll");
                    throw e;
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

    /*********************************************************************************************************************
     ** The 'getTextArray' method returns the list of text from each element after they are found.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static String[] getTextArray(Component component) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(component.getPath()));
            List<WebElement> elements = driver.findElements(component.getPath());
            return elements.parallelStream()
                    .map(WebElement::getText)
                    .toArray(String[]::new);
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to get the list of text from \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

    @SuppressWarnings("unused")
    public static String[] getTextArray(Component component, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(component.getPath()));
                    List<WebElement> elements = driver.findElements(component.getPath());
                    return elements.parallelStream()
                            .map(WebElement::getText)
                            .toArray(String[]::new);
                } catch (Exception e) { return null; }
            case WithScroll:
                try {
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(component.getPath()));
                    List<WebElement> elements = driver.findElements(component.getPath());
                    String[] textArray = new String[elements.size()];
                    for (int i = 0; i < elements.size(); i++) {
                        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elements.get(i));
                        textArray[i] = elements.get(i).getText();
                    }
                    return textArray;
                } catch (Exception e) {
                    String name = component.getName();
                    String type = component.getType();
                    String page = component.getPage();
                    Printer.printError("Failed to get the list of text from \"" + name + "\" " + type + " on " + page + " with scroll");
                    throw e;
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

    /*********************************************************************************************************************
     ** The 'getDouble' method returns the double of elements after they are found.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static double getDouble(Component component) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
            return Double.parseDouble(element.getText().replaceAll("[^0-9.-]+", ""));
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to get the double of \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

    @SuppressWarnings("unused")
    public static double getDouble(Component component, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
                    return Double.parseDouble(element.getText().replaceAll("[^0-9.-]+", ""));
                } catch (Exception e) { return 0.0; }
            case WithScroll:
                try {
                    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(component.getPath()));
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
                    return Double.parseDouble(element.getText().replaceAll("[^0-9.-]+", ""));
                } catch (Exception e) {
                    String name = component.getName();
                    String type = component.getType();
                    String page = component.getPage();
                    Printer.printError("Failed to get the double of \"" + name + "\" " + type + " on " + page + " with scroll");
                    throw e;
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

    /*********************************************************************************************************************
     ** The 'getDoubleArray' method returns the list of double from each element after they are found.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static double[] getDoubleArray(Component component) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
            List<WebElement> elements = driver.findElements(component.getPath());
            return elements.parallelStream()
                    .map(WebElement::getText)
                    .map(s -> s.replaceAll("[^0-9.-]+", ""))
                    .filter(s -> !s.isEmpty())
                    .mapToDouble(Double::parseDouble)
                    .toArray();
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to get the list of double from \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

    @SuppressWarnings("unused")
    public static double[] getDoubleArray(Component component, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
                    List<WebElement> elements = driver.findElements(component.getPath());
                    return elements.parallelStream()
                            .map(WebElement::getText)
                            .map(s -> s.replaceAll("[^0-9.-]+", ""))
                            .filter(s -> !s.isEmpty())
                            .mapToDouble(Double::parseDouble)
                            .toArray();
                } catch (Exception e) { return null; }
            case WithScroll:
                try {
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(component.getPath()));
                    List<WebElement> elements = driver.findElements(component.getPath());
                    double[] doubleArray = new double[elements.size()];
                    for (int i = 0; i < elements.size(); i++) {
                        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elements.get(i));
                        doubleArray[i] = Double.parseDouble(elements.get(i).getText().replaceAll("[^0-9.-]+", ""));
                    }
                    return doubleArray;
                } catch (Exception e) {
                    String name = component.getName();
                    String type = component.getType();
                    String page = component.getPage();
                    Printer.printError("Failed to get the list of double from \"" + name + "\" " + type + " on " + page + " with scroll");
                    throw e;
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

    /*********************************************************************************************************************
     ** The 'getInt' method returns the integer of elements after they are found.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static int getInt(Component component) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
            return Integer.parseInt(element.getText().replaceAll("[^0-9.-]+", ""));
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to get the integer of \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

    @SuppressWarnings("unused")
    public static int getInt(Component component, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
                    return Integer.parseInt(element.getText().replaceAll("[^0-9.-]+", ""));
                } catch (Exception e) { return 0; }
            case WithScroll:
                try {
                    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(component.getPath()));
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
                    return Integer.parseInt(element.getText().replaceAll("[^0-9.-]+", ""));
                } catch (Exception e) {
                    String name = component.getName();
                    String type = component.getType();
                    String page = component.getPage();
                    Printer.printError("Failed to get the integer of \"" + name + "\" " + type + " on " + page + " with scroll");
                    throw e;
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

    /*********************************************************************************************************************
     ** The 'getIntArray' method returns the list of integer from each element after they are found.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static int[] getIntArray(Component component) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
            List<WebElement> elements = driver.findElements(component.getPath());
            return elements.parallelStream()
                    .map(WebElement::getText)
                    .map(s -> s.replaceAll("[^0-9.-]+", ""))
                    .filter(s -> !s.isEmpty())
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to get the list of integer from \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

    @SuppressWarnings("unused")
    public static int[] getIntArray(Component component, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
                    List<WebElement> elements = driver.findElements(component.getPath());
                    return elements.parallelStream()
                            .map(WebElement::getText)
                            .map(s -> s.replaceAll("[^0-9.-]+", ""))
                            .filter(s -> !s.isEmpty())
                            .mapToInt(Integer::parseInt)
                            .toArray();
                } catch (Exception e) { return null; }
            case WithScroll:
                try {
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(component.getPath()));
                    List<WebElement> elements = driver.findElements(component.getPath());
                    int[] intArray = new int[elements.size()];
                    for (int i = 0; i < elements.size(); i++) {
                        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elements.get(i));
                        intArray[i] = Integer.parseInt(elements.get(i).getText().replaceAll("[^0-9.-]+", ""));
                    }
                    return intArray;
                } catch (Exception e) {
                    String name = component.getName();
                    String type = component.getType();
                    String page = component.getPage();
                    Printer.printError("Failed to get the list of integer from \"" + name + "\" " + type + " on " + page + " with scroll");
                    throw e;
                }
            default:
                throw new IllegalArgumentException("Invalid HandleCollection Value");
        }
    }

}
