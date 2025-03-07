package com.rodrigvf.GameZone.core.usecases;

import com.rodrigvf.GameZone.core.entities.Event;

public interface FilterByIdentifierEventCase {

    public Event execute(String identifier);

}
