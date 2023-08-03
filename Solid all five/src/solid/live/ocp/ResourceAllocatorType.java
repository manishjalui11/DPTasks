package solid.live.ocp;

public interface ResourceAllocatorType {
    int findFreeSlot();

    void markSlotBusy(int resourceId);

    void markSlotFree(int resourceId);
}

