package com.mireaHW.lab8;

import java.util.Scanner;
import java.util.Vector;

public class FurnitureShop {
    private Vector cart = new Vector(0);
    private int cash = 0;

    public int getCash() {
        return cash;
    }

    public Vector getCart() {
        return cart;
    }

    public void menu() {
        int sw = 0;

        while (sw != 5) {
            System.out.println("Выберите опцию: ");
            System.out.println("1) Добавить в корзину");
            System.out.println("2) Убрать из корзины");
            System.out.println("3) Подсчитать итоговую стоимость (временно не работает!)");
            System.out.println("4) Выход");
            Scanner scanner = new Scanner(System.in);
            sw = scanner.nextInt();

            switch (sw) {
                case 1:
                    addCart();
                    break;
                case 2:
                    remCart();
                    break;
                case 3:
                    System.out.println(cash);
                    break;
                default:
                    System.out.println();
                    break;
            }
        }
    }

    private void remCart() {
        System.out.println();
        System.out.println("Выберите товар, который хотите удалить из корзины: ");
        if (cart.size() != 0) {
            for (int i = 0; i < cart.size(); i++) {
                System.out.println(Integer.toString(i + 1) + ") " + cart.elementAt(i));
            }

            Scanner scanner = new Scanner(System.in);
            cart.remove(scanner.nextInt() - 1);
            System.out.println();
        } else {
            System.out.println("В корзине нет товаров!");
            System.out.println();
        }
    }

    private void addCart() {
        int sw = 0;
        int color, size, material;

        System.out.println();
        System.out.println("Выберите товар: ");
        System.out.println("1) Кровать");
        System.out.println("2) Стол");
        System.out.println("3) Полка");

        Scanner scanner = new Scanner(System.in);

        sw = scanner.nextInt();

        System.out.println();
        System.out.print("Введите цвет = ");
        color = scanner.nextInt();

        System.out.print("Введите размер = ");
        size = scanner.nextInt();

        System.out.print("Введите материал = ");
        material = scanner.nextInt();

        switch (sw) {
            case 1:
                System.out.print("Введите через пробел тип пружины и ножек = ");
                cart.addElement(new Bed(color, size, material, scanner.nextInt(), scanner.nextInt()));
                break;
            case 2:
                System.out.print("Введите через пробел количество ножек, тип ножек и высоту стола = ");
                cart.addElement(new Table(color, size, material, scanner.nextInt(),
                        scanner.nextInt(), scanner.nextInt()));
                break;
            case 3:
                System.out.print("Введите через пробел тип крепления и стиль полки = ");
                cart.addElement(new Shelf(color, size, material, scanner.nextInt(), scanner.nextInt()));
                break;
            default:
                System.out.println();
                break;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "FurnitureShop{" +
                "cart=" + cart +
                ", cash=" + cash +
                '}';
    }
}
