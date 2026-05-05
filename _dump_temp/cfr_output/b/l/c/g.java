/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.s.ub;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;

public final class g {
    public static final g \u00d400000 = new g();
    private static final LinkOption[] \u00d200000;
    private static final LinkOption[] o00000;
    private static final Set Object;
    private static final Set \u00d500000;

    private g() {
    }

    public final LinkOption[] \u00d200000(boolean bl) {
        if (bl) {
            return o00000;
        }
        return \u00d200000;
    }

    public final Set o00000(boolean bl) {
        if (bl) {
            return \u00d500000;
        }
        return Object;
    }

    static {
        LinkOption[] linkOptionArray = new LinkOption[1];
        LinkOption[] linkOptionArray2 = linkOptionArray;
        linkOptionArray[0] = LinkOption.NOFOLLOW_LINKS;
        \u00d200000 = linkOptionArray2;
        o00000 = new LinkOption[0];
        Object = ub.\u00d300000();
        \u00d500000 = ub.super((Object)FileVisitOption.FOLLOW_LINKS);
    }
}

