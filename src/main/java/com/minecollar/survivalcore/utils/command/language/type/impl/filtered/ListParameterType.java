package com.minecollar.survivalcore.utils.command.language.type.impl.filtered;

import com.minecollar.survivalcore.utils.command.language.type.impl.FilteredParameterType;
import com.minecollar.survivalcore.utils.text.Placeholder;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Function;

public class ListParameterType<Type> implements FilteredParameterType<Type> {

    private final List<Type> values;
    private final Function<Type, String> identifierMapper;

    public ListParameterType(List<Type> values, Function<Type, String> identifierMapper) {
        this.values = values;
        this.identifierMapper = identifierMapper;
    }

    @Override
    public boolean isType(String input) {
        for (Type value : values) {
            if (identifierMapper.apply(value).equalsIgnoreCase(input)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public Type parse(String input) {
        for (Type value : values) {
            if (identifierMapper.apply(value).equalsIgnoreCase(input)) {
                return value;
            }
        }

        return null;
    }

    @Override
    public Type getDefaultValue() {
        return null;
    }

    @Override
    public List<Type> getAllValues() {
        return values;
    }

    @Override
    public @Nullable List<Placeholder<Player>> createPlaceholders(Object value) {
        return null;
    }
}
