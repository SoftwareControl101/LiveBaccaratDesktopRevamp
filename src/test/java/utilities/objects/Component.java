package utilities.objects;

import org.openqa.selenium.By;

/*********************************************************************************************************************
 ** This object class is utilized to create a component that encompasses all details of a web element on the website.
 *********************************************************************************************************************/

@SuppressWarnings("unused")
public class Component {

    private final String Name; // * The name of the web element.
    private final String Type; // * The element type, such as Container, Button, TextBox, etc.
    private final String Page; // * The page's name to which the web element belongs.
    private final By Path; // * The XPath used to locate the web element on the website.

    @SuppressWarnings("unused")
    public Component(String Name, String Type, String Page, String Path) {
        this.Name = Name;
        this.Type = Type;
        this.Page = Page;
        this.Path = By.xpath(Path);
    }

    @SuppressWarnings("unused")
    public String getName() { return Name; }

    @SuppressWarnings("unused")
    public String getType() { return Type; }

    @SuppressWarnings("unused")
    public String getPage() { return Page; }

    @SuppressWarnings("unused")
    public By getPath() { return Path; }

}
