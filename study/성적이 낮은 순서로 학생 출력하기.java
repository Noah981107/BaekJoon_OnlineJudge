import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Question2 {

    static class Student {
        String name;
        int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    static int N;
    static List<Student> arr = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            arr.add(new Student(input[0], Integer.parseInt(input[1])));
        }

        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.score - o2.score;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Student student : arr) {
            sb.append(student.name).append(" ");
        }

        System.out.println(sb);
    }
}
