package ApplaudoStudiosApi.Tests;

import ApplaudoStudiosApi.BaseTest.BaseTest;
import ApplaudoStudiosApi.Models.Character;
import org.testng.annotations.Test;

import java.util.List;

public class TestGetAllCharacters extends BaseTest {

    @Test(description = "Get Name and Portrayed from all characters")
    public void getAllCharacters() {
        List<Character> characterList = characterServiceHelper.getAllCharacter();
        softAssert.assertNotNull(characterList, "CharacterList is not empty");
        System.out.println("**********************************************");
        System.out.println("* Printing all Characters name and Portrayed *");
        System.out.println("**********************************************\n\n");

        for (int i = 0; i < characterList.size(); i++) {
            String name = characterList.get(i).getName();
            String portrayed = characterList.get(i).getPortrayed();
            System.out.println("Character name: \"" + name + "\"");
            System.out.println("Portrayed: \"" + portrayed + "\"");
            System.out.println("________________________________");
        }
        softAssert.assertAll();
    }
}

