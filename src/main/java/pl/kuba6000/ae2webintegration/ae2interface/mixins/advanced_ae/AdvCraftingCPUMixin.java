package pl.kuba6000.ae2webintegration.ae2interface.mixins.advanced_ae;

import net.pedroksl.advanced_ae.common.cluster.AdvCraftingCPU;
import net.pedroksl.advanced_ae.common.logic.AdvCraftingCPULogic;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import appeng.api.stacks.AEKey;
import appeng.api.stacks.KeyCounter;
import pl.kuba6000.ae2webintegration.ae2interface.accessors.ICraftingCPULogicAccessor;
import pl.kuba6000.ae2webintegration.core.interfaces.IAEKey;
import pl.kuba6000.ae2webintegration.core.interfaces.ICraftingCPUCluster;
import pl.kuba6000.ae2webintegration.core.interfaces.IItemList;

@Mixin(value = AdvCraftingCPU.class, remap = false)
public abstract class AdvCraftingCPUMixin implements ICraftingCPUCluster {

    @Shadow
    private AdvCraftingCPULogic craftingLogic;

    @Override
    public void web$getAllItems(IItemList list) {
        craftingLogic.getAllItems((KeyCounter) (Object) list);
    }

    @Override
    public long web$getActiveItems(IAEKey key) {
        return craftingLogic.getWaitingFor((AEKey) key);
    }

    @Override
    public long web$getPendingItems(IAEKey key) {
        return craftingLogic.getWaitingFor((AEKey) key);
    }

    @Override
    public long web$getStorageItems(IAEKey key) {
        return craftingLogic.getWaitingFor((AEKey) key);
    }

    @Override
    public IItemList web$getWaitingFor() {
        return (IItemList) (Object) ((ICraftingCPULogicAccessor) craftingLogic).web$getJob()
            .web$getWaitingFor().list;
    }
}
