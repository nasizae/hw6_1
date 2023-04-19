package com.company;

public class Main {

    public static void main(String[] args) {
//В классе Main создать 1 экземпляр босса и задать ему все свойства (значения
//полям). Затем распечатать всю информацию о боссе.
        Weapon weapon=new Weapon();
        weapon.setNameWeapon("UTAS UTS-15");
        weapon.setWeaponType(WeaponType.SHOTGUN);
        Boss boss=new Boss();
        boss.setHealth(700);
        boss.setDamage(200);
        boss.setWeapon(weapon);
        System.out.println("BOSS:");
        //В Main распечатать информацию о Боссе с помощью метода printInfo, также
        //создать 2 экземпляра скелета и заполнить данными) затем распечатать всю
        //информацию о скелетах.
        System.out.println(boss.printInfo());

        System.out.println("Skeleton1:");
        Skeleton skeleton1=new Skeleton();
        skeleton1.setHealth(200);
        skeleton1.setDamage(100);
        skeleton1.weapon.setNameWeapon("Arrow");
       skeleton1.weapon.setWeaponType(WeaponType.RIFLE);
        skeleton1.setCountArrow(50);
        System.out.println(skeleton1.printInfo());

        System.out.println("Skeleton2:");
        Skeleton skeleton2=new Skeleton();
        skeleton2.setHealth(250);
        skeleton2.setDamage(150);
        skeleton2.weapon.setNameWeapon("Arrow");
        skeleton2.weapon.setWeaponType(WeaponType.RIFLE);
        skeleton2.setCountArrow(60);
        System.out.println(skeleton2.printInfo());
    }
}
