/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zagorodnyk.zagorodnyk;

import java.util.Locale;
import java.util.ResourceBundle;

public class PropertyValue {

    private String key;
    private Locale currentLocale;
    private final String PATH_PROP = "i18n/messages";

    public PropertyValue(String key, Locale currentLocale) {
        this.key = key;
        this.currentLocale = currentLocale;
    }

    public PropertyValue() {
    }

    public String getPropValues() {
        ResourceBundle labels = ResourceBundle.getBundle(PATH_PROP, currentLocale);
        return labels.getString(key);
    }
}
