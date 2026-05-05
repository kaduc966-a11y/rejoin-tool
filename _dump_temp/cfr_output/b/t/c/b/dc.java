/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.r;
import b.q.f;
import b.t.c.b.kb;
import b.t.c.b.lb;
import b.t.c.b.wc;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class dc {
    public static final wc o00000(kb object) {
        Member member = ((kb)object).\u00d3\u00f60000().privatedo().Object();
        if (member instanceof Method) {
            if (!Modifier.isStatic(((Method)member).getModifiers())) {
                object = "Only static methods are supported for now: ".concat(String.valueOf(member));
                throw new IllegalArgumentException(object.toString());
            }
            return new wc(member, object.o\u00f60000());
        }
        if (member instanceof Constructor) {
            int n2 = r.o00000(((Constructor)member).getDeclaringClass()).newfor() && dc.o00000() ? -1 : (((Constructor)member).getDeclaringClass().isEnum() ? ((Object[])((Constructor)member).getParameterAnnotations()).length - ((Constructor)member).getParameterTypes().length + 2 : 0);
            return new wc(member, object.o\u00f60000() + n2);
        }
        throw new lb("Unsupported parameter owner: ".concat(String.valueOf(member)));
    }

    private static final boolean o00000() {
        String string = System.getProperty("java.version");
        if (string != null) {
            return f.\u00d300000(string, "1.", false, 2, null);
        }
        return false;
    }
}

