import model.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MapperExamplesTest {

    private MapperExamples mapperExamples;
    private PersonRequest personRequest;

    @BeforeAll
    void setup() {
        mapperExamples = new MapperExamples();
        personRequest = new PersonRequest("Daniel Fegan", 33, 184);
    }

    @Test
    void mapsPersonRequestToPersonDomain() {
        final PersonDomain actual = mapperExamples.toPersonDomain(personRequest);
        final PersonDomain expected = new PersonDomain("Daniel Fegan", 33, 184);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void mapsPersonRequestToPersonDomainWithAltNames() {
        final PersonDomainWithAltNames actual = mapperExamples.toPersonDomainWithAltNames(personRequest);
        final PersonDomainWithAltNames expected = new PersonDomainWithAltNames("Daniel Fegan", 33, 184);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void mapsPersonRequestToEnrichedPerson() {
        final EnrichedPerson actual = mapperExamples.toEnricherPerson(personRequest);
        final EnrichedPerson expected = new EnrichedPerson("Daniel", "Fegan", 33, 184, 6.04);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void mapsPersonRequestToPersonDomainWithConstantValue() {
        final PersonDomainWithConstantValue actual = mapperExamples.toPersonDomainWithConstantValue(personRequest);
        final PersonDomainWithConstantValue expected = new PersonDomainWithConstantValue(
            "Daniel Fegan",
            33,
            184,
            "hardcodedValue"
        );

        assertThat(actual).isEqualTo(expected);
    }

}