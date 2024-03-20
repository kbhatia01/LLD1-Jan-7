package parkingLot.Stratergy;

import parkingLot.Model.SlotAssignmentStratergyEnum;

public class getSlotStartergyFactory {

    public static SlotAssignmentStratergy getSlotStratergyBasedOnType(SlotAssignmentStratergyEnum e){
        if(e.equals(SlotAssignmentStratergyEnum.RANDOM)){
            return new RandomSlotStratergy();
        }
        return null;
    }
}
