package week2.mission2.problem2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FileInput {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(
                "/Users/hanawang/MastersPre/src/week2/mission2/problem2/index.txt"));

        //  기본 데이터 입력
        bw.write("Kim 수학 100 100");
        bw.newLine();
        bw.write("Lee 국어 55 55 100");
        bw.close();


    }
}
