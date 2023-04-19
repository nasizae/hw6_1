package com.company;
//2. Создать класс Weapon (Оружие), с приватными полями тип оружия и название
//оружия. И добавить геттеры и сеттеры
public class Weapon {
    private WeaponType weaponType;
    private String nameWeapon;

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }
}
