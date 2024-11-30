import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void CanCreateGroup() {
        openGroupPage();
        createGroup(new GroupData("group name", "group header", "group footer"));
    }

    @Test
    public void CanCreateGroupWithName() {
        openGroupPage();
        createGroup(new GroupData());
    }


    @Test
    public void CanCreateGroupWithNameOnly() {
        openGroupPage();
        var emptyGroup = new GroupData();
        var groupWithName = emptyGroup.withName("some name");
        createGroup(groupWithName);
    }
}
