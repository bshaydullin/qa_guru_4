import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FindSoftAssertions {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void successfulSubmitFormTest() {
        open("https://github.com/selenide/selenide/");

        $("#wiki-tab").click();
        $(".js-wiki-more-pages-link").click();
        $(byText("SoftAssertions")).click();
        $(byText("Using JUnit5 extend test class:")).shouldBe(visible);
    }
}