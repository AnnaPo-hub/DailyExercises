package regEx;

public class CheckIP {
    /**
     * A method checks whether @param input is a valid IP address.
     *
     * @return true if  IP is valid  or false if IP is not valid.
     */
    public boolean checkIPAddress(String input) {
        String regEx = "[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";
        boolean isLogin = input.matches(regEx);
        if (!isLogin) {
            return false;
        } else {
            final String[] split = input.split("\\.");
            for (int i = 0; i < split.length; i++) {
                int currInt = Integer.parseInt(split[i]);
                if (currInt > 255 || currInt < 0) {
                    return false;
                } else if (i == split.length - 1)
                    return true;
            }
        }
        return true;
    }
}
