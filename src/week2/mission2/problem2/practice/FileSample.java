//package week2.mission2.problem2.practice;
//
//import java.io.*;
//import java.nio.*;
//
//public class FileSample {
//    public static void main(String[] args) throws Exception {
//        //  1. 파일명과 파일에 쓸 내용 입력받기
//        String path = "/Users/hanawang/MastersPre/src/week2/mission2/problem2/index.txt";
//
////        Path path = Paths.get("/Users/hanawang/MastersPre/src/week2/mission2/problem2/index.txt");
//        System.out.println("Input 파일명 입력: ");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        //  1-(1). 파일명 입력
//        String fileName = "index.txt";
//
//        //  1-(2). 파일에 쓸 내용 입력
//        System.out.println("내용 입력: ");
//        String contentToWrite = br.readLine();
//
//        //  1-(3). 파일 생성 및 내용 쓰기
//        FileWriter fw = new FileWriter(fileName);
//
//        fw.write(contentToWrite);
//        fw.close();
//
//        // 2. 파일명을 읽어와서 파일 내용 출력
//        System.out.println("Output 파일명 입력: ");
//        fileName = "index.txt";
//        br.close();
//
//        File f = new File(path);
//
//        FileReader fr = new FileReader(f);
//
//        //  BufferedReader를 사용하는 이유: 한 줄씩 읽어오는 함수 readLine이 있기 때문
//            br = new BufferedReader(fr);
//
//            String temp = "";   //  한 줄씩 읽어올 변수
//            contentToWrite = "";   //  파일의 내용을 담을 변수 초기화
//
//        //  한 줄씩 읽어서 temp에 저장
//        while ((temp = br.readLine()) != null) {
//            temp += "\n";   //  한 줄씩 읽어오므로 개행문자 추가
//            contentToWrite += temp;
//        }
//
//        System.out.println(contentToWrite);
//
//        br.close();
//    }
//}
