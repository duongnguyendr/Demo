package org.example.base;

public abstract class BasePage extends Base {

    public <TPage extends BasePage> TPage As(Class<TPage> PageInstance) {
        try {
            return (TPage) this;

        } catch (Exception e) {
            e.getStackTrace();
        }
        return null;
    }
}


