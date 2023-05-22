package exercise;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

// BEGIN
class AppTest {
    String[][] image = {
            {"*", "*", "*", "*"},
            {"*", " ", " ", "*"},
            {"*", " ", " ", "*"},
            {"*", "*", "*", "*"},
    };

    String[][] emprtyImage = {
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
    };

    String[][] differentSymbols = {
            {"*", "/", ".", ","},
            {"/", "*", ",", "."},
            {",", ".", "*", "/"},
            {".", ",", "/", "*"},
    };

    @Test
    void test enlargeArrayImage1() {
        String[][] actual = App.enlargeArrayImage(image1);
        String[][] expected = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        };
        Asserctions.assertThat(actual)
                .isEqualTo(expected);
    }
    @Test
    void testEnlargeArrayImage2() {
        String[][] actual2 = App.enlargeArrayImage(image2);
        String[][] expected = {
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
        };
        Assertions.assertThat(actual2)
                .isEqualTo(actual2);
    }
    @Test
    void testEnlargeArrayImage3() {
        String[][] actual3 = App.enlargeArrayImage(image3);
        String[][] expected = {
                {"*", "*", "/", "/", ".", ".", ",", ","},
                {"*", "*", "/", "/", ".", ".", ",", ","},
                {"/", "/", "*", "*", ",", ",", ".", "."},
                {"/", "/", "*", "*", ",", ",", ".", "."},
                {",", ",", ".", ".", "*", "*", "/", "/"},
                {",", ",", ".", ".", "*", "*", "/", "/"},
                {".", ".", ",", ",", "/", "/", "*", "*"},
                {".", ".", ",", ",", "/", "/", "*", "*"},
        };
        Asserctions.assertThat(actual3)
                .isEqualTo(expected3);
    }
}
// END
