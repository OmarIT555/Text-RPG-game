import java.util.Scanner;

public class Item {

    private int itemID;
    private String itemName;
    private String itemDescription;
    private int itemRoomLocation;
    private int attackDamage;
    private int healPoints;

    public Item (int itemID, String itemName, String itemDescription, int itemRoomLocation, int attackDamage, int healPoints){
        setItemID(itemID);
        setItemName(itemName);
        setItemDescription(itemDescription);
        setItemRoomLocation(itemRoomLocation);
        setAttackDamage(attackDamage);
        setHealPoints(healPoints);
    }

    // Getters
    public int getItemID() { return this.itemID; }
    public String getItemName() { return this.itemName; }
    public String getItemDescription() { return this.itemDescription; }
    public int getItemRoomLocation() { return this.itemRoomLocation; }
    public int getAttackDamage() { return this.attackDamage; }
    public int getHealPoints() { return this.healPoints; }

    // Setters
    public void setItemID(int newItemID) { itemID = newItemID; }
    public void setItemName(String newItemName) {itemName = newItemName; }
    public void setItemDescription(String itemDescription) { this.itemDescription = itemDescription; }
    public void setItemRoomLocation(int itemRoomLocation) { this.itemRoomLocation = itemRoomLocation; }
    public void setAttackDamage(int attackDamage) {this.attackDamage = attackDamage; }
    public void setHealPoints(int healPoints) {this.healPoints = healPoints;}

    public String Examine (String answer, boolean roomObjectItemContains, boolean invContainsItem) {
        Scanner keyboard = new Scanner(System.in);
        if (answer.toUpperCase().equals(("EXAMINE " + itemName).toUpperCase()) && (roomObjectItemContains || invContainsItem) ) {
            System.out.println(itemDescription);
            answer = keyboard.nextLine();
            return answer;
        }
        return answer;
    }

    // include these 2 lines of code before this method
        //Inventory.add(Item_1.getItemName());
        //roomObj1.removeItem(Item_1.getItemName());
    public String PickUp (String answer) {
        Scanner keyboard = new Scanner(System.in);
            System.out.println(itemName + " has been picked up from the room and successfully added to the player inventory");
            answer = keyboard.nextLine();
            return answer;
    }

    // include these 2 lines of code before this method
        //Inventory.remove(Item_1.getItemName());
        //roomObj1.setItems(Item_1.getItemName());
    public String Drop (String answer, String roomObjGetRoomName) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(itemName + " has been dropped successfully from the player inventory and placed in " + roomObjGetRoomName);
        answer = keyboard.nextLine();
        return answer;
    }

}
