import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solve_20291 {

    static int N;

    public static class File {
        String name;
        int num;

        public File(String name, int num) {
            this.name = name;
            this.num = num;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<N; i++) {
            String input = br.readLine();
            input = input.substring(input.indexOf('.') + 1);
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        List<File> fileList = new ArrayList<>();

        for (String key : map.keySet()) {
            fileList.add(new File(key, map.get(key)));
        }

        Collections.sort(fileList, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(File element : fileList) {
            sb.append(element.name).append(" ").append(element.num).append("\n");
        }

        System.out.println(sb);
    }
}
