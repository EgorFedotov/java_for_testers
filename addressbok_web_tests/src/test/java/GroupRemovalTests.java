import org.junit.jupiter.api.Test;

public class GroupRemovalTests extends TestBase{


    @Test
    public void CanRemoveGroup() {
        openGroupPage();
        if (!isGroupPresent()){
            createGroup("group name", "group header", "group footer");
        }
        removeGroup();
    }

}
