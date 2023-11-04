package kevinlibrary;
import java.util.List;

public class Library {
    private List<Room> listOfRooms;

    public List<Room> getListOfRooms() {
        return listOfRooms;
    }

    public void setListOfRooms(List<Room> listOfRooms) {
        this.listOfRooms = listOfRooms;
    }

    //staff
    //activities
    // posters
    // state
    // country
    // plants
  public void addRoom(Room myRoom) {
        this.listOfRooms.add(myRoom);
  }

}
