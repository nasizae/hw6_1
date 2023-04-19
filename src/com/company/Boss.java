package com.company;
//4. Создать класс Босса, наследовать его от класса GameEntity и дополнить его полем
//сложного типа данных Weapon (то есть дать оружие боссу). Также добавить
//геттеры и сеттеры для этого поля
public class Boss extends GameEnity {
   Weapon weapon=new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    //6. Распечатывание информации сделать в методе в классе Босса public String
    //printInfo(){}
    public String printInfo(){
return "health: "+getHealth()+" damage: "+getDamage()+" weaponName: "+weapon.getNameWeapon()+" weaponType: "+weapon.getWeaponType();
    }
}
