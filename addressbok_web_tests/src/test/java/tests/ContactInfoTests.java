package tests;

import model.ContactData;
import model.GroupData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContactInfoTests extends TestBase{

    @Test
    void testPhones(){
        if (app.hbm().getGroupCount() == 0){
            app.hbm().createGroup(new GroupData("", "group name", "group header", "group footer"));
        }
        var contacts = app.hbm().getContactList();
        var expected = contacts.stream().collect(Collectors.toMap(ContactData::id, contact ->
            Stream.of(contact.home(), contact.mobile(), contact.work(), contact.secondary())
                    .filter(s -> s != null && !"".equals(s))
                    .collect(Collectors.joining("\n"))
         ));
        var phones = app.contacts().getPhones();
        Assertions.assertEquals(expected, phones);
    }
}
