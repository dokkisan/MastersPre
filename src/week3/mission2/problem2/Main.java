//package week3.mission2.problem2;
//
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(
//                    "/Users/hanawang/MastersPre/src/week2/mission2/problem2/index.txt"));
//            List<String> defaultData = new ArrayList<>();
//            String line = br.readLine();
//
//            while (line != null) {
//                StringTokenizer st = new StringTokenizer(line);
//                String name = st.nextToken();
//                String major = st.nextToken();
//
//                List<Integer> scores = new ArrayList<>();
//
//                while (st.hasMoreTokens()) {
//                    int score = Integer.parseInt(st.nextToken());
//                    scores.add(score);
//                }
//
//                Student student = new Student(name, major, scores);
//
//                scores.add(student);
//
//                line = br.readLine();
//    }
//}
