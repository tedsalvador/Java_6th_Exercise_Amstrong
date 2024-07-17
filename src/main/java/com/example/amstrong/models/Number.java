package com.example.amstrong.models;

public class Number {

    private int value;
    private int originalValue;

    public Number(int value) {
        this.value = value;
        this.originalValue = value; // Guardamos el valor original al momento de la creación
    }

    public int getNumberOfDigits() {
        return String.valueOf(value).length();
    }

    public int calculateArmstrongValue() {
        int numberOfDigits = getNumberOfDigits();
        int sum = 0;
        int temp = originalValue; // Usamos temp en lugar de modificar value directamente

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numberOfDigits);
            temp /= 10;
        }

        return sum;
    }

    public boolean isArmstrong() {
        return calculateArmstrongValue() == originalValue;
    }
}
