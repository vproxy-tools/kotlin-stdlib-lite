package kotlin.text;

public class StringsKt {
    private StringsKt() {
    }

    public static StringBuilder clear(StringBuilder self) {
        return self.delete(0, self.length());
    }

    public static String concatToString(char[] self, int startIndex, int endIndex) {
        return new String(self, startIndex, endIndex - startIndex);
    }

    public static boolean isBlank(CharSequence self) {
        if (self.length() == 0)
            return true;
        for (int i = 0, l = self.length(); i < l; ++i) {
            char c = self.charAt(i);
            if (!Character.isWhitespace(c)) {
                return false;
            }
        }
        return true;
    }

    public static char last(CharSequence self) {
        if (self.length() == 0)
            throw new IndexOutOfBoundsException();
        return self.charAt(self.length() - 1);
    }

    public static String repeat(CharSequence self, int times) {
        StringBuilder sb = new StringBuilder(self.length() * times);
        for (int i = 0; i < times; ++i) {
            sb.append(self);
        }
        return sb.toString();
    }

    public static CharSequence trim(CharSequence self) {
        return self.toString().trim();
    }

    private static int indexOf(CharSequence self, CharSequence matcher,
                               int startIndex, boolean ignoreCase,
                               boolean backToFront, boolean matchOnlyOnce) {
        if (self.length() < matcher.length()) {
            return -1;
        }
        if (self.length() == 0) {
            return 0;
        }
        if (matcher.length() == 0) {
            if (startIndex < 0) {
                return 0;
            }
            //noinspection ManualMinMaxCalculation
            if (startIndex >= self.length()) {
                return self.length();
            }
            return startIndex;
        }
        if (startIndex < 0) {
            startIndex = 0;
        } else if (startIndex >= self.length()) {
            startIndex = self.length() - 1;
        }
        if (backToFront) {
            int possibleIndex = self.length() - matcher.length();
            if (startIndex > possibleIndex) {
                startIndex = possibleIndex;
            }
        } else {
            if (self.length() - startIndex < matcher.length()) {
                return -1;
            }
        }

        if (backToFront) {
            for (int i = startIndex; i >= 0; --i) {
                if (match(self, matcher, i, ignoreCase)) {
                    return i;
                }
                if (matchOnlyOnce) {
                    return -1;
                }
            }
        } else {
            for (int i = startIndex; i < self.length(); ++i) {
                if (match(self, matcher, i, ignoreCase)) {
                    return i;
                }
                if (matchOnlyOnce) {
                    return -1;
                }
            }
        }
        return -1;
    }

    private static boolean match(CharSequence self, CharSequence matcher, int index, boolean ignoreCase) {
        for (int i = 0, l = matcher.length(); i < l; ++i) {
            char a = self.charAt(index + i);
            char b = matcher.charAt(i);
            boolean same;
            if (ignoreCase) {
                same = Character.toLowerCase(a) == Character.toLowerCase(b);
            } else {
                same = a == b;
            }
            if (!same) {
                return false;
            }
        }
        return true;
    }

    public static boolean contains$default(CharSequence self, CharSequence other, boolean ignoreCase,
                                           int mask, @SuppressWarnings("unused") Object handler) {
        if ((mask & 2) == 2) {
            ignoreCase = false;
        }
        return indexOf(self, other, 0, ignoreCase, false, false) >= 0;
    }

    public static boolean startsWith$default(String self, String other, boolean ignoreCase,
                                             int mask, @SuppressWarnings("unused") Object handler) {
        return startsWith$default((CharSequence) self, other, ignoreCase, mask, handler);
    }

    public static boolean startsWith$default(CharSequence self, CharSequence other, boolean ignoreCase,
                                             int mask, @SuppressWarnings("unused") Object handler) {
        if ((mask & 2) == 2) {
            ignoreCase = false;
        }
        return indexOf(self, other, 0, ignoreCase, false, true) >= 0;
    }

    public static boolean endsWith$default(String self, String other, boolean ignoreCase,
                                           int mask, @SuppressWarnings("unused") Object handler) {
        return endsWith$default((CharSequence) self, other, ignoreCase, mask, handler);
    }

    public static boolean endsWith$default(CharSequence self, CharSequence other, boolean ignoreCase,
                                           int mask, @SuppressWarnings("unused") Object handler) {
        if ((mask & 2) == 2) {
            ignoreCase = false;
        }
        return indexOf(self, other, self.length() - other.length(), ignoreCase, true, true) >= 0;
    }

    public static int indexOf$default(CharSequence self, String other, int startIndex, boolean ignoreCase,
                                      int mask, @SuppressWarnings("unused") Object handler) {
        return indexOf$default(self, (CharSequence) other, startIndex, ignoreCase, mask, handler);
    }

    public static int indexOf$default(CharSequence self, CharSequence other, int startIndex, boolean ignoreCase,
                                      int mask, @SuppressWarnings("unused") Object handler) {
        if ((mask & 2) == 2) {
            startIndex = 0;
        }
        if ((mask & 4) == 4) {
            ignoreCase = false;
        }
        return indexOf(self, other, startIndex, ignoreCase, false, false);
    }

    public static int lastIndexOf$default(CharSequence self, String other, int startIndex, boolean ignoreCase,
                                          int mask, @SuppressWarnings("unused") Object handler) {
        return lastIndexOf$default(self, (CharSequence) other, startIndex, ignoreCase, mask, handler);
    }

    public static int lastIndexOf$default(CharSequence self, CharSequence other, int startIndex, boolean ignoreCase,
                                          int mask, @SuppressWarnings("unused") Object handler) {
        if ((mask & 2) == 2) {
            startIndex = self.length();
        }
        if ((mask & 4) == 4) {
            ignoreCase = false;
        }
        return indexOf(self, other, startIndex, ignoreCase, true, false);
    }
}
