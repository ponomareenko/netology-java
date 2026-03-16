package ru.netology.service;

public class CustomsService {
    public static final int ST_PO_WEIGHT = 100;

    public static int calculateCustoms(int price, int weight) {
        int result = (price / 100) + (weight * ST_PO_WEIGHT);
        return result;
    }
}
