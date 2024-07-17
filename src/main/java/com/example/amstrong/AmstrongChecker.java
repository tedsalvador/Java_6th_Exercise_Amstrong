package com.example.amstrong;

import com.example.amstrong.models.Number;

public class AmstrongChecker {

    public boolean isAmstrong(int number) {
        Number num = new Number(number);
        return num.isArmstrong();
    }
}

