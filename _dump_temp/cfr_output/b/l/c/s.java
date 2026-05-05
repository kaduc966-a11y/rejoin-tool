/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.g.c;
import b.g.l;
import b.g.n;
import b.i;
import b.l.c.b;
import b.l.c.g;
import b.l.c.k;
import b.l.c.q;
import b.l.c.r;
import b.l.c.s$_b$1;
import b.l.c.s$_c$1;
import b.l.c.v;
import b.o.d.tc;
import b.s.z;
import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class s
implements n {
    private final Path O\u00d30000;
    private final v[] \u00f8\u00d20000;

    public s(Path path, v[] vArray) {
        this.O\u00d30000 = path;
        this.\u00f8\u00d20000 = vArray;
    }

    private final boolean String() {
        return z.\u00d300000((Object[])this.\u00f8\u00d20000, (Object)v.\u00d300000);
    }

    private final LinkOption[] \u00d600000() {
        return g.\u00d400000.\u00d200000(this.String());
    }

    private final boolean \u00d500000() {
        return z.\u00d300000((Object[])this.\u00f8\u00d20000, (Object)v.\u00d500000);
    }

    private final boolean \u00d800000() {
        return z.\u00d300000((Object[])this.\u00f8\u00d20000, (Object)v.\u00d400000);
    }

    @Override
    public final Iterator o00000() {
        if (this.\u00d800000()) {
            return this.\u00d300000();
        }
        return this.null();
    }

    private final Object o00000(l l2, k k2, q q2, b.o.e.g g2, b.r.b b2) {
        Path path = k2.String();
        if (k2.\u00d300000() != null) {
            r.new(path);
        }
        Path path2 = path;
        LinkOption[] linkOptionArray = this.\u00d600000();
        LinkOption[] linkOptionArray2 = Arrays.copyOf(linkOptionArray, linkOptionArray.length);
        if (Files.isDirectory(path2, Arrays.copyOf(linkOptionArray2, linkOptionArray2.length))) {
            if (b.new(k2)) {
                throw new FileSystemLoopException(((Object)path).toString());
            }
            if (this.\u00d500000()) {
                tc.\u00d200000(0);
                l2.o00000((Object)path, b2);
                tc.\u00d200000(1);
            }
            path2 = path;
            LinkOption[] linkOptionArray3 = this.\u00d600000();
            linkOptionArray2 = Arrays.copyOf(linkOptionArray3, linkOptionArray3.length);
            if (Files.isDirectory(path2, Arrays.copyOf(linkOptionArray2, linkOptionArray2.length))) {
                g2.\u00f800000(q2.o00000(k2));
            }
        } else {
            path2 = path;
            LinkOption[] linkOptionArray4 = new LinkOption[1];
            linkOptionArray2 = linkOptionArray4;
            linkOptionArray4[0] = LinkOption.NOFOLLOW_LINKS;
            if (Files.exists(path2, Arrays.copyOf(linkOptionArray2, linkOptionArray2.length))) {
                tc.\u00d200000(0);
                l2.o00000((Object)path, b2);
                tc.\u00d200000(1);
                return i.o00000;
            }
        }
        return i.o00000;
    }

    private final Iterator null() {
        return c.\u00d200000(new s$_b$1(this, null));
    }

    private final Iterator \u00d300000() {
        return c.\u00d200000(new s$_c$1(this, null));
    }

    public static final /* synthetic */ boolean \u00d200000(s s2) {
        return s2.String();
    }

    public static final /* synthetic */ Path String(s s2) {
        return s2.O\u00d30000;
    }
}

