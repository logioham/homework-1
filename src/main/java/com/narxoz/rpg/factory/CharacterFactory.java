package com.narxoz.rpg.factory;
import com.narxoz.rpg.character.Character;

abstract class CharacterFactory {
    public abstract Character createCharacter(String name);
}

