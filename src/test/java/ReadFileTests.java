import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha() throws FileNotFoundException {
        File file = new File("src/test/resources/ReadFileTests.txt");
        Scanner sc = new Scanner(file, "UTF8");

        ArrayList<String> text = new ArrayList<>();

        while(sc.hasNext()) {
            text.add(sc.next());
        }

        sc.close();
        assertEquals("аллоха", text.get(1));
    }
}
