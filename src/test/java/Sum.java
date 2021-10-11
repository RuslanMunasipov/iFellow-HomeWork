import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sum {
    @BeforeAll
    static void setUp(){
        Configuration.startMaximized = true;
    }
    String name = "Ruslan",
            lastName = "Munasipov",
            eMail = "ruslanmunasipov23@gmail.com",
            phone = "79991845170",
            dateOfBirth = "23 feb 1994",
            subjects = "java, automationQA",
            currentAddress = "Saratov";

//    xPaths
//    First Name: //div[@class = 'col-md-4 col-sm-6']//input[@placeholder = 'First Name']
//    Last Name: //div[@class = 'col-md-4 col-sm-6']//input[@placeholder = 'Last Name']
//    Email: //div[@class = 'col-md-9 col-sm-12']//input[@placeholder = 'name@example.com']
//    Male Gender: //label[@for = 'gender-radio-1']
//    Phone: //div[@class = 'col-md-9 col-sm-12']//input[@id = 'userNumber']
//    DateOfBirth: //select[@class = 'react-datepicker__month-select']/option[@value = '1'] - February
//    Subjects: //div[@class = 'subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']
//    HobbiesSport: //label[@for = 'hobbies-checkbox-1']
//    UploadPicture: //label[@for = 'uploadPicture']
//    CurrentAddress: //div[@class = 'col-md-9 col-sm-12']//textarea[@class = 'form-control']
//    SelectState: //div[@class = ' css-yk16xz-control']
//    SelectCity: //div[@class = ' css-14jk2my-container']
//    Submit: //button[text() = 'Submit']

    @Test
    public void main() throws InterruptedException {
        open("https://demoqa.com/automation-practice-form");
        $x("//div[@class = 'col-md-4 col-sm-6']//input[@placeholder = 'First Name']").setValue(name);
        $x("//div[@class = 'col-md-4 col-sm-6']//input[@placeholder = 'Last Name']").setValue(lastName);
        $x("//div[@class = 'col-md-9 col-sm-12']//input[@placeholder = 'name@example.com']").setValue(eMail);
        $x("//label[@for = 'gender-radio-1']").click();
        $x("//div[@class = 'col-md-9 col-sm-12']//input[@id = 'userNumber']").setValue(phone);
        $x("//div[@class = 'react-datepicker__input-container']//input").click();
        $x("//select[@class = 'react-datepicker__month-select']").click();
        $x("//select[@class = 'react-datepicker__month-select']").selectOptionByValue("1");
        $x("//div[@class = 'react-datepicker__year-dropdown-container react-datepicker__year-dropdown-container--select']").click();
        $x("//div[@class = 'react-datepicker__year-dropdown-container react-datepicker__year-dropdown-container--select']").selectOption("1994");
        $x("//div[@class = 'react-datepicker__day react-datepicker__day--023']").selectOptionByValue("23");
        $x("//div[@class = 'subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']").click();
        $x("//label[@for = 'hobbies-checkbox-1']").click();
        //$x("//label[@for = 'uploadPicture']").click();
        $x("//div[@class = 'col-md-9 col-sm-12']//textarea[@class = 'form-control']").setValue(currentAddress);
        //$x("//div[@class = ' css-yk16xz-control']").setValue("sar");
        //$x("//div[@class = ' css-14jk2my-container']").setValue("Saratov");
        $x("//button[text() = 'Submit']").click();
        $x("//button[text() = 'Submit']").click();
        Assertions.assertEquals($x("//div[@class = 'col-md-4 col-sm-6']//input[@placeholder = 'First Name']").getText(), name, "nashel");
        Assertions.assertEquals($x("//div[@class = 'col-md-4 col-sm-6']//input[@placeholder = 'Last Name']").getText(), lastName, "nashel");
    }
}

