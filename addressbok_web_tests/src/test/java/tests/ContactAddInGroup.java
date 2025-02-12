package tests;

import common.CommonFunctions;
import model.ContactData;
import model.GroupData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ContactAddInGroup extends TestBase{

    public static List<ContactData> singleRandomContact() {
        return List.of(new ContactData()
                .withName(CommonFunctions.randomString(10))
                .withLastName(CommonFunctions.randomString(10))
                .withAddress(CommonFunctions.randomString(10))
                .withMobile(CommonFunctions.randomString(10))
                .withEmail(CommonFunctions.randomString(10)));
    }

    @ParameterizedTest
    @MethodSource("singleRandomContact")
    void canAddContactInGroup(ContactData contact) {
        if (app.hbm().getGroupCount() == 0){
            app.hbm().createGroup(new GroupData("", "group name", "group header", "group footer"));
        }
        if ( app.contacts().getCount() == 0){
            app.contacts().CreateContact(new ContactData("", "egor", "fedotov", "arzamas", "88005553535", "egor@gmail.com", "", "", "", "", "", "", ""));
        }
        var groupList = app.hbm().getGroupList();

        ContactData contactForAddToGroup = null;
        GroupData groupData = groupList.getFirst();
        var oldContactListInGroup = app.hbm().getContactsInGroup(groupData);
        var contactListNotInGroup = app.hbm().getContactsNotInGroup();
        if  ((contactListNotInGroup != null) && (!contactListNotInGroup.isEmpty())) {
            contactForAddToGroup = contactListNotInGroup.getFirst();
            app.contacts().addContactInToGroup(contactForAddToGroup, groupData);
        }
        else {
            app.contacts().CreateContact(contact);
            contact = contact.withId(app.hbm().getIdContactByName(contact.firstname()));
            app.contacts().addContactInToGroup(contact, groupData);
            contactForAddToGroup = contact;
        }
        var expectedContactListInGroup = app.hbm().getContactsInGroup(groupData);
        var newContactListInGroup = new ArrayList<>(oldContactListInGroup);
        newContactListInGroup.add(contactForAddToGroup);
        Assertions.assertEquals(Set.copyOf(expectedContactListInGroup), Set.copyOf(newContactListInGroup));
    }
}
