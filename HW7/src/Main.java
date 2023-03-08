import static terminal.factory.LionsFactory.lionsCollection;
import static terminal.factory.SnakesFactory.snakesCollection;
import static terminal.factory.WolvesFactory.wolvesCollection;

import java.util.List;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.LionCage;
import cage.SnakeCage;
import cage.WolfCage;
import terminal.TerminalReader;
import terminal.command.ParseCommand;
import zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        List<Lion> lions = lionsCollection(2);
        LionCage lionsInCage = new LionCage(lions);

        lionsInCage.sortLions();
        System.out.println(lionsInCage);

        List<Snake> snakes = snakesCollection(2);
        SnakeCage snakesInCage = new SnakeCage(snakes);
        snakesInCage.sortSnakes();
        System.out.println(snakesInCage);


        List<Wolf> wolves = wolvesCollection(2);
        WolfCage wolvesInCage = new WolfCage(wolves);
        wolvesInCage.sortWolves();
        System.out.println(wolvesInCage);

        Zoo zoo = new Zoo(lionsInCage, wolvesInCage, snakesInCage);
        TerminalReader terminalReader = TerminalReader.newTerminalReader(new ParseCommand(),zoo);
        terminalReader.endless();

    }
}
