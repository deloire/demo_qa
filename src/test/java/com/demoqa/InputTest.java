package com.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class InputTest {

    @Test
    void fillFormTest() {
        Configuration.holdBrowserOpen = true;
        Selenide.open("https://demoqa.com/text-box");
        Configuration.timeout = 7000;
        $("[id=userName]").setValue("Steve Jobs");
        $("[id=userEmail]").setValue("examle@gmail.com");
        $("[id=currentAddress]").setValue("1200 Park Avenue, Oakland.");
        $("[id=permanentAddress]").setValue("Unknown");

        $("[id=submit]").click();
        $("[id=output]").shouldHave(text("examle@gmail.com"));

    }


}
