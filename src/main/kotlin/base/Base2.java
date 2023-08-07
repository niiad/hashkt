package base;

public class Base2 {

    /**
     * checks if a given string is a valid url using regular expression
     *
     * @param url the given string
     *
     * @return 'true' if the given string is a valid url, 'false' otherwise
     * */
    public static boolean isValidURL(String url) {
        String pattern = "^(https?|ftp)://[\\w\\-]+(\\.[\\w\\-]+)+([\\w\\-.,@?^=%&:/~+#]*[\\w\\-@?^=%&/~+#])?$";

        return url.matches(pattern);
    }
}
