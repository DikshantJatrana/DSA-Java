public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        System.out.println(sb);
        sb.setCharAt(0, 'P');
        System.out.println(sb);
    }
}
