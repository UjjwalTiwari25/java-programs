package scvariableargument;
public class SCVariableargument {
    static void showList(int start, String... S) {
        for (String s : S) {
            System.out.println(start + "." + s);
            start++;

        }
    }

    public static void main(String... args) {
        showList(1, "Ram", "Ujj wal", "Rahul", "Raj");
    }
}