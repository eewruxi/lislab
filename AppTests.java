import com.codeborne.selenide.Condition;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;

public class AppTests {
    @Test
    public void RollButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@id='link_1']").click();
        sleep(3000);
        $x("//*[@id='app']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void PizzaButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@id='link_14']").click();
        sleep(3000);
        $x("//*[@id='app']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void ZakuskiButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@name='zakuski']").click();
        sleep(3000);
        $x("//*[@id='app']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void PastaButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@id='link_15']").click();
        sleep(3000);
        $x("//*[@id='app']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void NapitkiButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@id='link_6']").click();
        sleep(3000);
        $x("//*[@id='app']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void SousyButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@id='link_7']").click();
        sleep(3000);
        $x("//*[@id='app']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void AddToCartButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@class='MuiButtonGroup-root MuiButtonGroup-outlined MuiButtonGroup-disableElevation ActionsCartButtonStart css-1eh4l5p']").click();
        $x("//*[@id='app']").shouldBe(Condition.visible);
        sleep(3000);
    }

    @Test
    public void CartButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@class='MuiButtonGroup-root MuiButtonGroup-outlined MuiButtonGroup-disableElevation ActionsCartButtonStart css-1eh4l5p']").click();
        $x("//*[@class='headerCart count']").click();
        $x("//*[@id='app']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void OrderButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@class='MuiButtonGroup-root MuiButtonGroup-outlined MuiButtonGroup-disableElevation ActionsCartButtonStart css-1eh4l5p']").click();
        $x("//*[@class='headerCart count']").click();
        sleep(3000);
        $x("//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButtonGroup-grouped MuiButtonGroup-groupedHorizontal MuiButtonGroup-groupedContained MuiButtonGroup-groupedContainedHorizontal MuiButtonGroup-groupedContainedPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButtonGroup-grouped MuiButtonGroup-groupedHorizontal MuiButtonGroup-groupedContained MuiButtonGroup-groupedContainedHorizontal MuiButtonGroup-groupedContainedPrimary css-6wz749']").click();
        $x("//*[@id='app']").shouldBe(Condition.visible);
        sleep(3000);
    }

    @Test
    public void LoginYandexButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@class='MuiButtonGroup-root MuiButtonGroup-outlined MuiButtonGroup-disableElevation ActionsCartButtonStart css-1eh4l5p']").click();
        $x("//*[@class='headerCart count']").click();
        sleep(1000);
        $x("//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButtonGroup-grouped MuiButtonGroup-groupedHorizontal MuiButtonGroup-groupedContained MuiButtonGroup-groupedContainedHorizontal MuiButtonGroup-groupedContainedPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButtonGroup-grouped MuiButtonGroup-groupedHorizontal MuiButtonGroup-groupedContained MuiButtonGroup-groupedContainedHorizontal MuiButtonGroup-groupedContainedPrimary css-6wz749']").click();
        sleep(1000);
        $x("//*[@href='https://oauth.yandex.ru/authorize?response_type=code&redirect_uri=https%3A%2F%2Fjacofood.ru%2Fsamara&client_id=15b6c4f1191f4243bd23e33893f1f16e&scrope=default_phone']").click();
        sleep(3000);
    }
    @Test
    public void LoginCreateButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@class='MuiButtonGroup-root MuiButtonGroup-outlined MuiButtonGroup-disableElevation ActionsCartButtonStart css-1eh4l5p']").click();
        $x("//*[@class='headerCart count']").click();
        sleep(1000);
        $x("//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButtonGroup-grouped MuiButtonGroup-groupedHorizontal MuiButtonGroup-groupedContained MuiButtonGroup-groupedContainedHorizontal MuiButtonGroup-groupedContainedPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButtonGroup-grouped MuiButtonGroup-groupedHorizontal MuiButtonGroup-groupedContained MuiButtonGroup-groupedContainedHorizontal MuiButtonGroup-groupedContainedPrimary css-6wz749']").click();
        sleep(1000);
        $x("//*[@class='loginCreate']").click();
        sleep(3000);
    }
    @Test
    public void LoginButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@class='MuiButtonGroup-root MuiButtonGroup-outlined MuiButtonGroup-disableElevation ActionsCartButtonStart css-1eh4l5p']").click();
        $x("//*[@class='headerCart count']").click();
        sleep(1000);
        $x("//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButtonGroup-grouped MuiButtonGroup-groupedHorizontal MuiButtonGroup-groupedContained MuiButtonGroup-groupedContainedHorizontal MuiButtonGroup-groupedContainedPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButtonGroup-grouped MuiButtonGroup-groupedHorizontal MuiButtonGroup-groupedContained MuiButtonGroup-groupedContainedHorizontal MuiButtonGroup-groupedContainedPrimary css-6wz749']").click();
        sleep(1000);
        $x("//*[@class='loginLogin']").click();
        sleep(3000);
    }

    @Test
    public void CompoundButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@class='MuiTypography-root MuiTypography-h5 CardNameItem css-zq6grw']").click();
        sleep(3000);
    }

    @Test
    public void ContactButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@href='/samara/contacts']").click();
        sleep(3000);
        $x("//*[@id='app']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void SaleButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@href='/samara/akcii']").click();
        sleep(3000);
        $x("//*[@id='app']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void DocButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@href='/samara/akcii']").click();
        sleep(2000);
        $x("//*[@href='https://storage.yandexcloud.net/site-other-data/jaco_2023_12_06.pdf']").click();
        $x("//*[@id='app']").shouldBe(Condition.visible);
        sleep(3000);
    }
    @Test
    public void VKButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        sleep(2000);
        $x("//*[@href='https://vk.com/jacofood_smr']").click();
        sleep(3000);
    }
    @Test
    public void TGButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        sleep(2000);
        $x("//*[@href='https://t.me/jacofood']").click();
        sleep(3000);
    }
    @Test
    public void MinusButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@class='MuiButtonGroup-root MuiButtonGroup-outlined MuiButtonGroup-disableElevation ActionsCartButtonStart css-1eh4l5p']").click();
        sleep(1000);
        $x("//*[@class='minus']").click();
        sleep(3000);
    }
    @Test
    public void PlusButton() {
        open("https://jacofood.ru/samara");
        $x("//*[@class='active active']").click();
        $x("//*[@class='MuiButtonGroup-root MuiButtonGroup-outlined MuiButtonGroup-disableElevation ActionsCartButtonStart css-1eh4l5p']").click();
        sleep(1000);
        $x("//*[@class='plus']").click();
        sleep(3000);
    }

}
