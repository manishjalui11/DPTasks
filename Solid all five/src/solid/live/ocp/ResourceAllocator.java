package solid.live.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResourceAllocator {

    public int allocate(ResourceAllocatorType resourceAllocatorType) {
        int resourceId;
        resourceId = resourceAllocatorType.findFreeSlot();
        resourceAllocatorType.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(ResourceAllocatorType resourceAllocatorType, int resourceId) {
        resourceAllocatorType.markSlotFree(resourceId);
    }
}
