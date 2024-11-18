package com.globant_test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends BasePage {

    // Elementos de la calculadora
    @FindBy(id = "com.google.android.calculator:id/digit_9")
    private WebElement digit_9;

    @FindBy(id = "com.google.android.calculator:id/digit_6")
    private WebElement digit_6;

    @FindBy(id = "com.google.android.calculator:id/op_add")
    private WebElement sign_plus;

    @FindBy(id = "com.google.android.calculator:id/eq")
    private WebElement sign_equal;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    private WebElement final_result;

    // Métodos para interactuar con la calculadora
    public void clickNumberNine() {
        click_android(digit_9);
    }

    public void clickNumberSix() {
        click_android(digit_6);
    }

    public void clickPlus() {
        click_android(sign_plus);
    }

    public void clickEquals() {
        click_android(sign_equal);
    }

    public String getResult() {
        return getElementValue(final_result);
    }
}
