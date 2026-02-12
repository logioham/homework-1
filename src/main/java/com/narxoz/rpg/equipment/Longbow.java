package com.narxoz.rpg.equipment;

public class Longbow implements Weapon {
    private int damage = 30;
    private String range = "Long";

    @Override
    public int getDamage() { return damage; }

    @Override
    public String getWeaponInfo() {
        return "Longbow (Ranger) - Perfect for long-range combat.";
    }

    @Override
    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo() + " | Damage: " + damage + " | Range: " + range);
    }
}