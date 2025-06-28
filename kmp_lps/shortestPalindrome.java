static public String shortestPalindrome(String s) {
    StringBuilder reverfull = new StringBuilder();

    reverfull.append(s);
    reverfull.append("#");
    reverfull.append(new StringBuilder(s).reverse().toString());
    int lps[] = new int[reverfull.length()];

    for (int i = 1; i < lps.length; i++) {
        int len = lps[i - 1];
        while (len > 0 && reverfull.charAt(len) != reverfull.charAt(i)) {
            len = lps[len - 1];
        }
        if (len == 0) {
            if (reverfull.charAt(len) == reverfull.charAt(i)) {
                lps[i] = 1;
                continue;
            } else {
                lps[i] = 0;
                continue;
            }
        }
        lps[i] = len + 1;
    }

    StringBuilder newadded = new StringBuilder(reverfull.substring(
            s.length() + 1, (s.length() + 1) + (s.length() - lps[lps.length - 1])));

    return newadded.append(s).toString();
}