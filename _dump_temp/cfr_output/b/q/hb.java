/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.e.bb;
import b.o.d.rc;
import b.q.f;
import b.q.fb;
import b.q.h;
import b.q.lb;
import b.s.kb;
import b.s.z;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class hb
extends lb {
    private static final int super(String string, char c2, int n2) {
        return string.indexOf(c2, n2);
    }

    private static final int super(String string, String string2, int n2) {
        return string.indexOf(string2, n2);
    }

    private static final int \u00d200000(String string, char c2, int n2) {
        return string.lastIndexOf(c2, n2);
    }

    private static final int \u00d200000(String string, String string2, int n2) {
        return string.lastIndexOf(string2, n2);
    }

    public static final boolean \u00d400000(String string, String string2, boolean bl) {
        if (string == null) {
            return string2 == null;
        }
        if (!bl) {
            return string.equals(string2);
        }
        return string.equalsIgnoreCase(string2);
    }

    public static /* synthetic */ boolean \u00d200000(String string, String string2, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return f.\u00d400000(string, string2, bl);
    }

    public static final String \u00d200000(String charSequence, char c2, char c3, boolean bl) {
        StringBuilder stringBuilder;
        if (!bl) {
            return ((String)charSequence).replace(c2, c3);
        }
        int n2 = ((String)charSequence).length();
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder(n2);
        charSequence = charSequence;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c4 = charSequence.charAt(i2);
            stringBuilder2.append(h.o00000(c4, c2, bl) ? c3 : c4);
        }
        return stringBuilder.toString();
    }

    public static /* synthetic */ String super(String string, char c2, char c3, boolean bl, int n2, Object object) {
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return f.\u00d200000(string, c2, c3, bl);
    }

    public static final String \u00d200000(String string, String string2, String string3, boolean bl) {
        int n2 = f.super((CharSequence)string, string2, 0, bl);
        if (n2 < 0) {
            return string;
        }
        int n3 = string2.length();
        int n4 = bb.\u00d200000(n3, 1);
        int n5 = string.length() - n3 + string3.length();
        if (n5 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder stringBuilder = new StringBuilder(n5);
        int n6 = 0;
        do {
            stringBuilder.append(string, n6, n2).append(string3);
            n6 = n2 + n3;
        } while (n2 < string.length() && (n2 = f.super((CharSequence)string, string2, n2 + n4, bl)) > 0);
        return stringBuilder.append(string, n6, string.length()).toString();
    }

    public static /* synthetic */ String super(String string, String string2, String string3, boolean bl, int n2, Object object) {
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return f.\u00d200000(string, string2, string3, bl);
    }

    public static final String super(String string, char c2, char c3, boolean bl) {
        int n2 = f.super((CharSequence)string, c2, 0, bl, 2, null);
        c2 = (char)n2;
        if (n2 < 0) {
            return string;
        }
        int n3 = c2 + '\u0001';
        CharSequence charSequence = String.valueOf(c3);
        return ((Object)f.super((CharSequence)string, (int)c2, n3, charSequence)).toString();
    }

    public static /* synthetic */ String \u00d200000(String string, char c2, char c3, boolean bl, int n2, Object object) {
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return f.super(string, c2, c3, bl);
    }

    public static final String super(String string, String string2, String string3, boolean n2) {
        if ((n2 = f.super((CharSequence)string, string2, 0, n2 != 0, 2, null)) < 0) {
            return string;
        }
        int n3 = n2 + string2.length();
        return ((Object)f.super((CharSequence)string, n2, n3, (CharSequence)string3)).toString();
    }

    public static /* synthetic */ String \u00d200000(String string, String string2, String string3, boolean bl, int n2, Object object) {
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return f.super(string, string2, string3, bl);
    }

    private static final String \u00d6o0000(String string) {
        return string.toUpperCase();
    }

    private static final String publicsuper(String string) {
        return string.toUpperCase(Locale.ROOT);
    }

    private static final String \u00f6o0000(String string) {
        return string.toLowerCase();
    }

    private static final String \u00d3o0000(String string) {
        return string.toLowerCase(Locale.ROOT);
    }

    public static final String super(char[] cArray) {
        return new String(cArray);
    }

    public static final String super(char[] cArray, int n2, int n3) {
        kb.return.o00000(n2, n3, cArray.length);
        return new String(cArray, n2, n3 - n2);
    }

    public static /* synthetic */ String super(char[] cArray, int n2, int n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = cArray.length;
        }
        return f.super(cArray, n2, n3);
    }

    public static final char[] super(String string, int n2, int n3) {
        kb.return.o00000(n2, n3, string.length());
        char[] cArray = new char[n3 - n2];
        string.getChars(n2, n3, cArray, 0);
        return cArray;
    }

    public static /* synthetic */ char[] super(String string, int n2, int n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = string.length();
        }
        return f.super(string, n2, n3);
    }

    public static final String super(byte[] byArray) {
        return new String(byArray, fb.\u00d300000);
    }

    public static final String super(byte[] byArray, int n2, int n3, boolean bl) {
        kb.return.o00000(n2, n3, byArray.length);
        if (!bl) {
            return new String(byArray, n2, n3 - n2, fb.\u00d300000);
        }
        return fb.\u00d300000.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(byArray, n2, n3 - n2)).toString();
    }

    public static /* synthetic */ String super(byte[] byArray, int n2, int n3, boolean bl, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = byArray.length;
        }
        if ((n4 & 4) != 0) {
            bl = false;
        }
        return f.super(byArray, n2, n3, bl);
    }

    public static final byte[] \u00f4o0000(String string) {
        return string.getBytes(fb.\u00d300000);
    }

    public static final byte[] super(String object, int n2, int n3, boolean bl) {
        byte[] byArray;
        kb.return.o00000(n2, n3, ((String)object).length());
        if (!bl) {
            String string = ((String)object).substring(n2, n3);
            object = fb.\u00d300000;
            return string.getBytes((Charset)object);
        }
        object = fb.\u00d300000.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap((CharSequence)object, n2, n3));
        if (((ByteBuffer)object).hasArray() && ((ByteBuffer)object).arrayOffset() == 0 && ((Buffer)object).remaining() == ((ByteBuffer)object).array().length) {
            return ((ByteBuffer)object).array();
        }
        byte[] byArray2 = byArray = new byte[((Buffer)object).remaining()];
        ((ByteBuffer)object).get(byArray2);
        return byArray;
    }

    public static /* synthetic */ byte[] super(String string, int n2, int n3, boolean bl, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = string.length();
        }
        if ((n4 & 4) != 0) {
            bl = false;
        }
        return f.super(string, n2, n3, bl);
    }

    private static final char[] \u00d4o0000(String string) {
        return string.toCharArray();
    }

    private static final char[] super(String string, char[] cArray, int n2, int n3, int n4) {
        string.getChars(n3, n4, cArray, n2);
        return cArray;
    }

    static /* synthetic */ char[] super(String string, char[] cArray, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n2 = 0;
        }
        if ((n5 & 4) != 0) {
            n3 = 0;
        }
        if ((n5 & 8) != 0) {
            n4 = string.length();
        }
        string.getChars(n3, n4, cArray, n2);
        return cArray;
    }

    private static final String super(String string, Object ... objectArray) {
        return String.format(string, Arrays.copyOf(objectArray, objectArray.length));
    }

    private static final String super(rc rc2, String string, Object ... objectArray) {
        return String.format(string, Arrays.copyOf(objectArray, objectArray.length));
    }

    private static final String super(String string, Locale locale, Object ... objectArray) {
        return String.format(locale, string, Arrays.copyOf(objectArray, objectArray.length));
    }

    private static final String super(rc rc2, Locale locale, String string, Object ... objectArray) {
        return String.format(locale, string, Arrays.copyOf(objectArray, objectArray.length));
    }

    public static final List super(CharSequence charSequence, Pattern pattern, int n2) {
        f.super(n2);
        return z.\u00d500000(pattern.split(charSequence, n2 == 0 ? -1 : n2));
    }

    public static /* synthetic */ List super(CharSequence charSequence, Pattern pattern, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        return f.super(charSequence, pattern, n2);
    }

    private static final String OO0000(String string, int n2) {
        return string.substring(n2);
    }

    private static final String \u00d400000(String string, int n2, int n3) {
        return string.substring(n2, n3);
    }

    public static final boolean \u00d300000(String string, String string2, boolean bl) {
        if (!bl) {
            return string.startsWith(string2);
        }
        return f.super(string, 0, string2, 0, string2.length(), bl);
    }

    public static /* synthetic */ boolean \u00d300000(String string, String string2, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return f.\u00d300000(string, string2, bl);
    }

    public static final boolean super(String string, String string2, int n2, boolean bl) {
        if (!bl) {
            return string.startsWith(string2, n2);
        }
        return f.super(string, n2, string2, 0, string2.length(), bl);
    }

    public static /* synthetic */ boolean super(String string, String string2, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return f.super(string, string2, n2, bl);
    }

    public static final boolean super(String string, String string2, boolean bl) {
        if (!bl) {
            return string.endsWith(string2);
        }
        String string3 = string;
        return f.super(string3, string3.length() - string2.length(), string2, 0, string2.length(), true);
    }

    public static /* synthetic */ boolean \u00d400000(String string, String string2, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return f.super(string, string2, bl);
    }

    private static final String super(byte[] byArray, int n2, int n3, Charset charset) {
        return new String(byArray, n2, n3, charset);
    }

    private static final String super(byte[] byArray, Charset charset) {
        return new String(byArray, charset);
    }

    private static final String super(byte[] byArray, int n2, int n3) {
        return new String(byArray, n2, n3, fb.\u00d300000);
    }

    private static final String \u00d200000(byte[] byArray) {
        return new String(byArray, fb.\u00d300000);
    }

    private static final String \u00d200000(char[] cArray) {
        return new String(cArray);
    }

    private static final String \u00d200000(char[] cArray, int n2, int n3) {
        return new String(cArray, n2, n3);
    }

    private static final String super(int[] nArray, int n2, int n3) {
        return new String(nArray, n2, n3);
    }

    private static final String super(StringBuffer stringBuffer) {
        return new String(stringBuffer);
    }

    private static final String \u00d400000(StringBuilder stringBuilder) {
        return new String(stringBuilder);
    }

    private static final int \u00f800000(String string, int n2) {
        return string.codePointAt(n2);
    }

    private static final int do(String string, int n2) {
        return string.codePointBefore(n2);
    }

    private static final int \u00d200000(String string, int n2, int n3) {
        return string.codePointCount(n2, n3);
    }

    public static final int \u00d200000(String string, String string2, boolean bl) {
        if (bl) {
            return string.compareToIgnoreCase(string2);
        }
        return string.compareTo(string2);
    }

    public static /* synthetic */ int super(String string, String string2, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return f.\u00d200000(string, string2, bl);
    }

    private static final boolean super(String string, CharSequence charSequence) {
        return string.contentEquals(charSequence);
    }

    private static final boolean super(String string, StringBuffer stringBuffer) {
        return string.contentEquals(stringBuffer);
    }

    public static final boolean super(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence instanceof String && charSequence2 != null) {
            return ((String)charSequence).contentEquals(charSequence2);
        }
        return f.\u00d600000(charSequence, charSequence2);
    }

    public static final boolean super(CharSequence charSequence, CharSequence charSequence2, boolean bl) {
        if (bl) {
            return f.\u00d400000(charSequence, charSequence2);
        }
        return f.super(charSequence, charSequence2);
    }

    private static final String \u00d8o0000(String string) {
        return string.intern();
    }

    private static final int \u00d300000(String string, int n2, int n3) {
        return string.offsetByCodePoints(n2, n3);
    }

    public static final boolean super(CharSequence charSequence, int n2, CharSequence charSequence2, int n3, int n4, boolean bl) {
        if (charSequence instanceof String && charSequence2 instanceof String) {
            return f.super((String)charSequence, n2, (String)charSequence2, n3, n4, bl);
        }
        return f.\u00d200000(charSequence, n2, charSequence2, n3, n4, bl);
    }

    public static /* synthetic */ boolean super(CharSequence charSequence, int n2, CharSequence charSequence2, int n3, int n4, boolean bl, int n5, Object object) {
        if ((n5 & 0x10) != 0) {
            bl = false;
        }
        return f.super(charSequence, n2, charSequence2, n3, n4, bl);
    }

    public static final boolean super(String string, int n2, String string2, int n3, int n4, boolean bl) {
        if (!bl) {
            return string.regionMatches(n2, string2, n3, n4);
        }
        return string.regionMatches(bl, n2, string2, n3, n4);
    }

    public static /* synthetic */ boolean super(String string, int n2, String string2, int n3, int n4, boolean bl, int n5, Object object) {
        if ((n5 & 0x10) != 0) {
            bl = false;
        }
        return f.super(string, n2, string2, n3, n4, bl);
    }

    private static final String super(String string, Locale locale) {
        return string.toLowerCase(locale);
    }

    private static final String \u00d200000(String string, Locale locale) {
        return string.toLowerCase(locale);
    }

    private static final String \u00d300000(String string, Locale locale) {
        return string.toUpperCase(locale);
    }

    private static final String class(String string, Locale locale) {
        return string.toUpperCase(locale);
    }

    private static final byte[] super(String string, Charset charset) {
        return string.getBytes(charset);
    }

    static /* synthetic */ byte[] super(String string, Charset charset, int n2, Object object) {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        return string.getBytes(charset);
    }

    private static final Pattern \u00d2O0000(String string, int n2) {
        return Pattern.compile(string, n2);
    }

    static /* synthetic */ Pattern super(String string, int n2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n2 = 0;
        }
        return Pattern.compile(string, n2);
    }

    public static final String \u00d2o0000(String string) {
        return f.\u00d400000(string, Locale.getDefault());
    }

    public static final String \u00d400000(String string, Locale locale) {
        char c2;
        if (((CharSequence)string).length() > 0 && Character.isLowerCase(c2 = string.charAt(0))) {
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
            char c3 = Character.toTitleCase(c2);
            if (c3 != Character.toUpperCase(c2)) {
                stringBuilder2.append(c3);
            } else {
                stringBuilder2.append(string.substring(0, 1).toUpperCase(locale));
            }
            stringBuilder2.append(string.substring(1));
            return stringBuilder.toString();
        }
        return string;
    }

    public static final String floatsuper(String string) {
        if (((CharSequence)string).length() > 0 && !Character.isLowerCase(string.charAt(0))) {
            String string2 = string.substring(0, 1);
            Locale locale = Locale.getDefault();
            return string2.toLowerCase(locale) + string.substring(1);
        }
        return string;
    }

    public static final String \u00d600000(String string, Locale locale) {
        if (((CharSequence)string).length() > 0 && !Character.isLowerCase(string.charAt(0))) {
            return string.substring(0, 1).toLowerCase(locale) + string.substring(1);
        }
        return string;
    }

    public static final String super(CharSequence charSequence, int n2) {
        if (!(n2 >= 0)) {
            charSequence = "Count 'n' must be non-negative, but was " + n2 + '.';
            throw new IllegalArgumentException(((Object)charSequence).toString());
        }
        switch (n2) {
            case 0: {
                return "";
            }
            case 1: {
                return ((Object)charSequence).toString();
            }
        }
        switch (charSequence.length()) {
            case 0: {
                return "";
            }
            case 1: {
                char c2 = charSequence.charAt(0);
                int n3 = 0;
                char[] cArray = new char[n2];
                while (n3 < n2) {
                    int n4 = n3++;
                    cArray[n4] = c2;
                }
                char[] cArray2 = cArray;
                return new String(cArray2);
            }
        }
        StringBuilder stringBuilder = new StringBuilder(n2 * charSequence.length());
        int n5 = 1;
        if (n2 > 0) {
            while (true) {
                stringBuilder.append(charSequence);
                if (n5 == n2) break;
                ++n5;
            }
        }
        return stringBuilder.toString();
    }

    public static final Comparator super(rc rc2) {
        return String.CASE_INSENSITIVE_ORDER;
    }
}

