package com.bean;

/**
 * @Program: MyJavaStudy
 * @ClassName: Card
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-01 11:39
 * @Version: V1.0
 */
public class Card {
    private Integer id;
    private String number;
    private Person p;

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", p=" + p +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public Card(Integer id, String number, Person p) {
        this.id = id;
        this.number = number;
        this.p = p;
    }

    public Card() {
    }
}
