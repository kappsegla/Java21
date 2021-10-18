package se.iths.java21.fluent;

public class BuildingDemo {
    public static void main(String[] args) {

        Building building = new BuildingBuilder().setRooms(1).setChimney(false).setPrice(10_000).createBuilding();

        building.setRooms(4);
        building.setChimney(true);
        building.setPrice(1_000_000);

        //Fluent style
        building.setRooms(5)
                .setPrice(2_000_000)
                .setChimney(false);

        //Create object using Builder pattern
        //Avoid calling constructor with lots of parameters.
        //Create Builder with Refactor->Replace Constructor with Builder
        Building building1 = new BuildingBuilder()
                .setPrice(12)
                .setRooms(2)
                .createBuilding();

        //Builder pattern with convenience method.
        Building building2 = new BuildingBuilder()
                .normalBuilding()
                .createBuilding();

        //Example of builder in java sdk.
        //Use when creating strings in loops instead of +=
        StringBuilder builder = new StringBuilder();
        String s = builder.append("Hello")
                .append(" ")
                .append("World!")
                .toString();
    }
}
