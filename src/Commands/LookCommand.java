package Commands;

import Core.GameContext;
import Core.Room;

import java.util.Map;

public class LookCommand implements Command {
    @Override
    public void execute(String[] args, GameContext context) {
        Room current = context.getBuilding().getCurrentRoom();
        System.out.println(current.getDescription());
        System.out.println(current.getObjectsDescription());
        System.out.println(context.getBuilding().getOccupantsDescription()); // Room description

        // Format exits
        Map<String, Room> neighbors = current.getNeighbors();
        if (!neighbors.isEmpty()) {
            System.out.print("Exits: ");
            for (Map.Entry<String, Room> entry : neighbors.entrySet()) {
                System.out.print(entry.getKey() + " (" + entry.getValue().getName() + ") ");
            }
            System.out.println(); // Newline after exits
        } else {
            System.out.println("Exits: None");
        }

        // Display occupants
        //System.out.println(context.getBuilding().getOccupantsDescription());
    }
}
