# Mystic Mayhem

Mystic Mayhem is a **Java-based turn-based battle game** between two players.  
Each player builds an army, equips them with weapons and armor, and strategically battles opponents in different home grounds with unique bonuses.

---

## 🎮 Features

- **Player Profiles**
  - Create profiles with unique username and system-generated user ID.
  - Change name anytime (username is fixed once created).
  - Earn gold coins and XP through battles.
  
- **Army Creation**
  - Choose one character from each category:
    - Archer
    - Knight
    - Mage
    - Healer
    - Mythical Creature
  - Buy/sell characters with gold coins (selling returns 90% of current value).
  - Equip characters with **1 artefact** and **1 armor** each (optional).

- **Battle System**
  - Turn-based combat, ordered by character speed.
  - Strategic targeting based on lowest defense or healing allies.
  - Special home ground bonuses affecting stats.
  - Win by eliminating all enemy characters or draw after 10 turns.

- **Home Grounds**
  - Hillcrest, Marshland, Desert, Arcane — each with unique buffs and debuffs for certain character categories.

- **Economy & Progression**
  - Start with **500 gold coins**.
  - Winner gains **10%** of opponent’s coins.
  - XP increases by **1** per victory.
  - No coin/XP exchange in draws.

---

## 🗡 Characters & Equipment

- **Character Categories:** Archers, Knights, Mages, Healers, Mythical Creatures.
- **Stats:** Attack, Defense, Health, Speed.
- **Equipment Types:**
  - **Armor**: Increases defense or health, may affect speed.
  - **Artefacts**: Enhance attack, defense, or speed.

---

## 🏟 Home Ground Effects

| Home Ground | Buffs | Debuffs |
|-------------|-------|---------|
| **Hillcrest** | Highlanders +1 ATK/DEF, bonus 20% ATK extra turn | Marshlanders & Sunchildren -1 SPD |
| **Marshland** | Marshlanders +2 DEF | Sunchildren -1 ATK, Mystics -1 SPD |
| **Desert** | Sunchildren +1 ATK | Marshlanders -1 HP |
| **Arcane** | Mystics +2 ATK, heal 10% after attack | Highlanders & Marshlanders -1 SPD/DEF |

---

## ⚔ Combat Rules

1. Players take turns based on **character speed**.
2. Priority order when speeds are equal:  
   **Healer < Mage < Mythical Creature < Knight < Archer**.
3. Target selection: Attackers hit **lowest defense** opponent (healers heal lowest HP ally).
4. Health/damage formulas:
   - Damage: `0.5 * Attacker ATK - 0.1 * Defender DEF`
   - Healing: `0.1 * Healer ATK`
5. Battle ends when:
   - All characters of one side are defeated → Win.
   - 10 turns pass → Draw.

---

## 📂 Project Structure

