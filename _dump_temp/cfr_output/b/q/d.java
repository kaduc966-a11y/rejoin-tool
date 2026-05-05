/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.ac;
import b.e.bb;
import b.e.m;
import b.e.x;
import b.g.c;
import b.g.n;
import b.o.d.fc;
import b.o.e.g;
import b.q.d$_b$_b$_b$1;
import b.q.d$_c$1;
import b.q.d$_d$_b$_b$1;
import b.q.f;
import b.q.i;
import b.qb;
import b.s.ab;
import b.s.e;
import b.s.gc;
import b.s.mc;
import b.s.ub;
import b.s.y;
import b.yc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class d
extends i {
    private static final char \u00d400000(CharSequence charSequence, int n2, g g2) {
        boolean bl = n2 >= 0 ? n2 < charSequence.length() : false;
        if (bl) {
            return charSequence.charAt(n2);
        }
        return ((Character)g2.\u00f800000(n2)).charValue();
    }

    private static final Character class(CharSequence charSequence, int n2) {
        return f.\u00f600000(charSequence, n2);
    }

    private static final Character \u00f8\u00d20000(CharSequence charSequence, g g2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            if (!((Boolean)g2.\u00f800000(Character.valueOf(c2))).booleanValue()) continue;
            return Character.valueOf(c2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static final Character \u00d4O0000(CharSequence charSequence, g g2) {
        int c2 = charSequence.length() + -1;
        if (c2 >= 0) {
            void var2_3;
            do {
                char c3 = var2_3--;
                if (!((Boolean)g2.\u00f800000(Character.valueOf(c3 = charSequence.charAt(c3)))).booleanValue()) continue;
                return Character.valueOf(c3);
            } while (var2_3 >= 0);
        }
        return null;
    }

    public static final char \u00d3\u00d20000(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    public static final char \u00d4\u00d20000(CharSequence charSequence, g g2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            if (!((Boolean)g2.\u00f800000(Character.valueOf(c2))).booleanValue()) continue;
            return c2;
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    private static final Object intnew(CharSequence charSequence, g g2) {
        Object object;
        block3: {
            for (int i2 = 0; i2 < charSequence.length(); ++i2) {
                char c2 = charSequence.charAt(i2);
                object = g2.\u00f800000(Character.valueOf(c2));
                if (object == null) {
                    continue;
                }
                break block3;
            }
            object = null;
        }
        if (object == null) {
            throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
        }
        return object;
    }

    private static final Object \u00d6o0000(CharSequence charSequence, g g2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            Object object = g2.\u00f800000(Character.valueOf(c2));
            if (object == null) continue;
            return object;
        }
        return null;
    }

    public static final Character intnew(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static final Character OO0000(CharSequence charSequence, g g2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            if (!((Boolean)g2.\u00f800000(Character.valueOf(c2))).booleanValue()) continue;
            return Character.valueOf(c2);
        }
        return null;
    }

    private static final char \u00d200000(CharSequence charSequence, int n2, g g2) {
        boolean bl = n2 >= 0 ? n2 < charSequence.length() : false;
        if (bl) {
            return charSequence.charAt(n2);
        }
        return ((Character)g2.\u00f800000(n2)).charValue();
    }

    public static final Character \u00f600000(CharSequence charSequence, int n2) {
        boolean bl = n2 >= 0 ? n2 < charSequence.length() : false;
        if (bl) {
            return Character.valueOf(charSequence.charAt(n2));
        }
        return null;
    }

    public static final int \u00d2o0000(CharSequence charSequence, g g2) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!((Boolean)g2.\u00f800000(Character.valueOf(charSequence.charAt(i2)))).booleanValue()) continue;
            return i2;
        }
        return -1;
    }

    public static final int \u00f4\u00d20000(CharSequence charSequence, g g2) {
        int n2 = charSequence.length() + -1;
        if (n2 >= 0) {
            do {
                int n3;
                if (!((Boolean)g2.\u00f800000(Character.valueOf(charSequence.charAt(n3 = n2--)))).booleanValue()) continue;
                return n3;
            } while (n2 >= 0);
        }
        return -1;
    }

    public static final char \u00d8\u00d20000(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        CharSequence charSequence2 = charSequence;
        return charSequence2.charAt(f.\u00d400000(charSequence2));
    }

    /*
     * WARNING - void declaration
     */
    public static final char \u00d2\u00d20000(CharSequence charSequence, g g2) {
        int c2 = charSequence.length() + -1;
        if (c2 >= 0) {
            void var2_3;
            do {
                char c3 = var2_3--;
                if (!((Boolean)g2.\u00f800000(Character.valueOf(c3 = charSequence.charAt(c3)))).booleanValue()) continue;
                return c3;
            } while (var2_3 >= 0);
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final Character \u00d6\u00d20000(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        CharSequence charSequence2 = charSequence;
        return Character.valueOf(charSequence2.charAt(charSequence2.length() - 1));
    }

    /*
     * WARNING - void declaration
     */
    public static final Character Oo0000(CharSequence charSequence, g g2) {
        int c2 = charSequence.length() + -1;
        if (c2 >= 0) {
            void var2_3;
            do {
                char c3 = var2_3--;
                if (!((Boolean)g2.\u00f800000(Character.valueOf(c3 = charSequence.charAt(c3)))).booleanValue()) continue;
                return Character.valueOf(c3);
            } while (var2_3 >= 0);
        }
        return null;
    }

    private static final char supernew(CharSequence charSequence) {
        return f.super(charSequence, b.b.f.super);
    }

    public static final char super(CharSequence charSequence, b.b.f f2) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(f2.o00000(charSequence.length()));
    }

    private static final Character \u00d2\u00d20000(CharSequence charSequence) {
        return f.\u00d200000(charSequence, b.b.f.super);
    }

    public static final Character \u00d200000(CharSequence charSequence, b.b.f f2) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(f2.o00000(charSequence.length())));
    }

    public static final char \u00f4O0000(CharSequence charSequence) {
        switch (charSequence.length()) {
            case 0: {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            case 1: {
                return charSequence.charAt(0);
            }
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static final char \u00d2\u00d30000(CharSequence charSequence, g g2) {
        Character c2 = null;
        boolean bl = false;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c3 = charSequence.charAt(i2);
            if (!((Boolean)g2.\u00f800000(Character.valueOf(c3))).booleanValue()) continue;
            if (bl) {
                throw new IllegalArgumentException("Char sequence contains more than one matching element.");
            }
            c2 = Character.valueOf(c3);
            bl = true;
        }
        if (!bl) {
            throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
        }
        return c2.charValue();
    }

    public static final Character \u00f8o0000(CharSequence charSequence) {
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    public static final Character \u00f6\u00d30000(CharSequence charSequence, g g2) {
        Character c2 = null;
        boolean bl = false;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c3 = charSequence.charAt(i2);
            if (!((Boolean)g2.\u00f800000(Character.valueOf(c3))).booleanValue()) continue;
            if (bl) {
                return null;
            }
            c2 = Character.valueOf(c3);
            bl = true;
        }
        if (!bl) {
            return null;
        }
        return c2;
    }

    public static final CharSequence \u00d400000(CharSequence charSequence, int n2) {
        if (!(n2 >= 0)) {
            charSequence = "Requested character count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(((Object)charSequence).toString());
        }
        return charSequence.subSequence(bb.Object(n2, charSequence.length()), charSequence.length());
    }

    public static final String \u00d6O0000(String string, int n2) {
        if (!(n2 >= 0)) {
            string = "Requested character count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(string.toString());
        }
        String string2 = string;
        int n3 = bb.Object(n2, string.length());
        return string2.substring(n3);
    }

    public static final CharSequence \u00d800000(CharSequence charSequence, int n2) {
        if (!(n2 >= 0)) {
            charSequence = "Requested character count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(((Object)charSequence).toString());
        }
        CharSequence charSequence2 = charSequence;
        return f.\u00d600000(charSequence2, bb.\u00d200000(charSequence2.length() - n2, 0));
    }

    public static final String \u00d4O0000(String string, int n2) {
        if (!(n2 >= 0)) {
            string = "Requested character count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(string.toString());
        }
        String string2 = string;
        return f.interface(string2, bb.\u00d200000(string2.length() - n2, 0));
    }

    public static final CharSequence int(CharSequence charSequence, g g2) {
        for (int i2 = f.\u00d400000(charSequence); i2 >= 0; --i2) {
            if (((Boolean)g2.\u00f800000(Character.valueOf(charSequence.charAt(i2)))).booleanValue()) continue;
            return charSequence.subSequence(0, i2 + 1);
        }
        return "";
    }

    public static final String \u00f600000(String string, g g2) {
        for (int i2 = f.\u00d400000((CharSequence)string); i2 >= 0; --i2) {
            if (((Boolean)g2.\u00f800000(Character.valueOf(string.charAt(i2)))).booleanValue()) continue;
            int n2 = i2 + 1;
            return string.substring(0, n2);
        }
        return "";
    }

    public static final CharSequence \u00d2\u00d40000(CharSequence charSequence, g g2) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (((Boolean)g2.\u00f800000(Character.valueOf(charSequence.charAt(i2)))).booleanValue()) continue;
            return charSequence.subSequence(i2, charSequence.length());
        }
        return "";
    }

    public static final String \u00f400000(String string, g g2) {
        int n2 = ((CharSequence)string).length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (((Boolean)g2.\u00f800000(Character.valueOf(string.charAt(i2)))).booleanValue()) continue;
            return string.substring(i2);
        }
        return "";
    }

    public static final CharSequence \u00d6\u00d30000(CharSequence charSequence, g g2) {
        Appendable appendable = new StringBuilder();
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = charSequence.charAt(i2);
            if (!((Boolean)g2.\u00f800000(Character.valueOf(c2))).booleanValue()) continue;
            appendable.append(c2);
        }
        return (CharSequence)((Object)appendable);
    }

    public static final String do(String charSequence, g g2) {
        charSequence = charSequence;
        Appendable appendable = new StringBuilder();
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = charSequence.charAt(i2);
            if (!((Boolean)g2.\u00f800000(Character.valueOf(c2))).booleanValue()) continue;
            appendable.append(c2);
        }
        return ((StringBuilder)appendable).toString();
    }

    public static final CharSequence \u00d200000(CharSequence charSequence, b.o.e.f f2) {
        Appendable appendable = new StringBuilder();
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            int n3;
            char c2 = charSequence.charAt(i2);
            if (!((Boolean)f2.o00000(n3 = n2++, Character.valueOf(c2))).booleanValue()) continue;
            appendable.append(c2);
        }
        return (CharSequence)((Object)appendable);
    }

    public static final String super(String charSequence, b.o.e.f f2) {
        charSequence = charSequence;
        Appendable appendable = new StringBuilder();
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            int n3;
            char c2 = charSequence.charAt(i2);
            if (!((Boolean)f2.o00000(n3 = n2++, Character.valueOf(c2))).booleanValue()) continue;
            appendable.append(c2);
        }
        return ((StringBuilder)appendable).toString();
    }

    public static final Appendable super(CharSequence charSequence, Appendable appendable, b.o.e.f f2) {
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            int n3;
            char c2 = charSequence.charAt(i2);
            if (!((Boolean)f2.o00000(n3 = n2++, Character.valueOf(c2))).booleanValue()) continue;
            appendable.append(c2);
        }
        return appendable;
    }

    public static final CharSequence \u00d8o0000(CharSequence charSequence, g g2) {
        Appendable appendable = new StringBuilder();
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            if (((Boolean)g2.\u00f800000(Character.valueOf(c2))).booleanValue()) continue;
            appendable.append(c2);
        }
        return (CharSequence)((Object)appendable);
    }

    public static final String OO0000(String charSequence, g g2) {
        charSequence = charSequence;
        Appendable appendable = new StringBuilder();
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            if (((Boolean)g2.\u00f800000(Character.valueOf(c2))).booleanValue()) continue;
            appendable.append(c2);
        }
        return ((StringBuilder)appendable).toString();
    }

    public static final Appendable super(CharSequence charSequence, Appendable appendable, g g2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            if (((Boolean)g2.\u00f800000(Character.valueOf(c2))).booleanValue()) continue;
            appendable.append(c2);
        }
        return appendable;
    }

    public static final Appendable \u00d200000(CharSequence charSequence, Appendable appendable, g g2) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = charSequence.charAt(i2);
            if (!((Boolean)g2.\u00f800000(Character.valueOf(c2))).booleanValue()) continue;
            appendable.append(c2);
        }
        return appendable;
    }

    public static final CharSequence \u00d600000(CharSequence charSequence, m m2) {
        if (((x)m2).if()) {
            return "";
        }
        return f.\u00d400000(charSequence, m2);
    }

    public static final String \u00d300000(String string, m m2) {
        if (((x)m2).if()) {
            return "";
        }
        return f.\u00d200000(string, m2);
    }

    public static final CharSequence super(CharSequence charSequence, Iterable object) {
        int n2 = mc.o00000((Iterable)object, 10);
        if (n2 == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(n2);
        object = object.iterator();
        while (object.hasNext()) {
            int n3 = ((Number)object.next()).intValue();
            stringBuilder.append(charSequence.charAt(n3));
        }
        return stringBuilder;
    }

    private static final String super(String string, Iterable iterable) {
        return ((Object)f.super((CharSequence)string, iterable)).toString();
    }

    public static final CharSequence \u00d600000(CharSequence charSequence, int n2) {
        if (!(n2 >= 0)) {
            charSequence = "Requested character count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(((Object)charSequence).toString());
        }
        return charSequence.subSequence(0, bb.Object(n2, charSequence.length()));
    }

    public static final String interface(String string, int n2) {
        if (!(n2 >= 0)) {
            string = "Requested character count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(string.toString());
        }
        String string2 = string;
        int n3 = bb.Object(n2, string.length());
        return string2.substring(0, n3);
    }

    public static final CharSequence \u00f400000(CharSequence charSequence, int n2) {
        if (!(n2 >= 0)) {
            charSequence = "Requested character count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(((Object)charSequence).toString());
        }
        int n3 = charSequence.length();
        return charSequence.subSequence(n3 - bb.Object(n2, n3), n3);
    }

    public static final String \u00d3O0000(String string, int n2) {
        if (!(n2 >= 0)) {
            string = "Requested character count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(string.toString());
        }
        int n3 = string.length();
        n2 = n3 - bb.Object(n2, n3);
        return string.substring(n2);
    }

    public static final CharSequence donew(CharSequence charSequence, g g2) {
        for (int i2 = f.\u00d400000(charSequence); i2 >= 0; --i2) {
            if (((Boolean)g2.\u00f800000(Character.valueOf(charSequence.charAt(i2)))).booleanValue()) continue;
            return charSequence.subSequence(i2 + 1, charSequence.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final String int(String string, g g2) {
        for (int i2 = f.\u00d400000((CharSequence)string); i2 >= 0; --i2) {
            if (((Boolean)g2.\u00f800000(Character.valueOf(string.charAt(i2)))).booleanValue()) continue;
            int n2 = i2 + 1;
            return string.substring(n2);
        }
        return string;
    }

    public static final CharSequence ObjectObject(CharSequence charSequence, g g2) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (((Boolean)g2.\u00f800000(Character.valueOf(charSequence.charAt(i2)))).booleanValue()) continue;
            return charSequence.subSequence(0, i2);
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final String \u00d2O0000(String string, g g2) {
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (((Boolean)g2.\u00f800000(Character.valueOf(string.charAt(i2)))).booleanValue()) continue;
            return string.substring(0, i2);
        }
        return string;
    }

    public static final CharSequence \u00d4o0000(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }

    private static final String classnew(String string) {
        return ((Object)f.\u00d4o0000(string)).toString();
    }

    public static final Map O\u00d30000(CharSequence charSequence, g g2) {
        int n2 = bb.\u00d200000(y.\u00d200000(charSequence.length()), 16);
        Map map = new LinkedHashMap(n2);
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            Map map2 = map;
            qb qb2 = (qb)g2.\u00f800000(Character.valueOf(c2));
            map2.put(qb2.new(), qb2.o00000());
        }
        return map;
    }

    public static final Map \u00f6\u00d20000(CharSequence charSequence, g g2) {
        int n2 = bb.\u00d200000(y.\u00d200000(charSequence.length()), 16);
        Map map = new LinkedHashMap(n2);
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            map.put(g2.\u00f800000(Character.valueOf(c2)), Character.valueOf(c2));
        }
        return map;
    }

    public static final Map super(CharSequence charSequence, g g2, g g3) {
        int n2 = bb.\u00d200000(y.\u00d200000(charSequence.length()), 16);
        Map map = new LinkedHashMap(n2);
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            map.put(g2.\u00f800000(Character.valueOf(c2)), g3.\u00f800000(Character.valueOf(c2)));
        }
        return map;
    }

    public static final Map \u00d200000(CharSequence charSequence, Map map, g g2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            map.put(g2.\u00f800000(Character.valueOf(c2)), Character.valueOf(c2));
        }
        return map;
    }

    public static final Map super(CharSequence charSequence, Map map, g g2, g g3) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            map.put(g2.\u00f800000(Character.valueOf(c2)), g3.\u00f800000(Character.valueOf(c2)));
        }
        return map;
    }

    public static final Map \u00d300000(CharSequence charSequence, Map map, g g2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            Map map2 = map;
            qb qb2 = (qb)g2.\u00f800000(Character.valueOf(c2));
            map2.put(qb2.new(), qb2.o00000());
        }
        return map;
    }

    public static final Map Objectsuper(CharSequence charSequence, g g2) {
        Map map = new LinkedHashMap(bb.\u00d200000(y.\u00d200000(bb.Object(charSequence.length(), 128)), 16));
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            map.put(Character.valueOf(c2), g2.\u00f800000(Character.valueOf(c2)));
        }
        return map;
    }

    public static final Map \u00d400000(CharSequence charSequence, Map map, g g2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            map.put(Character.valueOf(c2), g2.\u00f800000(Character.valueOf(c2)));
        }
        return map;
    }

    public static final Collection super(CharSequence charSequence, Collection collection) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            collection.add(Character.valueOf(c2));
        }
        return collection;
    }

    public static final HashSet \u00d4\u00d20000(CharSequence charSequence) {
        return (HashSet)f.super(charSequence, new HashSet(y.\u00d200000(bb.Object(charSequence.length(), 128))));
    }

    public static final List \u00d2o0000(CharSequence charSequence) {
        switch (charSequence.length()) {
            case 0: {
                return mc.\u00d500000();
            }
            case 1: {
                return mc.o00000(Character.valueOf(charSequence.charAt(0)));
            }
        }
        return f.Oo0000(charSequence);
    }

    public static final List Oo0000(CharSequence charSequence) {
        return (List)f.super(charSequence, new ArrayList(charSequence.length()));
    }

    public static final Set \u00d3o0000(CharSequence charSequence) {
        switch (charSequence.length()) {
            case 0: {
                return ub.\u00d300000();
            }
            case 1: {
                return ub.super((Object)Character.valueOf(charSequence.charAt(0)));
            }
        }
        return (Set)f.super(charSequence, new LinkedHashSet(y.\u00d200000(bb.Object(charSequence.length(), 128))));
    }

    public static final List \u00f4\u00d30000(CharSequence charSequence, g g2) {
        Collection collection = new ArrayList();
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            Iterable iterable = (Iterable)g2.\u00f800000(Character.valueOf(c2));
            mc.new(collection, iterable);
        }
        return (List)collection;
    }

    private static final List \u00d600000(CharSequence charSequence, b.o.e.f f2) {
        Collection collection = new ArrayList();
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            mc.new(collection, (Iterable)f2.o00000(n2++, Character.valueOf(c2)));
        }
        return (List)collection;
    }

    private static final Collection super(CharSequence charSequence, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            Iterable iterable = (Iterable)f2.o00000(n2++, Character.valueOf(c2));
            mc.new(collection, iterable);
        }
        return collection;
    }

    public static final Collection \u00d300000(CharSequence charSequence, Collection collection, g g2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            Iterable iterable = (Iterable)g2.\u00f800000(Character.valueOf(c2));
            mc.new(collection, iterable);
        }
        return collection;
    }

    public static final Map \u00d6\u00d20000(CharSequence charSequence, g g2) {
        Map map = new LinkedHashMap();
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            Map map2 = map;
            char c2 = charSequence.charAt(i2);
            Object object = g2.\u00f800000(Character.valueOf(c2));
            Object object2 = map2.get(object);
            if (object2 == null) {
                object2 = new ArrayList();
                map2.put(object, object2);
            }
            ((List)object2).add(Character.valueOf(c2));
        }
        return map;
    }

    public static final Map \u00d200000(CharSequence charSequence, g g2, g g3) {
        Map map = new LinkedHashMap();
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            Map map2 = map;
            char c2 = charSequence.charAt(i2);
            Object object = g2.\u00f800000(Character.valueOf(c2));
            Object object2 = map2.get(object);
            if (object2 == null) {
                object2 = new ArrayList();
                map2.put(object, object2);
            }
            ((List)object2).add(g3.\u00f800000(Character.valueOf(c2)));
        }
        return map;
    }

    public static final Map super(CharSequence charSequence, Map map, g g2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            Map map2 = map;
            char c2 = charSequence.charAt(i2);
            Object object = g2.\u00f800000(Character.valueOf(c2));
            Object object2 = map2.get(object);
            if (object2 == null) {
                object2 = new ArrayList();
                map2.put(object, object2);
            }
            ((List)object2).add(Character.valueOf(c2));
        }
        return map;
    }

    public static final Map \u00d200000(CharSequence charSequence, Map map, g g2, g g3) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            Map map2 = map;
            char c2 = charSequence.charAt(i2);
            Object object = g2.\u00f800000(Character.valueOf(c2));
            Object object2 = map2.get(object);
            if (object2 == null) {
                object2 = new ArrayList();
                map2.put(object, object2);
            }
            ((List)object2).add(g3.\u00f800000(Character.valueOf(c2)));
        }
        return map;
    }

    public static final ab \u00d8O0000(CharSequence charSequence, g g2) {
        return new d$_c$1(charSequence, g2);
    }

    public static final List \u00d4o0000(CharSequence object, g g2) {
        CharSequence charSequence = object;
        object = new ArrayList(object.length());
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            object.add(g2.\u00f800000(Character.valueOf(c2)));
        }
        return (List)object;
    }

    public static final List \u00f400000(CharSequence object, b.o.e.f f2) {
        CharSequence charSequence = object;
        object = new ArrayList(object.length());
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            object.add(f2.o00000(n2++, Character.valueOf(c2)));
        }
        return (List)object;
    }

    public static final List class(CharSequence charSequence, b.o.e.f f2) {
        Collection collection = new ArrayList();
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            Object object;
            int n3;
            char c2 = charSequence.charAt(i2);
            if (f2.o00000(n3 = n2++, Character.valueOf(c2)) == null) continue;
            collection.add(object);
        }
        return (List)collection;
    }

    public static final Collection \u00d300000(CharSequence charSequence, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            Object object;
            int n3;
            char c2 = charSequence.charAt(i2);
            if (f2.o00000(n3 = n2++, Character.valueOf(c2)) == null) continue;
            collection.add(object);
        }
        return collection;
    }

    public static final Collection \u00d200000(CharSequence charSequence, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            collection.add(f2.o00000(n2++, Character.valueOf(c2)));
        }
        return collection;
    }

    public static final List \u00d3\u00d30000(CharSequence charSequence, g g2) {
        Collection collection = new ArrayList();
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            Object object;
            char c2 = charSequence.charAt(i2);
            if (g2.\u00f800000(Character.valueOf(c2)) == null) continue;
            collection.add(object);
        }
        return (List)collection;
    }

    public static final Collection super(CharSequence charSequence, Collection collection, g g2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            Object object;
            char c2 = charSequence.charAt(i2);
            if (g2.\u00f800000(Character.valueOf(c2)) == null) continue;
            collection.add(object);
        }
        return collection;
    }

    public static final Collection \u00d200000(CharSequence charSequence, Collection collection, g g2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            collection.add(g2.\u00f800000(Character.valueOf(c2)));
        }
        return collection;
    }

    public static final Iterable \u00d8O0000(CharSequence charSequence) {
        return new gc(() -> d.voidsuper(charSequence));
    }

    public static final boolean \u00d8\u00d20000(CharSequence charSequence, g g2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            if (((Boolean)g2.\u00f800000(Character.valueOf(c2))).booleanValue()) continue;
            return false;
        }
        return true;
    }

    public static final boolean \u00f4o0000(CharSequence charSequence) {
        return !(charSequence.length() == 0);
    }

    public static final boolean \u00d3o0000(CharSequence charSequence, g g2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            if (!((Boolean)g2.\u00f800000(Character.valueOf(c2))).booleanValue()) continue;
            return true;
        }
        return false;
    }

    private static final int \u00d8o0000(CharSequence charSequence) {
        return charSequence.length();
    }

    public static final int \u00d8\u00d30000(CharSequence charSequence, g g2) {
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            if (!((Boolean)g2.\u00f800000(Character.valueOf(c2))).booleanValue()) continue;
            ++n2;
        }
        return n2;
    }

    public static final Object \u00d200000(CharSequence charSequence, Object object, b.o.e.f f2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            object = f2.o00000(object, Character.valueOf(c2));
        }
        return object;
    }

    public static final Object super(CharSequence charSequence, Object object, b.o.e.e e2) {
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            object = e2.o00000(n2++, object, Character.valueOf(c2));
        }
        return object;
    }

    public static final Object super(CharSequence charSequence, Object object, b.o.e.f f2) {
        int n2 = f.\u00d400000(charSequence);
        while (n2 >= 0) {
            object = f2.o00000(Character.valueOf(charSequence.charAt(n2--)), object);
        }
        return object;
    }

    public static final Object \u00d300000(CharSequence charSequence, Object object, b.o.e.e e2) {
        for (int i2 = f.\u00d400000(charSequence); i2 >= 0; --i2) {
            object = e2.o00000(i2, Character.valueOf(charSequence.charAt(i2)), object);
        }
        return object;
    }

    public static final void \u00f4o0000(CharSequence charSequence, g g2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            g2.\u00f800000(Character.valueOf(c2));
        }
    }

    public static final void super(CharSequence charSequence, b.o.e.f f2) {
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            f2.o00000(n2++, Character.valueOf(c2));
        }
    }

    public static final char \u00f6O0000(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char c2 = charSequence.charAt(0);
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                char c3;
                if (fc.o00000((int)c2, c3 = charSequence.charAt(n2)) < 0) {
                    c2 = c3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return c2;
    }

    public static final char interfacenew(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char c2 = charSequence.charAt(0);
        int n2 = f.\u00d400000(charSequence);
        if (n2 == 0) {
            return c2;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(Character.valueOf(c2));
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                char c3;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(Character.valueOf(c3 = charSequence.charAt(n3)))) < 0) {
                    c2 = c3;
                    comparable = comparable2;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return c2;
    }

    public static final Character floatsuper(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            return null;
        }
        char c2 = charSequence.charAt(0);
        int n2 = f.\u00d400000(charSequence);
        if (n2 == 0) {
            return Character.valueOf(c2);
        }
        Comparable comparable = (Comparable)g2.\u00f800000(Character.valueOf(c2));
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                char c3;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(Character.valueOf(c3 = charSequence.charAt(n3)))) < 0) {
                    c2 = c3;
                    comparable = comparable2;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return Character.valueOf(c2);
    }

    private static final double O\u00d20000(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)g2.\u00f800000(Character.valueOf(charSequence.charAt(0)))).doubleValue();
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(Character.valueOf(charSequence.charAt(n2)))).doubleValue();
                d2 = Math.max(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final float \u00f8o0000(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)g2.\u00f800000(Character.valueOf(charSequence.charAt(0)))).floatValue();
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(Character.valueOf(charSequence.charAt(n2)))).floatValue();
                f2 = Math.max(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return f2;
    }

    private static final Comparable interface(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)g2.\u00f800000(Character.valueOf(charSequence.charAt(0)));
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(Character.valueOf(charSequence.charAt(n2)))) < 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Double publicsuper(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            return null;
        }
        double d2 = ((Number)g2.\u00f800000(Character.valueOf(charSequence.charAt(0)))).doubleValue();
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(Character.valueOf(charSequence.charAt(n2)))).doubleValue();
                d2 = Math.max(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final Float classnew(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            return null;
        }
        float f2 = ((Number)g2.\u00f800000(Character.valueOf(charSequence.charAt(0)))).floatValue();
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(Character.valueOf(charSequence.charAt(n2)))).floatValue();
                f2 = Math.max(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return Float.valueOf(f2);
    }

    private static final Comparable \u00f400000(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            return null;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(Character.valueOf(charSequence.charAt(0)));
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(Character.valueOf(charSequence.charAt(n2)))) < 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Object \u00d300000(CharSequence charSequence, Comparator comparator, g g2) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        Object object = g2.\u00f800000(Character.valueOf(charSequence.charAt(0)));
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(Character.valueOf(charSequence.charAt(n2)))) < 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    private static final Object \u00d400000(CharSequence charSequence, Comparator comparator, g g2) {
        if (charSequence.length() == 0) {
            return null;
        }
        Object object = g2.\u00f800000(Character.valueOf(charSequence.charAt(0)));
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(Character.valueOf(charSequence.charAt(n2)))) < 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    public static final Character \u00f8O0000(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        char c2 = charSequence.charAt(0);
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                char c3;
                if (fc.o00000((int)c2, c3 = charSequence.charAt(n2)) < 0) {
                    c2 = c3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return Character.valueOf(c2);
    }

    public static final char \u00d400000(CharSequence charSequence, Comparator comparator) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char c2 = charSequence.charAt(0);
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                char c3 = charSequence.charAt(n2);
                if (comparator.compare(Character.valueOf(c2), Character.valueOf(c3)) < 0) {
                    c2 = c3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return c2;
    }

    public static final Character class(CharSequence charSequence, Comparator comparator) {
        if (charSequence.length() == 0) {
            return null;
        }
        char c2 = charSequence.charAt(0);
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                char c3 = charSequence.charAt(n2);
                if (comparator.compare(Character.valueOf(c2), Character.valueOf(c3)) < 0) {
                    c2 = c3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return Character.valueOf(c2);
    }

    public static final char \u00f6o0000(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char c2 = charSequence.charAt(0);
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                char c3;
                if (fc.o00000((int)c2, c3 = charSequence.charAt(n2)) > 0) {
                    c2 = c3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return c2;
    }

    public static final char \u00f4O0000(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char c2 = charSequence.charAt(0);
        int n2 = f.\u00d400000(charSequence);
        if (n2 == 0) {
            return c2;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(Character.valueOf(c2));
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                char c3;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(Character.valueOf(c3 = charSequence.charAt(n3)))) > 0) {
                    c2 = c3;
                    comparable = comparable2;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return c2;
    }

    public static final Character \u00d3\u00d20000(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            return null;
        }
        char c2 = charSequence.charAt(0);
        int n2 = f.\u00d400000(charSequence);
        if (n2 == 0) {
            return Character.valueOf(c2);
        }
        Comparable comparable = (Comparable)g2.\u00f800000(Character.valueOf(c2));
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                char c3;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(Character.valueOf(c3 = charSequence.charAt(n3)))) > 0) {
                    c2 = c3;
                    comparable = comparable2;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return Character.valueOf(c2);
    }

    private static final double do(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)g2.\u00f800000(Character.valueOf(charSequence.charAt(0)))).doubleValue();
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(Character.valueOf(charSequence.charAt(n2)))).doubleValue();
                d2 = Math.min(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final float \u00f800000(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)g2.\u00f800000(Character.valueOf(charSequence.charAt(0)))).floatValue();
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(Character.valueOf(charSequence.charAt(n2)))).floatValue();
                f2 = Math.min(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return f2;
    }

    private static final Comparable O\u00d40000(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)g2.\u00f800000(Character.valueOf(charSequence.charAt(0)));
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(Character.valueOf(charSequence.charAt(n2)))) > 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Double \u00d3\u00d40000(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            return null;
        }
        double d2 = ((Number)g2.\u00f800000(Character.valueOf(charSequence.charAt(0)))).doubleValue();
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(Character.valueOf(charSequence.charAt(n2)))).doubleValue();
                d2 = Math.min(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final Float supernew(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            return null;
        }
        float f2 = ((Number)g2.\u00f800000(Character.valueOf(charSequence.charAt(0)))).floatValue();
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(Character.valueOf(charSequence.charAt(n2)))).floatValue();
                f2 = Math.min(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return Float.valueOf(f2);
    }

    private static final Comparable \u00f600000(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            return null;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(Character.valueOf(charSequence.charAt(0)));
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(Character.valueOf(charSequence.charAt(n2)))) > 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Object \u00d200000(CharSequence charSequence, Comparator comparator, g g2) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        Object object = g2.\u00f800000(Character.valueOf(charSequence.charAt(0)));
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(Character.valueOf(charSequence.charAt(n2)))) > 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    private static final Object super(CharSequence charSequence, Comparator comparator, g g2) {
        if (charSequence.length() == 0) {
            return null;
        }
        Object object = g2.\u00f800000(Character.valueOf(charSequence.charAt(0)));
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(Character.valueOf(charSequence.charAt(n2)))) > 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    public static final Character Objectsuper(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        char c2 = charSequence.charAt(0);
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                char c3;
                if (fc.o00000((int)c2, c3 = charSequence.charAt(n2)) > 0) {
                    c2 = c3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return Character.valueOf(c2);
    }

    public static final char \u00d600000(CharSequence charSequence, Comparator comparator) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char c2 = charSequence.charAt(0);
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                char c3 = charSequence.charAt(n2);
                if (comparator.compare(Character.valueOf(c2), Character.valueOf(c3)) > 0) {
                    c2 = c3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return c2;
    }

    public static final Character \u00d300000(CharSequence charSequence, Comparator comparator) {
        if (charSequence.length() == 0) {
            return null;
        }
        char c2 = charSequence.charAt(0);
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                char c3 = charSequence.charAt(n2);
                if (comparator.compare(Character.valueOf(c2), Character.valueOf(c3)) > 0) {
                    c2 = c3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return Character.valueOf(c2);
    }

    public static final boolean \u00f4\u00d20000(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    public static final boolean voidsuper(CharSequence charSequence, g g2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            if (!((Boolean)g2.\u00f800000(Character.valueOf(c2))).booleanValue()) continue;
            return false;
        }
        return true;
    }

    public static final CharSequence \u00f6o0000(CharSequence charSequence, g g2) {
        CharSequence charSequence2 = charSequence;
        for (int i2 = 0; i2 < charSequence2.length(); ++i2) {
            char c2 = charSequence2.charAt(i2);
            g2.\u00f800000(Character.valueOf(c2));
        }
        return charSequence;
    }

    public static final CharSequence \u00f800000(CharSequence charSequence, b.o.e.f f2) {
        CharSequence charSequence2 = charSequence;
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence2.length(); ++i2) {
            char c2 = charSequence2.charAt(i2);
            f2.o00000(n2++, Character.valueOf(c2));
        }
        return charSequence;
    }

    public static final char \u00d300000(CharSequence charSequence, b.o.e.f f2) {
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char c2 = charSequence.charAt(0);
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                c2 = ((Character)f2.o00000(Character.valueOf(c2), Character.valueOf(charSequence.charAt(n2)))).charValue();
                if (n2 == n3) break;
                ++n2;
            }
        }
        return c2;
    }

    public static final char class(CharSequence charSequence, b.o.e.e e2) {
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char c2 = charSequence.charAt(0);
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                c2 = ((Character)e2.o00000(n2, Character.valueOf(c2), Character.valueOf(charSequence.charAt(n2)))).charValue();
                if (n2 == n3) break;
                ++n2;
            }
        }
        return c2;
    }

    public static final Character \u00d200000(CharSequence charSequence, b.o.e.e e2) {
        if (charSequence.length() == 0) {
            return null;
        }
        char c2 = charSequence.charAt(0);
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                c2 = ((Character)e2.o00000(n2, Character.valueOf(c2), Character.valueOf(charSequence.charAt(n2)))).charValue();
                if (n2 == n3) break;
                ++n2;
            }
        }
        return Character.valueOf(c2);
    }

    public static final Character int(CharSequence charSequence, b.o.e.f f2) {
        if (charSequence.length() == 0) {
            return null;
        }
        char c2 = charSequence.charAt(0);
        int n2 = 1;
        int n3 = f.\u00d400000(charSequence);
        if (n3 > 0) {
            while (true) {
                c2 = ((Character)f2.o00000(Character.valueOf(c2), Character.valueOf(charSequence.charAt(n2)))).charValue();
                if (n2 == n3) break;
                ++n2;
            }
        }
        return Character.valueOf(c2);
    }

    public static final char \u00d400000(CharSequence charSequence, b.o.e.f f2) {
        int n2 = f.\u00d400000(charSequence);
        if (n2 < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char c2 = charSequence.charAt(n2--);
        while (n2 >= 0) {
            c2 = ((Character)f2.o00000(Character.valueOf(charSequence.charAt(n2--)), Character.valueOf(c2))).charValue();
        }
        return c2;
    }

    public static final char \u00d300000(CharSequence charSequence, b.o.e.e e2) {
        int n2 = f.\u00d400000(charSequence);
        if (n2 < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char c2 = charSequence.charAt(n2--);
        while (n2 >= 0) {
            c2 = ((Character)e2.o00000(n2, Character.valueOf(charSequence.charAt(n2)), Character.valueOf(c2))).charValue();
            --n2;
        }
        return c2;
    }

    public static final Character super(CharSequence charSequence, b.o.e.e e2) {
        int n2 = f.\u00d400000(charSequence);
        if (n2 < 0) {
            return null;
        }
        char c2 = charSequence.charAt(n2--);
        while (n2 >= 0) {
            c2 = ((Character)e2.o00000(n2, Character.valueOf(charSequence.charAt(n2)), Character.valueOf(c2))).charValue();
            --n2;
        }
        return Character.valueOf(c2);
    }

    public static final Character \u00f600000(CharSequence charSequence, b.o.e.f f2) {
        int n2 = f.\u00d400000(charSequence);
        if (n2 < 0) {
            return null;
        }
        char c2 = charSequence.charAt(n2--);
        while (n2 >= 0) {
            c2 = ((Character)f2.o00000(Character.valueOf(charSequence.charAt(n2--)), Character.valueOf(c2))).charValue();
        }
        return Character.valueOf(c2);
    }

    public static final List \u00d400000(CharSequence charSequence, Object object, b.o.e.f f2) {
        if (charSequence.length() == 0) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(charSequence.length() + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            object2 = f2.o00000(object2, Character.valueOf(c2));
            arrayList.add(object2);
        }
        return arrayList;
    }

    public static final List \u00d400000(CharSequence charSequence, Object object, b.o.e.e e2) {
        if (charSequence.length() == 0) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(charSequence.length() + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            object2 = e2.o00000(i2, object2, Character.valueOf(charSequence.charAt(i2)));
            arrayList.add(object2);
        }
        return arrayList;
    }

    public static final List OO0000(CharSequence charSequence, b.o.e.f f2) {
        if (charSequence.length() == 0) {
            return mc.\u00d500000();
        }
        char c2 = charSequence.charAt(0);
        ArrayList<Character> arrayList = new ArrayList<Character>(charSequence.length());
        arrayList.add(Character.valueOf(c2));
        ArrayList<Character> arrayList2 = arrayList;
        int n2 = charSequence.length();
        for (int i2 = 1; i2 < n2; ++i2) {
            c2 = ((Character)f2.o00000(Character.valueOf(c2), Character.valueOf(charSequence.charAt(i2)))).charValue();
            arrayList2.add(Character.valueOf(c2));
        }
        return arrayList2;
    }

    public static final List \u00d400000(CharSequence charSequence, b.o.e.e e2) {
        if (charSequence.length() == 0) {
            return mc.\u00d500000();
        }
        char c2 = charSequence.charAt(0);
        ArrayList<Character> arrayList = new ArrayList<Character>(charSequence.length());
        arrayList.add(Character.valueOf(c2));
        ArrayList<Character> arrayList2 = arrayList;
        int n2 = charSequence.length();
        for (int i2 = 1; i2 < n2; ++i2) {
            c2 = ((Character)e2.o00000(i2, Character.valueOf(c2), Character.valueOf(charSequence.charAt(i2)))).charValue();
            arrayList2.add(Character.valueOf(c2));
        }
        return arrayList2;
    }

    public static final List \u00d300000(CharSequence charSequence, Object object, b.o.e.f f2) {
        if (charSequence.length() == 0) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(charSequence.length() + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            object2 = f2.o00000(object2, Character.valueOf(c2));
            arrayList.add(object2);
        }
        return arrayList;
    }

    public static final List \u00d200000(CharSequence charSequence, Object object, b.o.e.e e2) {
        if (charSequence.length() == 0) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(charSequence.length() + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            object2 = e2.o00000(i2, object2, Character.valueOf(charSequence.charAt(i2)));
            arrayList.add(object2);
        }
        return arrayList;
    }

    public static final int \u00f6O0000(CharSequence charSequence, g g2) {
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            n2 += ((Number)g2.\u00f800000(Character.valueOf(c2))).intValue();
        }
        return n2;
    }

    public static final double \u00d6O0000(CharSequence charSequence, g g2) {
        double d2 = 0.0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            d2 += ((Number)g2.\u00f800000(Character.valueOf(c2))).doubleValue();
        }
        return d2;
    }

    private static final double \u00f8\u00d30000(CharSequence charSequence, g g2) {
        double d2 = 0.0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            d2 += ((Number)g2.\u00f800000(Character.valueOf(c2))).doubleValue();
        }
        return d2;
    }

    private static final int \u00d4\u00d30000(CharSequence charSequence, g g2) {
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            n2 += ((Number)g2.\u00f800000(Character.valueOf(c2))).intValue();
        }
        return n2;
    }

    private static final long \u00d3O0000(CharSequence charSequence, g g2) {
        long l2 = 0L;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            l2 += ((Number)g2.\u00f800000(Character.valueOf(c2))).longValue();
        }
        return l2;
    }

    private static final int \u00d2O0000(CharSequence charSequence, g g2) {
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            n2 = ac.\u00d500000(n2 + ((ac)g2.\u00f800000(Character.valueOf(c2))).o00000());
        }
        return n2;
    }

    private static final long \u00f8O0000(CharSequence charSequence, g g2) {
        long l2 = 0L;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            l2 = b.f.super(l2 + ((b.f)g2.\u00f800000(Character.valueOf(c2))).super());
        }
        return l2;
    }

    public static final List int(CharSequence charSequence, int n2) {
        int n3 = n2;
        return f.super(charSequence, n3, n3, true);
    }

    public static final List \u00d300000(CharSequence charSequence, int n2, g g2) {
        int n3 = n2;
        return f.super(charSequence, n3, n3, true, g2);
    }

    public static final n \u00f800000(CharSequence charSequence, int n2) {
        return f.super(charSequence, n2, d::\u00d6o0000);
    }

    public static final n super(CharSequence charSequence, int n2, g g2) {
        int n3 = n2;
        return f.\u00d200000(charSequence, n3, n3, true, g2);
    }

    public static final qb voidObject(CharSequence charSequence, g g2) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            if (((Boolean)g2.\u00f800000(Character.valueOf(c2))).booleanValue()) {
                stringBuilder.append(c2);
                continue;
            }
            stringBuilder2.append(c2);
        }
        return new qb(stringBuilder, stringBuilder2);
    }

    public static final qb \u00f800000(String string, g g2) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (((Boolean)g2.\u00f800000(Character.valueOf(c2))).booleanValue()) {
                stringBuilder.append(c2);
                continue;
            }
            stringBuilder2.append(c2);
        }
        return new qb(stringBuilder.toString(), stringBuilder2.toString());
    }

    public static final List super(CharSequence charSequence, int n2, int n3, boolean bl) {
        return f.super(charSequence, n2, n3, bl, d::\u00d6O0000);
    }

    public static /* synthetic */ List super(CharSequence charSequence, int n2, int n3, boolean bl, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n3 = 1;
        }
        if ((n4 & 4) != 0) {
            bl = false;
        }
        return f.super(charSequence, n2, n3, bl);
    }

    public static final List super(CharSequence charSequence, int n2, int n3, boolean bl, g g2) {
        e.super(n2, n3);
        int n4 = charSequence.length();
        int n5 = n4 / n3 + (n4 % n3 == 0 ? 0 : 1);
        ArrayList<Object> arrayList = new ArrayList<Object>(n5);
        int n6 = 0;
        while (true) {
            int n7;
            boolean bl2 = n6 >= 0 ? n6 < n4 : false;
            if (!bl2) break;
            int n8 = n6 + n2;
            if (n8 < 0 || n8 > n4) {
                if (!bl) break;
                n7 = n4;
            } else {
                n7 = n8;
            }
            n8 = n7;
            arrayList.add(g2.\u00f800000(charSequence.subSequence(n6, n8)));
            n6 += n3;
        }
        return arrayList;
    }

    public static /* synthetic */ List super(CharSequence charSequence, int n2, int n3, boolean bl, g g2, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n3 = 1;
        }
        if ((n4 & 4) != 0) {
            bl = false;
        }
        return f.super(charSequence, n2, n3, bl, g2);
    }

    public static final n \u00d200000(CharSequence charSequence, int n2, int n3, boolean bl) {
        return f.\u00d200000(charSequence, n2, n3, bl, d::O\u00d20000);
    }

    public static /* synthetic */ n \u00d200000(CharSequence charSequence, int n2, int n3, boolean bl, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n3 = 1;
        }
        if ((n4 & 4) != 0) {
            bl = false;
        }
        return f.\u00d200000(charSequence, n2, n3, bl);
    }

    public static final n \u00d200000(CharSequence charSequence, int n2, int n3, boolean bl, g g2) {
        e.super(n2, n3);
        return c.\u00f5\u00d30000(mc.\u00d5o0000(bb.o00000((x)(bl ? f.int(charSequence) : bb.\u00d400000(0, charSequence.length() - n2 + 1)), n3)), arg_0 -> d.super(n2, charSequence, g2, arg_0));
    }

    public static /* synthetic */ n \u00d200000(CharSequence charSequence, int n2, int n3, boolean bl, g g2, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n3 = 1;
        }
        if ((n4 & 4) != 0) {
            bl = false;
        }
        return f.\u00d200000(charSequence, n2, n3, bl, g2);
    }

    public static final List \u00d800000(CharSequence charSequence, CharSequence charSequence2) {
        int n2 = Math.min(charSequence.length(), charSequence2.length());
        ArrayList<qb> arrayList = new ArrayList<qb>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = charSequence2.charAt(i2);
            char c3 = charSequence.charAt(i2);
            ArrayList<qb> arrayList2 = arrayList;
            arrayList2.add(yc.o00000(Character.valueOf(c3), Character.valueOf(c2)));
        }
        return arrayList;
    }

    public static final List super(CharSequence charSequence, CharSequence charSequence2, b.o.e.f f2) {
        int n2 = Math.min(charSequence.length(), charSequence2.length());
        ArrayList<Object> arrayList = new ArrayList<Object>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(f2.o00000(Character.valueOf(charSequence.charAt(i2)), Character.valueOf(charSequence2.charAt(i2))));
        }
        return arrayList;
    }

    public static final List publicsuper(CharSequence charSequence) {
        int n2 = charSequence.length() - 1;
        if (n2 <= 0) {
            return mc.\u00d500000();
        }
        ArrayList<qb> arrayList = new ArrayList<qb>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = charSequence.charAt(i2 + 1);
            char c3 = charSequence.charAt(i2);
            ArrayList<qb> arrayList2 = arrayList;
            arrayList2.add(yc.o00000(Character.valueOf(c3), Character.valueOf(c2)));
        }
        return arrayList;
    }

    public static final List \u00d800000(CharSequence charSequence, b.o.e.f f2) {
        int n2 = charSequence.length() - 1;
        if (n2 <= 0) {
            return mc.\u00d500000();
        }
        ArrayList<Object> arrayList = new ArrayList<Object>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(f2.o00000(Character.valueOf(charSequence.charAt(i2)), Character.valueOf(charSequence.charAt(i2 + 1))));
        }
        return arrayList;
    }

    public static final Iterable classnew(CharSequence charSequence) {
        if (charSequence instanceof String && charSequence.length() == 0) {
            return mc.\u00d500000();
        }
        return new d$_d$_b$_b$1(charSequence);
    }

    public static final n floatsuper(CharSequence charSequence) {
        if (charSequence instanceof String && charSequence.length() == 0) {
            return c.\u00d200000();
        }
        return new d$_b$_b$_b$1(charSequence);
    }

    private static final Iterator voidsuper(CharSequence charSequence) {
        return f.class(charSequence);
    }

    private static final String \u00d6o0000(CharSequence charSequence) {
        return ((Object)charSequence).toString();
    }

    private static final String \u00d6O0000(CharSequence charSequence) {
        return ((Object)charSequence).toString();
    }

    private static final String O\u00d20000(CharSequence charSequence) {
        return ((Object)charSequence).toString();
    }

    private static final Object super(int n2, CharSequence charSequence, g g2, int n3) {
        n2 = (n2 = n3 + n2) < 0 || n2 > charSequence.length() ? charSequence.length() : n2;
        return g2.\u00f800000(charSequence.subSequence(n3, n2));
    }
}

