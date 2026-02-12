package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {
    private int defense = 20;
    private int agilityBonus = 15;

    @Override
    public int getDefense() { return defense; }

    @Override
    public String getArmorInfo() {
        return "Leather Armor (Ranger) - Boosts agility by " + agilityBonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo() + " | Defense: " + defense);
    }
}