
import output.Formatter;
import output.Output;
import output.Print;
import output.SeparatorWithComma;
import patterns.Counter;
import patterns.FindPatternStrategy;
import reader.MainReader;
import reader.Reader;

import java.util.List;


public class App {
    public static void main(String[] args) {

        if (args.length != 2) {
            throw new IllegalArgumentException("Usage: java -jar PatternCounter-1.0.jar <filename>, <PatternName> >> \n" +
                    "Example  : java -jar PatternCounter-1.0.jar input.txt UniqueNumber");
        }

        System.out.println("Application started reading arguments");
        System.out.println("File Path = " + args[0]);
        System.out.println("Pattern = " + args[1]);

        List<String> document;
        Counter counter;
        try {
            Reader reader = new MainReader();
            document = reader.read(args[0]);

            FindPatternStrategy findPattern = FindPatternStrategy.getPattern(args[1]);

            counter = new Counter(findPattern);
            counter.validateDocument(document);
        } catch (Exception e){
            System.err.println(e.getMessage());
            return;
        }
        Formatter formatter = new SeparatorWithComma();
        Output output = new Print();
        output.send(counter.count(document), formatter);
    }

}
