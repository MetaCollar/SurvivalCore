package com.minecollar.survivalcore.utils.command.command.impl;

import com.minecollar.survivalcore.utils.command.language.CompiledObjective;
import com.minecollar.survivalcore.utils.command.language.data.ObjectiveMetadata;

public abstract class ExecutionContext extends CompiledObjective { // Just a friendly rename

    public ExecutionContext(ObjectiveMetadata metadata) {
        super(metadata);
    }
}
