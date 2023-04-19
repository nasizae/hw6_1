package com.company;
//3. Создать класс GameEntity (Игровая сущность), выделить все общие поля которые
//присущи и Боссу и Героям и добавить геттеры и сеттеры к ним.
public class GameEnity {
    private int health;
    private int damage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
