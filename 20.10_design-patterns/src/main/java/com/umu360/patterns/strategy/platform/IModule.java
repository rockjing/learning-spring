package com.umu360.patterns.strategy.platform;

import java.util.List;

public interface IModule {
    List<IModule> GetMenus();
    IModule GetParent();
    List<IModule> GetDependencies();

}
