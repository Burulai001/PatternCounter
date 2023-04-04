package reader;

import java.util.List;

@FunctionalInterface
public interface Reader {

    List<String> read(String filePath);

}
