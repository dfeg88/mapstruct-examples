package model;

import java.util.List;

public record PersonRequest(String name, int age, double heightInCentimeters, List<String> siblings) {

}
