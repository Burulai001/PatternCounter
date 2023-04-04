package reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainReader implements Reader {

    @Override
    public List<String> read(String filePath) {

        List<String> stringList;

        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            stringList = lines.collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Check if the file path is valid", e);
        }

        System.out.println("File Content is : " + stringList);
        System.out.println("File Content size : " + stringList.size());
        return stringList;
    }
}
