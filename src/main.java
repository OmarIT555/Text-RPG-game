import java.io.File;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;

class main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String answer = "";


        //Creates Rooms
        String[] room1 = new String[]{};
        String[] room2 = new String[]{};
        String[] room3 = new String[]{};
        String[] room4 = new String[]{};
        String[] room5 = new String[]{};
        String[] room6 = new String[]{};

        //Creates Items
        String[] Item1 = new String[]{};
        String[] Item2 = new String[]{};
        String[] Item3 = new String[]{};

        //Creates Puzzles
        String[] Puzzle1 = new String[]{};
        String[] Puzzle2 = new String[]{};
        String[] Puzzle3 = new String[]{};

        //Creates Monsters
        String[] Monster1 = new String[]{};


        //Loads Room data from the Rooms.txt file
        try {
            Scanner input = new Scanner(new File("Rooms.txt"));
            String MLine = input.nextLine();

            MLine = input.nextLine();
            room1 = MLine.split("~");

            MLine = input.nextLine();
            room2 = MLine.split("~");

            MLine = input.nextLine();
            room3 = MLine.split("~");

            MLine = input.nextLine();
            room4 = MLine.split("~");

            MLine = input.nextLine();
            room5 = MLine.split("~");

            MLine = input.nextLine();
            room6 = MLine.split("~");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Loads Item data from the Items.txt file
        try {
            Scanner input = new Scanner(new File("Items.txt"));
            String MLine = input.nextLine();

            MLine = input.nextLine();
            Item1 = MLine.split("~");

            MLine = input.nextLine();
            Item2 = MLine.split("~");

            MLine = input.nextLine();
            Item3 = MLine.split("~");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Loads Puzzle data from the Puzzles.txt file
        try {
            Scanner input = new Scanner(new File("Puzzles.txt"));
            String MLine = input.nextLine();

            MLine = input.nextLine();
            Puzzle1 = MLine.split("~");

            MLine = input.nextLine();
            Puzzle2 = MLine.split("~");

            MLine = input.nextLine();
            Puzzle3 = MLine.split("~");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //Creates Item Objects
        Item Item_1 = new Item(Integer.parseInt(Item1[0]), Item1[1], Item1[2], Integer.parseInt(Item1[3]), Integer.parseInt(Item1[4]), Integer.parseInt(Item1[5]));
        Item Item_2 = new Item(Integer.parseInt(Item2[0]), Item2[1], Item2[2], Integer.parseInt(Item2[3]), Integer.parseInt(Item2[4]), Integer.parseInt(Item2[5]));
        Item Item_3 = new Item(Integer.parseInt(Item3[0]), Item3[1], Item3[2], Integer.parseInt(Item3[3]), Integer.parseInt(Item3[4]), Integer.parseInt(Item3[5]));

        //Creates Room Objects
        StringToIntArr CC = new StringToIntArr();
        int[] r1 = CC.cConvert(room1[4]);
        Room roomObj1 = new Room(Integer.parseInt(room1[0]), room1[1], room1[2], Boolean.parseBoolean(room1[3]), r1);

        int[] r2 = CC.cConvert(room2[4]);
        Room roomObj2 = new Room(Integer.parseInt(room2[0]), room2[1], room2[2], Boolean.parseBoolean(room2[3]), r2);
        //roomObj2.setItems( Item_1.getItemName() );

        int[] r3 = CC.cConvert(room3[4]);
        Room roomObj3 = new Room(Integer.parseInt(room3[0]), room3[1], room3[2], Boolean.parseBoolean(room3[3]), r3);
        //roomObj3.setItems(Item_2.getItemName());

        int[] r4 = CC.cConvert(room4[4]);
        Room roomObj4 = new Room(Integer.parseInt(room4[0]), room4[1], room4[2], Boolean.parseBoolean(room4[3]), r4);

        int[] r5 = CC.cConvert(room5[4]);
        Room roomObj5 = new Room(Integer.parseInt(room5[0]), room5[1], room5[2], Boolean.parseBoolean(room5[3]), r5);
        //roomObj5.setItems(Item_3.getItemName());

        int[] r6 = CC.cConvert(room6[4]);
        Room roomObj6 = new Room(Integer.parseInt(room6[0]), room6[1], room6[2], Boolean.parseBoolean(room6[3]), r6);

        //Creates Puzzle Objects
        Puzzle Puzzle_1 = new Puzzle(Integer.parseInt(Puzzle1[0]), Puzzle1[1], Puzzle1[2], Puzzle1[3], Integer.parseInt(Puzzle1[4]));
        Puzzle Puzzle_2 = new Puzzle(Integer.parseInt(Puzzle2[0]), Puzzle2[1], Puzzle2[2], Puzzle2[3], Integer.parseInt(Puzzle2[4]));
        Puzzle Puzzle_3 = new Puzzle(Integer.parseInt(Puzzle3[0]), Puzzle3[1], Puzzle3[2], Puzzle3[3], Integer.parseInt(Puzzle3[4]));


        //Assigns Item to room
        //For Item 1
        if (Item_1.getItemRoomLocation() == roomObj1.getRoomNumber()) {
            roomObj1.setItems(Item_1.getItemName());
        } else if (Item_1.getItemRoomLocation() == roomObj2.getRoomNumber()) {
            roomObj2.setItems(Item_1.getItemName());
        } else if (Item_1.getItemRoomLocation() == roomObj3.getRoomNumber()) {
            roomObj3.setItems(Item_1.getItemName());
        } else if (Item_1.getItemRoomLocation() == roomObj4.getRoomNumber()) {
            roomObj4.setItems(Item_1.getItemName());
        } else if (Item_1.getItemRoomLocation() == roomObj5.getRoomNumber()) {
            roomObj5.setItems(Item_1.getItemName());
        } else if (Item_1.getItemRoomLocation() == roomObj6.getRoomNumber()) {
            roomObj6.setItems(Item_1.getItemName());
        } else {
        }

        //For Item 2
        if (Item_2.getItemRoomLocation() == roomObj1.getRoomNumber()) {
            roomObj1.setItems(Item_2.getItemName());
        } else if (Item_2.getItemRoomLocation() == roomObj2.getRoomNumber()) {
            roomObj2.setItems(Item_2.getItemName());
        } else if (Item_2.getItemRoomLocation() == roomObj3.getRoomNumber()) {
            roomObj3.setItems(Item_2.getItemName());
        } else if (Item_2.getItemRoomLocation() == roomObj4.getRoomNumber()) {
            roomObj4.setItems(Item_2.getItemName());
        } else if (Item_2.getItemRoomLocation() == roomObj5.getRoomNumber()) {
            roomObj5.setItems(Item_2.getItemName());
        } else if (Item_2.getItemRoomLocation() == roomObj6.getRoomNumber()) {
            roomObj6.setItems(Item_2.getItemName());
        } else {
        }

        //For Item 3
        if (Item_3.getItemRoomLocation() == roomObj1.getRoomNumber()) {
            roomObj1.setItems(Item_3.getItemName());
        } else if (Item_3.getItemRoomLocation() == roomObj2.getRoomNumber()) {
            roomObj2.setItems(Item_3.getItemName());
        } else if (Item_3.getItemRoomLocation() == roomObj3.getRoomNumber()) {
            roomObj3.setItems(Item_3.getItemName());
        } else if (Item_3.getItemRoomLocation() == roomObj4.getRoomNumber()) {
            roomObj4.setItems(Item_3.getItemName());
        } else if (Item_3.getItemRoomLocation() == roomObj5.getRoomNumber()) {
            roomObj5.setItems(Item_3.getItemName());
        } else if (Item_3.getItemRoomLocation() == roomObj6.getRoomNumber()) {
            roomObj6.setItems(Item_3.getItemName());
        } else {
        }


        // current room number
        int CurrentRoomNum = 1;

        // Creates player Inventory
        ArrayList<String> Inventory = new ArrayList<String>();

        // Creates player (Health and Attack)
        Player player = new Player(100, 5);

        //Loads Monster data from the Monsters.txt file
        try {
            Scanner input = new Scanner(new File("Monsters.txt"));
            String MLine = input.nextLine();

            MLine = input.nextLine();
            Monster1 = MLine.split("~");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Creates Monster
        Monster monster = new Monster(Integer.parseInt(Monster1[0]), Integer.parseInt(Monster1[1]), Integer.parseInt(Monster1[2]),Monster1[3], Monster1[4]);

        boolean completedMonster = false;  //if the player has completed the interaction with the monster

        //Equip Status
        boolean Equip = false;

        // Game loop
        boolean gameLoop = true;
        while (gameLoop) {


            // ## First Room ##
            if (CurrentRoomNum == 1) {
                // Title and Description of room and then it asks a question
                System.out.println(roomObj1.toString());
                roomObj1.fRoom();
                System.out.println("Health: " + player.getHealth());
                System.out.println("Attack power: " + player.getAttack());
                System.out.println("Inventory: " + Inventory);
                System.out.println("Items in current area: " + roomObj1.getItems());
                if (roomObj1.getVisited() == false) {
                    Puzzle_1.displayPuzzle();
                }

                boolean RoomMode = true;
                answer = keyboard.nextLine();
                while (RoomMode == true) {
                    // For Item 1 #######################################################################################################################################

                    //Examine
                    answer = Item_1.Examine(answer, roomObj1.getItems().contains(Item_1.getItemName()), Inventory.contains(Item_1.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_1.getItemName()).toUpperCase()) && roomObj1.getItems().contains(Item_1.getItemName())) {
                        Inventory.add(Item_1.getItemName());
                        roomObj1.removeItem(Item_1.getItemName());
                        answer = Item_1.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName())) {
                        Inventory.remove(Item_1.getItemName());
                        roomObj1.setItems(Item_1.getItemName());
                        answer = Item_1.Drop(answer, roomObj1.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Equip == false && Item_1.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_1.getAttackDamage());
                        System.out.println("Equipped " + Item_1.getItemName() + ", attack increased by " + Item_1.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_1.getAttackDamage());
                        System.out.println("Unequipped " + Item_1.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Item_1.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_1.getHealPoints());
                        Inventory.remove(Item_1.getItemName());
                        System.out.println(Item_1.getItemName() + " consumed, health increased by " + Item_1.getHealPoints() + " points!");
                    }


                    // For Item 2 #######################################################################################################################################

                    //Examine
                    answer = Item_2.Examine(answer, roomObj1.getItems().contains(Item_2.getItemName()), Inventory.contains(Item_2.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_2.getItemName()).toUpperCase()) && roomObj1.getItems().contains(Item_2.getItemName())) {
                        Inventory.add(Item_2.getItemName());
                        roomObj1.removeItem(Item_2.getItemName());
                        answer = Item_2.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName())) {
                        Inventory.remove(Item_2.getItemName());
                        roomObj1.setItems(Item_2.getItemName());
                        answer = Item_2.Drop(answer, roomObj1.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Equip == false && Item_2.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_2.getAttackDamage());
                        System.out.println("Equipped " + Item_2.getItemName() + ", attack increased by " + Item_2.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_2.getAttackDamage());
                        System.out.println("Unequipped " + Item_2.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Item_2.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_2.getHealPoints());
                        Inventory.remove(Item_2.getItemName());
                        System.out.println(Item_2.getItemName() + " consumed, health increased by " + Item_2.getHealPoints() + " points!");
                    }

                    // For Item 3 #######################################################################################################################################

                    //Examine
                    answer = Item_3.Examine(answer, roomObj1.getItems().contains(Item_3.getItemName()), Inventory.contains(Item_3.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_3.getItemName()).toUpperCase()) && roomObj1.getItems().contains(Item_3.getItemName())) {
                        Inventory.add(Item_3.getItemName());
                        roomObj1.removeItem(Item_3.getItemName());
                        answer = Item_3.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName())) {
                        Inventory.remove(Item_3.getItemName());
                        roomObj1.setItems(Item_3.getItemName());
                        answer = Item_3.Drop(answer, roomObj1.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Equip == false && Item_3.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_3.getAttackDamage());
                        System.out.println("Equipped " + Item_3.getItemName() + ", attack increased by " + Item_3.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_3.getAttackDamage());
                        System.out.println("Unequipped " + Item_3.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Item_3.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_3.getHealPoints());
                        Inventory.remove(Item_3.getItemName());
                        System.out.println(Item_3.getItemName() + " consumed, health increased by " + Item_3.getHealPoints() + " points!");
                    }


                    if (NavHandler.ResultfromNavAnswer(answer, r1) == -1) {
                        System.out.println("Please type North, East, South, or West (case doesn't matter)");
                        answer = keyboard.nextLine();
                    } else {
                        CurrentRoomNum = NavHandler.ResultfromNavAnswer(answer, r1);
                        roomObj1.setVisited(true);
                        RoomMode = false;
                    }
                }
            }


            // ## Second Room ##
            else if (CurrentRoomNum == 2) {
                // Title and Description of room and then it asks a question
                System.out.println(roomObj2.toString());
                roomObj2.fRoom();
                System.out.println("Health: " + player.getHealth());
                System.out.println("Attack power: " + player.getAttack());
                System.out.println("Inventory: " + Inventory);
                System.out.println("Items in current area: " + roomObj2.getItems());


                boolean RoomMode = true;
                answer = keyboard.nextLine();
                while (RoomMode == true) {
                    // For Item 1 #######################################################################################################################################

                    //Examine
                    answer = Item_1.Examine(answer, roomObj2.getItems().contains(Item_1.getItemName()), Inventory.contains(Item_1.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_1.getItemName()).toUpperCase()) && roomObj2.getItems().contains(Item_1.getItemName())) {
                        Inventory.add(Item_1.getItemName());
                        roomObj2.removeItem(Item_1.getItemName());
                        answer = Item_1.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName())) {
                        Inventory.remove(Item_1.getItemName());
                        roomObj2.setItems(Item_1.getItemName());
                        answer = Item_1.Drop(answer, roomObj2.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Equip == false && Item_1.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_1.getAttackDamage());
                        System.out.println("Equipped " + Item_1.getItemName() + ", attack increased by " + Item_1.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_1.getAttackDamage());
                        System.out.println("Unequipped " + Item_1.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Item_1.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_1.getHealPoints());
                        Inventory.remove(Item_1.getItemName());
                        System.out.println(Item_1.getItemName() + " consumed, health increased by " + Item_1.getHealPoints() + " points!");
                    }


                    // For Item 2 #######################################################################################################################################

                    //Examine
                    answer = Item_2.Examine(answer, roomObj2.getItems().contains(Item_2.getItemName()), Inventory.contains(Item_2.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_2.getItemName()).toUpperCase()) && roomObj2.getItems().contains(Item_2.getItemName())) {
                        Inventory.add(Item_2.getItemName());
                        roomObj2.removeItem(Item_2.getItemName());
                        answer = Item_2.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName())) {
                        Inventory.remove(Item_2.getItemName());
                        roomObj2.setItems(Item_2.getItemName());
                        answer = Item_2.Drop(answer, roomObj2.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Equip == false && Item_2.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_2.getAttackDamage());
                        System.out.println("Equipped " + Item_2.getItemName() + ", attack increased by " + Item_2.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_2.getAttackDamage());
                        System.out.println("Unequipped " + Item_2.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Item_2.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_2.getHealPoints());
                        Inventory.remove(Item_2.getItemName());
                        System.out.println(Item_2.getItemName() + " consumed, health increased by " + Item_2.getHealPoints() + " points!");
                    }

                    // For Item 3 #######################################################################################################################################

                    //Examine
                    answer = Item_3.Examine(answer, roomObj2.getItems().contains(Item_3.getItemName()), Inventory.contains(Item_3.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_3.getItemName()).toUpperCase()) && roomObj2.getItems().contains(Item_3.getItemName())) {
                        Inventory.add(Item_3.getItemName());
                        roomObj2.removeItem(Item_3.getItemName());
                        answer = Item_3.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName())) {
                        Inventory.remove(Item_3.getItemName());
                        roomObj2.setItems(Item_3.getItemName());
                        answer = Item_3.Drop(answer, roomObj2.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Equip == false && Item_3.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_3.getAttackDamage());
                        System.out.println("Equipped " + Item_3.getItemName() + ", attack increased by " + Item_3.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_3.getAttackDamage());
                        System.out.println("Unequipped " + Item_3.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Item_3.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_3.getHealPoints());
                        Inventory.remove(Item_3.getItemName());
                        System.out.println(Item_3.getItemName() + " consumed, health increased by " + Item_3.getHealPoints() + " points!");
                    }


                    if (NavHandler.ResultfromNavAnswer(answer, r2) == -1) {
                        System.out.println("Please type North, East, South, or West (case doesn't matter)");
                        answer = keyboard.nextLine();
                    } else {
                        CurrentRoomNum = NavHandler.ResultfromNavAnswer(answer, r2);
                        roomObj2.setVisited(true);
                        RoomMode = false;
                    }
                }
            }

            // ## Third Room ##
            else if (CurrentRoomNum == 3) {
                // Title and Description of room and then it asks a question
                System.out.println(roomObj3.toString());
                roomObj3.fRoom();
                System.out.println("Health: " + player.getHealth());
                System.out.println("Attack power: " + player.getAttack());
                System.out.println("Inventory: " + Inventory);
                System.out.println("Items in current area: " + roomObj3.getItems());
                if (roomObj3.getVisited() == false) {
                    Puzzle_2.displayPuzzle();
                }

                boolean RoomMode = true;
                answer = keyboard.nextLine();
                while (RoomMode == true) {
                    // For Item 1 #######################################################################################################################################

                    //Examine
                    answer = Item_1.Examine(answer, roomObj3.getItems().contains(Item_1.getItemName()), Inventory.contains(Item_1.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_1.getItemName()).toUpperCase()) && roomObj3.getItems().contains(Item_1.getItemName())) {
                        Inventory.add(Item_1.getItemName());
                        roomObj3.removeItem(Item_1.getItemName());
                        answer = Item_1.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName())) {
                        Inventory.remove(Item_1.getItemName());
                        roomObj3.setItems(Item_1.getItemName());
                        answer = Item_1.Drop(answer, roomObj3.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Equip == false && Item_1.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_1.getAttackDamage());
                        System.out.println("Equipped " + Item_1.getItemName() + ", attack increased by " + Item_1.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_1.getAttackDamage());
                        System.out.println("Unequipped " + Item_1.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Item_1.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_1.getHealPoints());
                        Inventory.remove(Item_1.getItemName());
                        System.out.println(Item_1.getItemName() + " consumed, health increased by " + Item_1.getHealPoints() + " points!");
                    }


                    // For Item 2 #######################################################################################################################################

                    //Examine
                    answer = Item_2.Examine(answer, roomObj3.getItems().contains(Item_2.getItemName()), Inventory.contains(Item_2.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_2.getItemName()).toUpperCase()) && roomObj3.getItems().contains(Item_2.getItemName())) {
                        Inventory.add(Item_2.getItemName());
                        roomObj3.removeItem(Item_2.getItemName());
                        answer = Item_2.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName())) {
                        Inventory.remove(Item_2.getItemName());
                        roomObj3.setItems(Item_2.getItemName());
                        answer = Item_2.Drop(answer, roomObj3.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Equip == false && Item_2.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_2.getAttackDamage());
                        System.out.println("Equipped " + Item_2.getItemName() + ", attack increased by " + Item_2.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_2.getAttackDamage());
                        System.out.println("Unequipped " + Item_2.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Item_2.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_2.getHealPoints());
                        Inventory.remove(Item_2.getItemName());
                        System.out.println(Item_2.getItemName() + " consumed, health increased by " + Item_2.getHealPoints() + " points!");
                    }

                    // For Item 3 #######################################################################################################################################

                    //Examine
                    answer = Item_3.Examine(answer, roomObj3.getItems().contains(Item_3.getItemName()), Inventory.contains(Item_3.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_3.getItemName()).toUpperCase()) && roomObj3.getItems().contains(Item_3.getItemName())) {
                        Inventory.add(Item_3.getItemName());
                        roomObj3.removeItem(Item_3.getItemName());
                        answer = Item_3.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName())) {
                        Inventory.remove(Item_3.getItemName());
                        roomObj3.setItems(Item_3.getItemName());
                        answer = Item_3.Drop(answer, roomObj3.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Equip == false && Item_3.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_3.getAttackDamage());
                        System.out.println("Equipped " + Item_3.getItemName() + ", attack increased by " + Item_3.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_3.getAttackDamage());
                        System.out.println("Unequipped " + Item_3.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Item_3.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_3.getHealPoints());
                        Inventory.remove(Item_3.getItemName());
                        System.out.println(Item_3.getItemName() + " consumed, health increased by " + Item_3.getHealPoints() + " points!");
                    }


                    if (NavHandler.ResultfromNavAnswer(answer, r3) == -1) {
                        System.out.println("Please type North, East, South, or West (case doesn't matter)");
                        answer = keyboard.nextLine();
                    } else {
                        CurrentRoomNum = NavHandler.ResultfromNavAnswer(answer, r3);
                        roomObj3.setVisited(true);
                        RoomMode = false;
                    }
                }
            }

            // ## Fourth Room
            else if (CurrentRoomNum == 4) {
                // Title and Description of room and then it asks a question
                System.out.println(roomObj4.toString());
                roomObj4.fRoom();
                System.out.println("Health: " + player.getHealth());
                System.out.println("Attack power: " + player.getAttack());
                System.out.println("Inventory: " + Inventory);
                System.out.println("Items in current area: " + roomObj4.getItems());


                boolean RoomMode = true;
                answer = keyboard.nextLine();
                while (RoomMode == true) {
                    // For Item 1 #######################################################################################################################################

                    //Examine
                    answer = Item_1.Examine(answer, roomObj4.getItems().contains(Item_1.getItemName()), Inventory.contains(Item_1.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_1.getItemName()).toUpperCase()) && roomObj4.getItems().contains(Item_1.getItemName())) {
                        Inventory.add(Item_1.getItemName());
                        roomObj4.removeItem(Item_1.getItemName());
                        answer = Item_1.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName())) {
                        Inventory.remove(Item_1.getItemName());
                        roomObj4.setItems(Item_1.getItemName());
                        answer = Item_1.Drop(answer, roomObj4.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Equip == false && Item_1.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_1.getAttackDamage());
                        System.out.println("Equipped " + Item_1.getItemName() + ", attack increased by " + Item_1.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_1.getAttackDamage());
                        System.out.println("Unequipped " + Item_1.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Item_1.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_1.getHealPoints());
                        Inventory.remove(Item_1.getItemName());
                        System.out.println(Item_1.getItemName() + " consumed, health increased by " + Item_1.getHealPoints() + " points!");
                    }


                    // For Item 2 #######################################################################################################################################

                    //Examine
                    answer = Item_2.Examine(answer, roomObj4.getItems().contains(Item_2.getItemName()), Inventory.contains(Item_2.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_2.getItemName()).toUpperCase()) && roomObj4.getItems().contains(Item_2.getItemName())) {
                        Inventory.add(Item_2.getItemName());
                        roomObj4.removeItem(Item_2.getItemName());
                        answer = Item_2.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName())) {
                        Inventory.remove(Item_2.getItemName());
                        roomObj4.setItems(Item_2.getItemName());
                        answer = Item_2.Drop(answer, roomObj4.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Equip == false && Item_2.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_2.getAttackDamage());
                        System.out.println("Equipped " + Item_2.getItemName() + ", attack increased by " + Item_2.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_2.getAttackDamage());
                        System.out.println("Unequipped " + Item_2.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Item_2.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_2.getHealPoints());
                        Inventory.remove(Item_2.getItemName());
                        System.out.println(Item_2.getItemName() + " consumed, health increased by " + Item_2.getHealPoints() + " points!");
                    }

                    // For Item 3 #######################################################################################################################################

                    //Examine
                    answer = Item_3.Examine(answer, roomObj4.getItems().contains(Item_3.getItemName()), Inventory.contains(Item_3.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_3.getItemName()).toUpperCase()) && roomObj4.getItems().contains(Item_3.getItemName())) {
                        Inventory.add(Item_3.getItemName());
                        roomObj4.removeItem(Item_3.getItemName());
                        answer = Item_3.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName())) {
                        Inventory.remove(Item_3.getItemName());
                        roomObj4.setItems(Item_3.getItemName());
                        answer = Item_3.Drop(answer, roomObj4.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Equip == false && Item_3.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_3.getAttackDamage());
                        System.out.println("Equipped " + Item_3.getItemName() + ", attack increased by " + Item_3.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_3.getAttackDamage());
                        System.out.println("Unequipped " + Item_3.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Item_3.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_3.getHealPoints());
                        Inventory.remove(Item_3.getItemName());
                        System.out.println(Item_3.getItemName() + " consumed, health increased by " + Item_3.getHealPoints() + " points!");
                    }


                    if (NavHandler.ResultfromNavAnswer(answer, r4) == -1) {
                        System.out.println("Please type North, East, South, or West (case doesn't matter)");
                        answer = keyboard.nextLine();
                    } else {
                        CurrentRoomNum = NavHandler.ResultfromNavAnswer(answer, r4);
                        roomObj4.setVisited(true);
                        RoomMode = false;
                    }
                }
            }

            // ## Fifth Room ##
            else if (CurrentRoomNum == 5) {
                // Title and Description of room and then it asks a question
                System.out.println(roomObj5.toString());
                roomObj5.fRoom();
                System.out.println("There's a monster in this room (type examine monster to interact with the monster)");
                System.out.println("Health: " + player.getHealth());
                System.out.println("Attack power: " + player.getAttack());
                System.out.println("Inventory: " + Inventory);
                System.out.println("Items in current area: " + roomObj5.getItems());


                boolean RoomMode = true;
                answer = keyboard.nextLine();
                while (RoomMode == true) {
                    // For Item 1 #######################################################################################################################################

                    //Examine
                    answer = Item_1.Examine(answer, roomObj5.getItems().contains(Item_1.getItemName()), Inventory.contains(Item_1.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_1.getItemName()).toUpperCase()) && roomObj5.getItems().contains(Item_1.getItemName())) {
                        Inventory.add(Item_1.getItemName());
                        roomObj5.removeItem(Item_1.getItemName());
                        answer = Item_1.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName())) {
                        Inventory.remove(Item_1.getItemName());
                        roomObj5.setItems(Item_1.getItemName());
                        answer = Item_1.Drop(answer, roomObj5.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Equip == false && Item_1.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_1.getAttackDamage());
                        System.out.println("Equipped " + Item_1.getItemName() + ", attack increased by " + Item_1.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_1.getAttackDamage());
                        System.out.println("Unequipped " + Item_1.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Item_1.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_1.getHealPoints());
                        Inventory.remove(Item_1.getItemName());
                        System.out.println(Item_1.getItemName() + " consumed, health increased by " + Item_1.getHealPoints() + " points!");
                    }


                    // For Item 2 #######################################################################################################################################

                    //Examine
                    answer = Item_2.Examine(answer, roomObj5.getItems().contains(Item_2.getItemName()), Inventory.contains(Item_2.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_2.getItemName()).toUpperCase()) && roomObj5.getItems().contains(Item_2.getItemName())) {
                        Inventory.add(Item_2.getItemName());
                        roomObj5.removeItem(Item_2.getItemName());
                        answer = Item_2.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName())) {
                        Inventory.remove(Item_2.getItemName());
                        roomObj5.setItems(Item_2.getItemName());
                        answer = Item_2.Drop(answer, roomObj5.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Equip == false && Item_2.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_2.getAttackDamage());
                        System.out.println("Equipped " + Item_2.getItemName() + ", attack increased by " + Item_2.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_2.getAttackDamage());
                        System.out.println("Unequipped " + Item_2.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Item_2.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_2.getHealPoints());
                        Inventory.remove(Item_2.getItemName());
                        System.out.println(Item_2.getItemName() + " consumed, health increased by " + Item_2.getHealPoints() + " points!");
                    }

                    // For Item 3 #######################################################################################################################################

                    //Examine
                    answer = Item_3.Examine(answer, roomObj5.getItems().contains(Item_3.getItemName()), Inventory.contains(Item_3.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_3.getItemName()).toUpperCase()) && roomObj5.getItems().contains(Item_3.getItemName())) {
                        Inventory.add(Item_3.getItemName());
                        roomObj5.removeItem(Item_3.getItemName());
                        answer = Item_3.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName())) {
                        Inventory.remove(Item_3.getItemName());
                        roomObj5.setItems(Item_3.getItemName());
                        answer = Item_3.Drop(answer, roomObj5.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Equip == false && Item_3.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_3.getAttackDamage());
                        System.out.println("Equipped " + Item_3.getItemName() + ", attack increased by " + Item_3.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_3.getAttackDamage());
                        System.out.println("Unequipped " + Item_3.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Item_3.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_3.getHealPoints());
                        Inventory.remove(Item_3.getItemName());
                        System.out.println(Item_3.getItemName() + " consumed, health increased by " + Item_3.getHealPoints() + " points!");
                    }

                    //Monster Commands ###########
                    // Battle State
                    boolean battleState = false;
                    boolean newGameLocation = false;
                    if (answer.toUpperCase().equals("EXAMINE MONSTER" ) && completedMonster == false ) {
                        System.out.println(monster.getDescription());
                        System.out.println("Type Attack to fight the monster of type Ignore to ignore the monster (case doesn't matter)");

                        boolean QuestionAnswered = false;
                        while (QuestionAnswered == false) {
                            answer = keyboard.nextLine();
                            if (answer.toUpperCase().equals("ATTACK")) {
                                int turnCount = 1;
                                battleState = true;

                                while (battleState) {
                                    System.out.println("Health: " + player.getHealth() + "         " + monster.getName() + " Health: " + monster.getHealth());
                                    System.out.println("Attack power: " + player.getAttack() + "     " + monster.getName() + " Attack power: " + monster.getAttack());
                                    System.out.println("Inventory: " + Inventory + "     ");
                                    System.out.println("Type Attack or Heal and press enter (case doesn't matter)");

                                    int rand = (int) (Math.random() * 100);


                                    if (turnCount % 2 != 0) {
                                        answer = keyboard.nextLine();
                                        // Player Attacks Monster, Monster attacks back with chance of double damage
                                        if (answer.toUpperCase().equals("ATTACK")) {
                                            monster.setHealth(monster.getHealth() - player.getAttack());
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("You attack the " + monster.getName() + " and do " + player.getAttack() + " damage!");
                                        }

                                        // Player types heal and will type consume (item name) in order to heal
                                        if (answer.toUpperCase().equals("HEAL")) {
                                            System.out.println("Type Consume (item name) to heal");

                                            if (answer.toUpperCase().equals("CONSUME " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Item_1.getAttackDamage() <= 0) {
                                                player.setHealth(player.getHealth() + Item_1.getHealPoints());
                                                Inventory.remove(Item_1.getItemName());
                                                System.out.println();
                                                System.out.println();
                                                System.out.println(Item_1.getItemName() + " consumed, health increased by " + Item_1.getHealPoints() + " points!");
                                            } else if (answer.toUpperCase().equals("CONSUME " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Item_2.getAttackDamage() <= 0) {
                                                player.setHealth(player.getHealth() + Item_2.getHealPoints());
                                                Inventory.remove(Item_2.getItemName());
                                                System.out.println();
                                                System.out.println();
                                                System.out.println(Item_2.getItemName() + " consumed, health increased by " + Item_2.getHealPoints() + " points!");
                                            } else if (answer.toUpperCase().equals("CONSUME " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Item_3.getAttackDamage() <= 0) {
                                                player.setHealth(player.getHealth() + Item_3.getHealPoints());
                                                Inventory.remove(Item_3.getItemName());
                                                System.out.println();
                                                System.out.println();
                                                System.out.println(Item_3.getItemName() + " consumed, health increased by " + Item_3.getHealPoints() + " points!");
                                            } else {
                                                System.out.println();
                                                System.out.println();
                                                System.out.println("You don't have that item or the item cannot be used to heal yourself");
                                            }
                                        }

                                        //Equip Item ===========
                                        if (answer.toUpperCase().equals("EQUIP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Equip == false && Item_1.getAttackDamage() > 0) {
                                            Equip = true;
                                            player.setAttack(player.getAttack() + Item_1.getAttackDamage());
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("Equipped " + Item_1.getItemName() + ", attack increased by " + Item_1.getAttackDamage() + " points!");
                                        }

                                        if (answer.toUpperCase().equals("EQUIP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Equip == false && Item_2.getAttackDamage() > 0) {
                                            Equip = true;
                                            player.setAttack(player.getAttack() + Item_2.getAttackDamage());
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("Equipped " + Item_2.getItemName() + ", attack increased by " + Item_2.getAttackDamage() + " points!");
                                        }

                                        if (answer.toUpperCase().equals("EQUIP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Equip == false && Item_3.getAttackDamage() > 0) {
                                            Equip = true;
                                            player.setAttack(player.getAttack() + Item_3.getAttackDamage());
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("Equipped " + Item_3.getItemName() + ", attack increased by " + Item_3.getAttackDamage() + " points!");
                                        }



                                        //UnEquip Item ===========
                                        if (answer.toUpperCase().equals("UNEQUIP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Equip == true) {
                                            Equip = false;
                                            player.setAttack(player.getAttack() - Item_1.getAttackDamage());
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("Unequipped " + Item_1.getItemName());
                                        }

                                        if (answer.toUpperCase().equals("UNEQUIP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Equip == true) {
                                            Equip = false;
                                            player.setAttack(player.getAttack() - Item_2.getAttackDamage());
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("Unequipped " + Item_2.getItemName());
                                        }

                                        if (answer.toUpperCase().equals("UNEQUIP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Equip == true) {
                                            Equip = false;
                                            player.setAttack(player.getAttack() - Item_3.getAttackDamage());
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("Unequipped " + Item_3.getItemName());
                                        }


                                    }

                                    if (monster.getHealth() <= 0) {
                                        completedMonster = true;
                                        QuestionAnswered = true;
                                        battleState = false;
                                        System.out.println("You win!");
                                    }

                                    // Monster's turn to attack
                                    if (turnCount % 2 == 0) {
                                        if (rand < monster.getThreshHold()) {
                                            player.setHealth(player.getHealth() - (monster.getAttack() * 2));
                                            System.out.println();
                                            System.out.println();
                                            System.out.println(monster.getName() +" attacks you and does " + (monster.getAttack() * 2) + " damage!" );
                                        } else {
                                            player.setHealth(player.getHealth() - monster.getAttack());
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("Monster attacks you and does " + monster.getAttack() + " damage!" );
                                        }
                                    }

                                    if (player.getHealth() <= 0) {
                                        System.out.println("You lose!");
                                        System.out.println("Type Exit to quit the game or New Game to restart the game");
                                        boolean Q2 = false;
                                        while (Q2 == false) {
                                            answer = keyboard.nextLine();
                                            if (answer.toUpperCase().equals("EXIT")) {
                                                System.out.println("Exitting game, thanks for playing!");
                                                System.exit(0);
                                            }
                                            else if (answer.toUpperCase().equals("NEW GAME")) {
                                                System.out.println("Starting New Game");
                                                roomObj1.setVisited(false);
                                                roomObj2.setVisited(false);
                                                roomObj3.setVisited(false);
                                                roomObj4.setVisited(false);
                                                roomObj5.setVisited(false);
                                                roomObj6.setVisited(false);

                                                player.setHealth(100);
                                                Inventory.clear();
                                                roomObj1.clearItems();
                                                roomObj2.clearItems();
                                                roomObj3.clearItems();
                                                roomObj4.clearItems();
                                                roomObj5.clearItems();
                                                roomObj6.clearItems();
                                                answer = "";
                                                battleState = false;
                                                QuestionAnswered = true;
                                                Q2 = true;
                                                //Assigns Item to room
                                                //For Item 1
                                                if (Item_1.getItemRoomLocation() == roomObj1.getRoomNumber()) {
                                                    roomObj1.setItems(Item_1.getItemName());
                                                } else if (Item_1.getItemRoomLocation() == roomObj2.getRoomNumber()) {
                                                    roomObj2.setItems(Item_1.getItemName());
                                                } else if (Item_1.getItemRoomLocation() == roomObj3.getRoomNumber()) {
                                                    roomObj3.setItems(Item_1.getItemName());
                                                } else if (Item_1.getItemRoomLocation() == roomObj4.getRoomNumber()) {
                                                    roomObj4.setItems(Item_1.getItemName());
                                                } else if (Item_1.getItemRoomLocation() == roomObj5.getRoomNumber()) {
                                                    roomObj5.setItems(Item_1.getItemName());
                                                } else if (Item_1.getItemRoomLocation() == roomObj6.getRoomNumber()) {
                                                    roomObj6.setItems(Item_1.getItemName());
                                                } else {
                                                }

                                                //For Item 2
                                                if (Item_2.getItemRoomLocation() == roomObj1.getRoomNumber()) {
                                                    roomObj1.setItems(Item_2.getItemName());
                                                } else if (Item_2.getItemRoomLocation() == roomObj2.getRoomNumber()) {
                                                    roomObj2.setItems(Item_2.getItemName());
                                                } else if (Item_2.getItemRoomLocation() == roomObj3.getRoomNumber()) {
                                                    roomObj3.setItems(Item_2.getItemName());
                                                } else if (Item_2.getItemRoomLocation() == roomObj4.getRoomNumber()) {
                                                    roomObj4.setItems(Item_2.getItemName());
                                                } else if (Item_2.getItemRoomLocation() == roomObj5.getRoomNumber()) {
                                                    roomObj5.setItems(Item_2.getItemName());
                                                } else if (Item_2.getItemRoomLocation() == roomObj6.getRoomNumber()) {
                                                    roomObj6.setItems(Item_2.getItemName());
                                                } else {
                                                }

                                                //For Item 3
                                                if (Item_3.getItemRoomLocation() == roomObj1.getRoomNumber()) {
                                                    roomObj1.setItems(Item_3.getItemName());
                                                } else if (Item_3.getItemRoomLocation() == roomObj2.getRoomNumber()) {
                                                    roomObj2.setItems(Item_3.getItemName());
                                                } else if (Item_3.getItemRoomLocation() == roomObj3.getRoomNumber()) {
                                                    roomObj3.setItems(Item_3.getItemName());
                                                } else if (Item_3.getItemRoomLocation() == roomObj4.getRoomNumber()) {
                                                    roomObj4.setItems(Item_3.getItemName());
                                                } else if (Item_3.getItemRoomLocation() == roomObj5.getRoomNumber()) {
                                                    roomObj5.setItems(Item_3.getItemName());
                                                } else if (Item_3.getItemRoomLocation() == roomObj6.getRoomNumber()) {
                                                    roomObj6.setItems(Item_3.getItemName());
                                                } else {
                                                }

                                                newGameLocation = true;


                                            }
                                            else {
                                                System.out.println("Please type Exit or New Game and press enter");
                                            }
                                        }
                                    }

                                    turnCount++;
                                }
                            }
                            if (answer.toUpperCase().equals("IGNORE")){
                                QuestionAnswered = true;
                                completedMonster = true;
                                System.out.println("Monster ignored");
                            }

                        }



                    }

                        if (newGameLocation == true) {
                            CurrentRoomNum = 1;
                            RoomMode = false;
                        }
                        else if (NavHandler.ResultfromNavAnswer(answer, r5) == -1) {
                            System.out.println("Please type North, East, South, or West (case doesn't matter)");
                            answer = keyboard.nextLine();
                        }
                        else {
                            CurrentRoomNum = NavHandler.ResultfromNavAnswer(answer, r5);
                            roomObj5.setVisited(true);
                            RoomMode = false;
                        }


                }
            }

            // ## Sixth Room ##
            else if (CurrentRoomNum == 6) {
                // Title and Description of room and then it asks a question
                System.out.println(roomObj6.toString());
                roomObj6.fRoom();
                System.out.println("Health: " + player.getHealth());
                System.out.println("Attack power: " + player.getAttack());
                System.out.println("Inventory: " + Inventory);
                System.out.println("Items in current area: " + roomObj6.getItems());
                if (roomObj6.getVisited() == false) {
                    Puzzle_3.displayPuzzle();
                }

                boolean RoomMode = true;
                answer = keyboard.nextLine();
                while (RoomMode == true) {
                    // For Item 1 #######################################################################################################################################

                    //Examine
                    answer = Item_1.Examine(answer, roomObj6.getItems().contains(Item_1.getItemName()), Inventory.contains(Item_1.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_1.getItemName()).toUpperCase()) && roomObj6.getItems().contains(Item_1.getItemName())) {
                        Inventory.add(Item_1.getItemName());
                        roomObj6.removeItem(Item_1.getItemName());
                        answer = Item_1.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName())) {
                        Inventory.remove(Item_1.getItemName());
                        roomObj6.setItems(Item_1.getItemName());
                        answer = Item_1.Drop(answer, roomObj6.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Equip == false && Item_1.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_1.getAttackDamage());
                        System.out.println("Equipped " + Item_1.getItemName() + ", attack increased by " + Item_1.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_1.getAttackDamage());
                        System.out.println("Unequipped " + Item_1.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_1.getItemName().toUpperCase()) && Inventory.contains(Item_1.getItemName()) && Item_1.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_1.getHealPoints());
                        Inventory.remove(Item_1.getItemName());
                        System.out.println(Item_1.getItemName() + " consumed, health increased by " + Item_1.getHealPoints() + " points!");
                    }


                    // For Item 2 #######################################################################################################################################

                    //Examine
                    answer = Item_2.Examine(answer, roomObj6.getItems().contains(Item_2.getItemName()), Inventory.contains(Item_2.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_2.getItemName()).toUpperCase()) && roomObj6.getItems().contains(Item_2.getItemName())) {
                        Inventory.add(Item_2.getItemName());
                        roomObj6.removeItem(Item_2.getItemName());
                        answer = Item_2.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName())) {
                        Inventory.remove(Item_2.getItemName());
                        roomObj6.setItems(Item_2.getItemName());
                        answer = Item_2.Drop(answer, roomObj6.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Equip == false && Item_2.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_2.getAttackDamage());
                        System.out.println("Equipped " + Item_2.getItemName() + ", attack increased by " + Item_2.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_2.getAttackDamage());
                        System.out.println("Unequipped " + Item_2.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_2.getItemName().toUpperCase()) && Inventory.contains(Item_2.getItemName()) && Item_2.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_2.getHealPoints());
                        Inventory.remove(Item_2.getItemName());
                        System.out.println(Item_2.getItemName() + " consumed, health increased by " + Item_2.getHealPoints() + " points!");
                    }

                    // For Item 3 #######################################################################################################################################

                    //Examine
                    answer = Item_3.Examine(answer, roomObj6.getItems().contains(Item_3.getItemName()), Inventory.contains(Item_3.getItemName()) );

                    //Pick up
                    if (answer.toUpperCase().equals(("PICK " + Item_3.getItemName()).toUpperCase()) && roomObj6.getItems().contains(Item_3.getItemName())) {
                        Inventory.add(Item_3.getItemName());
                        roomObj6.removeItem(Item_3.getItemName());
                        answer = Item_3.PickUp(answer);
                    }

                    //Drop
                    if (answer.toUpperCase().equals("DROP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName())) {
                        Inventory.remove(Item_3.getItemName());
                        roomObj6.setItems(Item_3.getItemName());
                        answer = Item_3.Drop(answer, roomObj6.getRoomName());
                    }

                    //Equip Item ===========
                    if (answer.toUpperCase().equals("EQUIP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Equip == false && Item_3.getAttackDamage() > 0) {
                        Equip = true;
                        player.setAttack(player.getAttack() + Item_3.getAttackDamage());
                        System.out.println("Equipped " + Item_3.getItemName() + ", attack increased by " + Item_3.getAttackDamage() + " points!");
                    }
                    //UnEquip Item ===========
                    if (answer.toUpperCase().equals("UNEQUIP " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Equip == true) {
                        Equip = false;
                        player.setAttack(player.getAttack() - Item_3.getAttackDamage());
                        System.out.println("Unequipped " + Item_3.getItemName());
                    }
                    //Consume Item ===========
                    if (answer.toUpperCase().equals("CONSUME " + Item_3.getItemName().toUpperCase()) && Inventory.contains(Item_3.getItemName()) && Item_3.getAttackDamage() <= 0) {
                        player.setHealth(player.getHealth() + Item_3.getHealPoints());
                        Inventory.remove(Item_3.getItemName());
                        System.out.println(Item_3.getItemName() + " consumed, health increased by " + Item_3.getHealPoints() + " points!");
                    }


                    if (NavHandler.ResultfromNavAnswer(answer, r6) == -1) {
                        System.out.println("Please type North, East, South, or West (case doesn't matter)");
                        answer = keyboard.nextLine();
                    } else {
                        CurrentRoomNum = NavHandler.ResultfromNavAnswer(answer, r6);
                        roomObj6.setVisited(true);
                        RoomMode = false;
                    }
                }
            }


        }
    }
}


