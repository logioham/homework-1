package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon {
    private int damage = 15;
    private int manaBoost = 20;

    @Override
    public int getDamage() { return damage; }

    @Override
    public String getWeaponInfo() {
        return "Wizard Staff (Magic) - Increases mana by " + manaBoost;
    }

    @Override
    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo() + " | Base Damage: " + damage);
    }
}