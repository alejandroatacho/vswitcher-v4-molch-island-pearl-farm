//Title: V4 Molch island - Molch Pearl Minigame Pearl Farmer
//______________________________________________________________________________________________
// User Variables:
int maxPearl = 1100; // What pearl count in your inventory to stop farming and log out
int GoldTenchLogOut = 0; // Log out if you get 1 in 20k drop (TenchHunter), Ignores maxPearl
//0 = no
//1 = yes
//______________________________________________________________________________________________

// Hinamizawa Variables Down Below:
int knifeId = 946;
int knifeSlot = v.getInventory().slot(knifeId);
int pearl = 22820;
int fishId = 22826;
int fishId2 = 22829;
int fishId3 = 22832; 
int fishId4 = 22835;
int fishNpcId = 8523;
int goldTenchId = 22840;
NPC fishingSpot = v.getNpc().findNearest(fishNpcId);
WorldPoint fishSpot = new WorldPoint(1360, 3631, 0);
WorldPoint currentLocation = client.getLocalPlayer().getWorldLocation(); 
//Hina Calculator:
int rareDropCounter = v.getInventory().count(goldTenchId);
int pearlCounter = v.getInventory().count(pearl);
int fishCount = v.getInventory().count(fishId);
int fishCount2 = v.getInventory().count(fishId2);
int fishCount3 = v.getInventory().count(fishId3);
int fishCount4 = v.getInventory().count(fishId4);
int fishCounter = fishCount + fishCount2 + fishCount3 + fishCount4; //Sum
int hina_blocker = 0;

//Script Itself:
if (pearlCounter < maxPearl || GoldTenchLogOut == 1) {
        if (!currentLocation.equals(fishSpot) && !v.getWalking().isMoving()) {
            v.getWalking().walk(fishSpot);
        } else if (v.getInventory().inventoryFull() && v.getLocalPlayer().hasAnimation(-1) && !v.getWalking().isMoving() && currentLocation.equals(fishSpot)) {
                while (hina_blocker <= fishCounter) {
                    v.invoke("Use", "<col=ff9040>Knife</col>", 0, 25, knifeSlot, 9764864, false);
                    v.invoke("Use", "<col=ff9040>Knife</col><col=ffffff> -> <col=ff9040>Sacred eel</col>", 0, 58, 26, 9764864, false);
                    hina_blocker++;   
                } 
        } else if (v.getLocalPlayer().hasAnimation(-1) && !v.getInventory().inventoryFull() && fishCount >= 0 && currentLocation.equals(fishSpot)) {
                v.getFishing().bait(fishingSpot);
            }
        } 
        
        else if (GoldTenchLogOut == 0) {
         if (pearlCounter >= maxPearl){
            v.getGame().logout();
    }
        }
            else if (GoldTenchLogOut == 1) {
         if (rareDropCounter > 0){
            v.getGame().logout();
    }
        }
