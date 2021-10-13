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
            phone = "9991845170",
            dateOfBirth = "1994",
            subjects = "Maths",
            currentAddress = "Saratov",
            state = "Rajasthan",
            city = "Jaipur",
            assertName = "Ruslan Munasipov",
            assertEMail = "ruslanmunasipov23@gmail.com",
            assertGender = "Male",
            assertPhone = "9991845170",
            assertDateOfBirth = "23 February,1994",
            assertSubjects = "Maths",
            assertHobbies = "Sports",
            assertPicture = "123.jpg",
            assertCurrentAddress = "Saratov",
            assertStateCity = "Rajasthan Jaipur";


    @Test
    public void main() throws InterruptedException {
        open("https://demoqa.com/automation-practice-form");


        //заполняем


        $x("//div[@class = 'col-md-4 col-sm-6']//input[@placeholder = 'First Name']").setValue(name);
        $x("//div[@class = 'col-md-4 col-sm-6']//input[@placeholder = 'Last Name']").setValue(lastName);
        $x("//div[@class = 'col-md-9 col-sm-12']//input[@placeholder = 'name@example.com']").setValue(eMail);
        $x("//label[@for = 'gender-radio-1']").click();
        $x("//div[@class = 'col-md-9 col-sm-12']//input[@id = 'userNumber']").setValue(phone);
        $x("//div[@class = 'react-datepicker__input-container']//input").click();
        $x("//select[@class = 'react-datepicker__month-select']").selectOptionByValue("1");
        $x("//select[@class='react-datepicker__year-select']").selectOption(dateOfBirth);
        $x("//div[@class = 'react-datepicker__day react-datepicker__day--023']").click();
        $x("//div[@class = 'subjects-auto-complete__input']//input[@id = 'subjectsInput']").setValue(subjects).pressEnter();
        $x("//label[@for = 'hobbies-checkbox-1']").click();
        $x("//input[@id = 'uploadPicture']").uploadFromClasspath("123.jpg");
        $x("//div[@class = 'col-md-9 col-sm-12']//textarea[@class = 'form-control']").setValue(currentAddress);
        $x("//input[@id = 'react-select-3-input']").setValue(state).pressEnter();
        $x("//input[@id = 'react-select-4-input']").setValue(city).pressEnter();
        $x("//button[text() = 'Submit']").click();


        //проверяем


        Assertions.assertEquals($x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//td[.= 'Ruslan Munasipov']").getText(), assertName, "nashel");
        Assertions.assertEquals($x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//td[.= 'ruslanmunasipov23@gmail.com']").getText(), assertEMail, "nashel");
        Assertions.assertEquals($x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//td[.= 'Male']").getText(), assertGender, "nashel");
        Assertions.assertEquals($x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//td[.= '9991845170']").getText(), assertPhone, "nashel");
        Assertions.assertEquals($x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//td[.= '23 February,1994']").getText(), assertDateOfBirth, "nashel");
        Assertions.assertEquals($x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//td[.= 'Maths']").getText(), assertSubjects, "nashel");
        Assertions.assertEquals($x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//td[.= 'Sports']").getText(), assertHobbies, "nashel");
        Assertions.assertEquals($x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//td[.= '123.jpg']").getText(), assertPicture, "nashel");
        Assertions.assertEquals($x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//td[.= 'Saratov']").getText(), assertCurrentAddress, "nashel");
        Assertions.assertEquals($x("//table[@class = 'table table-dark table-striped table-bordered table-hover']//td[.= 'Rajasthan Jaipur']").getText(), assertStateCity, "nashel");
    }
}



