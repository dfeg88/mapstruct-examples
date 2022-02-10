package mapper;

import model.*;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDomain toPersonDomain(PersonRequest personRequest);

    @Mappings({
        @Mapping(source = "age", target = "personsAge"),
        @Mapping(source = "name", target = "fullName")
    })
    PersonDomainWithAltNames toPersonDomainWithAltNames(PersonRequest personRequest);

    @Mappings({
        @Mapping(source = "name", target = "firstName", qualifiedByName = "getFirstName"),
        @Mapping(source = "name", target = "lastName", qualifiedByName = "getLastName"),
        @Mapping(source = "heightInCentimeters", target = "heightInFeet", qualifiedByName = "getHeightInFeet"),
    })
    EnrichedPerson toEnrichedPerson(PersonRequest personRequest);

    @Mapping(target = "someValue", constant = "hardcodedValue")
    PersonDomainWithConstantValue toPersonDomainWithConstantValue(PersonRequest personRequest);

    @Named("getFirstName")
    default String getFirstName(String name) {
        final String[] nameArray = name.split(" ");
        return nameArray[0];
    }

    @Named("getLastName")
    default String getLastName(String name) {
        final String[] nameArray = name.split(" ");
        return nameArray[1];
    }

    @Named("getHeightInFeet")
    default double getHeightInFeet(double heightInCentimeters) {
        return BigDecimal.valueOf(heightInCentimeters / 30.48).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

}
