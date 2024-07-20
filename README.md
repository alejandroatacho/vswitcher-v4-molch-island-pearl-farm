# V4 Molch island - Molch Pearl Minigame 31.2k Fish/ 41.8k Hunt/ 9.3k Cooking Exp/PH

## User Variables && Requirements
- `maxPearl`: The pearl count in your inventory at which you want the farming to stop.
- knife and its in the last spot of your inventory spot
- 30 Fish Chunks (you need to get it yourself do 1 inventory and use knife and your done or grab 5 king worm on the ground and hope its enough to begin infinite bait)

## Introduction
This script is designed for the Molch island - Molch Pearl Minigame. It combines fishing and hunting activities to gain experience and collect Molch pearls. The following Hunter creatures can be caught using the aerial fishing technique:

- Bluegill
- Common tench
- Mottled eel
- Greater siren

There is also a chance to obtain the rare Golden tench (1/20k) and Clue bottles.

## Getting There
To reach the island in the center of Lake Molch, you can use the following methods:

- **Northern or Eastern Dock**: Use the fairy ring DJR to the chasm of fire and run south-west for the eastern dock or west for the northern dock.
- **Eastern Dock**: Teleport to Shayzien using Kharedst's Memoirs and run west.
- **Western Dock**: Use a Skills Necklace to teleport to the Farming Guild and run south-east through Molch.

## Usage
1. Set the `maxPearl` variable to the desired pearl count in your inventory to stop farming.
2. Ensure that you have a knife in the last spot of your inventory.
3. Run the script in the vicinity of the Molch island.
4. The script will perform the following actions:

   - If the pearl count in your inventory is below the specified maximum (`maxPearl`), the script will:
     - Walk to the fishing spot if not already there.
     - If the inventory is full and the player has the necessary animation, the script will use the knife to obtain fishing bait from the caught fish.
     - If the inventory is not full and there are fish available, the script will bait the fishing spot.
   - If the pearl count reaches or exceeds the maximum (`maxPearl`) or you obtain the rare Golden tench, the script will log out.

**Note**: Please ensure that you have the necessary equipment, such as a knife in the last inventory spot, and are in the Molch island area before running the script.

Happy farming on Molch island! 🎣🏹
