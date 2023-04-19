package com.company;
//7. Создать класс Skeleton (Скелет), унаследовать от Босса
public class Skeleton extends Boss{
    //8. Добавить поле (кол-во стрел) и добавить геттеры и сеттеры в классе Skeleton.
    private int countArrow;

    public int getCountArrow() {
        return countArrow;
    }

    public void setCountArrow(int countArrow) {
        this.countArrow = countArrow;
    }
    // Переопределить родительский метод printInfo в классе Skeleton
    public String printInfo(){
      return super.printInfo()+" countArrow: "+ this.countArrow;
    }
}
