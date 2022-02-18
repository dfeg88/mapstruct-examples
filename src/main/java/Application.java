import model.PersonRequest;

import java.util.List;

import static java.util.Arrays.asList;

public class Application {

    public static void main(String[] args) {
        final MapperExamples mapperExamples = new MapperExamples();
        final PersonRequest personRequest = new PersonRequest("Daniel Fegan", 33, 184.00, asList("Bob", "Geoff"));

        final List<Record> examples = asList(
            mapperExamples.toPersonDomain.apply(personRequest),
            mapperExamples.toPersonDomainWithAltNames.apply(personRequest),
            mapperExamples.toPersonDomainWithConstantValue.apply(personRequest),
            mapperExamples.toEnrichedPerson.apply(personRequest)
        );

        examples.forEach(System.out::println);
    }
}
