package Strategy;

import Models.SlotAllocationStrategy;

public class slotStrategyFactory {

    public static SlotAssignmentStrategy getSlotStrategy(SlotAllocationStrategy e) {
        if (e.equals(SlotAllocationStrategy.RANDOM)) {
            return new RandomSlotAssignmentStrategy();
        }
        else if(e.equals(SlotAllocationStrategy.ORDERED)){
            return  new OrderedSlotAssignmentStrategy();
        }

        return null;
    }
}
