/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.o.d.fc;
import b.q.f;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class o {
    public static final o new = new o();
    private static final Path \u00d300000 = Paths.get("", new String[0]);
    private static final Path o00000 = Paths.get("..", new String[0]);

    private o() {
    }

    public final Path o00000(Path path, Path path2) {
        path2 = path2.normalize();
        path = path.normalize();
        Path path3 = path2.relativize(path);
        int n2 = Math.min(path2.getNameCount(), path.getNameCount());
        for (int i2 = 0; i2 < n2 && fc.o00000((Object)path2.getName(i2), (Object)o00000); ++i2) {
            if (fc.o00000((Object)path.getName(i2), (Object)o00000)) continue;
            throw new IllegalArgumentException("Unable to compute relative path");
        }
        if (!fc.o00000((Object)path, (Object)path2) && fc.o00000((Object)path2, (Object)\u00d300000)) {
            return path;
        }
        String string = ((Object)path3).toString();
        if (f.\u00d400000(string, path3.getFileSystem().getSeparator(), false, 2, null)) {
            return path3.getFileSystem().getPath(f.\u00d4O0000(string, path3.getFileSystem().getSeparator().length()), new String[0]);
        }
        return path3;
    }
}

