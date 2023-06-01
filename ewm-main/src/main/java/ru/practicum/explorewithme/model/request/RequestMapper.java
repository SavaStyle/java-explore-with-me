package ru.practicum.explorewithme.model.request;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RequestMapper {
    @Mapping(target = "event", expression = "java(request.getEvent().getId())")
    @Mapping(target = "requester", expression = "java(request.getRequester().getId())")
    ParticipationRequestDto toParticipationRequestDto(Request request);
}
