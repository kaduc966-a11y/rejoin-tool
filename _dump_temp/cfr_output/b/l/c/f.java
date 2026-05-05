/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.l.c.g;
import b.l.c.j;
import b.l.c.m;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class f
implements j {
    public static final f super = new f();

    private f() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final m o00000(Path path, Path path2, boolean bl) {
        LinkOption[] linkOptionArray = g.\u00d400000.\u00d200000(bl);
        LinkOption[] linkOptionArray2 = Arrays.copyOf(linkOptionArray, linkOptionArray.length);
        if (Files.isDirectory(path, Arrays.copyOf(linkOptionArray2, linkOptionArray2.length))) {
            Path path3 = path2;
            LinkOption[] linkOptionArray3 = new LinkOption[1];
            LinkOption[] linkOptionArray4 = linkOptionArray3;
            linkOptionArray3[0] = LinkOption.NOFOLLOW_LINKS;
            if (Files.isDirectory(path3, Arrays.copyOf(linkOptionArray4, linkOptionArray4.length))) {
                return m.\u00d500000;
            }
        }
        CopyOption[] copyOptionArray = Arrays.copyOf(linkOptionArray, linkOptionArray.length);
        Files.copy(path, path2, Arrays.copyOf(copyOptionArray, copyOptionArray.length));
        return m.\u00d500000;
    }
}

