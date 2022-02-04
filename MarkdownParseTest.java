import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void readFile1() throws IOException {
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        List links = List.of("https://something.com", "some-page.html");
        assertEquals("checks result", links, MarkdownParse.getLinks(contents));
    }
        
    @Test
    public void readFile2() throws IOException {
        Path fileName2 = Path.of("test2-file.md");
        String contents2 = Files.readString(fileName2);
        List links2 = List.of();
        assertEquals("checks result of test file 2", links2, MarkdownParse.getLinks(contents2));
    }

    @Test
    public void readFile3() throws IOException {
        Path fileName3 = Path.of("test3-file.md");
        String contents3 = Files.readString(fileName3);
        List links3 = List.of("www.edwin.com");
        assertEquals("checks result of test file 3", links3, MarkdownParse.getLinks(contents3));
    }

    @Test
    public void readFile4() throws IOException {
        Path fileName4 = Path.of("test4-file.md");
        String contents4 = Files.readString(fileName4);
        List links4 = List.of("https://CSE15L.com");
        assertEquals("checks result of test file 4", links4, MarkdownParse.getLinks(contents4));

    }

    @Test
    public void testFile2() throws IOException {
        Path fileName2 = Path.of("test-file2.md");
        String contents2 = Files.readString(fileName2);
        List links2 = List.of("https://something.com", "some-page.html");
        assertEquals("checks result of test file 2", links2, MarkdownParse.getLinks(contents2));
    }

    @Test
    public void testFile3() throws IOException {

        Path fileName3 = Path.of("test-file3.md");
        String contents3 = Files.readString(fileName3);
        List links3 = List.of();
        assertEquals("checks result of test file 3", links3, MarkdownParse.getLinks(contents3));
    }

    @Test
    public void testFile4() throws IOException {
        Path fileName4 = Path.of("test-file4.md");
        String contents4 = Files.readString(fileName4);
        List links4 = List.of();
        assertEquals("checks result of test file 4", links4, MarkdownParse.getLinks(contents4));
    }

    @Test
    public void testFile5() throws IOException {
        Path fileName5 = Path.of("test-file5.md");
        String contents5 = Files.readString(fileName5);
        List links5 = List.of();
        assertEquals("checks result of test file 5", links5, MarkdownParse.getLinks(contents5));
    }

    @Test
    public void testFile6() throws IOException {
        Path fileName6 = Path.of("test-file6.md");
        String contents6 = Files.readString(fileName6);
        List links6 = List.of("page.com");
        assertEquals("checks result of test file 6", links6, MarkdownParse.getLinks(contents6));
    }

    @Test
    public void testFile7() throws IOException {
        Path fileName7 = Path.of("test-file7.md");
        String contents7 = Files.readString(fileName7);
        List links7 = List.of();
        assertEquals("checks result of test file 7", links7, MarkdownParse.getLinks(contents7));
    }

    @Test
    public void testFile8() throws IOException {
        Path fileName8 = Path.of("test-file8.md");
        String contents8 = Files.readString(fileName8);
        List links8 = List.of("a link on the first line");
        assertEquals("checks result of test file 8", links8, MarkdownParse.getLinks(contents8));
    }

    
    
}
