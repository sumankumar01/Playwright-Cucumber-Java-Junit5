package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Add_remove_elements {



    private Page page;
    private final Locator FULL_NAME_EDITBOX;


    public Add_remove_elements(Page page) {
        this.page = page;
        this.FULL_NAME_EDITBOX = page.getByPlaceholder("Full Name");
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
    public void clickElementNavBar(String navbarOption) {
        this.page.getByText(navbarOption, new Page.GetByTextOptions().setExact(true)).click();
    }


}
