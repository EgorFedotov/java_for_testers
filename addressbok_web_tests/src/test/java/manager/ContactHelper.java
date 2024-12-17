package manager;

import model.ContactData;
import model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase{

    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void CreateContact(ContactData contact) {
        fillContactForm(contact);
        returnToHomePAge();
    }

    public void removeContact(ContactData contact) {
        click(By.cssSelector(String.format("input[value='%s']", contact.id())));
        deleteContacts();
        click(By.id("logo"));
    }


    public void modifyContact(ContactData contactData, ContactData testData) {
        returnToHomePAge();
    }

    private void fillContactForm(ContactData contact) {
        click(By.linkText("add new"));
        type(By.name("firstname"), contact.firstname());
        type(By.name("lastname"), contact.lastname());
        type(By.name("address"), contact.address());
        type(By.name("mobile"), contact.mobile());
        click(By.name("theform"));
        type(By.name("email"), contact.email());
        submitContactCreation(By.name("submit"));
    }

    private void submitContactCreation(By locator) {

        manager.driver.findElement(locator).click();
    }

    private void returnToHomePAge() {
        manager.driver.findElement(By.linkText("home")).click();
    }

    private void deleteContacts() {
        manager.driver.findElement(By.cssSelector(".left:nth-child(8) > input")).click();
        //manager.driver.switchTo().alert().accept();
    }

    public int getCount() {
        return manager.driver.findElements(By.name("selected[]")).size();
    }

    public void removeAllContacts() {
        selectAllContacts();
        deleteContacts();
    }

    private void selectAllContacts() {
        var checkboxes = manager.driver.findElements(By.name("selected[]"));
        for (var checkbox : checkboxes) {
            checkbox.click();
        }
    }

    public List<ContactData> getList() {
        returnToHomePAge();
        var contacts = new ArrayList<ContactData>();
        var trs = manager.driver.findElements(By.name("entry"));
        for (var tr: trs){
            var td = tr.findElements(By.tagName("td"));
            String id = String.valueOf(Integer.parseInt(td.get(0).findElement(By.cssSelector("input[type='checkbox']")).getAttribute("value")));
            String lastname = td.get(1).getText();
            String firstname = td.get(2).getText();
            contacts.add(new ContactData().withId(id).withName(firstname).withLastName(lastname));
        }
        return contacts;
    }
}

