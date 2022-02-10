import mapper.PersonMapper;
import model.*;

public class MapperExamples {

    private static final PersonMapper PERSON_MAPPER = PersonMapper.INSTANCE;

    public PersonDomain toPersonDomain(final PersonRequest personRequest) {
        return PERSON_MAPPER.toPersonDomain(personRequest);
    }

    public PersonDomainWithAltNames toPersonDomainWithAltNames(final PersonRequest personRequest) {
        return PERSON_MAPPER.toPersonDomainWithAltNames(personRequest);
    }

    public EnrichedPerson toEnricherPerson(final PersonRequest personRequest) {
        return PERSON_MAPPER.toEnrichedPerson(personRequest);
    }

    public PersonDomainWithConstantValue toPersonDomainWithConstantValue(final PersonRequest personRequest) {
        return PERSON_MAPPER.toPersonDomainWithConstantValue(personRequest);
    }

}
