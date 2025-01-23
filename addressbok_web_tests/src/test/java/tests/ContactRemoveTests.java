package tests;// Generated by Selenium IDE

import io.qameta.allure.Allure;
import model.ContactData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

public class ContactRemoveTests extends TestBase{


  @Test
  public void CanRemoveContact() {

    Allure.step("Checking precondition", step -> {
      if (app.hbm().getContactCount() == 0) {
        app.hbm().CreateContact(new ContactData("", "egor", "fedotov", "arzamas", "88005553535", "egor@gmail.com", "", "", "", "", "", "", ""));
      }
    });
    var oldContacts = app.hbm().getContactList();
    var rnd = new Random();
    var index = rnd.nextInt(oldContacts.size());
    app.contacts().removeContact(oldContacts.get(index));
    var newContacts = app.hbm().getContactList();
    var expectedList = new ArrayList<>(oldContacts);
    expectedList.remove(index);
    Allure.step("Validating results", step -> {
      Assertions.assertEquals(newContacts, expectedList);
    });
  }

  @Test
  public void CanRemoveAllContacts(){
    Allure.step("Checking precondition", step -> {
      if (app.hbm().getContactCount() == 0){
        app.hbm().CreateContact(new ContactData("", "egor", "fedotov", "arzamas", "88005553535", "egor@gmail.com", "", "", "", "", "", "", ""));
      }
    });
    app.contacts().removeAllContacts();
    Allure.step("Validating results", step -> {
      Assertions.assertEquals(0, app.contacts().getCount());
    });
  }
}
