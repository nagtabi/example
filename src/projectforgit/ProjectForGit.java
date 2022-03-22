package projectforgit;

/**
 * @author --G--
 */
public class ProjectForGit {

    public static void main(String[] args) {
        String expr = "2,3....45,34";
        expr = expr.replaceFirst("\\.|,", "~");
        System.out.println(expr);
        expr = expr.replaceAll("\\.|,", "");
        expr = expr.replace("~", ",");
        System.out.println(expr);
    }

}
