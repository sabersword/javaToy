package org.ypq.beanwrapper;

import java.beans.PropertyEditorSupport;
import java.util.Date;

public class DatePropertyEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        Date date = (Date) getValue();
        return date.toString() + "ypq getAsText";
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Date(System.currentTimeMillis() - 1000000000));
    }
}
