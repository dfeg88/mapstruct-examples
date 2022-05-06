package model;

public record EnrichedPerson(String firstName,
                             String lastName,
                             int age,
                             double heightInCentimeters,
                             double heightInFeet) {
    public static EnrichedPersonBuilder builder() {
        return new EnrichedPersonBuilder();
    }

    public static class EnrichedPersonBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private double heightInCentimeters;
        private double heightInFeet;

        EnrichedPersonBuilder() { }

        public EnrichedPersonBuilder firstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EnrichedPersonBuilder lastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }



        public EnrichedPersonBuilder age(final int age) {
            this.age = age;
            return this;
        }

        public EnrichedPersonBuilder heightInCentimeters(final double heightInCentimeters) {
            this.heightInCentimeters = heightInCentimeters;
            return this;
        }

        public EnrichedPersonBuilder heightInFeet(final double heightInFeet) {
            this.heightInFeet = heightInFeet;
            return this;
        }

        public EnrichedPerson build() {
            return new EnrichedPerson(firstName, lastName, age, heightInCentimeters, heightInFeet);
        }
    }
}
