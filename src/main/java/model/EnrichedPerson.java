package model;

public record EnrichedPerson(String firstName,
                             String lastName,
                             int age,
                             double heightInCentimeters,
                             double heightInFeet) {
}
