package interfaces;
import java.lang.*;
import classes.Room;

public interface RoomOperations
{
	boolean insertRoom(Room r);
	boolean removeRoom(Room r);
	Room searchRoom(String roomNumber);
	void showAllRooms();
}