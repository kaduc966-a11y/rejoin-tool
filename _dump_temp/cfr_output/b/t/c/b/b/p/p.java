/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

final class p {
    public static boolean o00000(byte[] byArray) {
        return p.\u00d400000(byArray, 0, byArray.length);
    }

    public static boolean \u00d400000(byte[] byArray, int n2, int n3) {
        return p.Object(byArray, n2, n3) == 0;
    }

    public static int o00000(int n2, byte[] byArray, int n3, int n4) {
        if (n2 != 0) {
            if (n3 >= n4) {
                return n2;
            }
            byte by = (byte)n2;
            if (by < -32) {
                if (by < -62 || byArray[n3++] > -65) {
                    return -1;
                }
            } else if (by < -16) {
                byte by2 = (byte)(~(n2 >> 8));
                if (by2 == 0) {
                    by2 = byArray[n3++];
                    if (n3 >= n4) {
                        return p.o00000(by, by2);
                    }
                }
                if (by2 > -65 || by == -32 && by2 < -96 || by == -19 && by2 >= -96 || byArray[n3++] > -65) {
                    return -1;
                }
            } else {
                byte by3 = (byte)(~(n2 >> 8));
                byte by4 = 0;
                if (by3 == 0) {
                    by3 = byArray[n3++];
                    if (n3 >= n4) {
                        return p.o00000(by, by3);
                    }
                } else {
                    by4 = (byte)(n2 >> 16);
                }
                if (by4 == 0) {
                    by4 = byArray[n3++];
                    if (n3 >= n4) {
                        return p.o00000(by, (int)by3, (int)by4);
                    }
                }
                if (by3 > -65 || (by << 28) + (by3 - -112) >> 30 != 0 || by4 > -65 || byArray[n3++] > -65) {
                    return -1;
                }
            }
        }
        return p.Object(byArray, n3, n4);
    }

    public static int Object(byte[] byArray, int n2, int n3) {
        while (n2 < n3 && byArray[n2] >= 0) {
            ++n2;
        }
        if (n2 >= n3) {
            return 0;
        }
        return p.\u00d200000(byArray, n2, n3);
    }

    private static int \u00d200000(byte[] byArray, int n2, int n3) {
        while (true) {
            byte by;
            byte by2;
            if (n2 >= n3) {
                return 0;
            }
            if ((by2 = byArray[n2++]) >= 0) continue;
            if (by2 < -32) {
                if (n2 >= n3) {
                    return by2;
                }
                if (by2 >= -62 && byArray[n2++] <= -65) continue;
                return -1;
            }
            if (by2 < -16) {
                if (n2 >= n3 - 1) {
                    return p.o00000(byArray, n2, n3);
                }
                if (!((by = byArray[n2++]) > -65 || by2 == -32 && by < -96 || by2 == -19 && by >= -96) && byArray[n2++] <= -65) continue;
                return -1;
            }
            if (n2 >= n3 - 2) {
                return p.o00000(byArray, n2, n3);
            }
            if ((by = byArray[n2++]) > -65 || (by2 << 28) + (by - -112) >> 30 != 0 || byArray[n2++] > -65 || byArray[n2++] > -65) break;
        }
        return -1;
    }

    private static int o00000(int n2) {
        if (n2 > -12) {
            return -1;
        }
        return n2;
    }

    private static int o00000(int n2, int n3) {
        if (n2 > -12 || n3 > -65) {
            return -1;
        }
        return n2 ^ n3 << 8;
    }

    private static int o00000(int n2, int n3, int n4) {
        if (n2 > -12 || n3 > -65 || n4 > -65) {
            return -1;
        }
        return n2 ^ n3 << 8 ^ n4 << 16;
    }

    private static int o00000(byte[] byArray, int n2, int n3) {
        byte by = byArray[n2 - 1];
        switch (n3 - n2) {
            case 0: {
                return p.o00000(by);
            }
            case 1: {
                return p.o00000(by, byArray[n2]);
            }
            case 2: {
                return p.o00000(by, (int)byArray[n2], (int)byArray[n2 + 1]);
            }
        }
        throw new AssertionError();
    }
}

