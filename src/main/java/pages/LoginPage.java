package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LoginPage {



    private Page page;
    private final Locator USER_NAME;
    private final Locator PASSWORD;
    private final Locator SUBMIT;




    public LoginPage(Page page) {
        this.page = page;
        this.USER_NAME = page.getByPlaceholder("Username");
        this.PASSWORD = page.getByPlaceholder("Password");
        this.SUBMIT = page.getByRole(AriaRole.BUTTON,  new Page.GetByRoleOptions().setName("Login "));
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
    public void EnterUserName(String username) {
        USER_NAME.fill(username);
    }

    public void EnterPassword(String password) {
        PASSWORD.fill(password);
    }

    public void ClickSubmit() {
        SUBMIT.click();
    }




}
