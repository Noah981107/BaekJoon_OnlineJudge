import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Solve_10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Student[] students = new Student[N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int ko = Integer.parseInt(st.nextToken());
            int en = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            students[i] = new Student(name, ko, en, math);
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.ko < o2.ko){
                    return 1;
                }
                else if(o1.ko == o2.ko){
                    if(o1.en > o2.en)
                        return 1;
                    else if(o1.en == o2.en){
                        if(o1.math < o2.math){
                            return 1;
                        }
                        else if(o1.math == o2.math){
                            return o1.name.compareTo(o2.name);
                        }
                    }
                }

                return -1;
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(students[i].getName()).append("\n");
        }

        System.out.println(sb);
    }

    public static class Student {
        String name;
        int ko;
        int en;
        int math;

        public Student(String name, int ko, int en, int math) {
            this.name = name;
            this.ko = ko;
            this.en = en;
            this.math = math;
        }

        public String getName() {
            return name;
        }
    }
}
