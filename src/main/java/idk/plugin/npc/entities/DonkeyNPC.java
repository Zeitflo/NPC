package idk.plugin.npc.entities;

import cn.nukkit.entity.passive.EntityDonkey;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class DonkeyNPC extends EntityNPC {

    private static final int NETWORK_ID = EntityDonkey.NETWORK_ID;
    
    public DonkeyNPC(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }
}
