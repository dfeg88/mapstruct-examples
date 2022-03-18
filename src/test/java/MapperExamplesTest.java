import model.EnrichedPerson;
import model.PersonDomain;
import model.PersonDomainWithAltNames;
import model.PersonDomainWithConstantValue;
import model.PersonRequest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MapperExamplesTest {

    private MapperExamples mapperExamples;
    private static final PersonRequest personRequest = new PersonRequest(
        "Daniel Fegan",
        33,
        184,
        Arrays.asList("Bob", "Geoff")
    );;

    @BeforeAll
    void setup() {
        mapperExamples = new MapperExamples();
    }

    @Test
    void mapsPersonRequestToPersonDomain() {
        final PersonDomain actual = mapperExamples.toPersonDomain.apply(personRequest);
        final PersonDomain expected = new PersonDomain(
            "Daniel Fegan",
            33,
            184,
            Arrays.asList("Bob", "Geoff")
        );

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void mapsPersonRequestToPersonDomainWithAltNames() {
        final PersonDomainWithAltNames actual = mapperExamples.toPersonDomainWithAltNames.apply(personRequest);
        final PersonDomainWithAltNames expected = new PersonDomainWithAltNames("Daniel Fegan", 33, 184);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void mapsPersonRequestToEnrichedPerson() {
        final EnrichedPerson actual = mapperExamples.toEnrichedPerson.apply(personRequest);
        final EnrichedPerson expected = new EnrichedPerson("Daniel", "Fegan", 33, 184, 6.04);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void mapsPersonRequestToPersonDomainWithConstantValue() {
        final PersonDomainWithConstantValue actual = mapperExamples.toPersonDomainWithConstantValue.apply(personRequest);
        final PersonDomainWithConstantValue expected = new PersonDomainWithConstantValue(
            "Daniel Fegan",
            33,
            184,
            "hardcodedValue"
        );

        assertThat(actual).isEqualTo(expected);
    }

}