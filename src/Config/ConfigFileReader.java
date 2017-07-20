package Config;

import java.io.FileInputStream;

public class ConfigFileReader implements ConfigSource {

    private static String fileName = null;
    private static boolean initialized = false;
    private static boolean isSpain = false;
    private static String greetings = null;
    private static int length = 0;

    public ConfigFileReader(String file) {


        if (! this.initialized) {
            this.fileName = file;
            this.init();
        }
    }

    public boolean isSpain() {
        return this.isSpain;
    }

    public void greetings() {
        System.out.println(hello());
    }

    public String hello() {
        return this.greetings;
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public String getGreetings() {
        return this.greetings;
    }

    private void init() {

        char[][] input = this.read();

        this.isSpain = parserCountry(input);
        this.greetings = this.isSpain ? "!Hello World!": "Hello World!";

        this.length = parserLength(input);
        this.initialized = true;
    }

    private char[][] read() {
        try {
            FileInputStream input = new FileInputStream(this.fileName);
            char[][] data = new char [2][input.available()];

            int ch = 0;

            int i, j;
            for(i = 0; i < 2; i++) {
                for(j = 0; true; j++) {

                    if ((ch = input.read()) != -1) {
                        data[i][j] = (char)ch;
                        if (ch == '\n')
                            break;
                    }
                }
            }

            return data;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private boolean parserCountry(char[][] data) {

        int i;
        boolean firstLine = true;
        char[] truth = {'t', 'r', 'u', 'e', '\n'};
        int isTruth = 1;

        for(i = 0; truth[i] != '\n'; i++) {
            if (data[0][i] == truth[i]) {
                isTruth++;
            }
        }

        return this.isSpain = isTruth == truth.length;
    }

    private int parserLength(char[][] data) {

        int maxSize = 7;
        int size = 0;
        char[] normas = new char[maxSize];
        for(int i = 0, j = 0; data[1][i] != '\n'; i++) {

            if (maxSize <= i) {
                break;
            }
            if (data[1][i] < '0' || data[1][i] > '9') {
                continue;
            } else {
                normas[j++] = data[1][i];
                size++;
            }
        }
        char[] tmp = new char[size];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = normas[i];
        }

        String parse = new String(tmp);
        return Integer.parseInt(parse);
    }
}
