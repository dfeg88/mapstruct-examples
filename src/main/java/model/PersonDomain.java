package model;

import java.util.List;

public record PersonDomain(
    String name,
    int age,
    double heightInCentimeters,
    List<String> siblings
) { }
