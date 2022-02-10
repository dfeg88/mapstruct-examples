import mapper.PersonMapper;
import model.PersonRequest;

public class Application {

    public static void main(String[] args) {
        final PersonRequest personRequest = new PersonRequest("Daniel Fegan", 33, 184.00);
        System.out.println(personRequest);

        // Direct Mapping
        System.out.println(PersonMapper.INSTANCE.toPersonDomain(personRequest));

        // Different field name mapping
        System.out.println(PersonMapper.INSTANCE.toPersonDomainWithAltNames(personRequest));

        // Custom methods example
        System.out.println(PersonMapper.INSTANCE.toEnrichedPerson(personRequest));
    }

}
