import model.PersonRequest;

public class Application {

    public static void main(String[] args) {
        final MapperExamples mapperExamples = new MapperExamples();
        final PersonRequest personRequest = new PersonRequest("Daniel Fegan", 33, 184.00);

        System.out.println(mapperExamples.toPersonDomain(personRequest));
        System.out.println(mapperExamples.toPersonDomainWithAltNames(personRequest));
        System.out.println(mapperExamples.toEnrichedPerson(personRequest));
    }

}
