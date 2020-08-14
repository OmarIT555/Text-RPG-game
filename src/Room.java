import java.util.ArrayList;
public class Room {

    private int roomNumber;
    private String roomName;
    private String roomDesc;
    private boolean visited;
    private int[] NESW;
    private ArrayList<String> items = new ArrayList<String>();

    public Room (int roomNumber, String roomName,String roomDesc ,boolean visited, int[] NESW){
        setRoomNumber(roomNumber);
        setRoomName(roomName);
        setRoomDesc(roomDesc);
        setVisited(visited);
        setNESW(NESW);
    }

    //Getters
    public int getRoomNumber () {
        return this.roomNumber;
    }
    public String getRoomName () {
        return this.roomName;
    }
    public String getRoomDesc () {
        return this.roomDesc;
    }
    public boolean getVisited () {
        return this.visited;
    }
    public int[] NESW () {
        return this.NESW;
    }
    public ArrayList<String> getItems () { return this.items;}

    //Setters
    public void setRoomNumber (int newRoomNumber){
        roomNumber = newRoomNumber;
    }
    public void setRoomName (String newRoomName) {
       roomName  = newRoomName;
    }
    public void setRoomDesc (String newRoomDesc) {
        roomDesc = newRoomDesc;
    }
    public void setVisited (boolean newVisited) {
        visited = newVisited;
    }
    public void setNESW (int[] newNESW) {
        NESW = newNESW;
    }



    public String toString() {
        String output = roomName + "\n"
                      + roomDesc;
        return output;
    }

    public void fRoom() {
        if (visited == true){
         System.out.println("This place looks familiar");
        }
    }

    public void setItems (String newItems) { items.add(newItems); }
    public void removeItem (String input)  { items.remove(input); }
    public void clearItems () { items.clear(); }

    public void addItem(String input) {
        items.remove(input);
    }

    public void examineItem(String input) {
        System.out.println();
    }

}