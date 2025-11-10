package netherstarblock.fabric.utils;

import netherstarblock.utils.EnvType;
import netherstarblock.utils.ILoader;
import net.fabricmc.loader.api.FabricLoader;

public class LoaderImpl implements ILoader {
    @Override
    public ILoader.LoaderType getLoaderType() {
        return ILoader.LoaderType.Fabric;
    }

    @Override
    public boolean isModLoaded(String id) {
        return FabricLoader.getInstance().isModLoaded(id);
    }


    @Override
    public EnvType getEnv() {
        return FabricLoader.getInstance().getEnvironmentType() == net.fabricmc.api.EnvType.CLIENT ? EnvType.CLIENT : EnvType.SERVER;
    }
}
