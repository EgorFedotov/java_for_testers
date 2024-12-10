package manager;

import model.ContactData;
import org.openqa.selenium.By;

public class ContactHelper extends HelperBase{

    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void CreateContact(ContactData contact) {
        fillContactForm(contact);
        returnToHomePAge();
    }

    public void removeContact() {
        click(By.name("selected[]"));
        deleteContact();
    }

    private void fillContactForm(ContactData contact) {
        click(By.linkText("add new"));
        type(By.name("firstname"), contact.firstname());
        type(By.name("lastname"), contact.lastname());
        type(By.name("address"), contact.address());
        type(By.name("mobile"), contact.mobile());
        click(By.name("theform"));
        type(By.name("email"), contact.email());
        submitContactCreation(By.cssSelector("input:nth-child(75)"));
    }

    private void submitContactCreation(By by) {
        manager.driver.findElement(by).click();
    }

    public boolean isContactPresent() {
      return manager.isElementPresent(By.name("selected[]"));
    }

    private void returnToHomePAge() {
        manager.driver.findElement(By.linkText("home page")).click();
    }

    private void deleteContact() {
        manager.driver.findElement(By.cssSelector(".left:nth-child(8) > input")).click();
    }
}
