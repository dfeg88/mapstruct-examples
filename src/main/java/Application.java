import model.EnrichedPerson;
import model.PersonRequest;

import static java.util.Arrays.asList;

public class Application {

    public static void main(String[] args) {
        final var mapperExamples = new MapperExamples();
        final var personRequest = new PersonRequest("Daniel Fegan", 33, 184.00, asList("Bob", "Geoff"));
        final var examples = asList(
            mapperExamples.toPersonDomain.apply(personRequest),
            mapperExamples.toPersonDomainWithAltNames.apply(personRequest),
            mapperExamples.toPersonDomainWithConstantValue.apply(personRequest),
            mapperExamples.toEnrichedPerson.apply(personRequest)
        );

        examples.forEach(System.out::println);

        final EnrichedPerson enrichedPerson = EnrichedPerson.builder()
            .firstName("yo")
            .age(30)
            .heightInCentimeters(20)
            .heightInFeet(200)
            .build();

        System.out.println(enrichedPerson);
    }
}
