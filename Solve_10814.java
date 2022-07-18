import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solve_10814 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Person[] people = new Person[N];
        for(int i=0; i<N; i++){
            String[] tmp = br.readLine().split(" ");
            int age = Integer.parseInt(tmp[0]);
            String name = tmp[1];
            people[i] = new Person(age, name);
        }

        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(people[i]);
        }
        System.out.println(sb);
    }
    public static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public String toString() {
            return age + " " + name + "\n";
        }
    }
}
