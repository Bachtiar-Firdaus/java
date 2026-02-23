package belajar.pakage.data;

import belajar.pakage.annotation.Fancy;

@Fancy(name = "Car", tags = {"app", "java"})
public interface Car extends HasBrand, IsMaintenance{
    void drive();
    int getTier();

    default boolean isBig() {
        return false;
    }
}
