package se.iths.java21.objects.interfaces.commands;

public class NameCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Martin");
    }
}
