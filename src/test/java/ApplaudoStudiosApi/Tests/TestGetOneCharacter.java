package ApplaudoStudiosApi.Tests;

import ApplaudoStudiosApi.BaseTest.BaseTest;
import ApplaudoStudiosApi.Models.Character;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Locale;

public class TestGetOneCharacter extends BaseTest {
    @Test(description = "Get Walter White information, id : 1")
    public void getOneCharacter() {
        Character character = characterServiceHelper.getOneCharacter(1);
        softAssert.assertNotNull(character, "Character not empty");
        System.out.println("******************************");
        System.out.println("* Printing Walter's birthday *");
        System.out.println("******************************\n\n");
        String name = character.getName();
        String birthday = character.getBirthday();
        System.out.println(name + " ---> Birthday: " + birthday);
    }
}
