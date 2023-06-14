package de.limago.wepapp17;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PersonDtoMapper {
    PersonDTO convert(Person person);
    Person convert(PersonDTO dto);
}
