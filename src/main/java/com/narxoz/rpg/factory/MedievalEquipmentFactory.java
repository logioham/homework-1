package com.narxoz.rpg.factory;
import com.narxoz.rpg.equipment.*;

class MedievalEquipmentFactory implements EquipmentFactory {
    public Weapon createWeapon() { return new IronSword(); }
    public Armor createArmor() { return new PlateArmor(); }
}