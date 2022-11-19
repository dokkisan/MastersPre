package week2.mission2.problem2.practice;

import java.io.*;

public class ReadTextFile {
    public static void main(String[] args) {
        try {
            // 파일 객체 생성
            File file = new File("/Users/hanawang/MastersPre/src/week2/mission2/problem2/index.txt");
            // 입력 스트림 생성
            FileReader fileReader = new FileReader(file);
            // 입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(fileReader);
            String line = "";
            while((line = bufReader.readLine()) != null) {
                System.out.println(line);
            }
            bufReader.close();
        }catch (FileNotFoundException e) {

        }catch (IOException e) {
            System.out.println(e);
        }
    }
}