import mapper.PersonMapper;
import model.EnrichedPerson;
import model.PersonDomain;
import model.PersonDomainWithAltNames;
import model.PersonDomainWithConstantValue;
import model.PersonRequest;

import java.util.function.Function;

public class MapperExamples {

    private static final PersonMapper PERSON_MAPPER = PersonMapper.INSTANCE;

    public Function<PersonRequest, PersonDomain> toPersonDomain = PERSON_MAPPER::toPersonDomain;
    public Function<PersonRequest, PersonDomainWithAltNames> toPersonDomainWithAltNames = PERSON_MAPPER::toPersonDomainWithAltNames;
    public Function<PersonRequest, EnrichedPerson> toEnrichedPerson = PERSON_MAPPER::toEnrichedPerson;
    public Function<PersonRequest, PersonDomainWithConstantValue> toPersonDomainWithConstantValue = PERSON_MAPPER::toPersonDomainWithConstantValue;

}
