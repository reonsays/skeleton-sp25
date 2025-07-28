import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JavaExercisesTest {

    @Test
    public void testStarTriangle() {
        JavaExercises.starTriangle();
        // Visually check the console output!
    }

    public class StarTriangle {
        public static void main(String[] args) {
            int row = 5;
            for (int i = 0; i < row; i ++) {

                for (int j = 0; j < row - i -1; j ++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k ++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    @Test
    public void testPrintIndexed() {
        JavaExercises.printIndexed("hello");
        // Visually check the console output!
    }

    public class PrintIndexed {
        public static void PrintIndexed(String s) {
            String output = "";
            for (int i = 0; i < s.length(); i ++) {
                output += s.charAt(i);
                output += String.valueOf(s.length() - 1 - i);
            }
            System.out.println(output);
        }
        public static void main(String[] args) {
            PrintIndexed ("hello");
        }
    }

    @Test
    public void testStutter() {
        assertThat(JavaExercises.stutter("hello")).isEqualTo("hheelllloo");
        assertThat(JavaExercises.stutter("abc")).isEqualTo("aabbcc");
        assertThat(JavaExercises.stutter("")).isEqualTo("");
    }

    public class stutter {
        public static void Stutter(String s) {
            String output = "";
            for (int i = 0; i < s.length(); i ++) {
                output += s.charAt(i);
                output += s.charAt(i);
            }
            System.out.println(output);
        }
        public static void main(String[] args) {
            Stutter ("hello");
        }


        @Test
    public void testQuadrant() {
        assertThat(JavaExercises.quadrant(3, 4)).isEqualTo(1);
        assertThat(JavaExercises.quadrant(-3, 4)).isEqualTo(2);
        assertThat(JavaExercises.quadrant(-3, -4)).isEqualTo(3);
        assertThat(JavaExercises.quadrant(3, -4)).isEqualTo(4);
        assertThat(JavaExercises.quadrant(0, 5)).isEqualTo(0);
        assertThat(JavaExercises.quadrant(5, 0)).isEqualTo(0);
    }
}

    public class Quadrant {
        public static String getQuadrant(int x, int y) {
            String output = "";

            if (x == 0 || y == 0) {
                return "0";
            } else if (x > 0 && y > 0) {
                return "1";
            } else if (x < 0 && y > 0) {
                return "2";
            } else if (x < 0 && y < 0) {
                return "3";
            } else {
                return "4";
            }
        }

        public static void main(String[] args) {
            String result = getQuadrant(-2, 6);
            System.out.println("Quadrant:" + result);
        }
    }
