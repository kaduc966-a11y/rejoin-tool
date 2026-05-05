/*
 * Decompiled with CFR 0.152.
 */
import b.dc;
import b.e.bb;
import b.l.o;
import b.l.s;
import b.o.d.fc;
import b.q.fb;
import b.q.kb;
import b.q.t;
import b.qb;
import b.r;
import b.s.mc;
import b.s.ub;
import b.s.y;
import b.s.z;
import b.yc;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.lang.invoke.LambdaMetafactory;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class MainKt {
    private static final dc OO0000 = r.o00000(MainKt::o00000);
    private static final String OO0000 = "\u001b[0m";
    private static final String \u00f800000 = "\u001b[31m";
    private static final String if = "\u001b[32m";
    private static final String \u00f500000 = "\u001b[33m";
    private static final String \u00f400000 = "\u001b[34m";
    private static final String \u00d800000 = "\u001b[35m";
    private static final String return = "\u001b[36m";
    private static final String \u00d500000 = "\u001b[37m";
    private static final String \u00d400000 = "\u001b[1m";
    private static final String \u00d300000 = "\u001b[2m";
    private static final File OO0000 = new File(MainKt.o00000(0));
    private static final List OO0000;
    private static String new;
    private static final AtomicInteger OO0000;
    private static final String o00000;
    private static final AtomicInteger \u00f800000;

    private static final String o00000(int n2) {
        return ((String[])OO0000.\u00d200000())[n2];
    }

    private static final String[] new() {
        String[] stringArray = new String[808];
        String[] stringArray2 = stringArray;
        stringArray[0] = "VkBMUVdAVUpXVQtCTENLSkYIS0xKT0BX";
        stringArray2[1] = "UV1RC1FQVVFQSg==";
        stringArray2[2] = "UV1RC1ZHRFE=";
        stringArray2[3] = "UV1RC1ZHRFEIRFFJQEE=";
        stringArray2[4] = "FkBRTElUVgpLTEcKSEBRVlxWCg==";
        stringArray2[5] = "FkBRTElUVgpLTEddCkhAUVZcVgo=";
        stringArray2[6] = "FkBRTElUVgpLTEcKV1ZQClZASUxDCl1QSFdAUQtISkYKRFFEQQpEUURBCg==";
        stringArray2[7] = "FkBRTElUVgpLTEcKV1ZQCg==";
        stringArray2[8] = "FkBRTElUVgpLTEcKV0pBS0BTCg==";
        stringArray2[9] = "FkBRTElUVgVNRkxNUg==";
        stringArray2[10] = "FkBRTElUVg==";
        stringArray2[11] = "FAVLCAVJTERRBVkFSUlQSwpTQEEKGxcFUV1RC1ZQUURRVnpdSklHSlcKQEZEVVZOV0pyCkRRSUBhCkFXREZBVgoFUURG";
        stringArray2[12] = "SUlQSwpTQEEKGxcFUV1RC1ZQUURRVnpdSklHSlcKQEZEVVZOV0pyCkRRSUBhCkFXREZBVgoFQwgFSFc=";
        stringArray2[13] = "AgcCBwI=";
        stringArray2[14] = "VhUWBVdAUUNEBVFQSkBITHE=";
        stringArray2[15] = "V0pXV0AFS1JKS05LcA==";
        stringArray2[16] = "QEhKbQUfXEFEQHdVVWRLSg==";
        stringArray2[17] = "YWBhZGppemBiZHV6YGhqbXpkcGk=";
        stringArray2[18] = "QktMUVdEUXZASERiS0o=";
        stringArray2[19] = "QUBRV0RRdkBIRGJLSg==";
        stringArray2[20] = "DFxRVUhADQ==";
        stringArray2[21] = "XRcVAA==";
        stringArray2[22] = "CwsLRlBRBVVATFEFQEEFV0BRS2AFS0RNaw==";
        stringArray2[23] = "VkBdTENAV1V6QEJETkZEVQ==";
        stringArray2[24] = "RFFJQEEJXUpJR0pX";
        stringArray2[25] = "VkFLSkZAVnpcRElAQQ==";
        stringArray2[26] = "QUpNUUBIelZQUURRVg==";
        stringArray2[27] = "QUBLTEdISkY=";
        stringArray2[28] = "QEJETkZEVXpAQktETUZ6SlFQRA==";
        stringArray2[29] = "TkZKSUd6SlFQRA==";
        stringArray2[30] = "VUpRVnpARldKQw==";
        stringArray2[31] = "QUpNUUBIektMSk8=";
        stringArray2[32] = "QEJETkZEVXpOS0xJVUBAQQ==";
        stringArray2[33] = "SUlMTnpcV1FAV3pdREg=";
        stringArray2[34] = "VkFLSkZAVnpRTERSektKTFZWQFZ6QEhEQg==";
        stringArray2[35] = "QUBRRFdAS0BCBUpRUEQFCAVCTENLSkYFSUpKUQVLTEpPQFc=";
        stringArray2[36] = "ekJDRnpLTEpPQFc=";
        stringArray2[37] = "VUhRCw==";
        stringArray2[38] = "QkxDS0pGBUlKSlEFS0xKT0BX";
        stringArray2[39] = "VkBCRE5GRFV6QUBRRkBJQFY=";
        stringArray2[40] = "fWppZ2p3";
        stringArray2[41] = "VkBCRE5GRFUFUVZMSQVIVQ==";
        stringArray2[42] = "H0BCRE5GRFU=";
        stringArray2[43] = "FggFVkBCRE5GRFUFUVZMSQVIVQ==";
        stringArray2[44] = "UUtATElGC11KSUdKVwtISkY=";
        stringArray2[45] = "SUlQSwpTQEEKGxcFSUhdC1VIUEF6VlBRRFFWel1KSUdKVwpBV0RGQVYKBVFERg==";
        stringArray2[46] = "HgwVBRsFDEBQSURTekFAUVVcV0ZLQA1tcWJrYGkFd2oFFQUbBQxAUElEUw1tcWJrYGkNBWFrZAUCfHFsd3BmYHZqaWdqdwsCGEBIREsFYWtkBQIASEpGC11KSUdKVwACBWBubGkFXEBOelFWSk0FYHdgbXIFVkBMTkpKRgVoandjBQwPDXFrcGpmBXFmYGlgdg==";
        stringArray2[47] = "fHFsd3BmYHZqaWdqdw==";
        stringArray2[48] = "HgwCfHFsd3BmYHZqaWdqdwsCBQkCYWx9Z3cLAgUJAkRRRGFRVkBQYgIFCQIXc1dATkZEV3FRS0BTYH1ndwINBWtsBUBIREsFYHdgbXIFVkBMTkpKRgVoandjBUBQSURTBXFmYGlgdg==";
        stringArray2[49] = "HgJ8cWx3cGZgdmppZ2p3CwIYQEhESwVgd2BtcgVWQExOSkpGBWhqd2MFQFBJRFMFcWZgaWB2";
        stringArray2[50] = "dmxtcQhgd2RtdghxamsIamEIH2JrbGt3ZHI=";
        stringArray2[51] = "QUtQSkMFUUpL";
        stringArray2[52] = "YWBpaWRxdmtsenFqaw==";
        stringArray2[53] = "TVZEV0Z6SEQ=";
        stringArray2[54] = "S0pMUVVARl1ABUlEUURD";
        stringArray2[55] = "QUBMQQVWRE0=";
        stringArray2[56] = "QktMTVZMS0xDBUBGV0pD";
        stringArray2[57] = "UVBNVhoLV0BTV0BWWUFASUxEQwVRV0pVQElAcVlRVkpJBUtKTFFGQEtLSmZZQUBNRktQREkFUUtQSkZGRAVASERWWUtKTFFERkxDTFFKawVLSkxRRkBLS0pGVkxhWUtKVkRAVwVNUUxSBVFGQEtLSkZWTEEFQktMQUtAdllLSlZEQFcFTVFMUgVLSkxRRkBLS0pGBVFWSmlZQUBORkxOBUtAQEcFQFNETQVQSnw=";
        stringArray2[58] = "FAgFQURATQVZBUlJUEsKU0BBChsXBQpWQE1WRFdmCkRRSUBhCkFXREZBVgoFUQgFVkk=";
        stringArray2[59] = "QFZJREMFH0tEdwVWUVVMV0Z2";
        stringArray2[60] = "S1JKS05LUA==";
        stringArray2[61] = "QktMQURKSQ==";
        stringArray2[62] = "QEhEQktM";
        stringArray2[63] = "QUBORkxO";
        stringArray2[64] = "QktMS0xKT0BX";
        stringArray2[65] = "H0BTTElE";
        stringArray2[66] = "QWxARkRJVQ==";
        stringArray2[67] = "Ymtsa2xqb2B3emRwaQ==";
        stringArray2[68] = "YWBxZmBra2pmdmxhendqemFgbmZsbg==";
        stringArray2[69] = "fGlxa2BmYHd6YWBtdmR3Zg==";
        stringArray2[70] = "YWBxbH1gendqemJrbGtrcHd6cWpr";
        stringArray2[71] = "YGhkYnpia2xhZGpp";
        stringArray2[72] = "YWtwandiYHdqYw==";
        stringArray2[73] = "YGhkYnpqa3pha3Bqd2Jgd2pj";
        stringArray2[74] = "YWtwandibmZkZ3pia2xra3B3";
        stringArray2[75] = "GBgY";
        stringArray2[76] = "YWx1";
        stringArray2[77] = "cmpha2xy";
        stringArray2[78] = "fHFsc2xxZmQ=";
        stringArray2[79] = "dnBxZHF2emRwaQ==";
        stringArray2[80] = "bXZkd2Z6ZHFpYGE=";
        stringArray2[81] = "YWx3YHZw";
        stringArray2[82] = "YWx1enFkZmJqaQ==";
        stringArray2[83] = "YWRgYXpxZGZiamk=";
        stringArray2[84] = "S0pMUUZAS0tKRgVRVkpp";
        stringArray2[85] = "UUZAS0tKRlZMQQ==";
        stringArray2[86] = "UUtQSkZGRAVASERW";
        stringArray2[87] = "UVZKSQVLSkxRRkBLS0pm";
        stringArray2[88] = "QUBJTERDBVFXSlVASUBx";
        stringArray2[89] = "QUBBREppQEhEYktK";
        stringArray2[90] = "QUBRREBXRgVXSlFERkxJVUB3";
        stringArray2[91] = "S0pMVlZAdkBGS0BMV0BVXWA=";
        stringArray2[92] = "V0BNRktQRGlARkRJdQ==";
        stringArray2[93] = "V0BXUEJMQ0tKZk1GUUR1SUBBSmhEUURh";
        stringArray2[94] = "SURNVldEaEtKTFFGS1Bj";
        stringArray2[95] = "QUx6QEZESVU=";
        stringArray2[96] = "QElMQ3pWR0RR";
        stringArray2[97] = "DFZAQkRORkRVekFAUUZASUBWBUhKV0MFQUBRRFdAS0BCCEpRUEQNBUFsQEZESVVZQEJETkZEVVlJQEdESQUG";
        stringArray2[98] = "QWxARkRJVVlAQkRORkRVWUlAR0RJBQY=";
        stringArray2[99] = "C0dEUQpVVUQFUUpIBURJBUJLSkEFTEpIBQlLREYFUEBLBUFsQEZESVUFRFB2BQY=";
        stringArray2[100] = "C0JMQ0tKRgpRXVELVkdEUQpRXVELUVBVUVBKBUJLSldRBUpESwVHRFEFSkYFQktKTW4=";
        stringArray2[101] = "GBgYBVZHRHEFTkZATWYFGBgY";
        stringArray2[102] = "UVBKQkpJChZTCkhKRgtdSklHSlcLTVFQRAoKH1ZVUVFN";
        stringArray2[103] = "cXZqdQ==";
        stringArray2[104] = "TVFCS0BpCFFLQFFLSmY=";
        stringArray2[105] = "S0BOSlEIQ1dWRghd";
        stringArray2[106] = "UUBORkxRCEtKTFFERkxRS0BNUVBEChRTCkhKRgtdSklHSlcLTVFQRAoKH1ZVUVFN";
        stringArray2[107] = "a2BuanEIY3d2Zgh9";
        stringArray2[108] = "S0pMUURMUUpCQGtLSkxRREZMUUtATVFQZH1ndw==";
        stringArray2[109] = "QFVccQhRS0BRS0pm";
        stringArray2[110] = "S0pWTwpLSkxRREZMSVVVRA==";
        stringArray2[111] = "UUBORkxRCEtKTFFERkxRS0BNUVBECF1HVw==";
        stringArray2[112] = "B3k=";
        stringArray2[113] = "L3k=";
        stringArray2[114] = "VldAVlAKQEZLQFZAV1UKFFMKSEpGC11KSUdKVwtARktAVkBXVQoKH1ZVUVFN";
        stringArray2[115] = "cWBi";
        stringArray2[116] = "RFBJC1VIUXpRRkBRQEF6TkZMTgsKQVdERkFWCg==";
        stringArray2[117] = "DA54HAgVfwhkXwhEfg0YQEFKRngDGn4=";
        stringArray2[118] = "QEFKRnpXQFNXQFZ6VUxT";
        stringArray2[119] = "CwsLTktMSVVAQEEFVkBGS0BMV0BVXWAFeBRofgUbCA==";
        stringArray2[120] = "UUBORkxRek1RUEQ=";
        stringArray2[121] = "UV1RC0BMTkpKRgpXQEFJSkNATE5KSkY=";
        stringArray2[122] = "CwsLTktMSVVAQEEFUUBORkxxBU1RUGQFeBdofgUbCA==";
        stringArray2[123] = "CwsLTktMSVVAQEEFXEZEQkBpBXgWaH4FGwg=";
        stringArray2[124] = "CwsLTUZLUERJBVxRTFNMUUZkBVFGQFdMYQV4EWh+BRsI";
        stringArray2[125] = "FREFSwgFSUxEUQVZBQJRUEpASExRWUtKTFFVQEZdQFlJRFFEQ1lJQkBZSUJLQFVKWUtETklQU1lXQEFLQFdZTkZESUdZQEZEQ1dQVlldSklHSlcCBWBMCAVVQFdCBVkFFRcUBVEIBUEIBVFERkJKSQ==";
        stringArray2[126] = "H1FLTE0FQkpJCldAQUtAVwVRS0BGQHc=";
        stringArray2[127] = "H0JLTFFXRFF2";
        stringArray2[128] = "HkBIREsFCVxATnpRVkpNBXxnBXdgYXdqBVZATE5KSkYFaGp3YwUMAgIJQFBJRFMNYGZ2YGlkamYFCQwCFQIJDHF9YHEFdmQFDEBQSURTekFAUVVcV0ZLQA1tcWJrYGkNcXZkZg1gZnZgaWRqZgUJDAIVAgkMcX1gcQV2ZAUMQFBJRFMNbXFia2BpDXF2ZGYNYGZ2YGlkamYFCQwCAgkMcX1gcQV2ZAVGUVB6VkBXTFVdQA1xdmRmDWBmdmBpZGpmBQkMAgIJTVFEVQ1gZnZgaWRqZgUJDAICCUBIREsNYGZ2YGlkamYFCQwCAglcQE56UVZKTQ1gZnZgaWRqZgVxZmBpYHY=";
        stringArray2[129] = "GBgYBURRREFEUUBoBUBMTkpKZgVRV0pVXWAFGBgY";
        stringArray2[130] = "YWBxa2x3dQVxamsFH0BQSURTBUBMTkpKRgVSRHc=";
        stringArray2[131] = "QUBRRkRBQHcFQExOSkpmBVFXSlVdYAUG";
        stringArray2[132] = "RWFgcWtsd3UFcWprRQUfQFBJRFMFQExOSkpGBVJEdwUI";
        stringArray2[133] = "WQVRS0xXVVdAQktMQwUTEBcIZG12BVkFQUBRVVxXRktgBVkFQFBJRHMFWQVWQFdMVV1gBVkFTVFEdQVZBUBIRGsFWQVRVkptBVk=";
        stringArray2[134] = "WR8ICAhZHwgICFkfCAgIWR8ICAhZCAgIWQgICFkICAhZ";
        stringArray2[135] = "C05GQE1GBUBBBUpESwVHRFEKQEJETkZEVQVKRgVCS0pNbg==";
        stringArray2[136] = "GBgYBVZJSkpxBUBMTkpKZgVLSkxWVkB2BQoFR0RxBUBMTkpKZgVLTEJKaQUYGBg=";
        stringArray2[137] = "C0BMTkpKRgVEUURBRFFASAVORkBNZgUfQEFKaA==";
        stringArray2[138] = "SVRWC1FXQFZLTHpATE5KSkYLCkFXREZBVgo=";
        stringArray2[139] = "VkBc";
        stringArray2[140] = "SVRWC0BRREBXRnpATE5KSkYLCkFXREZBVgo=";
        stringArray2[141] = "SVRWC0BRREBXRnpATE5KSkYLCkFXREZBVgoFQwgFSFc=";
        stringArray2[142] = "RlFQektKTFFEQFdG";
        stringArray2[143] = "ExcQERYVEhMdFhITFBcRFhQ=";
        stringArray2[144] = "XEBOelFWSk0=";
        stringArray2[145] = "AkhKRgtdSklHSlcLAg==";
        stringArray2[146] = "XEBOekBRTFZ6QEhEV0N6VUpR";
        stringArray2[147] = "QEhESw==";
        stringArray2[148] = "AnxxbHdwZmB2amlnancLAg==";
        stringArray2[149] = "QFBJRFN6QUBRVVxXRktA";
        stringArray2[150] = "AgJ9";
        stringArray2[151] = "TVFEVQ==";
        stringArray2[152] = "AgoC";
        stringArray2[153] = "RlFQelZAV0xVXUA=";
        stringArray2[154] = "ExcQERYVEhMdFhYXExARFhQ=";
        stringArray2[155] = "QFdQRkBWelZM";
        stringArray2[156] = "QFdQRkBW";
        stringArray2[157] = "XElLSlVRUU16Vkw=";
        stringArray2[158] = "XElLSlVRUU0=";
        stringArray2[159] = "RlFQelZWQEZGRHpRVkRJ";
        stringArray2[160] = "VkBXTFVdQHpWRE0=";
        stringArray2[161] = "UUtAUVZMVldAVXpWTA==";
        stringArray2[162] = "UUtAUVZMVldAVQ==";
        stringArray2[163] = "XFFMV0pMV1U=";
        stringArray2[164] = "QFFMVkBIRFY=";
        stringArray2[165] = "QEhATUZWekBGV1BKVg==";
        stringArray2[166] = "UVdKVXpARldQSlY=";
        stringArray2[167] = "FhER";
        stringArray2[168] = "RlFQekBRREFVUHpRVkRJ";
        stringArray2[169] = "ERYTFhAVEhMdFhITFBcRFhQ=";
        stringArray2[170] = "Lx4CfHFsd3BmYHZqaWdqdwsCGEBIREsFYHdgbXIFVkBMTkpKRgVoandjBWBxYGlgYQ==";
        stringArray2[171] = "GBgYBQxEUUlAYQ0FQFFQRkBdYAVKUVBkBUpEUwVRVUxXRnYFSEBNcQUYGBgv";
        stringArray2[172] = "RFBJC1FVTFdGVgpBREpJS1JKYQpBV0RGQVYK";
        stringArray2[173] = "QElMQwVNRlBWBUpr";
        stringArray2[174] = "BR8MRFBJC0hXRENKUVBEBR9QQQVMcw0FRkBdQEpRUEQFQktKV1EFUFBJBUBJTEMFS0BRBVFEYQ==";
        stringArray2[175] = "RFBJC1FVTFdGVg==";
        stringArray2[176] = "RFBJCw==";
        stringArray2[177] = "GBgYBQxEUUlAYQ0FQFFQRkBdYAVKUVBkBUJLSldRBVFVTFdGdgVESn0FGBgYLw==";
        stringArray2[178] = "UV1RCw==";
        stringArray2[179] = "H0pGBUtATE0FQElMQwVGREYFTUZEVgVNS0Rh";
        stringArray2[180] = "RkRRBUpETVEFXFBtBXhmfg==";
        stringArray2[181] = "BR9ESl0FQEEFQktQBUJLSlBRBUpWBUtKTWY=";
        stringArray2[182] = "GBgYBQxEUUlAYQ0FQFFQRkBdYAVKUVBkBVxJBUtEUHQFGBgYLw==";
        stringArray2[183] = "S0pNZg==";
        stringArray2[184] = "QktESwVGUE1GBUtKTWY=";
        stringArray2[185] = "QEJETkZEVQVLSk1m";
        stringArray2[186] = "SlYFS0pNZg==";
        stringArray2[187] = "GBgYBVZJSkpxBUBMTkpKZgVLSkxWVkB2BQoFR0RxBUBMTkpKZgVLTEJKaQUYGBgv";
        stringArray2[188] = "RFFEQURRQEgFQExOSkpGBUtKTFZWQFYFTkZATWYFeBR+";
        stringArray2[189] = "Z2EFQExOSkpGBUtMQkpJBV1MYwV4F34=";
        stringArray2[190] = "QUBRRkRBQFcFRFFEQURRQEgFQExOSkpGBVFXSlVdYAV4Fn4=";
        stringArray2[191] = "VVVEBV1KSUdKdwVLQFVqBXgRfg==";
        stringArray2[192] = "TkZEZwV4En4=";
        stringArray2[193] = "R0RRBUBMTkpKZg==";
        stringArray2[194] = "SkRLBUBCRE5GRFUFSk1GBUBMTkpKRgVORkBNZg==";
        stringArray2[195] = "SkRLBUBCRE5GRFUFSk1GBWdhBUBMTkpKRgVdTGM=";
        stringArray2[196] = "SkRLBUBCRE5GRFUFSk1GBUBMTkpKRgVRV0pVXWA=";
        stringArray2[197] = "SkRLBVVVRAVKaA==";
        stringArray2[198] = "SkRLBUBCRE5GRFUFSkRTBUBMTkpKRgVRV0BWS2w=";
        stringArray2[199] = "V0BBSUpDQExOSkpG";
        stringArray2[200] = "SkRLBUBCRE5GRFUFRFBGBUBMTkpKRgVAU0pIQHc=";
        stringArray2[201] = "C0BJBVVKTQVCS0pNTgVLSk1GBURQaQ==";
        stringArray2[202] = "CwsLR0RRBUBMTkpKRgVMREkFXERQVAVAQQVXQFFLYAVLRE1r";
        stringArray2[203] = "DEBLSksN";
        stringArray2[204] = "H0BBSkYFRkRKTQVOS0xJBVdAU1dAdgV1bHMFVURNaw==";
        stringArray2[205] = "QEFKZgpOS0xp";
        stringArray2[206] = "DEpWDQVAQkRORkRVBUtKTWY=";
        stringArray2[207] = "H1xEQksFVURNawUEQEFKRgV1bHMFSkYFRFBNZg==";
        stringArray2[208] = "SkRLBUBCRE5GRFUFSk1GBXVscwVLTEpv";
        stringArray2[209] = "SURHSklCBUpNRgUVBUZESk0FDEpWDQVAQkRORkRVBUtKTWY=";
        stringArray2[210] = "TEpIBWFsQEZESXUFSURHSkliBVVETWs=";
        stringArray2[211] = "YWxARkRJdQ==";
        stringArray2[212] = "FggFQURATQVZBUpDS0xIQEgKRkpXVQoFUURG";
        stringArray2[213] = "SUlQSwpTQEEKGxcFQlNEQURKSQpGSldVCgVRREY=";
        stringArray2[214] = "FggFQURATQVZBQJAV1BRRFdAVUhAUVlWUFFEUVZZSUBTQEkCBWAIBVVAV0IFWQVJSVBLClNAQQobFwVcV0BRUURHBVZcVlVIUEE=";
        stringArray2[215] = "FQVASURGVnpLSkxRREhMS0R6UkpBS0xSBUlER0pJQgVRUFUFVkJLTFFRQFY=";
        stringArray2[216] = "FQVASURGVnpLSkxRREhMS0R6S0pMUUxWS0RXUQVJREdKSUIFUVBVBVZCS0xRUUBW";
        stringArray2[217] = "FQVASURGVnpLSkxRRFdQQXpXSlFESExLRAVJREdKSUIFUVBVBVZCS0xRUUBW";
        stringArray2[218] = "FAVJQEZGRHpSTXpARldKQwVJREdKSUIFUVBVBVZCS0xRUUBW";
        stringArray2[219] = "SUJLQFVKBVdAV0BBS0BXC0xQUk0LQlBHQEEFVUpXVVFAVg==";
        stringArray2[220] = "QFZJREMFUkRXQVdAU0oLTFBSTQtCUEdAQQVVSldVUUBW";
        stringArray2[221] = "FQVWQE1GUEpRelJKTVYFSEBRVlxWBVFQVQVWQktMUVFAVg==";
        stringArray2[222] = "VkBNRkRGelVKV0EKSFMKVlxWCkZKV1UKBRsFFgVKTUZABQMDBUZLXFY=";
        stringArray2[223] = "VkhCC0FMSldBS0QLQElCSkpCC0hKRg==";
        stringArray2[224] = "XUpHTUZXREBWTkZMUFRASUJKSkILQUxKV0FLRAtASUJKSkILSEpG";
        stringArray2[225] = "QEhKV01GC0FMSldBS0QLSEpG";
        stringArray2[226] = "QEdQUVBKXAtBTEpXQUtEC0BJQkpKQgtISkY=";
        stringArray2[227] = "REtEUUROC05KSkdARkRDC0hKRg==";
        stringArray2[228] = "REZXSgtOSkpHQEZEQwtISkY=";
        stringArray2[229] = "FRAFVlZAS1FNQkxXR3pLQEBXRlYFSEBRVlxWBVFQVQVWQktMUVFAVg==";
        stringArray2[230] = "FQVAQUpIelZWQEtRTUJMV0d6S0BAV0ZWBUhAUVZcVgVRUFUFVkJLTFFRQFY=";
        stringArray2[231] = "FRUVFRUTBVFQSkBITFF6Q0NKektAQFdGVgVIQFFWXFYFUVBVBVZCS0xRUUBW";
        stringArray2[232] = "FQVBQElHREtAek5GREdBQEBDekZMUVVETQVIQFFWXFYFUVBVBVZCS0xRUUBW";
        stringArray2[233] = "FQVGS1xWekpRUEQFSURHSklCBVFQVQVWQktMUVFAVg==";
        stringArray2[234] = "TldKUlFASwgJVlVCCAVBQFJKSUlEelZXQEFMU0pXVXpLSkxRREZKSQVAV1BGQFYFUVBVBVZCS0xRUUBW";
        stringArray2[235] = "QF9MVgVIUg==";
        stringArray2[236] = "DFVETVENBRUdFxRdFRcSBXgUfg==";
        stringArray2[237] = "DFVETVEFUURXDQUVExxdFREQBXgXfg==";
        stringArray2[238] = "TUtMTUYFUFEFVURNawV4Fn4=";
        stringArray2[239] = "FR0XFF0VFxIFQF9MVgVIUg==";
        stringArray2[240] = "FRMcXRUREAVAX0xWBUhS";
        stringArray2[241] = "DBEXFRRdFRUTBR9QQQVMUw0FbV1yBVVETWs=";
        stringArray2[242] = "FREXBVxRTFZLQEEFSFI=";
        stringArray2[243] = "UUBWQFcFQF9MVgVIUg==";
        stringArray2[244] = "UUBWQFcFXFFMVktAQQVIUg==";
        stringArray2[245] = "TUtMQQVGREgFQWxARkRJVQVVRE1r";
        stringArray2[246] = "C0BJBVVKTQVCS0pNTgVNS0xBBUZESAVBbEBGREl1";
        stringArray2[247] = "VkFLSkZAVnpcQ0xXQFN6S0xKTw==";
        stringArray2[248] = "VkFLSkZAVnpRUEpASExRekBIREJ6Sks=";
        stringArray2[249] = "VkFLSkZAVnpRUEpASExRektAQFdGVnpAUUxNUg==";
        stringArray2[250] = "GBgYBU5GQE1mBVZQUURRdgVJRExRTEtsBRgYGC8=";
        stringArray2[251] = "LxgYGBgYGBgYGBgYGBgYGBgYGBgYGBgYGBgYGBg=";
        stringArray2[252] = "SVdQek5KSk1HQFI=";
        stringArray2[253] = "S0xKT0B3BUpRUGQFUERBBVFEZwUbGw==";
        stringArray2[254] = "VkFLSkZAVnpLUkpBSUpKRnpLTEpPQFc=";
        stringArray2[255] = "dmB8H0BIRGJLbA==";
        stringArray2[256] = "amsfQEhEYkts";
        stringArray2[257] = "VVBVSlUFYmtz";
        stringArray2[258] = "QUx6R0pP";
        stringArray2[259] = "S0xKT0B3BUtAQFdGdkBRTE1yCmJrcwUbGQ==";
        stringArray2[260] = "H0BIREJLTB8=";
        stringArray2[261] = "BQ4F";
        stringArray2[262] = "QUBORkxOH0RQaQ==";
        stringArray2[263] = "QElEUVYfRFBp";
        stringArray2[264] = "SEBJR0pXVR9RREZCSmk=";
        stringArray2[265] = "QEhEQktMelFKSx9sdWQ=";
        stringArray2[266] = "SEBJR0pXVQVIV0xDS0pGBVZBSk1RQEgFSUlk";
        stringArray2[267] = "S0xKT0B3BU5GQE1mBVVAQGEFGxk=";
        stringArray2[268] = "S0xKT0B3BUxEZwVRRE1xBXh9fg==";
        stringArray2[269] = "QFNMSUQ=";
        stringArray2[270] = "SUlQSwpTQEEKGxcFUV1RCw8KVkBNVkRXZgpEUUlAYQpBV0RGQVYKBUMIBUhX";
        stringArray2[271] = "QEhEYgVLTEpPQHcFQktEYQUbGw==";
        stringArray2[272] = "C0BJTEMFUURAR1FXREBNBVdEQElGBQlCS0pdBUFESkkFQEhEYgUbCA==";
        stringArray2[273] = "QFFMSVRW";
        stringArray2[274] = "SVdQRg==";
        stringArray2[275] = "UUBCUg==";
        stringArray2[276] = "VUBXQg==";
        stringArray2[277] = "UURRVg==";
        stringArray2[278] = "VklMUVBAV0pG";
        stringArray2[279] = "VlVGSldV";
        stringArray2[280] = "CwsLBU1GTE1S";
        stringArray2[281] = "TUZMTVI=";
        stringArray2[282] = "Qk5V";
        stringArray2[283] = "QFFEQVVQ";
        stringArray2[284] = "UVdKVVVQVnpIV0pDQEBXQ3pASUdES0AFSURHSklCBVFAQgVWQktMUVFAVg==";
        stringArray2[285] = "VkBMUUxTTFFGRHpASUdEX0xWQFd6QEZXSkMFSURHSklCBVFAQgVWQktMUVFAVg==";
        stringArray2[286] = "FAVRV0pVVVBWekhXSkNAQFdDekBJR0RLQAVJREdKSUIFUVBVBVZCS0xRUUBW";
        stringArray2[287] = "FAVWQExRTFNMUUZEekBJR0RfTFZAV3pARldKQwVJREdKSUIFUVBVBVZCS0xRUUBW";
        stringArray2[288] = "SVdQekBCS0BJSURNRg==";
        stringArray2[289] = "CwsLSVdQekBCS0BJSURNRgVQUQVAUElEUwVGTEhES1xBBU1GUUBDBUJLRGEFGwg=";
        stringArray2[290] = "RFFEYQhJRExRTEtsCH0=";
        stringArray2[291] = "QEJLQElJRE1GCF0=";
        stringArray2[292] = "QFBJRFMIUUlQVkBXCF0=";
        stringArray2[293] = "UUZASUB2";
        stringArray2[294] = "S0BcUEJLBVBMQgVAQQVXQFFLYAUF";
        stringArray2[295] = "C0tAXFBCSwVQTGI=";
        stringArray2[296] = "SUlE";
        stringArray2[297] = "eBd+BVdKBXgUfgVRRkBJQHY=";
        stringArray2[298] = "aXdwBU5KSk1HQHI=";
        stringArray2[299] = "QUpNUUBo";
        stringArray2[300] = "VkFLSkZAVgVcRElAYQ==";
        stringArray2[301] = "SkRLBUBCRE5GRFUFUVBKQkpp";
        stringArray2[302] = "XERNVQVQREEFQktERwVQRE1LBU1GREYFCUxKSAVdTENAV3U=";
        stringArray2[303] = "GEBIRGtLSkxWV0BT";
        stringArray2[304] = "DEZKQg0=";
        stringArray2[305] = "DEBLSklGDQ==";
        stringArray2[306] = "BR8MSwpcDQUaVkBCRE5GRFV6QUBRRkBJQFYFSkRTBURGBVFEUQVBQUQFQktKQQVQcS8=";
        stringArray2[307] = "CxcFRlBIBUoFQktKRgVQTVEFS0pNRgVATVEFSkYFS0RnBQtcUG0=";
        stringArray2[308] = "DAJJSUQCBUZESk0NBVxETVUFUERBBUJLREcFUERNSwVNRkRGBQlESl0FS0RGBUpWBVVETWs=";
        stringArray2[309] = "DFFAVgVEUE1GDQ==";
        stringArray2[310] = "DEtAXFBCSwVQTEIFQEEFV0BRS2AFRkRKTQ0FTEpIBWFsBUBGREl1BVVETWs=";
        stringArray2[311] = "C2FsBUBGREl1BUtAXFBCSwVQTGI=";
        stringArray2[312] = "DBUWCBUXBR9cBUxKQgUJS0BcUEJLBVBMQgVXQFFLYAUJXERMQg0FUVBKQEhMUQVASERiSms=";
        stringArray2[313] = "DBUWCBUXBR9cBUxKQgUJS0BcUEJLBVBMQgVXQFFLYAUJXERMQg0FUVBKQEhMUQVLQEBXRnZAUUxNcg==";
        stringArray2[314] = "BUMIBVFWQFE=";
        stringArray2[315] = "bmoFSk1GQAUDAwU=";
        stringArray2[316] = "BR9BS1BKQwUWQFFMSVRWBXhuan4=";
        stringArray2[317] = "AhZAUUxJVFYCBU1LTEEFRkRIBUJLUEEFCUtEQQVCS0pQQQVcRE1RBUhMUQVCS0pNTgUWQFFMSVRWBXgEfg==";
        stringArray2[318] = "elZQUURRVnpdSklHSlc=";
        stringArray2[319] = "CkBGRFVWTldKcgpEUUlAYQpBV0RGQVYK";
        stringArray2[320] = "CkRRREEKQUxKV0FLZApBV0RGQVYK";
        stringArray2[321] = "CkBGRFVWTldKUgpEUUlAQQpWQElMQwo=";
        stringArray2[322] = "CkBGRFVWTldKUgoPClZASUxDCg==";
        stringArray2[323] = "BVFERg==";
        stringArray2[324] = "FAVLCAVJTERRBVkFSUlQSwpTQEEKGxcF";
        stringArray2[325] = "BUMIBUhX";
        stringArray2[326] = "SUlQSwpTQEEKGxcF";
        stringArray2[327] = "BUNKQUxV";
        stringArray2[328] = "GEFMVQgIBRUVFwVRCAVBCAVRREZCSkk=";
        stringArray2[329] = "FAgFSUxEUQVZBQJhYGFkaml6YGJkdXpgaGptemRwaVlASEptDwtcQURAd1VVZEtKAgVgTAgFVUBXQgVZBQ==";
        stringArray2[330] = "FAgFSUxEUQVZBQJBQFFXRFF2QEhEYktKWUJLTFFXRFF2QEhEYktKAgVgTAgFVUBXQgVZBQ==";
        stringArray2[331] = "CkZKV1UKBVFERg==";
        stringArray2[332] = "AlgXFwF5BVFLTFdVXgIFTlJEBVkFSUlQSwpTQEEKGxcFUURRVgo=";
        stringArray2[333] = "GEFMVQgIBRUVEAVRCAVBCAVRREZCSkk=";
        stringArray2[334] = "FAgFSUxEUQVZBQJRRkBLS0pGVkxBAgVTCAVVQFdCBVkFAldAQUxTSld1UUBWVmRZSURNVldEaEtKTFFGS1BjWVdAV1BCTENLSmZNRlFEdUlAQUpoRFFEYVlXSldXYEBGRFdxUUBORkp2R0ByWUBIRGIPC1dATUZLUERpQEZESXVZS0pMVlZAdkBGS0BMV0BVXWBZQUBRREBXRgVXSlFERkxJVUB3WUFAUVdEUXZASERiS0oCBWBMCAVVQFdCBVkF";
        stringArray2[335] = "FAgFSUxEUQVZBQJhYGFkaml6YGJkdXpgaGptemRwaVlcQURAd1VVZEtKAgVgTAgFVUBXQgVZBQ==";
        stringArray2[336] = "BR9NS0xBBUZESAVCTENLSkYFQElMQwVKRFEFRGEFGwg=";
        stringArray2[337] = "BR9ASUxDBUJMQ0tKRgVGSlBBBUpEUQVCS0pNbgUfQktMS1dEcgUbCA==";
        stringArray2[338] = "BRMTEwVBSkhNRg==";
        stringArray2[339] = "BR9CTENLSkYFTE1CBUxKaQUbCA==";
        stringArray2[340] = "C1BWClFKSlcFSkYFQktKTW4=";
        stringArray2[341] = "XFdES0xHBVBWBR9RSkp3BXhuan4=";
        stringArray2[342] = "BUBCRE5GRFUFVlxWVUhQQQ==";
        stringArray2[343] = "FAgFQURATQVZBQJcUUxTTFFGZAt5UUtATElGC3ldSklHSlcLeUhKRllNVkRJVXZdSklHSndZS0xEaEBTTFFEa1xRTFNMUUZkAgVgTAgFVUBXQgVZBQ==";
        stringArray2[344] = "CkRRREEKRFFEQQoFQQgFUVZAUQ==";
        stringArray2[345] = "CkRRREEKRFFEQQoFQQgFUVZAUQVZWQV9amlnancFSk1GQAUDAwVRS0BRS0pGClZRQFZWRHpVVUQK";
        stringArray2[346] = "fWppZ2p3BUpNRkAFAwMFQE1GREZ6QUBWVkBXVUhKRkBBekhdR1d6RFFKClZASUxDCg==";
        stringArray2[347] = "CkRRREEKRFFEQQo=";
        stringArray2[348] = "QE1GREYK";
        stringArray2[349] = "ChUKV0BWUApEUURBCg==";
        stringArray2[350] = "VkJKSQpWQElMQwo=";
        stringArray2[351] = "WV1KSUdKVwIFYEwIBVVAV0IFWQUVFR0FUQgFQQgFUURGQkpJ";
        stringArray2[352] = "FRMUBUsIBUlMRFEFWQUCS0pMUVVARl1AWU1WRFdGWUlEUURDWUBBSkYFV0pXV0BZUUtQSkZGRAVASERWWUtKTFFGQEtLSkYFUVZKSVlRRkBLS0pGVkxBWUFATkZMTllBTEBWV0BTTEtQWUFMekBIREJZQUxASERCWUFMekBGRElVWUFMQEZESVVZQUx6V0BWUFlBTFdAVlBZ";
        stringArray2[353] = "VkBMTkpKZgpRSVBEQ0BhClJATFNHQFJ6VVVECg==";
        stringArray2[354] = "BU1GUURHCAU=";
        stringArray2[355] = "FAgFQURATQVZBQJ8cWx3cGZgdmppZ2p3AgVMCAVVQFdCBVkFSUlQSwpTQEEKGxcFVkJLTFdRVgVZBUlJUEsKU0BBChsXBQ==";
        stringArray2[356] = "EAgFQURATQVZBQJhbFdAVnBZQUxQXUdXAgVgTAgFVUBXQgVZBUlJUEsKU0BBChsXBVZCS0xXUVYFWQVJSVBLClNAQQobFwU=";
        stringArray2[357] = "CkRRREEKRFFEQQoFUURG";
        stringArray2[358] = "SUlQSwpTQEEKGxcFSUhdC1ZDQFdVClZDQFdVekFAV0RNVgo=";
        stringArray2[359] = "ClZDQFdVekFAV0RNVgo=";
        stringArray2[360] = "SUlQSwpTQEEKGxcFSUhdC1dAXERJVQsXUws=";
        stringArray2[361] = "BVVAV0IFWQUCGEFsQEZESVUKCh9dSklHSlcCBUwIBVVAV0IFWQVWQExRTFNMUUZEBVxRTFNMUUZEBVZcVlVIUEE=";
        stringArray2[362] = "FAgFQURATQVZBQJ2bG1xCGB3ZG12CHFqawhqYQgfYmtsa3dkcgIFVUBXQgVZBUlJUEsKU0BBChsXBVZCS0xXUVYFWQVJSVBLClNAQQobFwU=";
        stringArray2[363] = "BU1RRFUFSFU=";
        stringArray2[364] = "BUMIBVVAV0JV";
        stringArray2[365] = "FAVLCAVBREBNBVkF";
        stringArray2[366] = "BVVAV0IFWQUCUkpBS0xyQUBWUEZKY0hZVVVkQUBWUEZKY0hZVlBGSmNRS0BXV1BmSAIFYAgFVUBXQgVZBVJKQUtMUgVWXFZVSFBB";
        stringArray2[367] = "BVVAV0IFWQUCXFFMU0xRRmRBQEhQVkB3WVxRTFNMUUZkQUBIUFZAd0gCBWAIBVVAV0IFWQVWQExRTFNMUUZEBVxRTFNMUUZEBVZcVlVIUEE=";
        stringArray2[368] = "AgVgTAgFVUBXQgVZBRUVEAVRCAVBCAVRREZCSkk=";
        stringArray2[369] = "FRYFSwgFSUxEUQVZBQJCS0xNVkxLTEMFQEZXSmNZQUBMQQVWRE1Za2pscXVgZn1gBWlkcWRjWU1WRFdGekhEWQ==";
        stringArray2[370] = "AgVgTAgFVUBXQgVZBQ==";
        stringArray2[371] = "EAVLCAVJTERRBVkFAg==";
        stringArray2[372] = "ClZATVZEV2YKRFFJQGEKQVdERkFWCgVRREY=";
        stringArray2[373] = "EBQIBUFEQE0FWQVJSVBLClNAQQobFwU=";
        stringArray2[374] = "BU1WRFdGBURRSUBh";
        stringArray2[375] = "GEtEd1ZRVUxXRnYFCUpCRAVW";
        stringArray2[376] = "GEtKTFFGZFFWRGkFCQ==";
        stringArray2[377] = "BR9hYHFmYHFgYQVtdmR3ZgVkcWlgYQUbCA==";
        stringArray2[378] = "BR8MQURAQQVVVUQNBW5mbG4FcWRmYmppBRsI";
        stringArray2[379] = "CwsLDEBGTFNXQHZRV0pVQElAcQ0FS0xKT0BXBVBRBUJLREEFUVVMV0ZWBURQaQUbCA==";
        stringArray2[380] = "AgVVQFdCBVkFAldATUZLUERpQEZESXVZV0BCREtEaEBIRGJZS0pMVlZAdkBGS0BMV0BVXWBZQUx6QEZESVVZQWxARkRJVQIFYEwIBVVAV0IFWQUVFRcFUQgFQQgFUURGQkpJ";
        stringArray2[381] = "FRQFSwgFSUxEUQVZBQJdSklHSldZeQ==";
        stringArray2[382] = "FgVLCAVJTERRBVkFAlFGQEtLSkZWTEECBVMIBVVAV0IFWQUCV0BBTFNKV3VRQFZWZFlJRE1WV0RoS0pMUUZLUGNZV0BXUEJMQ0tKZk1GUUR1SUBBSmhEUURhWVdKV1dgQEZEV3FRQE5GSnZHQHJZQUBRV0RRVg8LQktMV0BBS0B3WUBIRGIPC1dATUZLUERpQEZESXVZS0pMVlZAdkBGS0BMV0BVXWBZQUBBREppQEhEYktKWUJLTFFXRFF2QEhEYktKWVdKUURGTElVQHcPC05XSlJRQGsfH0JKaWMCBWBMCAVVQFdCBVkF";
        stringArray2[383] = "AgVVQFdCBVkFVkBMUUxTTFFGRAVcUUxTTFFGRAVWXFZVSFBB";
        stringArray2[384] = "FAgFSUxEUQVZBQJBbEBGRElVAgVMCAVVQFdCBVkFAg==";
        stringArray2[385] = "FAgFSUxEUQVZBQJLSkxRRkBLS0pGBVFWSklZS0pWREBXDwtRRkBLS0pGVkxBWUFATkZMTllhYGFkaml6YGJkdXpgaGptemRwaVlASEptDwtcQURAd1VVZEtKAgVgTAgFVUBXQgVZBQ==";
        stringArray2[386] = "GEBITFFVUAUfTkZER0lJREMNBUBQV1EYS0pMVlZAdkBIRGJLTAUbCA==";
        stringArray2[387] = "DEJKSQVBREcFSksFCVFLQFFLTAVBbEBGRElVBQlW";
        stringArray2[388] = "DFBGBUJKSQVATVEFSkYNBU5GTE4FUURGQkpJBURQVAVKRwUJQEhEYktsBUhXTENLSkYFbHVkBRsI";
        stringArray2[389] = "DEJLQExXBU1WRFdGBUxHBUBNUQVKRgVEUUlAYQ0FQElEUVYFUURAR1FXREBNBURQVAVKRwUJQEhEYktsBUhXTENLSkYFbHVkBRsI";
        stringArray2[390] = "BR9AQkRORkR1";
        stringArray2[391] = "BR9WUFFEUXY=";
        stringArray2[392] = "BR9BQFZQRkpj";
        stringArray2[393] = "BR9LSkxWVkB2QEhEYkts";
        stringArray2[394] = "BR9BV0pSXEBOBWxw";
        stringArray2[395] = "BR9RREZCSkkFTVZEV2Y=";
        stringArray2[396] = "BR9BV0pSXEBOBUJKSQVASUxj";
        stringArray2[397] = "BR9EUURBRFFASAVATE5KSkYFS0pMVlZAdg==";
        stringArray2[398] = "BR9QREgFR0RRBUBJTEMFSkRRBURh";
        stringArray2[399] = "BR9WUFFEUVYKQUBJSURRVktMBQ==";
        stringArray2[400] = "BR9LSkxWVkB2QEhEYktMBQ==";
        stringArray2[401] = "RFFEQURRQEgFQExOSkpGBUtKTFZWQFYF";
        stringArray2[402] = "ClZXQFZQChRTCkhKRgtdSklHSlcLVldAVlAKCh9WVVFRTQ==";
        stringArray2[403] = "elFGQFFAQXpORkxOCg==";
        stringArray2[404] = "HxMfa2psdndgcw==";
        stringArray2[405] = "BRAIBUFEQE0=";
        stringArray2[406] = "DQUTcwVRRkBRQEF6TkZMTgUbCA==";
        stringArray2[407] = "C1xKSVVAQQVEUFQFSkcFCUxEUQVLSlEFREEFDA==";
        stringArray2[408] = "SUlQSwpTQEEKGxcFRFBJC1FGQFFAQXpORkxOCg==";
        stringArray2[409] = "BUpNRgUMcWRgZ3F3ZGBtBWJudQh3YHUNBRNzBVFGQFFAQXpORkxOBVxKSVVAYQUbCA==";
        stringArray2[410] = "BUpEUwU=";
        stringArray2[411] = "BRsFUURG";
        stringArray2[412] = "LwJjamBkcGkCBRkZBQ==";
        stringArray2[413] = "Y2pgZHBpLw==";
        stringArray2[414] = "BEJLSkYFTUtETVEFXEpJVUBBBURBBQw=";
        stringArray2[415] = "DQUTcwVRRkBRQEF6TkZMTgVcSklVQEEFaWxkYwUbCA==";
        stringArray2[416] = "WAkTFF54HAgVfwhkXwhEfns=";
        stringArray2[417] = "BVVKUVYIQEZXSkMFSEQ=";
        stringArray2[418] = "CkRRREEKQUxKV0FLZApBV0RGQVYKBUNXCAVIVw==";
        stringArray2[419] = "CkRRREEKRFFEQQoFDwpWQkpJClZASUxDCg==";
        stringArray2[420] = "DwpATUZERgo=";
        stringArray2[421] = "GEBBSkYaVk5LTEl6QFdETVYKS0pMUURCTFNESwoKH11KSUdKVw==";
        stringArray2[422] = "V0BTV0B2GEBVXFED";
        stringArray2[423] = "GEBBSkYFH05LTElVQEBBBU5LTEkFQFdETXYFeHVsc34FGwg=";
        stringArray2[424] = "BUEIBXJgbHMLS0pMUUZEC1FLQFFLTAtBTEpXQUtEBUQIBU5WRFEIV0RASUYIXFFMU0xRRkQICAVRV0RRVgVIRA==";
        stringArray2[425] = "BVUIBQ==";
        stringArray2[426] = "BUpNRgVLTEpPQHcFV0BTV0B2BXVscwVMUEIFRGEFH2Jran0FGBgY";
        stringArray2[427] = "GBgYBQ==";
        stringArray2[428] = "QEZESXVRV0RRVgVJREhXSksFSlEFTkZER0lJREMFCUFASUxEQwVOS0xJVUBAQQV1bHM=";
        stringArray2[429] = "GEFsQEZESVUaUVdEUVYKVkBGS0BMV0BVXUAKCh9dSklHSlc=";
        stringArray2[430] = "GFFATkZMUQM=";
        stringArray2[431] = "GEFsQEZLRFFWS2xASERCAw==";
        stringArray2[432] = "GEFsQEZESVUKCh9dSklHSlc=";
        stringArray2[433] = "BUsIBVFXRFFWBUhE";
        stringArray2[434] = "d2BtZmtwZGkLXFdKQkBRREYLUUtAUUtMC0FMSldBS0QFRggFa2xkaAtLSkxRRkQLUUtAUUtMC0FMSldBS0QFRAgFTVZESVV2XFFMU0xRRmQLVVBRV0RRVgsK";
        stringArray2[435] = "BUpNRgVLTEpPQHcFTUtASQVMUEIFRGEFH2Jran0FGBgY";
        stringArray2[436] = "WV1KSUdKVwIFYEwIBVVAV0IFWQUVHRQFUQgFQQgFUURGQkpJ";
        stringArray2[437] = "FR0FSwgFSUxEUQVZBQJCS0xRV0RRdkBIRGJLSllLSkxWVkB2QEZLQExXQFVdYFlBTHpASERCWUFMQEhEQllBTHpARkRJVVlBTEBGRElVWQ==";
        stringArray2[438] = "QUtQSkMFUUpLBUFsQEZESVUFQkpJBVFLQEZAVwU=";
        stringArray2[439] = "BUpIBUJLRGE=";
        stringArray2[440] = "BVUIBXdgbWZrcGRpC1xXSkJAUURGC1FLQFFLTAtBTEpXQUtEBUYIBWtsZGgLS0pMUUZEC1FLQFFLTAtBTEpXQUtEBUQIBVFXRFFWBUhE";
        stringArray2[441] = "BUpIBURh";
        stringArray2[442] = "BEJLSkYFTUtETVEF";
        stringArray2[443] = "BVUIBVxATktKSA==";
        stringArray2[444] = "SUlQSwpTQEEKGxcFFAV3YG1ma3BkaQtcV0pCQFFERgtRS0BRS0wLQUxKV0FLRAVGCAU=";
        stringArray2[445] = "DFxATktKSA0FBEJLSkYFTUtETVEF";
        stringArray2[446] = "BUpIBUxKaQ==";
        stringArray2[447] = "BQMDBQ==";
        stringArray2[448] = "QFBXUQVZWQUCHgxgcWRma3B3cQ1RS0xKVU5GQE1GeklEUgVkaGJkd3UCBQ==";
        stringArray2[449] = "GHdgdnB6dXVk";
        stringArray2[450] = "BQJwAAIFRggFUURRVg0=";
        stringArray2[451] = "GHVwandienV1ZAUDAwUM";
        stringArray2[452] = "BQJiAAIFRggFUURRVg0=";
        stringArray2[453] = "BUtSSk1GBQMDBQw=";
        stringArray2[454] = "H3dgdnB6dXVk";
        stringArray2[455] = "BXVwandienV1ZA==";
        stringArray2[456] = "BRUTEwVBSkhNRg==";
        stringArray2[457] = "BUtKRkBXSlFWQFcFAwMFSUlQSwpTQEEKGwVLSkZAV0pRVkBXBVMIBUFLREhISkY=";
        stringArray2[458] = "QFBXUQVZWQU=";
        stringArray2[459] = "BVdKQwVAS0pBBUBMTkpKRgVRUEpCSmk=";
        stringArray2[460] = "BQJZAgVXSlFEV0RVQFYIBU1GUURHCAU=";
        stringArray2[461] = "BR9nYQ==";
        stringArray2[462] = "BR9RUFVRUGo=";
        stringArray2[463] = "RQUfQEJETkZEdQUI";
        stringArray2[464] = "RQUfZ2EFCA==";
        stringArray2[465] = "RQUfQEhMcQUI";
        stringArray2[466] = "GE1RRFUF";
        stringArray2[467] = "DWFgcWZkYWB3GEBQSURTBQ==";
        stringArray2[468] = "DWFgcWZkYWB3GEFAUVVcV0ZLQAUMVldETUYF";
        stringArray2[469] = "GFFLTFdVV0BCS0xDBQxWQFFcRwU=";
        stringArray2[470] = "DQVhYHFmZGFgdwVZBQ==";
        stringArray2[471] = "DQVhYHFmZGFgdwVZBQxWV0RNRgU=";
        stringArray2[472] = "BVkFDFZAUVxHBQ==";
        stringArray2[473] = "BR9EUURBRFFASAVBQFFGREFAVwVBQFFXSlVdYA==";
        stringArray2[474] = "BR9nYQUF";
        stringArray2[475] = "RFFEQURRQEgFfHFsd3BmYHZqaWdqdwsF";
        stringArray2[476] = "UUlQRENAYQpSQExTR0BSelVVRAo=";
        stringArray2[477] = "BUBCRE5GRHUFH3VsbnY=";
        stringArray2[478] = "C0xEUQVLSlEFQktKTU4F";
        stringArray2[479] = "SksFSk1GQAVZWQVWQFwFSk1GQAUDAwU=";
        stringArray2[480] = "CwsLZ2EFSkRRBUBBBV1KSUdKdwVKaAULTERRBUtKUQVEUE1GBWdhBUBMTkpKZgUbCA==";
        stringArray2[481] = "CwsLSkRRBUxKTU4FXUpJR0p3BUpNRgVWHQVMSmEFGwg=";
        stringArray2[482] = "CwsLFkBRTElUVgVCS0RHBUpEUQVCS0pBBVBxBQtKRgVEUE1GBUtEUwVnYQUbCA==";
        stringArray2[483] = "BVUIBVdMQU5I";
        stringArray2[484] = "BUpNRkA=";
        stringArray2[485] = "SVRWC0BRREBXRnpATE5KSkYLCkFXREZBVgoFGwU=";
        stringArray2[486] = "SVRWC0BRREBXRnpATE5KSkYLCkFXREZBVgoFGQU=";
        stringArray2[487] = "BEJLSkYFTUtETVEFTEpIBWdhBUBMTkpKZgVKRFEFRGEFGwg=";
        stringArray2[488] = "BXcIBUtSSk1G";
        stringArray2[489] = "BXcIBUtKRkBXSlFWQFc=";
        stringArray2[490] = "QFBXUQVZWQVJSVBLClNAQQobFwU=";
        stringArray2[491] = "BEJLSkYFTUtETVEFZ2EFQExOSkpmBUpEUQVEQQVdSklHSncFGwg=";
        stringArray2[492] = "BR9ESEBNRlYFZ2EFGwg=";
        stringArray2[493] = "VktIUElKRgU=";
        stringArray2[494] = "BUpNRgVATE5KSkYFS0BNRgVCS0Rh";
        stringArray2[495] = "BUlES1dQSk8I";
        stringArray2[496] = "BUlEUgg=";
        stringArray2[497] = "SE1WCA==";
        stringArray2[498] = "LwJjamBpdHYCBRkZBQ==";
        stringArray2[499] = "Y2pgaXR2Lw==";
        stringArray2[500] = "CwsLTUtASQVCS1BRBVVATFEFRlBXUQUfFwVBSk1RQEgFUE1xBRsI";
        stringArray2[501] = "BUtSSk1G";
        stringArray2[502] = "SUlQSwpTQEEKGxcFSURLV1BKTwg=";
        stringArray2[503] = "SUlQSwpTQEEKGxcFSURSCA==";
        stringArray2[504] = "SUlQSwpTQEEKGxcFSE1WCA==";
        stringArray2[505] = "BRUSEgVBSkhNRg==";
        stringArray2[506] = "BUtKRkBXSlFWQFc=";
        stringArray2[507] = "BUpNRgVCS0pdBUBMTkpKRgVLQE1m";
        stringArray2[508] = "BR9BQExDTFdAUw0FCw==";
        stringArray2[509] = "DFJKVwU=";
        stringArray2[510] = "DQVdSklHSncFSkgFQktEYQUbCA==";
        stringArray2[511] = "CwsLDA==";
        stringArray2[512] = "CwsLQURKSQVGSlBBBUBMTkpKRgVAQQVWFRQIEAVMSmEFC0pIBURBBV1KSUdKdwUbCA==";
        stringArray2[513] = "BUpNRgVLQE1GBUZKUEEFQktKTU4FQExOSkpmBR9pbGRj";
        stringArray2[514] = "RkBdQEpRUEQKRFFJQEEKVkBJTEMK";
        stringArray2[515] = "BR9NS0xBBUZEaA0FS0RHBURQRgVRVUxXRlYFQElMQwVLQEEFS0RBBUJLSlBBBVVETWs=";
        stringArray2[516] = "AgVWSQ==";
        stringArray2[517] = "SUlQSwpTQEEKGxcFAg==";
        stringArray2[518] = "BUBJTEMFXERNUQVITFEFQktKTW4FH0xKaQ==";
        stringArray2[519] = "BEZKUFdRBUFESklLUkphBUZQSAVKRFMFUVVMV0ZWBUxEUQVcRG0FCw==";
        stringArray2[520] = "AgVVRg==";
        stringArray2[521] = "BR9KRFMFUVVMV0ZWBVxVSkYFRGE=";
        stringArray2[522] = "BRQIBVZJ";
        stringArray2[523] = "BEpEUQVGSlBBBURQTUYFRkRKTQVCS0pXUQVCS0RBBUtATE0FRkBdQEpRUEQFRlBIBVBNcQ==";
        stringArray2[524] = "BEZAXUBKUVBEBUJLSldRBUpESwVRVUxXRlYFQElMQwVKRgVCS0pNbg==";
        stringArray2[525] = "QElMQwVkZgVxZHEFREp9BQ==";
        stringArray2[526] = "BEZAXUBKUVBEBUJLSldRBVFVTFdGVgVKRwVLREpRBURKXQVEYQ==";
        stringArray2[527] = "AgVDCAVIVw==";
        stringArray2[528] = "BR9ASUxDBURKXQVEYQ==";
        stringArray2[529] = "BEBJBVVKTQVCS0pNTgVLSk1GBURQaQ==";
        stringArray2[530] = "H0tKTUYFREEFVkBCRE5GRHU=";
        stringArray2[531] = "SQgFRlIFWQVJSVBLClNAQQobFwU=";
        stringArray2[532] = "BR9WUVVMV0Z2BVkF";
        stringArray2[533] = "BUpNRgVRVUxXRlYFSEBNcQU=";
        stringArray2[534] = "ZGYFcWRx";
        stringArray2[535] = "VkBCRE5GRFUF";
        stringArray2[536] = "BUxKTU4FUVVMV0ZWBURKfQU=";
        stringArray2[537] = "CBR+BUpWBUtKTUYFRkRKbQ==";
        stringArray2[538] = "QEJETkZEVQVCS1BRBVxJBUtEUFQFQEEFeA==";
        stringArray2[539] = "TERJBVxEUHQF";
        stringArray2[540] = "BWRmBXFkcQVKTUYFUVVMV0ZWBUhATXEFGBgY";
        stringArray2[541] = "GBgYBVZAQkRORkRVBQ==";
        stringArray2[542] = "BUpNRgVcSklVQGEFGwg=";
        stringArray2[543] = "BUpNRgVRVUxXRlYFSEBNUQVEYQ==";
        stringArray2[544] = "BFZAQkRORkRVBQ==";
        stringArray2[545] = "BWRmBXFkcQVMSk1OBVFVTFdGVgVESn0FGBgY";
        stringArray2[546] = "BUpNRgVESn0FGwg=";
        stringArray2[547] = "BUxKTU4FUVVMV0ZWBURKXQVEYQ==";
        stringArray2[548] = "QFFQRkBdYAVKUVBkBUpEUwVEUEkLBVFVTFdGVgVIQE1xBQ==";
        stringArray2[549] = "QFFQRkBdYAVKUVBkBUJLSldRBURQSQsFUVVMV0ZWBURKfQU=";
        stringArray2[550] = "REYFUURxBQ==";
        stringArray2[551] = "QEJETkZEVQVLSk1GBRsIBQxLTEJKaQ0FQExOSkpGBVJEVwVRV0BWS2wF";
        stringArray2[552] = "DEBCRE5GRFUFQktQUQVRUEpCSmkNBUBMTkpKRgVAU0pIQHcF";
        stringArray2[553] = "BQgICA==";
        stringArray2[554] = "CAgIBQ==";
        stringArray2[555] = "BURQRgVATE5KSkYFREpdBUJLRGE=";
        stringArray2[556] = "CwsLBQ==";
        stringArray2[557] = "CkRRREEKRFFEQQoFQwgFSFc=";
        stringArray2[558] = "BVVKUVYIQEZXSkMFDgVATE5KSkYFREpdBURhBXhuan4=";
        stringArray2[559] = "C0pIBUxNTgVMREkFS0xCSkkFUERGBVBAXAVAVgVVVWQFBEJLSn0=";
        stringArray2[560] = "BR9AQkRORkR1BQU=";
        stringArray2[561] = "DhgYGBgYGBgYGBgYGBgYGBgYGBgYGBgYGBgYGBgYGBgYGBgYGBgYGBgYGBgYGBgYGA4=";
        stringArray2[562] = "BUtMSk9AdwVMTVFQQEx2BQ8=";
        stringArray2[563] = "FAsXUw==";
        stringArray2[564] = "H0BCRE5GRHU=";
        stringArray2[565] = "H2FsQEZESXU=";
        stringArray2[566] = "H0FKTVFAaA==";
        stringArray2[567] = "S0xKT0B3BUpRUGQ=";
        stringArray2[568] = "QEJETkZEVQVRRkBJQHYF";
        stringArray2[569] = "VkBCRE5GRFUFQUBRRkBJQFYFUVZMaQU=";
        stringArray2[570] = "QEJETkZEVQVRRkBJQFYISlFQZAU=";
        stringArray2[571] = "QUpNUUBIBUtMSk9AVwVRRkBJQHYF";
        stringArray2[572] = "TkpKTUdAUgVVUAVRQHYF";
        stringArray2[573] = "QExOSkpGBURMUwVLTEJKaQU=";
        stringArray2[574] = "QUpNUUBIBU5GQE1GBVZQUURRVgVRRkBJQHYF";
        stringArray2[575] = "VkdEUQVdSklHSlcFSUlEBUtAVWoF";
        stringArray2[576] = "eBUUfg==";
        stringArray2[577] = "UUtQSkZGRAVAQktETUYISlFQRAVASUJCSnEF";
        stringArray2[578] = "eBQUfg==";
        stringArray2[579] = "VkJLTFFRQFYFXERJQGEF";
        stringArray2[580] = "eBcUfg==";
        stringArray2[581] = "XUpJR0pXBVFQSkJKaQU=";
        stringArray2[582] = "eBYUfg==";
        stringArray2[583] = "QExOSkpGBUtMQkpJBV1MYwU=";
        stringArray2[584] = "eBEUfg==";
        stringArray2[585] = "QExOSkpGBVFXSlVdYAU=";
        stringArray2[586] = "eBAUfg==";
        stringArray2[587] = "XUxDQFdVBUBCRE5GRFUFUUxBYAU=";
        stringArray2[588] = "eBMUfg==";
        stringArray2[589] = "TkZKSUcFSlFQRAVASUJCSnEF";
        stringArray2[590] = "eBIUfg==";
        stringArray2[591] = "SUpKUQVCTENLSmYF";
        stringArray2[592] = "eB0Ufg==";
        stringArray2[593] = "DERRSUBhDQVAUVBGQF1gBUpRUGQFXEkFS0RQdAU=";
        stringArray2[594] = "eBwUfg==";
        stringArray2[595] = "VkBCRE5GRFUFXUpJR0p3BUFBRAhKUVBkBQMFS0RGdgU=";
        stringArray2[596] = "eBUXfg==";
        stringArray2[597] = "QEJETkZEVQVAU0pIQHcF";
        stringArray2[598] = "eBQXfg==";
        stringArray2[599] = "YWwFQEZESXUFUUB2BQ==";
        stringArray2[600] = "eBcXfg==";
        stringArray2[601] = "UFAFTEpxBQoFQkRpBV1MYwU=";
        stringArray2[602] = "eBYXfg==";
        stringArray2[603] = "DEtAQFdGdkBRTE1yCkBIRGJKaw0FTkZATUYFS0RMQgVMSk1RBVFAdgU=";
        stringArray2[604] = "eBEXfg==";
        stringArray2[605] = "V0BTV0B2BXVscwVLTEpv";
        stringArray2[606] = "eBAXfg==";
        stringArray2[607] = "QEJETkZEVQVCS1BRBWFsQEZESXUFUUB2BQ==";
        stringArray2[608] = "eBMXfg==";
        stringArray2[609] = "DFFATFEFTE1GDQVWUFFEUXYFQlBHQGEF";
        stringArray2[610] = "UUxdYA==";
        stringArray2[611] = "GBgYBVdAU1dAdgV1bHMFS0xKbwUYGBg=";
        stringArray2[612] = "H0xEUQVLQExNBUBBSkYFdWxz";
        stringArray2[613] = "QEFKRgpOS0xJBVdAU1dAdgV1bHMFUUB2BQ==";
        stringArray2[614] = "QEJETkZEVQVCS1BRBUpNRgVAQUpGBXVscwVRQHYF";
        stringArray2[615] = "DFZAQkRORkRVBURGBVFEUQ0FXERCSwVXQFNXQHYFdWxzBUtMSm8F";
        stringArray2[616] = "QEJETkZEVQUUBUpNRgVXQFNXQHYFdWxzBUtMSm8F";
        stringArray2[617] = "QEFKRgV1bHMFREp9BQ==";
        stringArray2[618] = "V0BTV0B2GEBVXFEDCwsLREQUEhQTExQYQEFKRhpAV0RNVgpISkYLXUpJR0pXC1JSUgoKH1ZVUVFNBR9QQQVMcw==";
        stringArray2[619] = "FBAQQRxBEkdHEh1EFBxDREARFh0UREAUREQUEhQTExQFH0ZESm0=";
        stringArray2[620] = "BR9AQUpGBXVscwVQUEkFRGE=";
        stringArray2[621] = "BFFQVUtMBVBRBUBBSkYFRkpQQQVAVldEVQVCS0pNbg==";
        stringArray2[622] = "H0BCRE5GRFUFQktQUQVKTUYFQEFKRgV1bHMFUUB2";
        stringArray2[623] = "BUpNRgVAQUpGCk5LTEkFdWxzBVVETWs=";
        stringArray2[624] = "C0BBSkZ6V0BTV0BWelVMUw==";
        stringArray2[625] = "BUpNRgVAQUpGBXVscwVQUEkFRGE=";
        stringArray2[626] = "BEBBSkYFRkpQQQVAVldEVQVCS0pNbg==";
        stringArray2[627] = "BEBBSkYFdWxzBUpGBUJLSk1u";
        stringArray2[628] = "BVdKQwV1bHMFQktMS0xKbwUbCA==";
        stringArray2[629] = "BUpNRgVAQUpGBXVscwVKRgVEUE1m";
        stringArray2[630] = "C1ZAQUpGBXVscwVERgVRRFEFREpdBURh";
        stringArray2[631] = "GBgYBUBCRE5GRFUFQktQUQVhbEBGREl1BVFAdgUYGBg=";
        stringArray2[632] = "DERGBVFEUQVKTUYNBWFsQEZESXUFSURHSkliBVFAdgU=";
        stringArray2[633] = "BRgFQUx6QEZESVUFSURHSklCBVBQSQVEYQ==";
        stringArray2[634] = "BEBJBVVKTQVCS0pNTgVhbEBGREl1";
        stringArray2[635] = "BUpNRgVhbEBGREl1BVVETWs=";
        stringArray2[636] = "HwxJREdKSUIFQktQQQUJSEpRVlBGBURKXQVAQQVXQFFLYA0F";
        stringArray2[637] = "C0FMekBGRElV";
        stringArray2[638] = "BUpNRgVhbEBGREl1BUhKUVZQRgVESl0FRGE=";
        stringArray2[639] = "DElER0pJQgVCS1BBBUBWDQU=";
        stringArray2[640] = "C0FMekBGRElVBVBQSQVEYQ==";
        stringArray2[641] = "DFFATFEFTE1GDQV2cHFkcXYFYnBnYGE=";
        stringArray2[642] = "BRgYGA==";
        stringArray2[643] = "H1ZQUURRdg==";
        stringArray2[644] = "H0FAVlBGSmM=";
        stringArray2[645] = "BUpDS0xIQEgFVlxWVUhQQQ==";
        stringArray2[646] = "FAgFQURATQVZBQJ2dnUFaWRxanECBVVAV0IFWQVJSVBLClNAQQobFwU=";
        stringArray2[647] = "H0BITFFVcA==";
        stringArray2[648] = "GEFMVQgIBRAFUQgFQQgFUURGQkpJ";
        stringArray2[649] = "H1ZCSkkFUVZEaQ==";
        stringArray2[650] = "FggFSUxEUQVZBQJRS1BKRkZEBUBIRFZZS0pWREBXDwtRRkBLS0pGVkxBWUtKTFFGQEtLSkYFUVZKaVlBQE5GTE4CBWBMCAVVQFdCBVkFSUlQSwpTQEEKGxcF";
        stringArray2[651] = "H1ZJREtCTFYFTkZMbg==";
        stringArray2[652] = "H0JMQ0tKZg==";
        stringArray2[653] = "GBgYBWhgcXZ8dgUYGBg=";
        stringArray2[654] = "H0FESmkFcHVm";
        stringArray2[655] = "H1xXQFFRRGc=";
        stringArray2[656] = "GBgYBVBwBUxKcQUKBUJEaQVdTGMFGBgY";
        stringArray2[657] = "DAsLC1dAQUtAVwVwdWIFCUtKTFFESExLRAVRRFENBVFEUFYFUEBMTQVQUAVMSnEF";
        stringArray2[658] = "XUpJR0p3BUBNRkRGBURKfQU=";
        stringArray2[659] = "DGhkdwVIRExCDQVWVVVEBUFLUEpXQk5GREcFSUlMbgU=";
        stringArray2[660] = "DFxXQFFRREcFS0xEV0EFSERMQg0FS0xVBVBQBUxKcQU=";
        stringArray2[661] = "DEJLREsFQkRJBUhETEINBUxETEIFS0RNVQVKQQVEbQU=";
        stringArray2[662] = "RkpCBUxETEIFS0RNVQVKQQVGUE1VBUxKTW4F";
        stringArray2[663] = "DBEOFg4XDhQNBWBraghrbAhpaWQF";
        stringArray2[664] = "CwsLUURQVgVQQExNBVBQBUxKUQVCS0Rh";
        stringArray2[665] = "C0FAUURXQElARkZEBXB1YgUJFRhLSkxRREhMS2QFBFFEUFYFUEBMTQVQUAVMSlEFRGE=";
        stringArray2[666] = "CwsLXUpJR0p3BUBNRkRGBURKXQVCS0Rh";
        stringArray2[667] = "CkRRREEKRFFEQQoFQ1cIBUhX";
        stringArray2[668] = "DwpATUZERnpAQUpGCg==";
        stringArray2[669] = "DwpATUZEZnB1YgpRSVBEQ0BhClJATFNHQFJ6VVVECg==";
        stringArray2[670] = "DwpATUZERnpBQFZWQFdVSEpGQEF6SF1HV3pEUUoKVkBJTEMK";
        stringArray2[671] = "BR9ATUZERgVBQFdEQElm";
        stringArray2[672] = "BEBNRkRGBURKXQVEYQ==";
        stringArray2[673] = "CwsLVlVVRAVBS1BKV0JORkRHBUlJTE4FQktEYQ==";
        stringArray2[674] = "BFZVVUQFQUtQSldCTkZERwVJSUxOBURh";
        stringArray2[675] = "CwsLS0xVBVBQBUxKUQVCS0Rh";
        stringArray2[676] = "C2Njahh2dWIFCWNjahhGS1xWCEpRUEQFCRUQGFZWQEtRTUJMV2cFBEtMVQVQUAVMSlEFRGE=";
        stringArray2[677] = "C0tERgVMTU4FTERJBVFERwUJUURRBURBBUZLXFYFRFMFdnViBR9cBVBQaQ==";
        stringArray2[678] = "CwsLTERMQgVLRE1VBUpBBURt";
        stringArray2[679] = "BR9MRFEFS0BMbQ==";
        stringArray2[680] = "C0tKTQVRSlBIBUBWBUBIRGIFBExETEIFS0RNVQVKQQVETQVEYQ==";
        stringArray2[681] = "C0ZKQgVMRExCBUtETVUFSkEFRlBNVQVMSk1OBURh";
        stringArray2[682] = "GBgYBUtKTFFEX0xITFFVagVga2oIa2wIaWlkBRgYGA==";
        stringArray2[683] = "a2oFcHViBQljY2oFS0pMUURITEtkBXgRChR+";
        stringArray2[684] = "CkRRREEKRFFEQQoFDwpATUZERgo=";
        stringArray2[685] = "CkRRREEKQUxKV0FLZApBV0RGQVYKBQ8KQE1GREZ6QEFKRgo=";
        stringArray2[686] = "QUBXREBJRgVATUZEZgV4EQoXfg==";
        stringArray2[687] = "QUBJSUxOBVZVVUQFQUtQSldCTkZEZwV4EQoWfg==";
        stringArray2[688] = "QUBfTEhMUVVKBVxXQFFRRGcFeBEKEX4=";
        stringArray2[689] = "C1BATE1LBUtKTQVRSlBIBUBWBUBIRGIFBGBramEFYGtqCGtsCGlpZA==";
        stringArray2[690] = "BUpNRgVQVgVCS0RHBVxETUYFQktEQQVLTEpPQFcFSlFQZA==";
        stringArray2[691] = "C0JLUEEFQEEFZg5JV1FmBQtHRFEKVVVEBQ==";
        stringArray2[692] = "BR9AQUpo";
        stringArray2[693] = "BR9JSUxOBVxXUUBXBV1EaAVZBQ==";
        stringArray2[694] = "CwxKRwVLREpRBVFERkJKSQVXREBJRgVCS0pNTg0FQktMV0BRSUxDBVFERkJKSQVBTFUIV0BVBUJLUEEFUHYFHxNz";
        stringArray2[695] = "BR9LUkpBSUpKRgVLTEpPQHc=";
        stringArray2[696] = "BR9RUEpASExRBUBIRGJKawVZBVY=";
        stringArray2[697] = "BR9cRElAYQVZBVY=";
        stringArray2[698] = "H1dAVnAFWQUM";
        stringArray2[699] = "GERQSQ0FbmofcXZkYwVZBQw=";
        stringArray2[700] = "YWtwandiYHdqYwUbCAUMSkJEBVY=";
        stringArray2[701] = "FgVLCAVJTERRBVkFAklETVZXRGhLSkxRRktQY1lXQFdQQkxDS0pmTUZRRHVJQEFKaERRRGFZV0pXV2BARkRXcVFATkZKdkdAcllXSlFERkxJVUB3WUFAUVdEUXZASERiS0pZUUtQSkZGRAVASERWWUtKTFFGQEtLSkYFUVZKSVlRRkBLS0pGVkxBWUFATkZMTgIFYEwIBVVAV0IFWQVJSVBLClNAQQobFwU=";
        stringArray2[702] = "GEFMVQgIBXFkZmJqaX4=";
        stringArray2[703] = "C1FLUEpGBVxXUUBXBVFAVkB3BQRCS0pGBU1LRE1RBUBIREIFSkRTBURhBR8=";
        stringArray2[704] = "CwsLQktKXQVBREpJBUBIREIFTEphBQsMQFNMUUZEBVFEQEdRV0RATQVEUGkNBWJrbGFkamkFQktEQQVASERiBR8=";
        stringArray2[705] = "GwVORlBRVgVLQEBXRlYFQFFMTXI=";
        stringArray2[706] = "DFYVHAVMSkEFQktKTU4NBXxkYmsFaWlsbgUEYWBxZmBxYGEF";
        stringArray2[707] = "DQVRS0BWBUtMSk9AdwUbCA==";
        stringArray2[708] = "BUxKYQULDA==";
        stringArray2[709] = "CwsLVg==";
        stringArray2[710] = "DQUPDw==";
        stringArray2[711] = "BR9QTVEFS0RpLww=";
        stringArray2[712] = "BR9KQQVcaS8=";
        stringArray2[713] = "AklETVZXRGhLSkxRRktQY1lXQFdQQkxDS0pmTUZRRHVJQEFKaERRRGFZV0pXV2BARkRXcVFATkZKdkdAcllBQFFEQFdGBVdKUURGTElVQHdZQUBRV0RRdkBIRGJLSgIFYEwIBVVAV0IFWQU=";
        stringArray2[714] = "BEJLSl0FQURKSQVASERiBRsI";
        stringArray2[715] = "BXBtcQVkYQUf";
        stringArray2[716] = "C0RQVAVKZwULS0RJBQ==";
        stringArray2[717] = "BURBBWBoZGJ6amt6YWtwandiYHdqYwUf";
        stringArray2[718] = "DQULCwtEUURBBVVETVEFUE1xBQtW";
        stringArray2[719] = "DE5GQE1GBVVAQEEFRkpQV1EFTERJBUtKRgVW";
        stringArray2[720] = "CwsLQUpNUUBIBRYFbmZgbWYFdWBgYQULVg==";
        stringArray2[721] = "FgVLCAVJTERRBVkFAlFGQEtLSkZWTEECBVMIBVVAV0IFWQUCV0BBTFNKV3VRQFZWZFlJRE1WV0RoS0pMUUZLUGNZV0BXUEJMQ0tKZk1GUUR1SUBBSmhEUURhWVdKV1dgQEZEV3FRQE5GSnZHQHJZS0pMVlZAdkBGS0BMV0BVXWBZQUBRREBXRgVXSlFERkxJVUB3WUFAUVdEUXZASERiS0oCBWBMCAVVQFdCBVkF";
        stringArray2[722] = "FgVLCAVJTERRBVkFAlFLUEpGRkQFQEhEVllLSkxRRkBLS0pGBVFWSklZUUZAS0tKRlZMQVlBQE5GTE4CBWBMCAVVQFdCBVkF";
        stringArray2[723] = "C2lpbG4FYmtqbW4FC25qBUBIREIFSkRHBUFKTVFASAVKZgUfbmZgbWYFdWBgYQUbCA==";
        stringArray2[724] = "DQVAQQVLRFMFSkYFaHdsY2tqZgVuZmBtZgV1YGBhBR8=";
        stringArray2[725] = "DQVrbGpvYHcFRFMFaWlsbgULDA==";
        stringArray2[726] = "BUxKYQULUUtAVgVLTEpPQHcFGwg=";
        stringArray2[727] = "CwsLQURKSQVASERCBUpNRgVW";
        stringArray2[728] = "BVBNUQVEYS8M";
        stringArray2[729] = "BEJLSkYFUE1RBURXUQVIQExOBUtEZgULS0RJBQ==";
        stringArray2[730] = "CwsLRFBLBUJLSlMFFAVIQE1RBUxKYQULRFFEQQVQQQVCS0pNbgUfbmZgbWYFdWBgYQUbCA==";
        stringArray2[731] = "CwsLVhAUBUxKYQULQEZMU1dAdlFXSlVASUBxBUJLREcFS0xKT0BXBVBRBUJLREEFUVVMV0ZWBURQaQUf";
        stringArray2[732] = "CwsLS0xKT0BXBQ4FSUlMTgVAVgVWUU4LS0xEaAULDEJLTEtMSk9AVwVCS0RBBUtEUw0FaWxkYwVLTEpPQFcFRFBpBRsI";
        stringArray2[733] = "C0xESQVcRE1GBUJLREEFQEhEYgUEYmtqZgVta2RtcQVLTEpPQFcFRFBpBRsI";
        stringArray2[734] = "BVVKUVYIQEZXSmMFGwg=";
        stringArray2[735] = "GEFMVQ0FS0xKT0BXBUxNTgVGSlBXUQU=";
        stringArray2[736] = "BUtMSk9AdwVCS0Rh";
        stringArray2[737] = "BR9hbHAFWQUM";
        stringArray2[738] = "BR9hbGIFWQU=";
        stringArray2[739] = "BR9KQQVcaQVZBQ==";
        stringArray2[740] = "BURBBUxKUQVMSmEFGwg=";
        stringArray2[741] = "CwsLTERJBUlJTE4FQEEFUUxEUgVRREJrBQRISlYFVVBVSlUFYmtzBUtATE0FUURNdQUbCA==";
        stringArray2[742] = "BEhKVgVCS0pdBUFESkkFQEhEYgUbCA==";
        stringArray2[743] = "C0JQR0BBBUBBBVFERkJKSQVQTEIFCUJLSl0FQURKSQVEUE1GBUBIRGIFGwg=";
        stringArray2[744] = "BUhATVEFTEphBR9rcmphaWpqZgUbCA==";
        stringArray2[745] = "BUxESQVLTEpPQFcFTE1OBUZKUFdRBVY=";
        stringArray2[746] = "BU1GTE1S";
        stringArray2[747] = "BVMIBUFLREhISkYFWVkFSUlQSwpTQEEKGxcF";
        stringArray2[748] = "AgVcRE1RBUhMUQVCS0pNbgV4BH4=";
        stringArray2[749] = "AgVAQkRORkRVBVFEQQVMREYFS0RGBRsIBQI=";
        stringArray2[750] = "BR9RREEFTERGBUJLSkEFUFEFQktEYQV4D34=";
        stringArray2[751] = "BUlJRFFWS0wFQk5VBQMDBUBRREFVUAVCTlUNBQUFBQ==";
        stringArray2[752] = "DFwIBQ==";
        stringArray2[753] = "BR9CS0pGBU1LRE1RBVFEQQVMREYFRGEFeG5qfg==";
        stringArray2[754] = "GFFMXUANBUxKSQVKRgVRREEFTERmBXgEfg==";
        stringArray2[755] = "BUlJRFFWS0wFQk5VBR9CS0pGBVBNUQVcRE1GBVBNcQULDA==";
        stringArray2[756] = "BR9JSURRVktMBUJOVQVcRE1GBUxNTgVMSmkFeAR+";
        stringArray2[757] = "BUlJRFFWS0wFQk5VBR9CS0pGBVBNUQVcRE1GBVBNcQUFBQU=";
        stringArray2[758] = "C0JLRFYFS0RWBURBBVZATEZLQEFLQFVAQQVERgVRRHEFeG5qfg==";
        stringArray2[759] = "CwsLDEtAQFdGdgVRTElVdgUKBUhXSkNAQFdjDQVSSkFLTHIITFFJUGgFQktESwVNS0xRBVFERwVCS0RhBXgPfg==";
        stringArray2[760] = "BFFXSlVVUFYFUkpBS0xyCExRSVBoBVFERwVEYQV4bmp+";
        stringArray2[761] = "BEJLUEEFVUQFQEEFTERKTVEFS0BMQQpKRAVcREgFDFFXRFFWQHcNBWxkaQVia2phBWxqbW4FS0RGBUtEZwUffAVwcGkFeAR+";
        stringArray2[762] = "CwJIV0pDQEBXYwIFRkRKTQUCS0BAV0Z2BVFMSVV2AgVLSk1GBUBBBUhATE1LBURBBU1LTFdRBUJLSldRBVVVRAVCS0pQUQVQQExHBVBMQgVLRE1LBUBNUQVKRgVLREcFCVFXRFFWQFcFTE1OBVBEdg==";
        stringArray2[763] = "C0JLSkYFUE1RBVVETUsFRkRKTQUQFAVGUEgFSgVdTENAV1UFRFBWBVxEbQULQEJETkZEVQVcRE1RBUhMUQVCS0pNbg==";
        stringArray2[764] = "GBgYBUBCRE5GRHUFUUZASUB2BRgYGA==";
        stringArray2[765] = "H0JLUEEFTUZEZg==";
        stringArray2[766] = "BUBBBUpWBVVETWsFBQ==";
        stringArray2[767] = "aGBtcQ==";
        stringArray2[768] = "DBYJFwkUBR9BUw0FQEJETkZEVQU=";
        stringArray2[769] = "BVVETWsFBQ==";
        stringArray2[770] = "BUBBBQ==";
        stringArray2[771] = "DBYICRQIBR9BUw0FQEJETkZEVQU=";
        stringArray2[772] = "QEJETkZEVQVLQFE=";
        stringArray2[773] = "DFVVRAtASVVIRF1AC0hKRgUfQVMNBVVATFEFRlBXUQU=";
        stringArray2[774] = "REYFUURRBUtKTUYFQEEF";
        stringArray2[775] = "DQVWQEJETkZEVQVBQFFGQElAdg==";
        stringArray2[776] = "C0BCRE5GRFUFXERNUQVITFEFQktKTW4=";
        stringArray2[777] = "BR9BQFFGQElAVghKUVBk";
        stringArray2[778] = "GBgYBUFKTVFAaAVLTEpPQHcFUUZASUB2BRgYGA==";
        stringArray2[779] = "BUBCRE5GRFV6TktMSVVAQEEF";
        stringArray2[780] = "DFFXRFFWClZARktATFdAVV1ACgofXUpJR0pXDQ==";
        stringArray2[781] = "BVFATkZMUXpNUVBEBQ==";
        stringArray2[782] = "DE5LTElVQEBBBQ4FUUBORkxxBU1RUGQFDgVjd3ZmDQ==";
        stringArray2[783] = "BRgFQUpNUUBIektMSk8FQUBTRHY=";
        stringArray2[784] = "C0FAU0RWBU5KSk1HQHI=";
        stringArray2[785] = "UkpBS0xSBQoFQ0pBTFUFCgVBQEtMR0hKRg==";
        stringArray2[786] = "GEBCRE5GRFV6QEJLRE1GekpRUEQ=";
        stringArray2[787] = "GE5GSklHekpRUEQ=";
        stringArray2[788] = "CwsLVkBCRE5GRFUFREYFUURRBUtERlYFQktEYQ==";
        stringArray2[789] = "BEpESwVdSklHSncFQEJETkZEVQVcRE1RBUhMUQVCS0pNbg==";
        stringArray2[790] = "BVxETVEFSExx";
        stringArray2[791] = "H11KSUdKdwVAQkRORkRVBQ==";
        stringArray2[792] = "FAgFQURATQVZBUBIRGtLSkxWV0BTBVVAV0IFWQU=";
        stringArray2[793] = "BVBQSQVEYQ==";
        stringArray2[794] = "BEJMQ0tKRgVKRFMFVkBCRE5GRFUF";
        stringArray2[795] = "C1ZAQkRORkRVekFAUUZASUBWBUJLSldRBUpESwVAQkRORkRVBUpGBURQTWY=";
        stringArray2[796] = "H0xEUQVLQExNBVZAQkRORkR1";
        stringArray2[797] = "C0JMQ0tKRgVMSk1OBVZAQkRORkRVBVFATQVESl0FRGE=";
        stringArray2[798] = "BR9MRFEFS0BMTQVhbAVARkRJdQ==";
        stringArray2[799] = "BRgFQUx6QEZESVUFUFBJBURh";
        stringArray2[800] = "GBgYBU5GQE1GBUtETEIFTEpNUQVRREEFTERmBRgYGA==";
        stringArray2[801] = "H0xEUQVLQExNBVFQSkBITFEFQEhEYkpr";
        stringArray2[802] = "DEFKTVFASAUWBU5GQE1GBVVAQEEFTE1OBUZKUFdRBUpNRgVLRExCBUxKTVENBVY=";
        stringArray2[803] = "H0xEUQVLQExNBVFQSkBITFEFS0BAV0Z2QFFMTXI=";
        stringArray2[804] = "DElJTE4FTE1OBUZKUFdRBUtAQFdGVgVAUUxNUgVLRExCBUxKTVENBVY=";
        stringArray2[805] = "BRgFVkFLSkZAVnpRUEpASExRekBIREJ6SksFUFBJBURh";
        stringArray2[806] = "DBUVFggQDQVASQVVSk0FQktKTU4FTFdRBURMYg==";
        stringArray2[807] = "BRgFVkFLSkZAVnpRUEpASExRektAQFdGVnpAUUxNUgVQUEkFRGE=";
        String[] stringArray3 = stringArray2;
        int cfr_ignored_0 = stringArray3.length;
        String[] stringArray4 = new String[808];
        for (int i2 = 0; i2 < 808; ++i2) {
            int n2;
            String[] stringArray5;
            Object object;
            int n3;
            int n4 = n3 = i2;
            String[] stringArray6 = stringArray4;
            try {
                object = z.oO0000(Base64.getDecoder().decode(stringArray3[n3]));
                int n5 = ((Object)object).length;
                int n6 = n4;
                String[] stringArray7 = stringArray6;
                for (int i3 = 0; i3 < n5; ++i3) {
                    object[i3] = (byte)(object[i3] ^ 0x25);
                }
                stringArray5 = stringArray7;
                n2 = n6;
                object = new String((byte[])object, fb.\u00d300000);
            }
            catch (Exception exception) {
                stringArray5 = stringArray6;
                n2 = n4;
                object = stringArray3[n3];
            }
            stringArray5[n2] = object;
        }
        return stringArray4;
    }

    private static final void \u00d300000() {
        try {
            Object object2;
            Object object3 = new File("/proc/self/status");
            if (((File)object3).exists() && (object3 = kb.super(new kb("TracerPid:\\\\s+(\\\\d+)"), b.l.f.\u00d500000((File)object3, null, 1, null), 0, 2, null)) != null && !fc.o00000(object3.\u00d600000().get(1), (Object)"0")) {
                Runtime.getRuntime().halt(0);
            }
            try {
                boolean bl;
                object2 = Class.forName("java.lang.management.ManagementFactory").getMethod("getRuntimeMXBean", new Class[0]).invoke(null, new Object[0]);
                Iterable object4 = (List)object2.getClass().getMethod("getInputArguments", new Class[0]).invoke(object2, new Object[0]);
                if (!(object4 instanceof Collection) || !((Collection)object4).isEmpty()) {
                    for (Object object4 : object4) {
                        if (!(b.q.f.\u00d300000((CharSequence)String.valueOf(object4), (CharSequence)"jdwp", false, 2, null) || b.q.f.\u00d300000((CharSequence)String.valueOf(object4), (CharSequence)"agentlib", false, 2, null))) continue;
                        bl = true;
                        break;
                    }
                } else {
                    bl = false;
                }
                if (bl) {
                    Runtime.getRuntime().halt(0);
                }
            }
            catch (Exception exception) {}
            String[] stringArray = new String[6];
            object2 = stringArray;
            stringArray[0] = "JADX";
            object2[1] = "JEB";
            object2[2] = "GHIDRA";
            object2[3] = "IDA";
            object2[4] = "FRIDA_";
            object2[5] = "XPOSED";
            object3 = mc.new((Object[])object2);
            for (String string : System.getenv().keySet()) {
                boolean bl;
                Object object = (Iterable)object3;
                if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
                    object = object.iterator();
                    while (object.hasNext()) {
                        Object object4;
                        object4 = (String)object.next();
                        if (!b.q.f.\u00d300000((CharSequence)string.toUpperCase(Locale.ROOT), (CharSequence)object4, false, 2, null)) continue;
                        bl = true;
                        break;
                    }
                } else {
                    bl = false;
                }
                if (!bl) continue;
                Runtime.getRuntime().halt(0);
            }
        }
        catch (Exception exception) {}
    }

    private static void o00000(String object, String string, String object2, int n2, String string2) {
        if (b.q.f.\u00f800000((CharSequence)object)) {
            return;
        }
        try {
            object = (HttpURLConnection)new URL((String)object).openConnection();
            ((HttpURLConnection)object).setRequestMethod(MainKt.o00000(103));
            ((URLConnection)object).setDoOutput(true);
            ((URLConnection)object).setRequestProperty(MainKt.o00000(109), MainKt.o00000(110));
            string = b.q.f.super(b.q.f.super(string, "\"", MainKt.o00000(112), false, 4, null), "\n", MainKt.o00000(113), false, 4, null);
            object2 = b.q.f.super(b.q.f.super((String)object2, "\"", MainKt.o00000(112), false, 4, null), "\n", MainKt.o00000(113), false, 4, null);
            string = b.q.f.\u00d400000("\n            {\n              \"embeds\": [{\n                \"title\": \"" + string + "\",\n                \"description\": \"" + (String)object2 + "\",\n                \"color\": " + n2 + ",\n                \"fields\": " + string2 + "\n              }]\n            }\n        ");
            object2 = ((URLConnection)object).getOutputStream();
            Throwable throwable = null;
            try {
                ((OutputStream)object2).write(string.getBytes(fb.\u00d300000));
            }
            catch (Throwable throwable2) {
                try {
                    object = throwable2;
                    throwable = throwable2;
                    throw object;
                }
                catch (Throwable throwable3) {
                    o.o00000((Closeable)object2, throwable);
                    throw throwable3;
                }
            }
            o.o00000((Closeable)object2, null);
            object2 = ((URLConnection)object).getInputStream();
            throwable = null;
            try {
                b.l.b.o00000((InputStream)object2);
            }
            catch (Throwable throwable4) {
                try {
                    object = throwable4;
                    throwable = throwable4;
                    throw object;
                }
                catch (Throwable throwable5) {
                    o.o00000((Closeable)object2, throwable);
                    throw throwable5;
                }
            }
            o.o00000((Closeable)object2, null);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static /* synthetic */ void o00000(String string, String string2, String string3, int n2) {
        String string4 = "[]";
        MainKt.o00000(string, string2, string3, n2, string4);
    }

    private static void o00000(String string, String string2, String charSequence, String string3) {
        MainKt.\u00f8o0000(string);
        MainKt.\u00d5O0000(string);
        MainKt.\u00d4O0000(MainKt.o00000(417) + string);
        Thread.sleep(2000L);
        MainKt.\u00d4O0000(MainKt.o00000(418) + string + MainKt.o00000(419) + string + MainKt.o00000(420));
        boolean bl = false;
        CharSequence charSequence2 = MainKt.o00000(429) + string2 + (!b.q.f.\u00f800000(string3) ? "&gameInstanceId=" + URLEncoder.encode(string3, "UTF-8") : "");
        System.out.println((Object)MainKt.o00000(119));
        if (MainKt.\u00d4O0000((String)new StringBuilder().append((String)MainKt.o00000((int)424)).append((String)MainKt.\u00f500000((String)charSequence2)).append((String)MainKt.o00000((int)425)).append((String)string).toString()).\u00d200000) {
            bl = true;
        }
        if (!bl || fc.o00000((Object)charSequence, (Object)MainKt.o00000(120))) {
            Object object;
            Object object2;
            charSequence = string;
            charSequence = MainKt.o00000(347) + charSequence + MainKt.o00000(353);
            charSequence2 = MainKt.o00000(49);
            charSequence2 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.return() + MainKt.o00000(354) + MainKt.\u00f500000(charSequence) + ' ' + MainKt.\u00f500000(charSequence2) + MainKt.o00000(326)))).toString();
            if (b.q.f.\u00d400000(charSequence2, (CharSequence)MainKt.o00000(50), true)) {
                object2 = charSequence2;
            } else {
                charSequence = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(323) + MainKt.\u00f500000(charSequence) + MainKt.o00000(362)))).toString();
                object2 = kb.super(new kb("(_\\|WARNING:-DO-NOT-SHARE-THIS[^|]*\\|[^/]*)"), charSequence, 0, 2, null);
                if (object2 == null || (object2 = object2.super()) == null) {
                    object2 = charSequence2 = "";
                }
            }
            if (b.q.f.\u00f800000((CharSequence)object2)) {
                object = new File(MainKt.o00000(121));
                charSequence2 = ((File)object).exists() ? ((Object)b.q.f.\u00f400000(b.l.f.\u00d300000((File)object, fb.\u00d300000))).toString() : "";
            }
            if (!b.q.f.\u00f800000(charSequence2) && !((charSequence = (CharSequence)(object = MainKt.\u00d500000(charSequence2))) == null || b.q.f.\u00f800000(charSequence)) && !((charSequence2 = (CharSequence)(charSequence = MainKt.o00000(charSequence2, (String)object, string2))) == null || b.q.f.\u00f800000(charSequence2))) {
                charSequence2 = MainKt.o00000(429) + string2 + MainKt.o00000(430) + charSequence + (!b.q.f.\u00f800000(string3) ? MainKt.o00000(431) + URLEncoder.encode(string3, "UTF-8") : "");
                System.out.println((Object)MainKt.o00000(122));
                if (System.nanoTime() < 0L) {
                    charSequence = String.valueOf(Math.random());
                    System.out.println(charSequence);
                }
                if (MainKt.\u00d4O0000((String)new StringBuilder().append((String)MainKt.o00000((int)424)).append((String)MainKt.\u00f500000((String)charSequence2)).append((String)MainKt.o00000((int)425)).append((String)string).toString()).\u00d200000) {
                    bl = true;
                }
            }
        }
        if (!bl) {
            charSequence2 = MainKt.o00000(432) + string2;
            System.out.println((Object)MainKt.o00000(123));
            if (fc.o00000((Object)System.getenv("LO1OLLLIO"), (Object)"l10OI01O0I1lI0l11")) {
                Runtime.getRuntime().halt(3);
            }
            if (MainKt.\u00d4O0000((String)new StringBuilder().append((String)MainKt.o00000((int)424)).append((String)MainKt.\u00f500000((String)charSequence2)).append((String)MainKt.o00000((int)425)).append((String)string).toString()).\u00d200000) {
                bl = true;
            }
        }
        if (!bl) {
            System.out.println((Object)MainKt.o00000(124));
            MainKt.\u00d4O0000(MainKt.o00000(433) + string + MainKt.o00000(434));
        }
        System.out.println((Object)(MainKt.o00000(435) + string + MainKt.o00000(427)));
        if ((System.currentTimeMillis() & 0L) != 0L) {
            Thread.sleep(858L);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static final void main(String[] var0) {
        block158: {
            MainKt.\u00d300000();
            var1_2 = var0 = new Thread((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, \u00d800000(), ()V)());
            var0.setDaemon(true);
            var1_2.setName("gc-monitor");
            var0.start();
            try {
                v0 = new c().getClass().getProtectionDomain();
                if (v0 == null || (v0 = v0.getCodeSource()) == null || (v0 = v0.getLocation()) == null || (v0 = v0.toURI()) == null) break block158;
                if ((v0 = v0.getPath()) == null || !(var1_2 = new File((String)(var0 = v0))).exists() || var1_2.length() < 1000L) break block158;
                var0 = MessageDigest.getInstance("SHA-256");
                var1_2 = new FileInputStream((File)var1_2);
                var2_6 = null;
                try {
                    var3_21 = (FileInputStream)var1_2;
                    var4_25 = new byte[8192];
                    while (true) {
                        var5_32 = var6_38 = var3_21.read((byte[])var4_25);
                        if (var6_38 == -1) break;
                        var0.update((byte[])var4_25, 0, var5_32);
                    }
                }
                catch (Throwable v1) {
                    try {
                        var0 = v1;
                        var2_6 = v1;
                        throw var0;
                    }
                    catch (Throwable var0_1) {
                        o.o00000((Closeable)var1_2, (Throwable)var2_6);
                        throw var0_1;
                    }
                }
                o.o00000((Closeable)var1_2, null);
                var1_2 = z.o00000(var0.digest(), (CharSequence)"", null, null, 0, null, (b.o.e.g)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, o00000(byte ), (Ljava/lang/Byte;)Ljava/lang/CharSequence;)(), 30, null);
                var2_6 = "a048992ccaf3";
                if (!fc.o00000((Object)"a048992ccaf3", (Object)"a048992ccaf3") && !fc.o00000(var1_2, var2_6)) {
                    System.out.println((Object)"Integrity check failed");
                    Runtime.getRuntime().halt(0);
                }
            }
            catch (Exception v2) {}
        }
        if (Runtime.getRuntime().availableProcessors() < 0) {
            throw new RuntimeException("IlO11ll100101");
        }
        var0 = MainKt.\u00d4O0000("id");
        if (!var0.\u00d200000) {
            System.out.println((Object)(MainKt.\u00f800000 + MainKt.o00000(340) + MainKt.OO0000));
            var1_2 = var0.o00000;
            var1_2 = b.q.f.\u00f800000((CharSequence)var1_2) != false ? var0.\u00d200000 : var1_2;
            System.out.println(var1_2);
            if ((System.currentTimeMillis() & 0L) != 0L) {
                Thread.sleep(963L);
            }
            v3 = false;
        } else {
            System.out.println((Object)(MainKt.if + MainKt.o00000(341) + MainKt.OO0000));
            v3 = true;
        }
        if (!v3) {
            System.exit(1);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
        MainKt.\u00d500000();
        var0 = b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(284))).toString();
        var1_2 = b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(285))).toString();
        if (!fc.o00000(var0, (Object)"1") || !fc.o00000(var1_2, (Object)"1")) {
            System.out.println((Object)(MainKt.return + MainKt.o00000(759) + MainKt.OO0000));
            MainKt.\u00d4O0000(MainKt.o00000(286));
            MainKt.\u00d4O0000(MainKt.o00000(287));
            System.out.println((Object)(MainKt.if + MainKt.o00000(760) + MainKt.OO0000));
            var0 = MainKt.\u00f500000 + MainKt.o00000(761) + MainKt.OO0000;
            System.out.println(var0);
            var0 = MainKt.\u00d300000 + MainKt.o00000(762) + MainKt.OO0000;
            System.out.println(var0);
        }
        while (true) {
            var0 = MainKt.\u00f400000();
            MainKt.\u00d300000((Properties)var0);
            var1_3 = MainKt.oo0000(MainKt.o00000(293));
            System.out.println();
            tmp = -1;
            switch (var1_3.hashCode()) {
                case 1600: {
                    if (var1_3.equals("22")) {
                        tmp = 1;
                    }
                    break;
                }
                case 1601: {
                    if (var1_3.equals("23")) {
                        tmp = 2;
                    }
                    break;
                }
                case 1602: {
                    if (var1_3.equals("24")) {
                        tmp = 3;
                    }
                    break;
                }
                case 1603: {
                    if (var1_3.equals("25")) {
                        tmp = 4;
                    }
                    break;
                }
                case 1604: {
                    if (var1_3.equals("26")) {
                        tmp = 5;
                    }
                    break;
                }
                case 1567: {
                    if (var1_3.equals("10")) {
                        tmp = 6;
                    }
                    break;
                }
                case 1568: {
                    if (var1_3.equals("11")) {
                        tmp = 7;
                    }
                    break;
                }
                case 1569: {
                    if (var1_3.equals("12")) {
                        tmp = 8;
                    }
                    break;
                }
                case 1570: {
                    if (var1_3.equals("13")) {
                        tmp = 9;
                    }
                    break;
                }
                case 1571: {
                    if (var1_3.equals("14")) {
                        tmp = 10;
                    }
                    break;
                }
                case 1572: {
                    if (var1_3.equals("15")) {
                        tmp = 11;
                    }
                    break;
                }
                case 1573: {
                    if (var1_3.equals("16")) {
                        tmp = 12;
                    }
                    break;
                }
                case 1574: {
                    if (var1_3.equals("17")) {
                        tmp = 13;
                    }
                    break;
                }
                case 1575: {
                    if (var1_3.equals("18")) {
                        tmp = 14;
                    }
                    break;
                }
                case 1576: {
                    if (var1_3.equals("19")) {
                        tmp = 15;
                    }
                    break;
                }
                case 48: {
                    if (var1_3.equals("0")) {
                        tmp = 16;
                    }
                    break;
                }
                case 49: {
                    if (var1_3.equals("1")) {
                        tmp = 17;
                    }
                    break;
                }
                case 50: {
                    if (var1_3.equals("2")) {
                        tmp = 18;
                    }
                    break;
                }
                case 51: {
                    if (var1_3.equals("3")) {
                        tmp = 19;
                    }
                    break;
                }
                case 52: {
                    if (var1_3.equals("4")) {
                        tmp = 20;
                    }
                    break;
                }
                case 53: {
                    if (var1_3.equals("5")) {
                        tmp = 21;
                    }
                    break;
                }
                case 54: {
                    if (var1_3.equals("6")) {
                        tmp = 22;
                    }
                    break;
                }
                case 55: {
                    if (var1_3.equals("7")) {
                        tmp = 23;
                    }
                    break;
                }
                case 56: {
                    if (var1_3.equals("8")) {
                        tmp = 24;
                    }
                    break;
                }
                case 57: {
                    if (var1_3.equals("9")) {
                        tmp = 25;
                    }
                    break;
                }
                case 1598: {
                    if (var1_3.equals("20")) {
                        tmp = 26;
                    }
                    break;
                }
                case 1599: {
                    if (var1_3.equals("21")) {
                        tmp = 27;
                    }
                    break;
                }
            }
            switch (tmp) {
                case 17: {
                    MainKt.OO0000((Properties)var0);
                    break;
                }
                case 18: {
                    var1_3 = mc.OO0000((Collection)MainKt.if((Properties)var0));
                    var2_7 = MainKt.\u00d400000((Properties)var0);
                    var3_21 = mc.\u00f4\u00d20000(mc.return((Collection)var1_3, (Iterable)var2_7));
                    if (var3_21.isEmpty()) {
                        var4_25 = MainKt.\u00f800000 + MainKt.o00000(763) + MainKt.OO0000;
                        System.out.println(var4_25);
                    }
                    var4_25 = MainKt.return + MainKt.o00000(764) + MainKt.OO0000;
                    System.out.println(var4_25);
                    v4 = new StringBuilder().append(MainKt.\u00d300000).append("Packages da chon hien tai: ");
                    var4_25 = mc.o00000((Iterable)var1_3, ", ", null, null, 0, null, null, 62, null);
                    if (b.q.f.\u00f800000((CharSequence)var4_25)) {
                        var2_7 = v4;
                        var4_25 = "(chua chon)";
                        v4 = var2_7;
                    }
                    var4_25 = v4.append((String)var4_25).append(MainKt.OO0000).toString();
                    System.out.println(var4_25);
                    System.out.println();
                    if (((Collection)var3_21).isEmpty() == false) {
                        var4_25 = (Iterable)var3_21;
                        var9_50 = 0;
                        var10_59 = var4_25.iterator();
                        while (var10_59.hasNext()) {
                            var2_7 = var10_59.next();
                            if ((var5_32 = var9_50++) < 0) {
                                mc.\u00d800000();
                            }
                            var6_39 = (String)var2_7;
                            var7_42 = var5_32;
                            var4_25 = var1_3.contains(var6_39) != false ? MainKt.if + "[v]" + MainKt.OO0000 : " ";
                            System.out.println((Object)("  [" + (String)var4_25 + "] " + MainKt.if + '[' + (var7_42 + 1) + ']' + MainKt.OO0000 + ' ' + var6_39));
                        }
                    }
                    System.out.println();
                    var4_25 = MainKt.\u00f500000 + MainKt.o00000(765) + MainKt.OO0000;
                    System.out.println(var4_25);
                    var4_25 = MainKt.o00000(766) + MainKt.if + MainKt.o00000(767) + MainKt.OO0000 + MainKt.o00000(768);
                    System.out.println(var4_25);
                    if ((System.currentTimeMillis() & 0L) != 0L) {
                        Thread.sleep(95L);
                    }
                    var4_25 = MainKt.o00000(769) + MainKt.\u00f800000 + "-so" + MainKt.OO0000 + MainKt.o00000(770) + MainKt.\u00f800000 + "XOA" + MainKt.OO0000 + MainKt.o00000(771);
                    System.out.println(var4_25);
                    var4_25 = MainKt.o00000(769) + MainKt.return + MainKt.o00000(772) + MainKt.OO0000 + MainKt.o00000(773);
                    System.out.println(var4_25);
                    var4_25 = MainKt.o00000(769) + MainKt.\u00d800000 + "all" + MainKt.OO0000 + MainKt.o00000(774);
                    System.out.println(var4_25);
                    if (fc.o00000((Object)System.getenv("I00IIL00I"), (Object)"I10OI00O0II1I1l00")) {
                        Runtime.getRuntime().halt(6);
                    }
                    var4_25 = MainKt.o00000(294);
                    System.out.println(var4_25);
                    System.out.println();
                    var4_25 = b.q.f.\u00f400000(MainKt.oo0000(MainKt.o00000(183))).toString();
                    if (b.q.f.\u00f800000((CharSequence)var4_25)) {
                        var8_47 = MainKt.o00000(295);
                        System.out.println(var8_47);
                    } else if (fc.o00000((Object)var4_25.toLowerCase(Locale.ROOT), (Object)MainKt.o00000(296))) {
                        var1_3.clear();
                        Boolean.valueOf(var1_3.addAll((Collection)var3_21));
                    } else {
                        v5 = new String[1];
                        var9_51 = v5;
                        v5[0] = ",";
                        var2_7 = var9_51 = (Iterable)b.q.f.super((CharSequence)var4_25, (String[])var9_51, false, 0, 6, null);
                        var5_33 = new ArrayList<E>(mc.o00000((Iterable)var9_51, 10));
                        var7_43 = var2_7.iterator();
                        while (var7_43.hasNext()) {
                            var9_51 = var7_43.next();
                            var4_25 = (String)var9_51;
                            var2_7 = var5_33;
                            var4_25 = b.q.f.\u00f400000((CharSequence)var4_25).toString();
                            var2_7.add(var4_25);
                        }
                        for (Object var10_59 : (List)var5_33) {
                            if (b.q.f.\u00d300000((String)var10_59, "-", false, 2, null)) {
                                v6 = b.q.f.Objectsuper(b.q.f.\u00d300000((String)var10_59, (CharSequence)"-"));
                                var2_7 = v6 != null ? Integer.valueOf(v6 - 1) : null;
                                if (var2_7 == null) continue;
                                var5_34 = ((Collection)var3_21).size();
                                var6_38 = var2_7.intValue();
                                v7 = var6_38 >= 0 ? var6_38 < var5_34 : false;
                                if (!v7) continue;
                                var1_3.remove(var3_21.get(var2_7.intValue()));
                                continue;
                            }
                            if (b.q.f.\u00d300000((CharSequence)var10_59, (CharSequence)".", false, 2, null)) {
                                if (var1_3.contains(var10_59)) continue;
                                var1_3.add(var10_59);
                                continue;
                            }
                            v8 = b.q.f.Objectsuper((String)var10_59);
                            var2_7 = v8 != null ? Integer.valueOf(v8 - 1) : null;
                            if (var2_7 == null) continue;
                            var5_35 = ((Collection)var3_21).size();
                            var6_38 = var2_7.intValue();
                            v9 = var6_38 >= 0 ? var6_38 < var5_35 : false;
                            if (!v9 || var1_3.contains(var5_36 = (String)var3_21.get(var2_7.intValue()))) continue;
                            var1_3.add(var5_36);
                        }
                    }
                    var8_47 = mc.\u00f4\u00d20000((Iterable)var1_3);
                    var0.setProperty(MainKt.o00000(39), mc.o00000((Iterable)var8_47, ",", null, null, 0, null, null, 62, null));
                    MainKt.\u00f800000((Properties)var0);
                    var9_52 = MainKt.if + MainKt.o00000(775) + var8_47.size() + "):" + MainKt.OO0000;
                    System.out.println(var9_52);
                    var9_52 = (Iterable)var8_47;
                    var2_8 = 0;
                    var5_37 = var9_52.iterator();
                    while (var5_37.hasNext()) {
                        var6_40 = var5_37.next();
                        if ((var7_44 = var2_8++) < 0) {
                            mc.\u00d800000();
                        }
                        var9_52 = (String)var6_40;
                        var4_26 = var7_44;
                        System.out.println((Object)("  " + MainKt.if + '[' + (var4_26 + 1) + ']' + MainKt.OO0000 + ' ' + (String)var9_52));
                    }
                    break;
                }
                case 19: {
                    var1_3 = MainKt.if((Properties)var0);
                    var1_3 = (Iterable)(var1_3.isEmpty() != false ? mc.o00000(MainKt.o00000(44)) : var1_3);
                    var3_22 = 0;
                    var4_25 = var1_3.iterator();
                    while (var4_25.hasNext()) {
                        var8_47 = var4_25.next();
                        if ((var9_53 = var3_22++) < 0) {
                            mc.\u00d800000();
                        }
                        var10_59 = (String)var8_47;
                        var2_9 = var9_53;
                        System.out.println((Object)(MainKt.return + '[' + (var2_9 + 1) + ']' + MainKt.OO0000));
                        var0 = var10_59;
                        v10 = new String[1];
                        var1_3 = v10;
                        v10[0] = "O1O1l";
                        ((String[])var1_3).length;
                        var1_3 = MainKt.OO0000((String)var0);
                        System.out.println((Object)(MainKt.o00000(390) + var1_3.\u00d200000));
                        System.out.println((Object)(MainKt.o00000(391) + var1_3.super));
                        System.out.println((Object)("PID: " + (b.q.f.\u00f800000(var1_3.\u00f400000) != false ? "(none)" : var1_3.\u00f400000)));
                        System.out.println((Object)(MainKt.o00000(392) + var1_3.\u00d200000));
                        System.out.println((Object)(MainKt.o00000(393) + var1_3.class));
                        System.out.println((Object)(MainKt.o00000(394) + var1_3.super));
                        if ((System.currentTimeMillis() & 0L) != 0L) {
                            Thread.sleep(833L);
                        }
                        System.out.println((Object)(MainKt.o00000(395) + var1_3.\u00f400000));
                        System.out.println((Object)(MainKt.o00000(396) + var1_3.\u00d800000));
                        System.out.println((Object)(MainKt.o00000(397) + var1_3.\u00d600000));
                        v11 = new StringBuilder("UserId from log/UI: ");
                        var0 = var1_3.\u00d800000;
                        if (b.q.f.\u00f800000((CharSequence)var0)) {
                            var0 = v11;
                            v12 = "(not found)";
                            v11 = var0;
                        } else {
                            v12 = var0;
                        }
                        System.out.println((Object)v11.append((String)v12).toString());
                        v13 = new StringBuilder("GameId/placeId from log/UI: ");
                        var0 = var1_3.\u00d600000;
                        if (b.q.f.\u00f800000((CharSequence)var0)) {
                            var0 = v13;
                            v14 = "(not found)";
                            v13 = var0;
                        } else {
                            v14 = var0;
                        }
                        System.out.println((Object)v13.append((String)v14).toString());
                        System.out.println();
                    }
                    break;
                }
                case 20: {
                    var1_3 = (String)mc.\u00f5O0000(MainKt.\u00d400000((Properties)var0));
                    if (var1_3 == null) {
                        var2_10 = MainKt.\u00f800000 + MainKt.o00000(776) + MainKt.OO0000;
                        System.out.println((Object)var2_10);
                        break;
                    }
                    var0.setProperty(MainKt.o00000(39), (String)var1_3);
                    MainKt.\u00f800000((Properties)var0);
                    var2_10 = MainKt.if + MainKt.o00000(777) + (String)var1_3 + MainKt.OO0000;
                    System.out.println((Object)var2_10);
                    break;
                }
                case 21: {
                    var1_3 = MainKt.return + MainKt.o00000(778) + MainKt.OO0000;
                    System.out.println(var1_3);
                    if ((System.currentTimeMillis() & 0L) != 0L) {
                        Thread.sleep(778L);
                    }
                    var1_3 = MainKt.if + "[1]" + MainKt.OO0000 + MainKt.o00000(779) + MainKt.\u00d300000 + MainKt.o00000(780) + MainKt.OO0000;
                    System.out.println(var1_3);
                    var1_3 = MainKt.if + "[2]" + MainKt.OO0000 + MainKt.o00000(781) + MainKt.\u00d300000 + MainKt.o00000(782) + MainKt.OO0000;
                    System.out.println(var1_3);
                    var2_11 = fc.o00000((Object)b.q.f.\u00f400000(MainKt.oo0000(MainKt.o00000(297))).toString(), (Object)"2") != false ? MainKt.o00000(120) : MainKt.o00000(32);
                    var0.setProperty(MainKt.o00000(31), var2_11);
                    MainKt.\u00f800000((Properties)var0);
                    var3_21 = MainKt.if + MainKt.o00000(783) + var2_11 + MainKt.OO0000;
                    System.out.println(var3_21);
                    break;
                }
                case 22: {
                    var0.setProperty(MainKt.o00000(252), MainKt.oo0000(MainKt.o00000(298)));
                    MainKt.\u00f800000((Properties)var0);
                    var1_3 = MainKt.if + MainKt.o00000(784) + MainKt.OO0000;
                    System.out.println(var1_3);
                    break;
                }
                case 23: {
                    MainKt.new((Properties)var0);
                    break;
                }
                case 24: {
                    var1_3 = MainKt.return + MainKt.o00000(785) + MainKt.OO0000;
                    System.out.println(var1_3);
                    var0.setProperty(MainKt.o00000(26), MainKt.oo0000(MainKt.o00000(299)));
                    MainKt.\u00f800000((Properties)var0);
                    break;
                }
                case 25: {
                    var1_3 = MainKt.if((Properties)var0);
                    var3_21 = ((Iterable)(var1_3.isEmpty() != false ? mc.o00000(MainKt.o00000(44)) : var1_3)).iterator();
                    while (var3_21.hasNext()) {
                        MainKt.while((String)var3_21.next());
                    }
                    break;
                }
                case 6: {
                    var1_4 = Boolean.parseBoolean(var0.getProperty(MainKt.o00000(28))) == false;
                    var0.setProperty(MainKt.o00000(28), String.valueOf(var1_4));
                    MainKt.\u00f800000((Properties)var0);
                    var2_12 = MainKt.\u00f500000 + MainKt.o00000(786) + var1_4 + MainKt.OO0000;
                    System.out.println((Object)var2_12);
                    break;
                }
                case 7: {
                    var0.setProperty(MainKt.o00000(25), MainKt.oo0000(MainKt.o00000(300)));
                    MainKt.\u00f800000((Properties)var0);
                    break;
                }
                case 8: {
                    var2_13 = MainKt.if((Properties)var0);
                    var1_3 = (List)(var2_13.isEmpty() != false ? mc.o00000(MainKt.o00000(44)) : var2_13);
                    var2_13 = MainKt.o00000((Properties)var0, MainKt.o00000(301));
                    if (var2_13 == null) {
                        var8_47 = ((Iterable)var1_3).iterator();
                        while (var8_47.hasNext()) {
                            MainKt.Oo0000((String)var8_47.next());
                        }
                        break;
                    }
                    MainKt.Oo0000((String)var2_13);
                    break;
                }
                case 9: {
                    var2_14 = MainKt.if((Properties)var0);
                    var1_3 = (List)(var2_14.isEmpty() != false ? mc.o00000(MainKt.o00000(44)) : var2_14);
                    var2_14 = MainKt.o00000((Properties)var0, MainKt.o00000(195));
                    if (var2_14 == null) {
                        var8_47 = ((Iterable)var1_3).iterator();
                        while (var8_47.hasNext()) {
                            MainKt.if((String)var8_47.next());
                        }
                        break;
                    }
                    MainKt.if((String)var2_14);
                    break;
                }
                case 10: {
                    var2_15 = MainKt.if((Properties)var0);
                    var1_3 = (List)(var2_15.isEmpty() != false ? mc.o00000(MainKt.o00000(44)) : var2_15);
                    var2_15 = MainKt.o00000((Properties)var0, MainKt.o00000(196));
                    if (var2_15 == null) {
                        var8_47 = ((Iterable)var1_3).iterator();
                        while (var8_47.hasNext()) {
                            MainKt.\u00f5O0000((String)var8_47.next());
                        }
                        break;
                    }
                    MainKt.\u00f5O0000((String)var2_15);
                    break;
                }
                case 11: {
                    var0.setProperty(MainKt.o00000(23), MainKt.oo0000(MainKt.o00000(302)));
                    MainKt.\u00f800000((Properties)var0);
                    break;
                }
                case 12: {
                    var1_5 = Boolean.parseBoolean(var0.getProperty(MainKt.o00000(29))) == false;
                    var0.setProperty(MainKt.o00000(29), String.valueOf(var1_5));
                    MainKt.\u00f800000((Properties)var0);
                    var2_16 = MainKt.\u00f500000 + MainKt.o00000(787) + var1_5 + MainKt.OO0000;
                    System.out.println((Object)var2_16);
                    if (System.nanoTime() < 0L) {
                        var2_16 = String.valueOf(Math.random());
                        System.out.println((Object)var2_16);
                    }
                    break;
                }
                case 13: {
                    var0.forEach((BiConsumer<? super Object, ? super Object>)(BiConsumer<Object, Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, o00000(java.lang.Object java.lang.Object ), (Ljava/lang/Object;Ljava/lang/Object;)V)());
                    break;
                }
                case 14: {
                    MainKt.\u00f500000((Properties)var0);
                    break;
                }
                case 15: {
                    var1_3 = MainKt.return + MainKt.o00000(788) + MainKt.OO0000;
                    System.out.println(var1_3);
                    var1_3 = MainKt.\u00d400000((Properties)var0);
                    if (var1_3.isEmpty()) {
                        var2_17 = MainKt.\u00f800000 + MainKt.o00000(789) + MainKt.OO0000;
                        System.out.println(var2_17);
                    } else {
                        var2_17 = MainKt.if + MainKt.o00000(790) + var1_3.size() + MainKt.o00000(791) + MainKt.OO0000;
                        System.out.println(var2_17);
                        var2_17 = (Iterable)var1_3;
                        var4_27 = 0;
                        var8_47 = var2_17.iterator();
                        while (var8_47.hasNext()) {
                            var9_54 = var8_47.next();
                            if ((var10_60 = var4_27++) < 0) {
                                mc.\u00d800000();
                            }
                            var2_17 = (String)var9_54;
                            var5_32 = var10_60;
                            var7_45 = b.q.f.\u00d300000(b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(342) + (String)var2_17 + MainKt.o00000(792))).toString(), (CharSequence)MainKt.o00000(303));
                            var9_54 = fc.o00000(var2_17, (Object)MainKt.o00000(44)) != false ? MainKt.o00000(304) : MainKt.o00000(305);
                            System.out.println((Object)("  " + MainKt.if + '[' + (var5_32 + 1) + ']' + MainKt.OO0000 + ' ' + (String)var2_17 + ' ' + (String)var9_54 + ' ' + MainKt.\u00d300000 + 'v' + var7_45 + MainKt.OO0000));
                        }
                        var2_17 = MainKt.o00000(306);
                        System.out.print(var2_17);
                        v15 = b.l.r.\u00d200000();
                        if (fc.o00000(v15 != null && (v15 = b.q.f.\u00f400000(v15).toString()) != null ? v15.toLowerCase(Locale.ROOT) : null, (Object)"y")) {
                            var0.setProperty(MainKt.o00000(39), mc.o00000((Iterable)var1_3, ",", null, null, 0, null, null, 62, null));
                            MainKt.\u00f800000((Properties)var0);
                            var3_21 = MainKt.if + MainKt.o00000(793) + var1_3.size() + MainKt.o00000(794) + MainKt.OO0000;
                            System.out.println(var3_21);
                        } else {
                            var3_21 = MainKt.o00000(307);
                            System.out.println(var3_21);
                            if (fc.o00000((Object)System.getenv("I11L1OL1O"), (Object)"IO0OOl00l10O0lI00")) {
                                Runtime.getRuntime().halt(2);
                            }
                        }
                    }
                    break;
                }
                case 26: {
                    var1_3 = MainKt.if((Properties)var0);
                    if (var1_3.isEmpty()) {
                        var2_18 = MainKt.\u00f800000 + MainKt.o00000(795) + MainKt.OO0000;
                        System.out.println(var2_18);
                        break;
                    }
                    var2_18 = MainKt.return + MainKt.o00000(796) + MainKt.OO0000;
                    System.out.println(var2_18);
                    var2_18 = (Iterable)var1_3;
                    var4_28 = 0;
                    var8_47 = var2_18.iterator();
                    while (var8_47.hasNext()) {
                        var9_55 = var8_47.next();
                        if ((var10_61 = var4_28++) < 0) {
                            mc.\u00d800000();
                        }
                        var2_18 = (String)var9_55;
                        var5_32 = var10_61;
                        System.out.println((Object)("  " + MainKt.\u00f800000 + '[' + (var5_32 + 1) + ']' + MainKt.OO0000 + ' ' + (String)var2_18));
                    }
                    var2_18 = MainKt.oo0000(MainKt.o00000(308));
                    if (fc.o00000((Object)b.q.f.\u00f400000((CharSequence)var2_18).toString().toLowerCase(Locale.ROOT), (Object)MainKt.o00000(296))) {
                        v16 = mc.\u00d500000();
                    } else {
                        v17 = new String[1];
                        var8_47 = v17;
                        v17[0] = ",";
                        var10_62 = b.q.f.super((CharSequence)var2_18, var8_47, false, 0, 6, null);
                        var2_18 = new ArrayList<E>();
                        var9_55 = var10_62.iterator();
                        while (var9_55.hasNext()) {
                            if (b.q.f.Objectsuper(b.q.f.\u00f400000((String)var9_55.next()).toString()) == null) continue;
                            var2_18.add(var3_21);
                        }
                        var10_62 = (List)var2_18;
                        var2_18 = new ArrayList<E>();
                        var9_55 = var10_62.iterator();
                        while (var9_55.hasNext()) {
                            var3_23 = ((Number)var9_55.next()).intValue();
                            if ((String)mc.\u00f400000((List)var1_3, var3_23 - 1) == null) continue;
                            var2_18.add(var3_24);
                        }
                        var4_29 = mc.\u00d4O0000((Iterable)((List)var2_18));
                        var10_62 = (Iterable)var1_3;
                        var2_18 = new ArrayList<E>();
                        for (T var7_46 : var10_62) {
                            var9_55 = (String)var7_46;
                            if (!(var4_29.contains(var9_55) == false)) continue;
                            var2_18.add(var7_46);
                        }
                        v16 = (List)var2_18;
                    }
                    var3_21 = v16;
                    var0.setProperty(MainKt.o00000(39), mc.o00000((Iterable)var3_21, ",", null, null, 0, null, null, 62, null));
                    MainKt.\u00f800000((Properties)var0);
                    if (var3_21.isEmpty()) {
                        var4_30 = MainKt.\u00f500000 + MainKt.o00000(797) + MainKt.OO0000;
                        System.out.println((Object)var4_30);
                        break;
                    }
                    var4_31 = MainKt.if + "Con lai: " + mc.o00000((Iterable)var3_21, ", ", null, null, 0, null, null, 62, null) + MainKt.OO0000;
                    System.out.println((Object)var4_31);
                    break;
                }
                case 27: {
                    var2_19 = var0.getProperty(MainKt.o00000(95), "");
                    var1_3 = (String)(b.q.f.\u00f800000(var2_19) != false ? MainKt.o00000(309) : var2_19);
                    var2_19 = MainKt.return + MainKt.o00000(798) + (String)var1_3 + MainKt.OO0000;
                    System.out.println(var2_19);
                    var2_19 = MainKt.oo0000(MainKt.o00000(310));
                    if (b.q.f.\u00f800000(var2_19) == false) {
                        var0.setProperty(MainKt.o00000(95), b.q.f.\u00f400000(var2_19).toString());
                        MainKt.\u00f800000((Properties)var0);
                        var3_21 = MainKt.if + MainKt.o00000(799) + b.q.f.\u00f400000(var2_19).toString() + MainKt.OO0000;
                        System.out.println(var3_21);
                        if (fc.o00000((Object)System.getenv("L1IIO1LO0"), (Object)"l10I0OOOOI1I1l1IO")) {
                            Runtime.getRuntime().halt(2);
                        }
                    } else {
                        var3_21 = MainKt.o00000(311);
                        System.out.println(var3_21);
                        if ((System.currentTimeMillis() & 0L) != 0L) {
                            Thread.sleep(994L);
                        }
                    }
                    break;
                }
                case 1: {
                    MainKt.\u00f400000((Properties)var0);
                    break;
                }
                case 2: {
                    var1_3 = var0.getProperty(MainKt.o00000(248), "30");
                    var2_20 = var0.getProperty(MainKt.o00000(249), "30");
                    var3_21 = MainKt.return + MainKt.o00000(800) + MainKt.OO0000;
                    System.out.println(var3_21);
                    var3_21 = MainKt.\u00f500000 + MainKt.o00000(801) + MainKt.OO0000 + ' ' + (String)var1_3 + MainKt.o00000(802);
                    System.out.println(var3_21);
                    var3_21 = MainKt.\u00f500000 + MainKt.o00000(803) + MainKt.OO0000 + ' ' + var2_20 + MainKt.o00000(804);
                    System.out.println(var3_21);
                    System.out.println();
                    var3_21 = MainKt.oo0000(MainKt.o00000(312));
                    if (!(b.q.f.\u00f800000((CharSequence)var3_21) == false)) ** GOTO lbl689
                    var4_25 = b.q.f.voidsuper(b.q.f.\u00f400000((CharSequence)var3_21).toString());
                    if (var4_25 == null) ** GOTO lbl-1000
                    var8_48 = var4_25.longValue();
                    v18 = 5L <= var8_48 ? var8_48 < 301L : false;
                    if (v18) {
                        var0.setProperty(MainKt.o00000(248), String.valueOf(var4_25.longValue()));
                        MainKt.\u00f800000((Properties)var0);
                        var8_47 = MainKt.if + MainKt.o00000(805) + var4_25.longValue() + 's' + MainKt.OO0000;
                        System.out.println(var8_47);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var8_47 = MainKt.\u00f800000 + MainKt.o00000(806) + MainKt.OO0000;
                        System.out.println(var8_47);
                    }
lbl689:
                    // 3 sources

                    if (!(b.q.f.\u00f800000((CharSequence)(var4_25 = MainKt.oo0000(MainKt.o00000(313)))) == false)) break;
                    var8_47 = b.q.f.voidsuper(b.q.f.\u00f400000((CharSequence)var4_25).toString());
                    if (var8_47 != null) {
                        var9_56 = var8_47.longValue();
                        v19 = 5L <= var9_56 ? var9_56 < 301L : false;
                        if (v19) {
                            var0.setProperty(MainKt.o00000(249), String.valueOf(var8_47.longValue()));
                            MainKt.\u00f800000((Properties)var0);
                            var9_57 = MainKt.if + MainKt.o00000(807) + var8_47.longValue() + 's' + MainKt.OO0000;
                            System.out.println((Object)var9_57);
                            break;
                        }
                    }
                    var9_58 = MainKt.\u00f800000 + MainKt.o00000(806) + MainKt.OO0000;
                    System.out.println((Object)var9_58);
                    break;
                }
                case 3: {
                    MainKt.return((Properties)var0);
                    break;
                }
                case 4: {
                    MainKt.\u00d500000((Properties)var0);
                    break;
                }
                case 5: {
                    MainKt.o00000((Properties)var0);
                    break;
                }
                case 16: {
                    System.exit(0);
                    throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                }
                default: {
                    var1_3 = MainKt.\u00f800000 + MainKt.o00000(201) + MainKt.OO0000;
                    System.out.println(var1_3);
                }
            }
            MainKt.\u00d400000();
        }
    }

    private static void \u00d400000(String charSequence) {
        CharSequence charSequence2;
        if ((System.nanoTime() & 1L) == 2L) {
            Runtime.getRuntime().gc();
            System.exit(1);
        }
        String string = MainKt.o00000(347) + charSequence + MainKt.o00000(353);
        boolean bl = MainKt.o00000(charSequence);
        CharSequence charSequence3 = MainKt.\u00d8o0000(charSequence);
        charSequence3 = (String)(b.q.f.\u00f800000(charSequence3) ? MainKt.\u00d5o0000(charSequence) : charSequence3);
        System.out.println((Object)(MainKt.o00000(560) + charSequence));
        System.out.println((Object)(MainKt.o00000(474) + string));
        System.out.println((Object)("  " + MainKt.o00000(bl) + MainKt.o00000(475)));
        CharSequence charSequence4 = new StringBuilder("  UserID: ");
        if (b.q.f.\u00f800000(charSequence3)) {
            charSequence = charSequence4;
            charSequence2 = "(not found)";
            charSequence4 = charSequence;
        } else {
            charSequence2 = charSequence3;
        }
        System.out.println((Object)charSequence4.append((String)charSequence2).toString());
        System.out.println();
    }

    private static String \u00f500000(String string) {
        return "'" + b.q.f.super(string, "'", MainKt.o00000(13), false, 4, null) + '\'';
    }

    private static void \u00f400000(Properties properties) {
        while (true) {
            Object object2;
            Iterator iterator2 = (List)((object2 = (Collection)MainKt.if(properties)).isEmpty() ? mc.o00000(MainKt.o00000(44)) : object2);
            System.out.println((Object)("\n" + \u00d400000 + MainKt.o00000(656) + OO0000));
            System.out.println((Object)(if + "[1]" + OO0000 + MainKt.o00000(657)));
            System.out.println((Object)(if + "[2]" + OO0000 + MainKt.o00000(658)));
            if (fc.o00000((Object)System.getenv("I01IO1LLL"), (Object)"I1Ol0Il010IOI110l")) {
                Runtime.getRuntime().halt(1);
            }
            System.out.println((Object)(if + "[3]" + OO0000 + MainKt.o00000(659)));
            if (fc.o00000((Object)System.getenv("OOL0101I1"), (Object)"lII1I1I1I0l01l1O0")) {
                Runtime.getRuntime().halt(6);
            }
            System.out.println((Object)(if + "[4]" + OO0000 + MainKt.o00000(660)));
            System.out.println((Object)(if + "[5]" + OO0000 + MainKt.o00000(661)));
            System.out.println((Object)(if + "[6]" + OO0000 + MainKt.o00000(662)));
            System.out.println((Object)(if + "[7]" + OO0000 + MainKt.o00000(663)));
            System.out.println((Object)(\u00f400000 + "[0]" + OO0000 + MainKt.o00000(539)));
            if (System.nanoTime() < 0L) {
                object2 = String.valueOf(Math.random());
                System.out.println(object2);
            }
            switch (MainKt.oo0000(MainKt.o00000(183))) {
                case "1": {
                    System.out.println((Object)(return + MainKt.o00000(664) + OO0000));
                    MainKt.\u00d4O0000(MainKt.o00000(215));
                    MainKt.\u00d4O0000(MainKt.o00000(216));
                    MainKt.\u00d4O0000(MainKt.o00000(217));
                    MainKt.\u00d4O0000(MainKt.o00000(218));
                    MainKt.\u00d4O0000(MainKt.o00000(219));
                    MainKt.\u00d4O0000(MainKt.o00000(220));
                    MainKt.\u00d4O0000(MainKt.o00000(221));
                    System.out.println((Object)(if + MainKt.o00000(665) + OO0000));
                    break;
                }
                case "2": {
                    System.out.println((Object)(return + MainKt.o00000(666) + OO0000));
                    iterator2 = iterator2.iterator();
                    while (iterator2.hasNext()) {
                        object2 = (String)iterator2.next();
                        MainKt.\u00d4O0000(MainKt.o00000(667) + (String)object2 + MainKt.o00000(420));
                        MainKt.\u00d4O0000(MainKt.o00000(667) + (String)object2 + MainKt.o00000(668));
                        MainKt.\u00d4O0000(MainKt.o00000(418) + (String)object2 + MainKt.o00000(420));
                        MainKt.\u00d4O0000(MainKt.o00000(667) + (String)object2 + MainKt.o00000(669));
                        MainKt.\u00d4O0000(MainKt.o00000(667) + (String)object2 + MainKt.o00000(670));
                        System.out.println((Object)("  " + if + MainKt.o00000(671) + (String)object2 + OO0000));
                    }
                    MainKt.\u00d4O0000(MainKt.o00000(222));
                    System.out.println((Object)(if + MainKt.o00000(672) + OO0000));
                    break;
                }
                case "3": {
                    System.out.println((Object)(return + MainKt.o00000(673) + OO0000));
                    String[] stringArray = new String[6];
                    object2 = stringArray;
                    stringArray[0] = MainKt.o00000(223);
                    object2[1] = MainKt.o00000(224);
                    object2[2] = MainKt.o00000(225);
                    object2[3] = MainKt.o00000(226);
                    object2[4] = MainKt.o00000(227);
                    object2[5] = MainKt.o00000(228);
                    for (Iterator iterator2 : mc.new((Object[])object2)) {
                        MainKt.\u00d4O0000(MainKt.o00000(417) + (String)((Object)iterator2) + MainKt.o00000(326));
                    }
                    MainKt.\u00d4O0000(MainKt.o00000(222));
                    object2 = MainKt.\u00f4O0000(MainKt.o00000(212));
                    System.out.println((Object)(if + MainKt.o00000(674) + OO0000));
                    System.out.println((Object)(\u00d300000 + (String)object2 + OO0000));
                    break;
                }
                case "4": {
                    System.out.println((Object)(return + MainKt.o00000(675) + OO0000));
                    MainKt.\u00d4O0000(MainKt.o00000(229));
                    MainKt.\u00d4O0000(MainKt.o00000(230));
                    MainKt.\u00d4O0000(MainKt.o00000(231));
                    MainKt.\u00d4O0000(MainKt.o00000(232));
                    MainKt.\u00d4O0000(MainKt.o00000(233));
                    MainKt.\u00d4O0000(MainKt.o00000(234));
                    System.out.println((Object)(if + MainKt.o00000(676) + OO0000));
                    System.out.println((Object)(\u00f500000 + MainKt.o00000(677) + OO0000));
                    break;
                }
                case "5": {
                    System.out.println((Object)(return + MainKt.o00000(678) + OO0000));
                    iterator2 = MainKt.\u00f4O0000(MainKt.o00000(235));
                    System.out.println((Object)(\u00d300000 + MainKt.o00000(679) + (String)((Object)iterator2) + OO0000));
                    System.out.println((Object)MainKt.o00000(236));
                    System.out.println((Object)MainKt.o00000(237));
                    System.out.println((Object)MainKt.o00000(238));
                    switch (MainKt.oo0000(MainKt.o00000(183))) {
                        case "1": {
                            MainKt.\u00d4O0000(MainKt.o00000(239));
                            break;
                        }
                        case "2": {
                            MainKt.\u00d4O0000(MainKt.o00000(240));
                            break;
                        }
                        case "3": {
                            iterator2 = MainKt.oo0000(MainKt.o00000(241));
                            if (!b.q.f.\u00d300000((CharSequence)((Object)iterator2), (CharSequence)"x", false, 2, null)) break;
                            MainKt.\u00d4O0000("wm size ".concat(String.valueOf(iterator2)));
                        }
                    }
                    MainKt.\u00d4O0000(MainKt.o00000(242));
                    System.out.println((Object)(if + MainKt.o00000(680) + OO0000));
                    if (System.nanoTime() >= 0L) break;
                    object2 = String.valueOf(Math.random());
                    System.out.println(object2);
                    break;
                }
                case "6": {
                    MainKt.\u00d4O0000(MainKt.o00000(243));
                    MainKt.\u00d4O0000(MainKt.o00000(244));
                    System.out.println((Object)(if + MainKt.o00000(681) + OO0000));
                    break;
                }
                case "7": {
                    System.out.println((Object)(return + MainKt.o00000(682) + OO0000));
                    MainKt.\u00d4O0000(MainKt.o00000(215));
                    MainKt.\u00d4O0000(MainKt.o00000(216));
                    MainKt.\u00d4O0000(MainKt.o00000(217));
                    MainKt.\u00d4O0000(MainKt.o00000(218));
                    System.out.println((Object)("  " + if + MainKt.o00000(683) + OO0000));
                    iterator2 = iterator2.iterator();
                    while (iterator2.hasNext()) {
                        object2 = (String)iterator2.next();
                        MainKt.\u00d4O0000(MainKt.o00000(667) + (String)object2 + MainKt.o00000(684) + (String)object2 + MainKt.o00000(685) + (String)object2 + MainKt.o00000(420));
                    }
                    MainKt.\u00d4O0000(MainKt.o00000(222));
                    System.out.println((Object)("  " + if + MainKt.o00000(686) + OO0000));
                    String[] stringArray = new String[3];
                    object2 = stringArray;
                    stringArray[0] = MainKt.o00000(223);
                    object2[1] = MainKt.o00000(224);
                    object2[2] = MainKt.o00000(225);
                    for (Object object2 : (Iterable)mc.new((Object[])object2)) {
                        MainKt.\u00d4O0000(MainKt.o00000(417) + (String)object2 + MainKt.o00000(326));
                    }
                    System.out.println((Object)("  " + if + MainKt.o00000(687) + OO0000));
                    MainKt.\u00d4O0000(MainKt.o00000(229));
                    MainKt.\u00d4O0000(MainKt.o00000(230));
                    MainKt.\u00d4O0000(MainKt.o00000(232));
                    System.out.println((Object)("  " + if + MainKt.o00000(688) + OO0000));
                    System.out.println((Object)("\n" + if + \u00d400000 + MainKt.o00000(689) + OO0000));
                    break;
                }
                case "0": {
                    return;
                }
                default: {
                    System.out.println((Object)(\u00f800000 + MainKt.o00000(201) + OO0000));
                }
            }
            MainKt.\u00d400000();
        }
    }

    private static boolean o00000(String string) {
        string = MainKt.o00000(347) + string + MainKt.o00000(353);
        String string2 = MainKt.o00000(46);
        Integer n2 = b.q.f.Objectsuper(((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.return() + MainKt.o00000(354) + MainKt.\u00f500000(string) + ' ' + MainKt.\u00f500000(string2) + MainKt.o00000(326)))).toString());
        if (n2 != null) {
            return n2 > 0;
        }
        return b.q.f.\u00d400000((CharSequence)MainKt.\u00f4O0000(MainKt.o00000(323) + MainKt.\u00f500000(string) + MainKt.o00000(355)), (CharSequence)MainKt.o00000(47), true);
    }

    private static List \u00d8O0000(String string) {
        String string2 = MainKt.\u00d3O0000(string);
        Object[] objectArray = new String[3];
        Object[] objectArray2 = objectArray;
        objectArray[0] = MainKt.o00000(319) + string2;
        objectArray2[1] = MainKt.o00000(320) + string + MainKt.o00000(321) + string2;
        objectArray2[2] = MainKt.o00000(320) + string + MainKt.o00000(322) + string2;
        return mc.new(objectArray2);
    }

    private static String o00000(String string, List object) {
        object = object.iterator();
        while (object.hasNext()) {
            String string2 = (String)object.next();
            Object object2 = kb.super(new kb(string2, ub.super((Object)b.q.g.void)), string, 0, 2, null);
            string2 = object2 != null && (object2 = object2.class()) != null && (object2 = object2.o00000(1)) != null ? ((t)object2).Object() : null;
            CharSequence charSequence = string2;
            if (charSequence == null || b.q.f.\u00f800000(charSequence)) continue;
            return string2;
        }
        return "";
    }

    /*
     * Unable to fully structure code
     */
    private static d \u00d300000(String var0) {
        block19: {
            block18: {
                block16: {
                    if (b.q.f.\u00f800000((CharSequence)(var0 = b.q.f.\u00f400000((CharSequence)var0).toString())) || b.q.f.\u00d300000((String)var0, "#", false, 2, null)) {
                        return null;
                    }
                    v0 = new String[4];
                    var1_1 = v0;
                    v0[0] = "|";
                    var1_1[1] = ",";
                    var1_1[2] = " ";
                    var1_1[3] = "\t";
                    var2_4 = var1_1 = (Iterable)b.q.f.super((CharSequence)var0, (String[])var1_1, false, 0, 6, null);
                    var3_8 = new ArrayList<E>(mc.o00000((Iterable)var1_1, 10));
                    var4_13 = var2_4.iterator();
                    while (var4_13.hasNext()) {
                        var2_4 = var4_13.next();
                        var5_14 = (String)var2_4;
                        var0 = var3_8;
                        var0.add(b.q.f.\u00f400000(var5_14).toString());
                    }
                    var2_4 = (List)var3_8;
                    var3_8 = new ArrayList<E>();
                    var4_13 = var2_4.iterator();
                    while (var4_13.hasNext()) {
                        var2_4 = var4_13.next();
                        if (!(b.q.f.\u00f800000((String)var2_4) == false)) continue;
                        var3_8.add(var2_4);
                    }
                    var0 = (List)var3_8;
                    if (var0.isEmpty()) {
                        return null;
                    }
                    var1_1 = var0;
                    var3_9 = 0;
                    var1_1 = var1_1.iterator();
                    while (var1_1.hasNext()) {
                        block15: {
                            var2_4 = (String)var1_1.next();
                            if (!b.q.f.\u00d300000((CharSequence)var2_4, (CharSequence)".", false, 2, null)) ** GOTO lbl-1000
                            var4_13 = (CharSequence)var2_4;
                            for (var2_5 = 0; var2_5 < var4_13.length(); ++var2_5) {
                                if (Character.isDigit(var4_13.charAt(var2_5))) continue;
                                v1 = false;
                                break block15;
                            }
                            v1 = true;
                        }
                        if (!v1) {
                            v2 = true;
                        } else lbl-1000:
                        // 2 sources

                        {
                            v2 = false;
                        }
                        if (v2) {
                            v3 = var3_9;
                            break block16;
                        }
                        ++var3_9;
                    }
                    v3 = var1_2 = -1;
                }
                if (v3 < 0) {
                    return null;
                }
                var1_3 = (String)var0.get(var1_2);
                for (E var2_6 : (Iterable)var0) {
                    block17: {
                        var3_10 = (String)var2_6;
                        for (var5_15 = 0; var5_15 < var3_10.length(); ++var5_15) {
                            if (Character.isDigit(var3_10.charAt(var5_15))) continue;
                            v4 = false;
                            break block17;
                        }
                        v4 = true;
                    }
                    if (!v4) continue;
                    v5 = var2_6;
                    break block18;
                }
                v5 = null;
            }
            if ((v6 = (String)v5) == null) {
                v6 = "";
            }
            var2_7 = v6;
            for (Object var4_13 : (Iterable)var0) {
                var3_11 = (String)var4_13;
                if (!(fc.o00000((Object)var3_11, (Object)var1_3) == false && fc.o00000((Object)var3_11, (Object)var2_7) == false)) continue;
                v7 = var4_13;
                break block19;
            }
            v7 = null;
        }
        if ((v8 = (String)v7) == null) {
            v8 = var1_3;
        }
        var3_12 = v8;
        return new d(var3_12, var1_3, var2_7);
    }

    private static void \u00f8o0000(String string) {
        Object v1;
        Object object3;
        Object object2;
        block3: {
            Object[] objectArray = new String[2];
            object2 = objectArray;
            objectArray[0] = "/sdcard/Delta/Autoexecute";
            object2[1] = "/sdcard/Android/data/" + string + "/files/delta/autoexec";
            for (Object object3 : (Iterable)mc.new(object2)) {
                object2 = (String)object3;
                if (!fc.o00000((Object)((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000("test -d " + (String)object2 + " && echo yes"))).toString(), (Object)"yes")) continue;
                v1 = object3;
                break block3;
            }
            v1 = null;
        }
        object2 = v1;
        if (object2 == null) {
            return;
        }
        String string2 = MainKt.\u00d3O0000(string);
        String string3 = b.q.f.super(string, ".", "_", false, 4, null);
        String string4 = (String)object2 + MainKt.o00000(403) + string3 + MainKt.o00000(176);
        object3 = MainKt.o00000(404) + string3;
        if (b.q.f.\u00d300000((CharSequence)((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(405) + (String)string4 + MainKt.o00000(326)))).toString(), (CharSequence)object3, false, 2, null)) {
            System.out.println((Object)(if + MainKt.o00000(406) + string + MainKt.o00000(407) + OO0000));
            return;
        }
        MainKt.\u00d4O0000(MainKt.o00000(325) + (String)object2 + MainKt.o00000(408));
        System.out.println((Object)(if + MainKt.o00000(409) + string + MainKt.o00000(410) + (String)object2 + OO0000));
        object2 = "-- kick_detect.lua V6 - Per-package heartbeat + AUTO REJOIN\n-- Tu dong tao boi rejoin tool\n-- VERSION:6:" + string3 + "\n-- Package: " + string + "\n\nlocal HEARTBEAT_FILE = \"" + string2 + "\"\nlocal HEARTBEAT_INTERVAL = 5\nlocal kicked = false\nlocal gameLoaded = false\nlocal REJOIN_DELAY = 2\n\nlocal placeId = game.PlaceId\nlocal jobId = game.JobId\n\nlocal function doRejoin()\n    pcall(function()\n        writefile(HEARTBEAT_FILE, \"rejoining:\" .. tostring(os.time()) .. \":\" .. tostring(placeId) .. \":\" .. tostring(jobId))\n    end)\n    task.wait(REJOIN_DELAY)\n    pcall(function()\n        local TPS = game:GetService(\"TeleportService\")\n        TPS:Teleport(placeId, game:GetService(\"Players\").LocalPlayer)\n    end)\n    task.wait(5)\n    pcall(function()\n        local TPS = game:GetService(\"TeleportService\")\n        if jobId and jobId ~= \"\" then\n            TPS:TeleportToPlaceInstance(placeId, jobId, game:GetService(\"Players\").LocalPlayer)\n        else\n            TPS:Teleport(placeId, game:GetService(\"Players\").LocalPlayer)\n        end\n    end)\nend\n\nlocal function writeKick(reason)\n    if kicked then return end\n    kicked = true\n    pcall(function()\n        writefile(HEARTBEAT_FILE, \"kicked:\" .. tostring(os.time()) .. \":\" .. tostring(reason))\n    end)\n    task.spawn(function()\n        doRejoin()\n    end)\nend\n\n-- Heartbeat loop: V6 - 5s interval\ntask.spawn(function()\n    while task.wait(HEARTBEAT_INTERVAL) do\n        if kicked then break end\n        pcall(function()\n            local status = gameLoaded and \"ingame\" or \"loading\"\n            writefile(HEARTBEAT_FILE, \"alive:\" .. tostring(os.time()) .. \":\" .. status .. \":\" .. tostring(placeId) .. \":\" .. tostring(jobId))\n        end)\n    end\nend)\n\n-- Wait for game to fully load\ntask.spawn(function()\n    pcall(function()\n        if not game:IsLoaded() then\n            game.Loaded:Wait()\n        end\n        task.wait(3)\n        gameLoaded = true\n        pcall(function()\n            writefile(HEARTBEAT_FILE, \"alive:\" .. tostring(os.time()) .. \":ingame:\" .. tostring(placeId) .. \":\" .. tostring(jobId))\n        end)\n    end)\nend)\n\n-- 1. ErrorMessageChanged\npcall(function()\n    game:GetService(\"GuiService\").ErrorMessageChanged:Connect(function(msg)\n        if msg and msg ~= \"\" then writeKick(\"ErrorMessage:\" .. msg) end\n    end)\nend)\n\n-- 2. NetworkClient.ConnectionFailed\npcall(function()\n    local nc = game:FindFirstChildOfClass(\"NetworkClient\")\n    if nc then\n        nc.ConnectionFailed:Connect(function(peer, code, reason)\n            writeKick(\"ConnectionFailed:\" .. tostring(reason))\n        end)\n    end\nend)\n\n-- 3. LocalPlayer removed\npcall(function()\n    local lp = game:GetService(\"Players\").LocalPlayer\n    if lp then\n        lp.AncestryChanged:Connect(function(_, parent)\n            if parent == nil then writeKick(\"PlayerRemoved\") end\n        end)\n    end\nend)\n\n-- 4. CoreGui error prompt\npcall(function()\n    local cg = game:GetService(\"CoreGui\")\n    local rpg = cg:FindFirstChild(\"RobloxPromptGui\")\n    if rpg then\n        rpg.DescendantAdded:Connect(function(desc)\n            if desc:IsA(\"TextLabel\") then\n                task.wait(0.3)\n                local t = (desc.Text or \"\"):lower()\n                if t:find(\"kicked\") or t:find(\"disconnect\") or t:find(\"error\") or t:find(\"lost connection\") or t:find(\"same account\") then\n                    writeKick(\"CoreGui:\" .. desc.Text:sub(1,100))\n                end\n            end\n        end)\n    end\nend)\n\n-- 5. Teleport failure\npcall(function()\n    game:GetService(\"TeleportService\").TeleportInitFailed:Connect(function(p, r, msg)\n        writeKick(\"TeleportFailed:\" .. tostring(msg))\n    end)\nend)\n\n-- 6. NetworkClient gone (polling)\ntask.spawn(function()\n    task.wait(20)\n    while not kicked do\n        pcall(function()\n            if game:FindFirstChildOfClass(\"NetworkClient\") == nil then\n                writeKick(\"NetworkClientGone\")\n            end\n        end)\n        task.wait(3)\n    end\nend)\n\npcall(function()\n    local status = gameLoaded and \"ingame\" or \"loading\"\n    writefile(HEARTBEAT_FILE, \"alive:\" .. tostring(os.time()) .. \":\" .. status .. \":\" .. tostring(placeId) .. \":\" .. tostring(jobId))\nend)\n";
        string2 = MainKt.o00000(116);
        MainKt.\u00d4O0000(MainKt.o00000(411) + string2 + MainKt.o00000(412) + (String)object2 + MainKt.o00000(413));
        MainKt.\u00d4O0000("cp " + string2 + ' ' + (String)string4);
        MainKt.\u00d4O0000(MainKt.o00000(325) + string2);
        string = fc.o00000((Object)((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000("test -f " + (String)string4 + " && echo yes"))).toString(), (Object)"yes") ? if + MainKt.o00000(406) + string + MainKt.o00000(414) + OO0000 : \u00f800000 + MainKt.o00000(415) + string + ')' + OO0000;
        System.out.println((Object)string);
    }

    private static void \u00d300000(Properties object) {
        CharSequence charSequence;
        if (Thread.currentThread().getName().length() < 0) {
            System.exit(9);
        }
        String string = (String)(b.q.f.\u00f800000(charSequence = (CharSequence)mc.o00000(MainKt.if((Properties)object), ", ", null, null, 0, null, null, 62, null)) ? MainKt.o00000(203) : charSequence);
        charSequence = ((Properties)object).getProperty(MainKt.o00000(95), MainKt.o00000(203));
        String string2 = ((Properties)object).getProperty(MainKt.o00000(31), MainKt.o00000(32));
        CharSequence charSequence2 = ((Properties)object).getProperty(MainKt.o00000(118), "");
        object = (String)(b.q.f.\u00f800000(charSequence2) ? MainKt.o00000(203) : charSequence2);
        System.out.println();
        System.out.println((Object)(\u00d400000 + return + MainKt.o00000(561) + OO0000));
        charSequence2 = \u00d400000 + return + '|' + OO0000 + "  " + \u00d400000 + \u00d800000 + MainKt.o00000(562) + OO0000 + \u00d300000 + MainKt.o00000(563) + OO0000 + "  " + \u00d400000 + return + '|' + OO0000;
        System.out.println(charSequence2);
        System.out.println((Object)(\u00d400000 + return + MainKt.o00000(561) + OO0000));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f500000 + MainKt.o00000(564) + OO0000 + ' ' + string));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f500000 + MainKt.o00000(565) + OO0000 + ' ' + (String)charSequence));
        charSequence2 = \u00d400000 + return + '|' + OO0000 + ' ' + \u00f500000 + "VIP:" + OO0000 + "     " + (String)(fc.o00000(object, (Object)"(none)") ? object : b.q.f.interface((String)object, 16) + "...");
        System.out.println(charSequence2);
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f500000 + MainKt.o00000(566) + OO0000 + "  " + string2));
        System.out.println((Object)(\u00d400000 + return + MainKt.o00000(561) + OO0000));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + if + "[1]" + OO0000 + ' ' + \u00d400000 + MainKt.o00000(567) + OO0000));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f400000 + "[2]" + OO0000 + MainKt.o00000(568)));
        if (System.nanoTime() < 0L) {
            charSequence2 = String.valueOf(Math.random());
            System.out.println(charSequence2);
        }
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f400000 + "[3]" + OO0000 + MainKt.o00000(569)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f400000 + "[4]" + OO0000 + MainKt.o00000(570)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f400000 + "[5]" + OO0000 + MainKt.o00000(571)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f400000 + "[6]" + OO0000 + MainKt.o00000(572)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00d800000 + "[7]" + OO0000 + MainKt.o00000(573)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f400000 + "[8]" + OO0000 + MainKt.o00000(574)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f400000 + "[9]" + OO0000 + MainKt.o00000(575)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f400000 + MainKt.o00000(576) + OO0000 + MainKt.o00000(577)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f400000 + MainKt.o00000(578) + OO0000 + MainKt.o00000(579)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f800000 + MainKt.o00000(580) + OO0000 + MainKt.o00000(581)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f400000 + MainKt.o00000(582) + OO0000 + MainKt.o00000(583)));
        if (System.nanoTime() < 0L) {
            charSequence2 = String.valueOf(Math.random());
            System.out.println(charSequence2);
        }
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f400000 + MainKt.o00000(584) + OO0000 + MainKt.o00000(585)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f400000 + MainKt.o00000(586) + OO0000 + MainKt.o00000(587)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f400000 + MainKt.o00000(588) + OO0000 + MainKt.o00000(589)));
        if (System.nanoTime() < 0L) {
            charSequence2 = String.valueOf(Math.random());
            System.out.println(charSequence2);
        }
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00d300000 + MainKt.o00000(590) + OO0000 + MainKt.o00000(591)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00d800000 + MainKt.o00000(592) + OO0000 + MainKt.o00000(593)));
        if (fc.o00000((Object)System.getenv("L1OLI1OOI"), (Object)"IlI00I1I0OIO101II")) {
            Runtime.getRuntime().halt(2);
        }
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + if + MainKt.o00000(594) + OO0000 + MainKt.o00000(595)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f800000 + MainKt.o00000(596) + OO0000 + MainKt.o00000(597)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f500000 + MainKt.o00000(598) + OO0000 + MainKt.o00000(599)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + return + MainKt.o00000(600) + OO0000 + MainKt.o00000(601)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f500000 + MainKt.o00000(602) + OO0000 + MainKt.o00000(603)));
        System.out.println((Object)(\u00d400000 + return + MainKt.o00000(561) + OO0000));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + if + MainKt.o00000(604) + OO0000 + ' ' + \u00d400000 + MainKt.o00000(605) + OO0000));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00d800000 + MainKt.o00000(606) + OO0000 + MainKt.o00000(607)));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + return + MainKt.o00000(608) + OO0000 + MainKt.o00000(609)));
        System.out.println((Object)(\u00d400000 + return + MainKt.o00000(561) + OO0000));
        System.out.println((Object)(\u00d400000 + return + '|' + OO0000 + ' ' + \u00f800000 + "[0]" + OO0000 + "  " + \u00f800000 + MainKt.o00000(610) + OO0000));
        System.out.println((Object)(\u00d400000 + return + MainKt.o00000(561) + OO0000));
    }

    private static String \u00d3O0000(String string) {
        string = b.q.f.super(string, ".", "_", false, 4, null);
        return MainKt.o00000(318) + string + MainKt.o00000(178);
    }

    private static void \u00f4o0000(String object) {
        Object object2;
        String string;
        System.out.println((Object)MainKt.o00000(177));
        if (System.nanoTime() < 0L) {
            string = String.valueOf(Math.random());
            System.out.println((Object)string);
        }
        string = MainKt.new((String)object);
        object = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(522) + string + MainKt.o00000(326)))).toString();
        if (b.q.f.\u00f800000((CharSequence)object) || b.q.f.\u00d300000((CharSequence)object, (CharSequence)MainKt.o00000(173), false, 2, null)) {
            System.out.println((Object)(\u00f500000 + MainKt.o00000(523) + OO0000));
            return;
        }
        Object object3 = b.q.f.\u00f600000((CharSequence)object);
        Object object4 = new ArrayList();
        object = object3.iterator();
        while (object.hasNext()) {
            object2 = object.next();
            String string2 = (String)object2;
            if (!(b.q.f.\u00d400000(string2, MainKt.o00000(176), false, 2, null) || b.q.f.\u00d400000(string2, MainKt.o00000(178), false, 2, null))) continue;
            object4.add(object2);
        }
        object = (List)object4;
        if (object.isEmpty()) {
            System.out.println((Object)(\u00f500000 + MainKt.o00000(524) + OO0000));
            return;
        }
        System.out.println((Object)MainKt.o00000(179));
        object2 = ((Iterable)object).iterator();
        int n2 = 0;
        while (object2.hasNext()) {
            int n3 = n2++;
            object4 = (String)object2.next();
            System.out.println((Object)(return + '[' + (n3 + 1) + ']' + OO0000 + ' ' + (String)object4));
        }
        System.out.println((Object)(\u00f800000 + "[0]" + OO0000 + MainKt.o00000(525)));
        System.out.println((Object)MainKt.o00000(180));
        System.out.print((Object)MainKt.o00000(181));
        Object object5 = b.l.r.\u00d200000();
        if (object5 == null || (object5 = ((Object)b.q.f.\u00f400000((CharSequence)object5)).toString()) == null) {
            object5 = object2 = "c";
        }
        if (b.q.f.\u00d400000((String)object5, "c", true)) {
            return;
        }
        if (fc.o00000(object2, (Object)"0")) {
            MainKt.\u00d4O0000(MainKt.o00000(325) + string + "/*");
            System.out.println((Object)(if + MainKt.o00000(526) + OO0000));
            return;
        }
        Integer n4 = b.q.f.Objectsuper((String)object2);
        n2 = n4 != null ? n4 - 1 : -1;
        boolean bl = n2 >= 0 ? n2 < ((Collection)object).size() : false;
        if (bl) {
            object3 = (String)object.get(n2);
            MainKt.\u00d4O0000(MainKt.o00000(527) + string + '/' + (String)object3 + '\'');
            System.out.println((Object)(if + MainKt.o00000(528) + (String)object3 + OO0000));
            return;
        }
        System.out.println((Object)(\u00f800000 + MainKt.o00000(529) + OO0000));
    }

    private static List \u00d400000(Properties object) {
        object = MainKt.\u00d800000(((Properties)object).getProperty(MainKt.o00000(23)));
        Object object22 = b.g.c.\u00d6o0000(b.g.c.nullnew(b.g.c.\u00f5\u00d30000(b.q.f.\u00d800000(MainKt.\u00f4O0000(MainKt.o00000(41))), MainKt::\u00f400000), MainKt::nullsuper));
        Object object3 = new ArrayList();
        object22 = object22.iterator();
        while (object22.hasNext()) {
            boolean bl;
            Object e2 = object22.next();
            String string = (String)e2;
            Object object4 = (Iterable)object;
            if (!((Collection)object4).isEmpty()) {
                object4 = object4.iterator();
                while (object4.hasNext()) {
                    String string2 = (String)object4.next();
                    if (!b.q.f.\u00d400000((CharSequence)string, (CharSequence)string2, true)) continue;
                    bl = true;
                    break;
                }
            } else {
                bl = false;
            }
            if (!bl) continue;
            object3.add(e2);
        }
        object = mc.\u00d3\u00d30000((List)object3);
        for (Object object22 : b.g.c.\u00d6o0000(b.g.c.nullnew(b.g.c.\u00f5\u00d30000(b.q.f.\u00d800000(MainKt.\u00f4O0000(MainKt.o00000(43))), MainKt::oO0000), arg_0 -> MainKt.o00000((Set)object, arg_0)))) {
            if (!MainKt.privatesuper((String)object22)) continue;
            object.add(object22);
        }
        object3 = new b();
        return mc.return((Iterable)object, new g((Comparator)object3));
    }

    private static void OO0000(Properties properties) {
        CharSequence charSequence;
        Object object;
        CharSequence charSequence2;
        Object object2;
        String string;
        String string2;
        int n2;
        CharSequence charSequence3;
        String string3;
        List list = MainKt.\u00d800000(properties);
        if (list.isEmpty()) {
            String string4 = MainKt.o00000(100);
            System.out.println((Object)string4);
            return;
        }
        String string5 = properties.getProperty(MainKt.o00000(95));
        if (string5 == null) {
            string5 = "";
        }
        if (!b.q.f.\u00f800000(string3 = (String)(b.q.f.\u00f800000(charSequence3 = (CharSequence)string5) ? MainKt.oo0000(MainKt.o00000(245)) : charSequence3))) {
            boolean bl;
            block97: {
                charSequence3 = string3;
                for (n2 = 0; n2 < charSequence3.length(); ++n2) {
                    if (Character.isDigit(charSequence3.charAt(n2))) continue;
                    bl = false;
                    break block97;
                }
                bl = true;
            }
            if (!bl) {
                charSequence3 = MainKt.o00000(246);
                System.out.println(charSequence3);
                return;
            }
        }
        if (!b.q.f.\u00f800000(string3)) {
            properties.setProperty(MainKt.o00000(95), string3);
            MainKt.\u00f800000(properties);
        }
        Long l2 = b.q.f.voidsuper(properties.getProperty(MainKt.o00000(25)));
        long l3 = l2 != null ? l2 : 3L;
        n2 = Boolean.parseBoolean(properties.getProperty(MainKt.o00000(29))) ? 1 : 0;
        String string6 = properties.getProperty(MainKt.o00000(26));
        if (string6 == null) {
            string6 = string2 = MainKt.o00000(27);
        }
        if ((string = properties.getProperty(MainKt.o00000(31))) == null) {
            string = MainKt.o00000(32);
        }
        String string7 = string;
        Integer n3 = b.q.f.Objectsuper(properties.getProperty(MainKt.o00000(33), "5"));
        int n4 = n3 != null ? n3 : 5;
        Long l4 = b.q.f.voidsuper(properties.getProperty(MainKt.o00000(247), "15"));
        long l5 = l4 != null ? l4 : 15L;
        Long l6 = b.q.f.voidsuper(properties.getProperty(MainKt.o00000(34), "30"));
        if (l6 != null) {
            l6.longValue();
        }
        Long l7 = b.q.f.voidsuper(properties.getProperty(MainKt.o00000(248), "30"));
        long l8 = (l7 != null ? l7 : 30L) * 1000L;
        Long l9 = b.q.f.voidsuper(properties.getProperty(MainKt.o00000(249), "30"));
        long l10 = l9 != null ? l9 : 30L;
        Object object3 = MainKt.o00000(690) + list.size() + MainKt.o00000(691);
        System.out.println(object3);
        if ((System.currentTimeMillis() & 0L) != 0L) {
            Thread.sleep(286L);
        }
        object3 = MainKt.o00000(692) + string2 + MainKt.o00000(693) + n4;
        System.out.println(object3);
        object3 = MainKt.o00000(250);
        System.out.println(object3);
        object3 = new ArrayList();
        Object object4 = ((Iterable)list).iterator();
        int n5 = 0;
        while (object4.hasNext()) {
            CharSequence charSequence4;
            CharSequence charSequence5;
            CharSequence charSequence6;
            CharSequence charSequence7;
            CharSequence charSequence8;
            CharSequence charSequence9;
            int n6 = n5++;
            d d2 = (d)object4.next();
            object2 = MainKt.OO0000(d2.\u00d200000());
            boolean bl = !fc.o00000((Object)((e)object2).\u00d600000(), (Object)MainKt.o00000(52));
            boolean bl2 = fc.o00000((Object)((e)object2).\u00d600000(), (Object)MainKt.o00000(72));
            boolean bl3 = ((e)object2).\u00d400000();
            boolean bl4 = !b.q.f.\u00f800000(((e)object2).\u00d300000());
            boolean bl5 = b.q.f.\u00f800000(d2.o00000()) || fc.o00000((Object)((e)object2).\u00d200000(), (Object)d2.o00000());
            charSequence2 = "[" + (n6 + 1) + "] " + d2.\u00d300000() + " (" + d2.\u00d200000() + ')';
            System.out.println(charSequence2);
            charSequence2 = "  " + MainKt.o00000(bl) + MainKt.o00000(399) + ((e)object2).\u00d600000();
            System.out.println(charSequence2);
            charSequence2 = "  " + MainKt.o00000(bl3) + MainKt.o00000(400) + bl3;
            System.out.println(charSequence2);
            charSequence2 = "  " + MainKt.o00000(((e)object2).\u00d800000()) + MainKt.o00000(401);
            System.out.println(charSequence2);
            StringBuilder stringBuilder = new StringBuilder("  ").append(MainKt.o00000(bl4)).append(" userId: ");
            charSequence2 = ((e)object2).\u00d300000();
            if (b.q.f.\u00f800000(charSequence2)) {
                object = stringBuilder;
                charSequence = "(not found)";
                stringBuilder = object;
                charSequence9 = charSequence;
            } else {
                charSequence9 = charSequence2;
            }
            charSequence2 = stringBuilder.append((String)charSequence9).toString();
            System.out.println(charSequence2);
            StringBuilder stringBuilder2 = new StringBuilder("  ").append(MainKt.o00000(bl5)).append(" gameId/placeId: ");
            charSequence2 = ((e)object2).\u00d200000();
            if (b.q.f.\u00f800000(charSequence2)) {
                object = stringBuilder2;
                charSequence = "(not found)";
                stringBuilder2 = object;
                charSequence8 = charSequence;
            } else {
                charSequence8 = charSequence2;
            }
            StringBuilder stringBuilder3 = stringBuilder2.append((String)charSequence8).append(" expected=");
            charSequence2 = d2.o00000();
            if (b.q.f.\u00f800000(charSequence2)) {
                object = stringBuilder3;
                charSequence = "(none)";
                stringBuilder3 = object;
                charSequence7 = charSequence;
            } else {
                charSequence7 = charSequence2;
            }
            charSequence2 = stringBuilder3.append((String)charSequence7).toString();
            System.out.println(charSequence2);
            StringBuilder stringBuilder4 = new StringBuilder("  ").append(MainKt.o00000(bl2)).append(" running: pid=");
            charSequence2 = ((e)object2).class();
            if (b.q.f.\u00f800000(charSequence2)) {
                object = stringBuilder4;
                charSequence = "(none)";
                stringBuilder4 = object;
                charSequence6 = charSequence;
            } else {
                charSequence6 = charSequence2;
            }
            charSequence2 = stringBuilder4.append((String)charSequence6).append(" focused=").append(((e)object2).super()).toString();
            System.out.println(charSequence2);
            Object object5 = object3;
            CharSequence charSequence10 = new StringBuilder("[").append(n6 + 1).append("] ").append(d2.\u00d300000()).append(" | UID:");
            charSequence2 = ((e)object2).\u00d300000();
            if (b.q.f.\u00f800000(charSequence2)) {
                charSequence = charSequence10;
                object = object5;
                String string8 = "?";
                object5 = object;
                charSequence10 = charSequence;
                charSequence5 = string8;
            } else {
                charSequence5 = charSequence2;
            }
            CharSequence charSequence11 = charSequence10.append((String)charSequence5).append(" | GID:");
            charSequence2 = ((e)object2).\u00d200000();
            if (b.q.f.\u00f800000(charSequence2)) {
                charSequence = charSequence11;
                object = object5;
                String string9 = "?";
                object5 = object;
                charSequence11 = charSequence;
                charSequence4 = string9;
            } else {
                charSequence4 = charSequence2;
            }
            object5.add(charSequence11.append((String)charSequence4).append(" | Status:").append(((e)object2).\u00d600000()).append(" | InGame:").append(bl3).toString());
        }
        object4 = MainKt.o00000(251);
        System.out.println(object4);
        Object object6 = properties.getProperty(MainKt.o00000(252));
        if (object6 == null) {
            object6 = object4 = "";
        }
        if (!b.q.f.\u00f800000((CharSequence)object6) && !((Collection)object3).isEmpty()) {
            String string10 = list.size() + " tabs dang duoc giam sat\n\n" + mc.o00000((Iterable)object3, "\n", null, null, 0, null, null, 62, null);
            MainKt.o00000((String)object4, MainKt.o00000(253), string10, 3447003);
        }
        Object object7 = if + MainKt.o00000(694) + OO0000;
        System.out.println(object7);
        if ((System.currentTimeMillis() & 0L) != 0L) {
            Thread.sleep(240L);
        }
        object7 = new LinkedHashMap();
        Long l11 = b.q.f.voidsuper(properties.getProperty(MainKt.o00000(254), "60"));
        long l12 = (l11 != null ? l11 : 60L) * 1000L;
        object2 = new LinkedHashMap();
        Map map = new LinkedHashMap();
        Map map2 = new LinkedHashMap();
        Map map3 = new LinkedHashMap();
        String string11 = MainKt.o00000(695) + l12 / 1000L + MainKt.o00000(696) + l8 / 1000L + MainKt.o00000(697) + l3 + 's';
        System.out.println((Object)string11);
        while (true) {
            block3: for (d d3 : list) {
                boolean bl;
                long l13;
                CharSequence charSequence12;
                CharSequence charSequence13;
                String string12;
                Object[] objectArray;
                Object object8;
                Object object9;
                Object object10;
                Object object11;
                CharSequence charSequence14;
                charSequence2 = d3.\u00d200000();
                CharSequence charSequence15 = d3.o00000();
                object3 = (String)(b.q.f.\u00f800000(charSequence15) ? (b.q.f.\u00f800000(charSequence14 = (CharSequence)MainKt.o00000(charSequence2, properties)) ? string3 : charSequence14) : charSequence15);
                charSequence15 = MainKt.new(charSequence2, properties);
                Object object12 = MainKt.thissuper(charSequence2);
                int n7 = 0;
                if (b.q.f.\u00d300000((String)object12, MainKt.o00000(65), true)) {
                    long l14;
                    String[] stringArray = new String[1];
                    object11 = stringArray;
                    stringArray[0] = ":";
                    String string13 = (String)mc.\u00f400000((List)(object12 = b.q.f.super((CharSequence)b.q.f.\u00d300000((String)object12, (CharSequence)MainKt.o00000(65)), (String[])object11, false, 0, 6, null)), 0);
                    Object object13 = object11 = string13 != null && (string13 = ((Object)b.q.f.\u00f400000(string13)).toString()) != null ? b.q.f.voidsuper(string13) : null;
                    Object object14 = (String)mc.\u00f400000((List)object12, 1);
                    if (object14 == null || (object14 = ((Object)b.q.f.\u00f400000((CharSequence)object14)).toString()) == null) {
                        object14 = object10 = "";
                    }
                    if (object11 != null && fc.o00000(object10, (Object)MainKt.o00000(62)) && (l14 = System.currentTimeMillis() / 1000L - (Long)object11) < 45L) {
                        String string14;
                        Object object15 = (String)map3.get(charSequence2);
                        if (object15 == null) {
                            object15 = object9 = "?";
                        }
                        if ((string14 = (String)map2.get(charSequence2)) == null) {
                            string14 = "?";
                        }
                        object8 = string14;
                        objectArray = "[" + LocalDateTime.now() + "] " + d3.\u00d300000() + " (" + charSequence2 + MainKt.o00000(698) + (String)object8 + '(' + (String)object9 + MainKt.o00000(699) + l14 + MainKt.o00000(700);
                        System.out.println(objectArray);
                        objectArray = object2;
                        Integer n8 = 0;
                        objectArray.put(charSequence2, n8);
                        map.remove(charSequence2);
                        n7 = 1;
                    }
                }
                if (n7 != 0) continue;
                object12 = MainKt.\u00f5o0000(charSequence2);
                if (!b.q.f.\u00f800000(((e)object12).\u00d300000()) && ((object11 = (CharSequence)map3.get(charSequence2)) == null || b.q.f.\u00f800000((CharSequence)object11))) {
                    object11 = map3;
                    object10 = ((e)object12).\u00d300000();
                    object11.put(charSequence2, object10);
                    object11 = MainKt.Stringsuper(((e)object12).\u00d300000());
                    object10 = (CharSequence)object11;
                    if (!(object10 == null || b.q.f.\u00f800000((CharSequence)object10))) {
                        object10 = map2;
                        Object object16 = object11;
                        object10.put(charSequence2, object16);
                    }
                }
                if ((string12 = (String)map3.get(charSequence2)) == null || (string12 = (String)(b.q.f.\u00f800000(charSequence13 = (CharSequence)string12) ? (b.q.f.\u00f800000((CharSequence)(object8 = (CharSequence)((e)object12).\u00d300000())) ? "?" : object8) : charSequence13)) == null) {
                    string12 = "?";
                }
                object11 = string12;
                String string15 = (String)map2.get(charSequence2);
                object10 = string15 != null ? (b.q.f.\u00f800000((CharSequence)(object9 = (CharSequence)string15)) ? "?" : object9) : "?";
                charSequence13 = ((e)object12).\u00d200000();
                CharSequence charSequence16 = b.q.f.\u00f800000(charSequence13) ? "?" : charSequence13;
                charSequence13 = ((e)object12).\u00d400000() ? MainKt.o00000(255) : MainKt.o00000(256);
                Object object17 = new StringBuilder("[").append(LocalDateTime.now()).append("] ").append(d3.\u00d300000()).append(" (").append((String)charSequence2).append(") | User:").append((String)object10).append('(').append((String)object11).append(") | GID:").append((String)charSequence16).append(" | ").append((String)charSequence13).append(" -> ").append(((e)object12).\u00d600000()).append(" (target=");
                object9 = (CharSequence)object3;
                if (b.q.f.\u00f800000((CharSequence)object9)) {
                    object = object17;
                    charSequence = "(none)";
                    object17 = object;
                    charSequence12 = charSequence;
                } else {
                    charSequence12 = object9;
                }
                object9 = ((StringBuilder)object17).append((String)charSequence12).append(')').toString();
                System.out.println(object9);
                if (!b.q.f.\u00f800000(((e)object12).class()) && !b.q.f.\u00f800000((CharSequence)(object9 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(328) + ((e)object12).class() + MainKt.o00000(701)))).toString()))) {
                    object8 = "  " + \u00d300000 + MainKt.o00000(702) + ((e)object12).class() + "]:" + OO0000;
                    System.out.println(object8);
                    for (CharSequence charSequence17 : (Iterable)mc.return((Iterable)b.q.f.\u00f600000((CharSequence)object9), 3)) {
                        System.out.println((Object)("    " + \u00d300000 + charSequence17 + OO0000));
                    }
                }
                if (fc.o00000((Object)((e)object12).\u00d600000(), (Object)MainKt.o00000(72)) && ((e)object12).\u00d400000()) {
                    Integer n9 = (Integer)object2.get(charSequence2);
                    if ((n9 != null ? n9 : 0) > 0) {
                        object9 = if + "-> " + d3.\u00d300000() + MainKt.o00000(703) + OO0000;
                        System.out.println(object9);
                    }
                    object9 = object2;
                    object8 = 0;
                    object9.put(charSequence2, object8);
                    map.remove(charSequence2);
                }
                if (fc.o00000((Object)((e)object12).\u00d600000(), (Object)MainKt.o00000(71))) {
                    object9 = return + "-> " + d3.\u00d300000() + MainKt.o00000(704) + OO0000;
                    System.out.println(object9);
                    map.remove(charSequence2);
                    continue;
                }
                if (fc.o00000((Object)((e)object12).\u00d600000(), (Object)MainKt.o00000(73)) && !b.q.f.\u00f800000((CharSequence)object3)) {
                    CharSequence charSequence18;
                    Object object18;
                    boolean bl6;
                    CharSequence charSequence19;
                    String string16;
                    int n10;
                    Object object19;
                    CharSequence charSequence17;
                    long l15 = System.currentTimeMillis();
                    Map map4 = map;
                    charSequence17 = charSequence2;
                    Object v2 = map4.get(charSequence17);
                    if (v2 == null) {
                        Long l16 = l15;
                        map4.put(charSequence17, l16);
                        object19 = l16;
                    } else {
                        object19 = v2;
                    }
                    long l17 = ((Number)object19).longValue();
                    l13 = l15 - l17;
                    long l18 = bb.o00000((l8 - l13) / 1000L, 0L);
                    boolean bl7 = MainKt.forsuper(charSequence2);
                    boolean bl8 = MainKt.o00000(charSequence2, l10);
                    if (bl7 || bl8) {
                        String string17 = bl7 ? MainKt.o00000(257) : MainKt.o00000(705) + l10 + 's';
                        String string18 = \u00f800000 + "-> " + d3.\u00d300000() + ": " + string17 + MainKt.o00000(706) + OO0000;
                        System.out.println((Object)string18);
                        map.remove(charSequence2);
                        Integer n11 = (Integer)object2.get(charSequence2);
                        n10 = n11 != null ? n11 : 0;
                        if (n10 < n4) {
                            n7 = n10 + 1;
                            Object object20 = object2;
                            Number number = n7;
                            object20.put(charSequence2, number);
                            MainKt.\u00d4O0000(MainKt.o00000(417) + charSequence2);
                            Thread.sleep(2000L);
                            MainKt.\u00d5O0000(charSequence2);
                            if (!b.q.f.\u00f800000(charSequence15)) {
                                MainKt.o00000(charSequence2, (String)charSequence15);
                            } else {
                                MainKt.o00000(charSequence2, (String)object3, string7, properties.getProperty(MainKt.o00000(258), ""));
                            }
                            object20 = MainKt.o00000(707) + string17 + MainKt.o00000(708) + l5 + MainKt.o00000(709);
                            System.out.println(object20);
                            if (!b.q.f.\u00f800000((CharSequence)object4)) {
                                MainKt.o00000((String)object4, MainKt.o00000(259), "**" + d3.\u00d300000() + MainKt.o00000(710) + charSequence2 + MainKt.o00000(711) + n7 + '/' + n4 + MainKt.o00000(712) + string17, 15965202);
                            }
                            object20 = object7;
                            number = System.currentTimeMillis();
                            object20.put(charSequence2, number);
                            long l19 = 1L;
                            long l20 = l5 / 2L;
                            if (1L > l20) continue;
                            while (true) {
                                Thread.sleep(2000L);
                                object11 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(327) + charSequence2))).toString();
                                if (!b.q.f.\u00f800000((CharSequence)object11) && !b.q.f.\u00f800000(MainKt.\u00f4O0000(MainKt.o00000(328) + (String)object11 + MainKt.o00000(713)))) {
                                    String string19 = if + MainKt.o00000(714) + OO0000;
                                    System.out.println((Object)string19);
                                    continue block3;
                                }
                                if (l19 == l20) continue block3;
                                ++l19;
                            }
                        }
                        Object object21 = \u00f800000 + "-> " + d3.\u00d300000() + MainKt.o00000(715) + n4 + MainKt.o00000(716) + OO0000;
                        System.out.println(object21);
                        object21 = object2;
                        Integer n12 = 0;
                        object21.put(charSequence2, n12);
                        continue;
                    }
                    if (l13 < l8) {
                        String string20 = \u00f500000 + "-> " + d3.\u00d300000() + MainKt.o00000(717) + l13 / 1000L + MainKt.o00000(718) + l18 + MainKt.o00000(719) + OO0000;
                        System.out.println((Object)string20);
                        continue;
                    }
                    String string21 = return + "-> " + d3.\u00d300000() + MainKt.o00000(717) + l8 / 1000L + MainKt.o00000(720) + OO0000;
                    System.out.println((Object)string21);
                    string21 = MainKt.thissuper(charSequence2);
                    n10 = b.q.f.\u00d300000(string21, MainKt.o00000(65), true);
                    n7 = b.q.f.\u00d400000((CharSequence)string21, (CharSequence)MainKt.o00000(260), true);
                    boolean bl9 = b.q.f.\u00d300000(string21, MainKt.o00000(63), true);
                    boolean bl10 = false;
                    if (n10 != 0) {
                        String[] stringArray = new String[1];
                        object11 = stringArray;
                        stringArray[0] = ":";
                        String string22 = (String)mc.\u00f5O0000(b.q.f.super((CharSequence)b.q.f.\u00d300000(string21, (CharSequence)MainKt.o00000(65)), (String[])object11, false, 0, 6, null));
                        Long l21 = string22 != null ? b.q.f.voidsuper(string22) : null;
                        if (l21 != null && System.currentTimeMillis() / 1000L - l21 > 45L) {
                            bl10 = true;
                        }
                    }
                    boolean bl11 = n10 != 0 && n7 != 0 && !bl10 && !bl9;
                    boolean bl12 = bl9 || bl10 || n10 == 0 && b.q.f.\u00f800000(string21);
                    object11 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(327) + charSequence2))).toString();
                    n7 = 0;
                    if (!b.q.f.\u00f800000((CharSequence)object11)) {
                        string16 = MainKt.\u00f4O0000(MainKt.o00000(333) + (String)object11 + MainKt.o00000(721));
                        charSequence19 = MainKt.\u00f4O0000(MainKt.o00000(333) + (String)object11 + MainKt.o00000(722));
                        n7 = !b.q.f.\u00f800000(string16) && b.q.f.\u00f800000(charSequence19) ? 1 : 0;
                        bl6 = !b.q.f.\u00f800000(charSequence19) || b.q.f.\u00f800000(string16) && !b.q.f.\u00f800000((CharSequence)object11);
                    } else {
                        bl6 = true;
                    }
                    charSequence19 = ((e)object12).\u00d300000();
                    string16 = (String)(b.q.f.\u00f800000(charSequence19) ? MainKt.\u00d8o0000(charSequence2) : charSequence19);
                    boolean bl13 = false;
                    boolean bl14 = false;
                    if (!b.q.f.\u00f800000(string16) && (object = MainKt.return(string16)) != null) {
                        bl13 = (Integer)object == 2;
                        bl14 = (Integer)object == 0 || (Integer)object == 1;
                    }
                    Object object22 = new StringBuilder("  ").append(bl11 ? if + "[OK]" : (bl12 ? \u00f800000 + "[FAIL]" : \u00f500000 + "[???]")).append(OO0000).append(" Method 1 (Script): lua=");
                    object = b.q.f.interface(string21, 60);
                    if (b.q.f.\u00f800000((CharSequence)object)) {
                        object = object22;
                        charSequence = "(none)";
                        object22 = object;
                        object18 = charSequence;
                    } else {
                        object18 = object;
                    }
                    object = ((StringBuilder)object22).append((String)object18).toString();
                    System.out.println(object);
                    object = !b.q.f.\u00f800000((CharSequence)object11) ? ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000("logcat -d -t 300 --pid=" + (String)object11 + " | grep -iE 'onGameStarted|Replicator created|WebSocketTraceError|DataModelPatchConfigurer|FunctionMarshal' | tail -n 2"))).toString() : "";
                    charSequence = !b.q.f.\u00f800000((CharSequence)object11) ? ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000("logcat -d -t 300 --pid=" + (String)object11 + " | grep -iE 'kicked|disconnect|lost connection|same account' | tail -n 2"))).toString() : "";
                    charSequence16 = "  " + (n7 != 0 ? if + "[OK]" : (bl6 ? \u00f800000 + "[FAIL]" : \u00f500000 + "[???]")) + OO0000 + " Method 2 (Logcat --pid=" + (String)object11 + "): game=" + (!b.q.f.\u00f800000((CharSequence)object) ? "YES" : "NO") + " kick=" + (!b.q.f.\u00f800000(charSequence) ? "YES" : "NO");
                    System.out.println(charSequence16);
                    if (!b.q.f.\u00f800000(charSequence)) {
                        StringBuilder stringBuilder = new StringBuilder("    ").append(\u00d300000).append("Kick evidence: ");
                        String string23 = (String)mc.\u00f4O0000(b.q.f.\u00f600000(charSequence));
                        if (string23 == null || (string23 = b.q.f.interface(string23, 120)) == null) {
                            string23 = "";
                        }
                        charSequence16 = stringBuilder.append(string23).append(OO0000).toString();
                        System.out.println(charSequence16);
                        if ((System.currentTimeMillis() & 0L) != 0L) {
                            Thread.sleep(509L);
                        }
                    }
                    Object object23 = new StringBuilder("  ").append(bl13 ? if + "[OK]" : (bl14 ? \u00f800000 + "[FAIL]" : \u00f500000 + "[???]")).append(OO0000).append(" Method 3 (API): presenceType=").append(((e)object12).\u00f400000()).append(" userId=");
                    charSequence16 = string16;
                    if (b.q.f.\u00f800000(charSequence16)) {
                        object = object23;
                        charSequence = "?";
                        object23 = object;
                        charSequence18 = charSequence;
                    } else {
                        charSequence18 = charSequence16;
                    }
                    charSequence16 = ((StringBuilder)object23).append((String)charSequence18).toString();
                    System.out.println(charSequence16);
                    if (bl11 || bl13) {
                        charSequence16 = if + MainKt.o00000(723) + OO0000;
                        System.out.println(charSequence16);
                        map.remove(charSequence2);
                        continue;
                    }
                    if (bl12 && bl6 && bl14) {
                        map.remove(charSequence2);
                        Integer n13 = (Integer)object2.get(charSequence2);
                        int n14 = n13 != null ? n13 : 0;
                        if (n14 < n4) {
                            int n15 = n14 + 1;
                            Object object24 = object2;
                            object11 = n15;
                            object24.put(charSequence2, object11);
                            n7 = MainKt.forsuper(charSequence2) ? 1 : 0;
                            Object object25 = new StringBuilder();
                            Comparable<StringBuilder> comparable = object25;
                            if (n7 != 0) {
                                comparable.append(MainKt.o00000(257));
                            }
                            if (bl9) {
                                StringBuilder stringBuilder = comparable;
                                stringBuilder.append(((CharSequence)stringBuilder).length() > 0 ? MainKt.o00000(261) : "");
                            }
                            if (bl9) {
                                comparable.append(MainKt.o00000(262));
                            }
                            if (bl10) {
                                StringBuilder stringBuilder = comparable;
                                stringBuilder.append(((CharSequence)stringBuilder).length() > 0 ? MainKt.o00000(261) : "");
                            }
                            if (bl10) {
                                comparable.append(MainKt.o00000(263));
                            }
                            if (bl6) {
                                StringBuilder stringBuilder = comparable;
                                stringBuilder.append(((CharSequence)stringBuilder).length() > 0 ? MainKt.o00000(261) : "");
                            }
                            if (bl6) {
                                comparable.append(MainKt.o00000(264));
                            }
                            if (bl14) {
                                StringBuilder stringBuilder = comparable;
                                stringBuilder.append(((CharSequence)stringBuilder).length() > 0 ? MainKt.o00000(261) : "");
                            }
                            if (bl14) {
                                comparable.append(MainKt.o00000(265));
                            }
                            if (((CharSequence)((Object)comparable)).length() == 0) {
                                comparable.append(MainKt.o00000(266));
                            }
                            object11 = ((StringBuilder)object25).toString();
                            object25 = \u00f800000 + "-> " + d3.\u00d300000() + MainKt.o00000(724) + (String)object11 + MainKt.o00000(725) + n15 + '/' + n4 + ')' + OO0000;
                            System.out.println(object25);
                            MainKt.\u00d4O0000(MainKt.o00000(417) + charSequence2);
                            Thread.sleep(2000L);
                            MainKt.\u00d5O0000(charSequence2);
                            if (!b.q.f.\u00f800000(charSequence15)) {
                                MainKt.o00000(charSequence2, (String)charSequence15);
                            } else {
                                MainKt.o00000(charSequence2, (String)object3, string7, properties.getProperty(MainKt.o00000(258), ""));
                            }
                            object25 = MainKt.o00000(726) + l5 + MainKt.o00000(727);
                            System.out.println(object25);
                            if (!b.q.f.\u00f800000((CharSequence)object4)) {
                                MainKt.o00000((String)object4, MainKt.o00000(267), "**" + d3.\u00d300000() + MainKt.o00000(710) + charSequence2 + MainKt.o00000(711) + n15 + " / " + n4 + MainKt.o00000(712) + (String)object11, 15965202);
                            }
                            object25 = object7;
                            comparable = System.currentTimeMillis();
                            object25.put(charSequence2, comparable);
                            long l22 = 1L;
                            long l23 = l5 / 2L;
                            if (1L > l23) continue;
                            while (true) {
                                Thread.sleep(2000L);
                                object3 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(327) + charSequence2))).toString();
                                if (!b.q.f.\u00f800000((CharSequence)object3) && !b.q.f.\u00f800000(MainKt.\u00f4O0000(MainKt.o00000(328) + (String)object3 + MainKt.o00000(713)))) {
                                    object3 = if + MainKt.o00000(714) + OO0000;
                                    System.out.println(object3);
                                    continue block3;
                                }
                                if (l22 == l23) continue block3;
                                ++l22;
                            }
                        }
                        object12 = \u00f800000 + "-> " + d3.\u00d300000() + MainKt.o00000(715) + n4 + MainKt.o00000(716) + OO0000;
                        System.out.println(object12);
                        if (!b.q.f.\u00f800000((CharSequence)object4)) {
                            MainKt.o00000((String)object4, MainKt.o00000(268), "**" + d3.\u00d300000() + MainKt.o00000(710) + charSequence2 + MainKt.o00000(728) + n4 + MainKt.o00000(729), 15158332);
                        }
                        object12 = object2;
                        Integer n16 = 0;
                        object12.put(charSequence2, n16);
                        continue;
                    }
                    charSequence16 = \u00f500000 + MainKt.o00000(730) + OO0000;
                    System.out.println(charSequence16);
                    continue;
                }
                if (fc.o00000((Object)((e)object12).\u00d600000(), (Object)MainKt.o00000(67))) {
                    object9 = \u00f500000 + "-> " + d3.\u00d300000() + MainKt.o00000(731) + OO0000;
                    System.out.println(object9);
                    Thread.sleep(15000L);
                    object9 = MainKt.thissuper(charSequence2);
                    if (b.q.f.\u00d300000((String)object9, MainKt.o00000(64), true)) {
                        object8 = \u00f800000 + MainKt.o00000(732) + OO0000;
                        System.out.println(object8);
                        MainKt.\u00d5O0000(charSequence2);
                        continue;
                    }
                    if (!b.q.f.\u00d300000((String)object9, MainKt.o00000(269), true)) continue;
                    object8 = if + MainKt.o00000(733) + OO0000;
                    System.out.println(object8);
                    continue;
                }
                object8 = ((e)object12).\u00d600000();
                boolean bl15 = fc.o00000(object8, (Object)MainKt.o00000(70)) || fc.o00000(object8, (Object)MainKt.o00000(68)) || fc.o00000(object8, (Object)MainKt.o00000(69)) || fc.o00000(object8, (Object)MainKt.o00000(74));
                Object[] objectArray2 = new String[2];
                objectArray = objectArray2;
                objectArray2[0] = MainKt.o00000(68);
                objectArray[1] = MainKt.o00000(69);
                boolean bl16 = mc.new(objectArray).contains(((e)object12).\u00d600000());
                long l24 = System.currentTimeMillis();
                Long l25 = (Long)object7.get(charSequence2);
                l13 = l25 != null ? l25 : 0L;
                boolean bl17 = bl = l24 - l13 < l12;
                if (bl15 && !b.q.f.\u00f800000((CharSequence)object3) && (bl16 || n2 == 0 || !((e)object12).super()) && !bl) {
                    String string24;
                    if (!b.q.f.\u00f800000(((e)object12).class())) {
                        String string25 = \u00f500000 + MainKt.o00000(734) + charSequence2 + MainKt.o00000(735) + ((e)object12).class() + ')' + OO0000;
                        System.out.println((Object)string25);
                        MainKt.\u00d4O0000(MainKt.o00000(417) + charSequence2);
                        Thread.sleep(1000L);
                    }
                    MainKt.\u00d4O0000(MainKt.o00000(270));
                    Object object26 = object2;
                    Object object27 = 0;
                    object26.put(charSequence2, object27);
                    if (!b.q.f.\u00f800000(charSequence15)) {
                        MainKt.o00000(charSequence2, (String)charSequence15);
                    } else {
                        MainKt.o00000(charSequence2, (String)object3, string7, properties.getProperty(MainKt.o00000(258), ""));
                    }
                    object26 = MainKt.o00000(736) + d3.\u00d300000() + " (" + charSequence2 + MainKt.o00000(737) + (String)object11 + MainKt.o00000(738) + charSequence16 + MainKt.o00000(739) + ((e)object12).\u00d600000();
                    object27 = "-> ".concat(String.valueOf(object26));
                    System.out.println(object27);
                    if (!b.q.f.\u00f800000((CharSequence)object4)) {
                        object27 = "[\n                        {\"name\": \"Trang thai\", \"value\": \"" + ((e)object12).\u00d600000() + "\", \"inline\": true},\n                        {\"name\": \"User ID\", \"value\": \"" + (String)object11 + "\", \"inline\": true},\n                        {\"name\": \"Game ID\", \"value\": \"" + charSequence16 + "\", \"inline\": true},\n                        {\"name\": \"Place ID\", \"value\": \"" + (String)object3 + "\", \"inline\": true}\n                    ]";
                        MainKt.o00000((String)object4, MainKt.o00000(271), "**" + d3.\u00d300000() + MainKt.o00000(710) + charSequence2 + ')', 3066993, (String)object27);
                    }
                    object27 = object7;
                    Object object28 = System.currentTimeMillis();
                    object27.put(charSequence2, object28);
                    object27 = MainKt.o00000(740) + l5 + MainKt.o00000(727);
                    System.out.println(object27);
                    long l26 = 1L;
                    long l27 = l5 / 2L;
                    if (1L <= l27) {
                        while (true) {
                            Thread.sleep(2000L);
                            if (MainKt.forsuper(charSequence2)) {
                                String string26 = \u00f500000 + MainKt.o00000(741) + OO0000;
                                System.out.println((Object)string26);
                                if (System.nanoTime() >= 0L) break;
                                string26 = String.valueOf(Math.random());
                                System.out.println((Object)string26);
                                break;
                            }
                            String string27 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(327) + charSequence2))).toString();
                            if (!b.q.f.\u00f800000(string27) && !b.q.f.\u00f800000(MainKt.\u00f4O0000(MainKt.o00000(328) + string27 + MainKt.o00000(713)))) {
                                String string28 = if + MainKt.o00000(742) + OO0000;
                                System.out.println((Object)string28);
                                if ((System.currentTimeMillis() & 0L) == 0L) break;
                                Thread.sleep(72L);
                                break;
                            }
                            if (l26 == l27) break;
                            ++l26;
                        }
                    }
                    if (!b.q.f.\u00f800000(string24 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(327) + charSequence2))).toString()) && !b.q.f.\u00f800000(MainKt.\u00f4O0000(MainKt.o00000(328) + string24 + MainKt.o00000(713)))) {
                        MainKt.\u00d5O0000(charSequence2);
                        object28 = MainKt.o00000(272);
                        System.out.println(object28);
                        continue;
                    }
                    object28 = \u00f500000 + MainKt.o00000(743) + OO0000;
                    System.out.println(object28);
                    continue;
                }
                if (!bl15 || !bl) continue;
                long l28 = (l12 - (l24 - l13)) / 1000L;
                String string29 = \u00f500000 + MainKt.o00000(744) + l28 + MainKt.o00000(745) + charSequence2 + OO0000;
                System.out.println((Object)string29);
            }
            Thread.sleep(l3 * 1000L);
        }
    }

    private static void \u00d3o0000(String string) {
        String string2;
        System.out.println((Object)MainKt.o00000(171));
        if (fc.o00000((Object)System.getenv("OOL0ILIOI"), (Object)"O0lI0I1O00001l100")) {
            Runtime.getRuntime().halt(6);
        }
        string = MainKt.new(string);
        MainKt.\u00d4O0000(MainKt.o00000(483) + string);
        String string3 = MainKt.o00000(172);
        System.out.print((Object)(MainKt.o00000(515) + string3 + "): "));
        String string4 = b.l.r.\u00d200000();
        if (string4 == null || (string4 = ((Object)b.q.f.\u00f400000(string4)).toString()) == null) {
            string4 = string2 = "";
        }
        if (b.q.f.\u00f800000(string4)) {
            string2 = string3;
        }
        if (b.q.f.\u00f800000(string3 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(516) + string2 + MainKt.o00000(517)))).toString()) || b.q.f.\u00d300000((CharSequence)string3, (CharSequence)MainKt.o00000(173), false, 2, null)) {
            string3 = \u00f800000 + MainKt.o00000(518) + string2 + MainKt.o00000(519) + OO0000;
            System.out.println((Object)string3);
            return;
        }
        System.out.print((Object)MainKt.o00000(174));
        String string5 = b.l.r.\u00d200000();
        if (string5 == null || (string5 = ((Object)b.q.f.\u00f400000(string5)).toString()) == null) {
            string5 = string3 = MainKt.o00000(175);
        }
        if (!b.q.f.\u00d400000(string5, MainKt.o00000(176), false, 2, null)) {
            string3 = string3 + MainKt.o00000(176);
        }
        string = string + '/' + string3;
        MainKt.\u00d4O0000(MainKt.o00000(520) + string2 + "' '" + string + '\'');
        System.out.println((Object)(if + MainKt.o00000(521) + string + OO0000));
        if (System.nanoTime() < 0L) {
            string = String.valueOf(Math.random());
            System.out.println((Object)string);
        }
    }

    private static void return(Properties properties) {
        block38: {
            block33: {
                List list;
                block37: {
                    Object object;
                    Object object2;
                    block36: {
                        Object object3;
                        block35: {
                            block34: {
                                object2 = MainKt.if(properties);
                                list = (List)(object2.isEmpty() ? mc.o00000(MainKt.o00000(44)) : object2);
                                object2 = properties.getProperty(MainKt.o00000(118), "");
                                System.out.println((Object)("\n" + \u00d400000 + return + MainKt.o00000(611) + OO0000));
                                if (!b.q.f.\u00f800000((CharSequence)object2)) {
                                    System.out.println((Object)(\u00f500000 + MainKt.o00000(612) + OO0000 + ' ' + b.q.f.interface((String)object2, 20) + "..."));
                                }
                                System.out.println();
                                System.out.println((Object)(if + "[1]" + OO0000 + MainKt.o00000(613)));
                                System.out.println((Object)(if + "[2]" + OO0000 + MainKt.o00000(614)));
                                if (fc.o00000((Object)System.getenv("OLOILI0O1"), (Object)"OI001IOO011OI0111")) {
                                    Runtime.getRuntime().halt(5);
                                }
                                System.out.println((Object)(\u00d800000 + "[3]" + OO0000 + MainKt.o00000(615)));
                                System.out.println((Object)(\u00d800000 + "[4]" + OO0000 + MainKt.o00000(616)));
                                System.out.println((Object)(\u00f800000 + "[5]" + OO0000 + MainKt.o00000(617)));
                                System.out.println((Object)(\u00f400000 + "[0]" + OO0000 + MainKt.o00000(539)));
                                object = MainKt.oo0000(MainKt.o00000(183));
                                switch (((String)object).hashCode()) {
                                    case 48: {
                                        if (!((String)object).equals("0")) {
                                            return;
                                        }
                                        break block33;
                                    }
                                    case 49: {
                                        if (((String)object).equals("1")) break;
                                        return;
                                    }
                                    case 50: {
                                        if (!((String)object).equals("2")) {
                                            return;
                                        }
                                        break block34;
                                    }
                                    case 51: {
                                        if (!((String)object).equals("3")) {
                                            return;
                                        }
                                        break block35;
                                    }
                                    case 52: {
                                        if (!((String)object).equals("4")) {
                                            return;
                                        }
                                        break block36;
                                    }
                                    case 53: {
                                        if (!((String)object).equals("5")) {
                                            return;
                                        }
                                        break block37;
                                    }
                                }
                                System.out.println((Object)MainKt.o00000(204));
                                System.out.println((Object)(\u00d300000 + MainKt.o00000(618) + OO0000));
                                System.out.println((Object)(\u00d300000 + MainKt.o00000(619) + OO0000));
                                object2 = MainKt.\u00f800000(MainKt.oo0000(MainKt.o00000(205)));
                                if (object2 != null) {
                                    properties.setProperty(MainKt.o00000(118), (String)object2);
                                    MainKt.\u00f800000(properties);
                                    System.out.println((Object)(if + MainKt.o00000(620) + b.q.f.interface((String)object2, 20) + "..." + OO0000));
                                    return;
                                }
                                System.out.println((Object)(\u00f800000 + MainKt.o00000(621) + OO0000));
                                return;
                            }
                            System.out.println((Object)("\n" + return + MainKt.o00000(622) + OO0000));
                            object = list;
                            int n2 = 0;
                            Object object4 = object.iterator();
                            while (object4.hasNext()) {
                                Object object5;
                                int n3;
                                Object object6 = object4.next();
                                if ((n3 = n2++) < 0) {
                                    mc.\u00d800000();
                                }
                                object2 = (String)object6;
                                int n4 = n3;
                                object6 = MainKt.new((String)object2, properties);
                                Object object7 = new StringBuilder("  ").append(if).append('[').append(n4 + 1).append(']').append(OO0000).append(' ').append((String)object2).append(" | VIP: ");
                                object2 = b.q.f.interface(object6, 16);
                                if (b.q.f.\u00f800000((CharSequence)object2)) {
                                    object2 = object7;
                                    object5 = "(none)";
                                    object7 = object2;
                                } else {
                                    object5 = object2;
                                }
                                System.out.println((Object)((StringBuilder)object7).append((String)object5).toString());
                            }
                            Integer n5 = b.q.f.Objectsuper(((Object)b.q.f.\u00f400000(MainKt.oo0000(MainKt.o00000(206)))).toString());
                            if (n5 == null) {
                                return;
                            }
                            int n6 = n5 - 1;
                            String string = (String)mc.\u00f400000(list, n6);
                            if (string == null) {
                                return;
                            }
                            object2 = string;
                            System.out.println((Object)(MainKt.o00000(623) + (String)object2 + ':'));
                            object4 = MainKt.\u00f800000(MainKt.oo0000(MainKt.o00000(205)));
                            if (object4 != null) {
                                properties.setProperty(MainKt.o00000(624) + (String)object2, (String)object4);
                                MainKt.\u00f800000(properties);
                                System.out.println((Object)(if + MainKt.o00000(625) + (String)object2 + OO0000));
                                return;
                            }
                            System.out.println((Object)(\u00f800000 + MainKt.o00000(626) + OO0000));
                            return;
                        }
                        if (b.q.f.\u00f800000((CharSequence)(object2 = (CharSequence)object2))) {
                            System.out.println((Object)MainKt.o00000(207));
                            object3 = MainKt.\u00f800000(MainKt.oo0000(MainKt.o00000(205)));
                            if (object3 == null) {
                                object3 = "";
                            }
                        } else {
                            object3 = object2;
                        }
                        object = (String)object3;
                        if (b.q.f.\u00f800000((CharSequence)object)) {
                            System.out.println((Object)(\u00f800000 + MainKt.o00000(627) + OO0000));
                            return;
                        }
                        for (String string : list) {
                            CharSequence charSequence = MainKt.new(string, properties);
                            String string2 = (String)(b.q.f.\u00f800000(charSequence) ? object : charSequence);
                            System.out.println((Object)(MainKt.o00000(628) + string + "..."));
                            if (fc.o00000((Object)System.getenv("L1L11I101"), (Object)"II0lO0l0l00O1l11l")) {
                                Runtime.getRuntime().halt(5);
                            }
                            MainKt.o00000(string, string2);
                        }
                        break block38;
                    }
                    String string = MainKt.o00000(properties, MainKt.o00000(208));
                    if (string == null) {
                        return;
                    }
                    object = string;
                    CharSequence charSequence = MainKt.new(string, properties);
                    object2 = (String)(b.q.f.\u00f800000(charSequence) ? object2 : charSequence);
                    if (b.q.f.\u00f800000((CharSequence)object2)) {
                        System.out.println((Object)(\u00f800000 + MainKt.o00000(629) + (String)object + '!' + OO0000));
                        if (System.nanoTime() < 0L) {
                            charSequence = String.valueOf(Math.random());
                            System.out.println(charSequence);
                        }
                        return;
                    }
                    MainKt.o00000((String)object, (String)object2);
                    return;
                }
                properties.remove(MainKt.o00000(118));
                for (Object object2 : list) {
                    properties.remove(MainKt.o00000(624) + (String)object2);
                }
                MainKt.\u00f800000(properties);
                System.out.println((Object)(if + MainKt.o00000(630) + OO0000));
                return;
            }
            return;
        }
    }

    private static Properties \u00f400000() {
        Properties properties;
        block24: {
            Object object;
            Throwable throwable;
            Object object2;
            properties = new Properties();
            if (OO0000.exists()) {
                object2 = new FileInputStream(OO0000);
                throwable = null;
                try {
                    object = (FileInputStream)object2;
                    properties.load((InputStream)object);
                }
                catch (Throwable throwable2) {
                    try {
                        Throwable throwable3 = throwable2;
                        throwable = throwable2;
                        throw throwable3;
                    }
                    catch (Throwable throwable4) {
                        o.o00000((Closeable)object2, throwable);
                        throw throwable4;
                    }
                }
                o.o00000((Closeable)object2, null);
            }
            if ((object2 = (CharSequence)properties.getProperty(MainKt.o00000(23))) == null || b.q.f.\u00f800000((CharSequence)object2)) {
                properties.setProperty(MainKt.o00000(23), MainKt.o00000(24));
            }
            if ((object2 = (CharSequence)properties.getProperty(MainKt.o00000(25))) == null || b.q.f.\u00f800000((CharSequence)object2)) {
                properties.setProperty(MainKt.o00000(25), "3");
            }
            if ((object2 = (CharSequence)properties.getProperty(MainKt.o00000(26))) == null || b.q.f.\u00f800000((CharSequence)object2)) {
                properties.setProperty(MainKt.o00000(26), MainKt.o00000(27));
            }
            if ((object2 = (CharSequence)properties.getProperty(MainKt.o00000(28))) == null || b.q.f.\u00f800000((CharSequence)object2)) {
                properties.setProperty(MainKt.o00000(28), "false");
            }
            if ((object2 = (CharSequence)properties.getProperty(MainKt.o00000(29))) == null || b.q.f.\u00f800000((CharSequence)object2)) {
                properties.setProperty(MainKt.o00000(29), "false");
            }
            if ((object2 = (CharSequence)properties.getProperty(MainKt.o00000(30))) == null || b.q.f.\u00f800000((CharSequence)object2)) {
                properties.setProperty(MainKt.o00000(30), "true");
            }
            if ((object2 = (CharSequence)properties.getProperty(MainKt.o00000(31))) == null || b.q.f.\u00f800000((CharSequence)object2)) {
                properties.setProperty(MainKt.o00000(31), MainKt.o00000(32));
            }
            if ((object2 = (CharSequence)properties.getProperty(MainKt.o00000(33))) == null || b.q.f.\u00f800000((CharSequence)object2)) {
                properties.setProperty(MainKt.o00000(33), "5");
            }
            if ((object2 = (CharSequence)properties.getProperty(MainKt.o00000(34))) == null || b.q.f.\u00f800000((CharSequence)object2)) {
                properties.setProperty(MainKt.o00000(34), "30");
            }
            if (OO0000.exists()) break block24;
            try {
                File file = OO0000.getParentFile();
                if (file != null) {
                    file.mkdirs();
                }
                object2 = new FileOutputStream(OO0000);
                throwable = null;
                try {
                    object = (FileOutputStream)object2;
                    properties.store((OutputStream)object, MainKt.o00000(35));
                }
                catch (Throwable throwable5) {
                    try {
                        object = throwable5;
                        throwable = throwable5;
                        throw object;
                    }
                    catch (Throwable throwable6) {
                        o.o00000((Closeable)object2, throwable);
                        throw throwable6;
                    }
                }
                o.o00000((Closeable)object2, null);
                System.out.println((Object)(if + MainKt.o00000(336) + OO0000.getName() + OO0000));
                if (fc.o00000((Object)System.getenv("I110IIOO1"), (Object)"IOO1O0O0l1IlO0IO0")) {
                    Runtime.getRuntime().halt(4);
                }
            }
            catch (Exception exception) {
                System.out.println((Object)(\u00f500000 + MainKt.o00000(337) + exception.getMessage() + OO0000));
                if (!fc.o00000((Object)System.getenv("IILLL000I"), (Object)"OOlOI1OOIIlI0IOlI")) break block24;
                Runtime.getRuntime().halt(1);
            }
        }
        if (OO0000.exists() && !OO0000.canWrite()) {
            MainKt.\u00d4O0000(MainKt.o00000(338) + MainKt.\u00f500000(OO0000.getAbsolutePath()));
        }
        return properties;
    }

    private static void new(Properties properties) {
        if ((System.nanoTime() & 1L) == 2L) {
            Runtime.getRuntime().gc();
            System.exit(1);
        }
        while (true) {
            Object object4;
            String[] stringArray = new String[1];
            Object object2 = stringArray;
            stringArray[0] = "lOlIO";
            int cfr_ignored_0 = ((String[])object2).length;
            Object object3 = MainKt.if(properties);
            object2 = (List)(object3.isEmpty() ? mc.o00000(MainKt.o00000(44)) : object3);
            System.out.println((Object)MainKt.o00000(187));
            System.out.println((Object)(\u00f500000 + MainKt.o00000(530) + OO0000));
            object3 = (Iterable)object2;
            int n2 = 0;
            object3 = object3.iterator();
            while (object3.hasNext()) {
                int n3;
                Object e2 = object3.next();
                if ((n3 = n2++) < 0) {
                    mc.\u00d800000();
                }
                object4 = (String)e2;
                int n4 = n3;
                boolean bl = MainKt.o00000((String)object4);
                CharSequence charSequence = MainKt.\u00d8o0000((String)object4);
                charSequence = b.q.f.\u00f800000(charSequence) ? "?" : charSequence;
                charSequence = "  " + if + '[' + (n4 + 1) + ']' + OO0000 + ' ' + (String)object4 + " | Cookie:" + (bl ? if + "OK" + OO0000 : \u00f800000 + "NO" + OO0000) + " | UID:" + (String)charSequence;
                System.out.println(charSequence);
            }
            System.out.println();
            System.out.println((Object)MainKt.o00000(188));
            System.out.println((Object)MainKt.o00000(189));
            System.out.println((Object)MainKt.o00000(190));
            System.out.println((Object)MainKt.o00000(191));
            if (fc.o00000((Object)System.getenv("I00OO0IL0"), (Object)"lIlOIl00II011OI0I")) {
                Runtime.getRuntime().halt(7);
            }
            System.out.println((Object)(\u00d800000 + "[5]" + OO0000 + MainKt.o00000(551)));
            System.out.println((Object)(\u00f800000 + "[6]" + OO0000 + MainKt.o00000(552)));
            System.out.println((Object)MainKt.o00000(192));
            System.out.println();
            switch (MainKt.oo0000(MainKt.o00000(193))) {
                case "1": {
                    object3 = MainKt.o00000(properties, MainKt.o00000(194));
                    if (object3 == null) {
                        for (Object object4 : (Iterable)object2) {
                            System.out.println((Object)(MainKt.o00000(553) + (String)object4 + MainKt.o00000(554)));
                            MainKt.\u00d400000((String)object4);
                        }
                        break;
                    }
                    MainKt.\u00d400000((String)object3);
                    break;
                }
                case "2": {
                    object3 = MainKt.o00000(properties, MainKt.o00000(195));
                    if (object3 == null) {
                        Iterator iterator = ((Iterable)object2).iterator();
                        while (iterator.hasNext()) {
                            MainKt.if((String)iterator.next());
                        }
                        break;
                    }
                    MainKt.if((String)object3);
                    break;
                }
                case "3": {
                    object3 = MainKt.o00000(properties, MainKt.o00000(196));
                    if (object3 == null) {
                        Iterator iterator = ((Iterable)object2).iterator();
                        while (iterator.hasNext()) {
                            MainKt.\u00f5O0000((String)iterator.next());
                        }
                        break;
                    }
                    MainKt.\u00f5O0000((String)object3);
                    break;
                }
                case "4": {
                    object3 = MainKt.o00000(properties, MainKt.o00000(197));
                    if (object3 == null) {
                        Iterator iterator = ((Iterable)object2).iterator();
                        while (iterator.hasNext()) {
                            MainKt.while((String)iterator.next());
                        }
                        break;
                    }
                    MainKt.while((String)object3);
                    break;
                }
                case "5": {
                    String string = MainKt.o00000(properties, MainKt.o00000(198));
                    Object object5 = string == null ? object2 : mc.o00000(string);
                    object3 = MainKt.oo0000("Nhap cookie (.ROBLOSECURITY) cho " + mc.o00000((Iterable)object5, ", ", null, null, 0, null, null, 62, null));
                    if (!(!b.q.f.\u00f800000((CharSequence)object3))) break;
                    new File(MainKt.o00000(199)).mkdirs();
                    b.l.f.o00000(new File(MainKt.o00000(121)), (String)object3, null, 2, null);
                    object4 = ((Iterable)object5).iterator();
                    while (object4.hasNext()) {
                        MainKt.\u00d300000((String)object4.next(), (String)object3);
                    }
                    break;
                }
                case "6": {
                    String string = MainKt.o00000(properties, MainKt.o00000(200));
                    object3 = (string == null ? object2 : mc.o00000(string)).iterator();
                    while (object3.hasNext()) {
                        String string2 = (String)object3.next();
                        System.out.println((Object)(\u00f500000 + MainKt.o00000(555) + string2 + MainKt.o00000(556) + OO0000));
                        object4 = MainKt.o00000(347) + string2 + MainKt.o00000(353);
                        MainKt.\u00d4O0000(MainKt.return() + ' ' + MainKt.\u00f500000((String)object4) + " \"DELETE FROM cookies WHERE name IN ('.ROBLOSECURITY', '.RBXID', 'RBXEventTrackerV2', 'GuestData');\"");
                        MainKt.\u00d4O0000(MainKt.o00000(557) + string2 + MainKt.o00000(359) + string2 + MainKt.o00000(360));
                        MainKt.\u00d4O0000(MainKt.o00000(417) + string2);
                        System.out.println((Object)(if + MainKt.o00000(558) + string2 + OO0000));
                    }
                    System.out.println((Object)(if + MainKt.o00000(559) + OO0000));
                    if (System.nanoTime() >= 0L) break;
                    object3 = String.valueOf(Math.random());
                    System.out.println(object3);
                    break;
                }
                case "7": {
                    return;
                }
                default: {
                    System.out.println((Object)MainKt.o00000(201));
                }
            }
            System.out.println();
            System.out.println((Object)MainKt.o00000(202));
            b.l.r.\u00d200000();
            System.out.println();
        }
    }

    private static f \u00d4O0000(String object) {
        try {
            String[] stringArray = new String[3];
            Object object2 = stringArray;
            stringArray[0] = "su";
            object2[1] = "-c";
            object2[2] = object;
            object = new ProcessBuilder((String)object2).start();
            Object object3 = ((Process)object).getInputStream();
            Object object4 = fb.\u00d300000;
            Object object5 = new InputStreamReader((InputStream)object3, (Charset)object4);
            object2 = ((Object)b.q.f.\u00f400000(s.o00000((Reader)new BufferedReader((Reader)object5, 8192)))).toString();
            object4 = ((Process)object).getErrorStream();
            object5 = fb.\u00d300000;
            object3 = new InputStreamReader((InputStream)object4, (Charset)object5);
            object3 = ((Object)b.q.f.\u00f400000(s.o00000((Reader)new BufferedReader((Reader)object3, 8192)))).toString();
            if (!((Process)object).waitFor(30L, TimeUnit.SECONDS)) {
                ((Process)object).destroyForcibly();
                String string = System.getProperty("java.vm.name");
                boolean bl = string != null && (string = string.toLowerCase(Locale.ROOT)) != null ? b.q.f.\u00d300000((CharSequence)string, (CharSequence)"debug", false, 2, null) : false;
                if (bl) {
                    Runtime.getRuntime().halt(7);
                }
                return new f(false, -1, "", MainKt.o00000(14));
            }
            int n2 = ((Process)object).exitValue();
            object = new f(n2 == 0, n2, (String)object2, (String)object3);
        }
        catch (Exception exception) {
            String string = exception.getMessage();
            if (string == null) {
                string = MainKt.o00000(15);
            }
            object = new f(false, -1, "", string);
        }
        return object;
    }

    private static boolean o00000(String string, long l2) {
        if ((System.nanoTime() & 1L) == 2L) {
            Runtime.getRuntime().gc();
            System.exit(1);
        }
        if (b.q.f.\u00f800000(string = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(327) + string))).toString())) {
            return false;
        }
        String string2 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(331) + string + MainKt.o00000(332)))).toString();
        String string3 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000("cat /proc/uptime 2>/dev/null | awk '{print $1}'"))).toString();
        Long l3 = b.q.f.voidsuper(string2);
        long l4 = l3 != null ? l3 : 0L;
        Double d2 = b.q.f.\u00d4O0000(string3);
        double d3 = d2 != null ? d2 : 0.0;
        if ((l4 > 0L && d3 > 0.0 ? (long)(d3 - (double)l4 / 100.0) : 0L) < l2) {
            return false;
        }
        String string4 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(333) + string + MainKt.o00000(334)))).toString();
        string = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(328) + string + MainKt.o00000(335)))).toString();
        return b.q.f.\u00f800000(string4) && b.q.f.\u00f800000(string);
    }

    private static void \u00d300000(String string, String object) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        String[] stringArray = new String[1];
        Object object6 = stringArray;
        stringArray[0] = "Il0lI";
        int cfr_ignored_0 = ((String[])object6).length;
        object6 = MainKt.o00000(347) + string + MainKt.o00000(353);
        Object object7 = MainKt.o00000(347) + string + MainKt.o00000(476);
        String string2 = MainKt.o00000(347) + string;
        CharSequence charSequence = MainKt.o00000(138);
        if (!MainKt.\u00d4O0000((String)new StringBuilder().append((String)MainKt.o00000((int)363)).append((String)string).toString()).\u00d200000) {
            System.out.println((Object)(MainKt.o00000(477) + string + MainKt.o00000(478)));
            return;
        }
        MainKt.\u00d4O0000(MainKt.o00000(417) + string);
        Thread.sleep(500L);
        if (!fc.o00000((Object)((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(314) + (String)object6 + MainKt.o00000(479)))).toString(), (Object)MainKt.o00000(139))) {
            System.out.println((Object)(\u00f500000 + MainKt.o00000(480) + OO0000));
            MainKt.while(string);
            System.out.println((Object)(return + MainKt.o00000(481) + OO0000));
            Thread.sleep(8000L);
            MainKt.\u00d4O0000(MainKt.o00000(417) + string);
            Thread.sleep(1000L);
            if (!fc.o00000((Object)((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(314) + (String)object6 + MainKt.o00000(479)))).toString(), (Object)MainKt.o00000(139))) {
                System.out.println((Object)(\u00f500000 + MainKt.o00000(482) + OO0000));
                MainKt.\u00d4O0000(MainKt.o00000(483) + (String)object7);
                object5 = "CREATE TABLE IF NOT EXISTS cookies (creation_utc INTEGER NOT NULL, host_key TEXT NOT NULL DEFAULT '', top_frame_site_key TEXT NOT NULL DEFAULT '', name TEXT NOT NULL DEFAULT '', value TEXT NOT NULL DEFAULT '', encrypted_value BLOB NOT NULL DEFAULT X'', path TEXT NOT NULL DEFAULT '', expires_utc INTEGER NOT NULL DEFAULT 0, is_secure INTEGER NOT NULL DEFAULT 0, is_httponly INTEGER NOT NULL DEFAULT 0, last_access_utc INTEGER NOT NULL DEFAULT 0, has_expires INTEGER NOT NULL DEFAULT 1, is_persistent INTEGER NOT NULL DEFAULT 1, priority INTEGER NOT NULL DEFAULT 1, samesite INTEGER NOT NULL DEFAULT -1, source_scheme INTEGER NOT NULL DEFAULT 0, source_port INTEGER NOT NULL DEFAULT -1, last_update_utc INTEGER NOT NULL DEFAULT 0);\nCREATE TABLE IF NOT EXISTS meta (key TEXT NOT NULL UNIQUE PRIMARY KEY, value TEXT NOT NULL);\nINSERT OR IGNORE INTO meta VALUES ('version','20');\nINSERT OR IGNORE INTO meta VALUES ('last_compatible_version','20');";
                object4 = new File(MainKt.o00000(140));
                try {
                    b.l.f.o00000((File)object4, (String)object5, null, 2, null);
                }
                catch (Exception exception) {
                    MainKt.\u00d4O0000(MainKt.o00000(484) + MainKt.\u00f500000((String)object5) + MainKt.o00000(485));
                }
                object3 = MainKt.\u00d4O0000(MainKt.return() + ' ' + (String)object6 + MainKt.o00000(486));
                MainKt.\u00d4O0000(MainKt.o00000(141));
                if (!((f)object3).\u00d200000) {
                    Object object8;
                    CharSequence charSequence2 = new StringBuilder().append(\u00f800000).append("-> LOI tao DB: ");
                    object4 = ((f)object3).o00000;
                    if (b.q.f.\u00f800000((CharSequence)object4)) {
                        charSequence = charSequence2;
                        object8 = ((f)object3).\u00d200000;
                        charSequence2 = charSequence;
                    } else {
                        object8 = object4;
                    }
                    object4 = charSequence2.append((String)object8).append(OO0000).toString();
                    System.out.println(object4);
                    return;
                }
                System.out.println((Object)(if + MainKt.o00000(487) + OO0000));
                MainKt.\u00d4O0000(MainKt.o00000(488) + '$' + MainKt.o00000(450) + string2 + "):$" + MainKt.o00000(452) + string2 + ") " + (String)object7);
                MainKt.\u00d4O0000(MainKt.o00000(456) + (String)object6);
                MainKt.\u00d4O0000(MainKt.o00000(489) + (String)object7 + MainKt.o00000(490));
            } else {
                System.out.println((Object)(if + MainKt.o00000(491) + OO0000));
            }
        }
        object7 = b.q.f.\u00f600000(MainKt.\u00f4O0000(MainKt.return() + ' ' + (String)object6 + " \"PRAGMA table_info(cookies);\""));
        object5 = new ArrayList();
        object7 = object7.iterator();
        while (object7.hasNext()) {
            String[] stringArray2 = new String[1];
            object3 = stringArray2;
            stringArray2[0] = "|";
            object3 = b.q.f.super((CharSequence)((String)object7.next()), (String[])object3, false, 0, 6, null);
            String string3 = object3.size() >= 2 ? ((Object)b.q.f.\u00f400000((String)object3.get(1))).toString() : null;
            if (string3 == null) continue;
            object3 = string3;
            object5.add(object3);
        }
        object5 = (List)object5;
        System.out.println((Object)(\u00d300000 + MainKt.o00000(492) + object5.size() + MainKt.o00000(493) + OO0000));
        object3 = b.q.f.super((String)object, "'", "''", false, 4, null);
        object4 = new ArrayList();
        object7 = new ArrayList();
        object5 = object5.iterator();
        while (object5.hasNext()) {
            object = (String)object5.next();
            object4.add(object);
            object2 = object;
            if (fc.o00000(object2, (Object)MainKt.o00000(142))) {
                object7.add(MainKt.o00000(143));
                continue;
            }
            if (fc.o00000(object2, (Object)MainKt.o00000(144))) {
                object7.add(MainKt.o00000(145));
                continue;
            }
            if (fc.o00000(object2, (Object)MainKt.o00000(146))) {
                object7.add("''");
                continue;
            }
            if (fc.o00000(object2, (Object)MainKt.o00000(147))) {
                object7.add(MainKt.o00000(148));
                continue;
            }
            if (fc.o00000(object2, (Object)"value")) {
                object7.add("'" + (String)object3 + '\'');
                continue;
            }
            if (fc.o00000(object2, (Object)MainKt.o00000(149))) {
                object7.add(MainKt.o00000(150));
                continue;
            }
            if (fc.o00000(object2, (Object)MainKt.o00000(151))) {
                object7.add(MainKt.o00000(152));
                continue;
            }
            if (fc.o00000(object2, (Object)MainKt.o00000(153))) {
                object7.add(MainKt.o00000(154));
                continue;
            }
            if (fc.o00000(object2, (Object)MainKt.o00000(155)) || fc.o00000(object2, (Object)MainKt.o00000(156))) {
                object7.add("1");
                continue;
            }
            if (fc.o00000(object2, (Object)MainKt.o00000(157)) || fc.o00000(object2, (Object)MainKt.o00000(158))) {
                object7.add("1");
                continue;
            }
            if (fc.o00000(object2, (Object)MainKt.o00000(159))) {
                object7.add(MainKt.o00000(143));
                continue;
            }
            if (fc.o00000(object2, (Object)MainKt.o00000(160))) {
                object7.add("1");
                continue;
            }
            if (fc.o00000(object2, (Object)MainKt.o00000(161)) || fc.o00000(object2, (Object)MainKt.o00000(162))) {
                object7.add("1");
                continue;
            }
            if (fc.o00000(object2, (Object)MainKt.o00000(163))) {
                object7.add("1");
                continue;
            }
            if (fc.o00000(object2, (Object)MainKt.o00000(164))) {
                object7.add("-1");
                continue;
            }
            if (fc.o00000(object2, (Object)MainKt.o00000(165))) {
                object7.add("2");
                continue;
            }
            if (fc.o00000(object2, (Object)MainKt.o00000(166))) {
                object7.add(MainKt.o00000(167));
                continue;
            }
            if (fc.o00000(object2, (Object)MainKt.o00000(168))) {
                object7.add(MainKt.o00000(169));
                continue;
            }
            object7.add("''");
        }
        object5 = MainKt.o00000(170) + "INSERT OR REPLACE INTO cookies (" + mc.o00000((Iterable)object4, ", ", null, null, 0, null, null, 62, null) + ") VALUES (" + mc.o00000((Iterable)object7, ", ", null, null, 0, null, null, 62, null) + ");";
        System.out.println((Object)(return + MainKt.o00000(494) + string + "..." + OO0000));
        MainKt.\u00d4O0000(MainKt.o00000(417) + string);
        Thread.sleep(500L);
        MainKt.\u00d4O0000(MainKt.o00000(325) + (String)object6 + MainKt.o00000(495) + (String)object6 + MainKt.o00000(496) + (String)object6 + MainKt.o00000(497));
        try {
            object2 = b.q.f.\u00d300000(charSequence, (CharSequence)"/sdcard/");
            object = "/sdcard/".concat(String.valueOf(object2));
            b.l.f.o00000(new File((String)object), (String)object5, null, 2, null);
        }
        catch (Exception exception) {
            MainKt.\u00d4O0000(MainKt.o00000(411) + charSequence + MainKt.o00000(498) + (String)object5 + MainKt.o00000(499));
        }
        object = MainKt.\u00d4O0000(MainKt.return() + ' ' + (String)object6 + " < " + charSequence);
        MainKt.\u00d4O0000(MainKt.o00000(325) + charSequence);
        if (!((f)object).\u00d200000) {
            CharSequence charSequence3;
            CharSequence charSequence4 = new StringBuilder().append(\u00f800000).append("FAIL insert: ");
            object2 = ((f)object).o00000;
            if (b.q.f.\u00f800000((CharSequence)object2)) {
                charSequence = charSequence4;
                charSequence3 = ((f)object).\u00d200000;
                charSequence4 = charSequence;
            } else {
                charSequence3 = object2;
            }
            System.out.println((Object)charSequence4.append((String)charSequence3).append(OO0000).toString());
            System.out.println((Object)(\u00f500000 + MainKt.o00000(500) + OO0000));
            MainKt.\u00d4O0000(MainKt.return() + ' ' + (String)object6 + " \"DELETE FROM cookies WHERE name='.ROBLOSECURITY';\"");
            object2 = MainKt.\u00d4O0000(MainKt.return() + ' ' + (String)object6 + " \"INSERT OR REPLACE INTO cookies (" + mc.o00000((Iterable)object4, ", ", null, null, 0, null, null, 62, null) + ") VALUES (" + mc.o00000((Iterable)object7, ", ", null, null, 0, null, null, 62, null) + ");\"");
            if (!((f)object2).\u00d200000) {
                Object object9;
                CharSequence charSequence5 = new StringBuilder().append(\u00f800000).append("FAIL fallback: ");
                object = ((f)object2).o00000;
                if (b.q.f.\u00f800000((CharSequence)object)) {
                    charSequence = charSequence5;
                    object9 = ((f)object2).\u00d200000;
                    charSequence5 = charSequence;
                } else {
                    object9 = object;
                }
                System.out.println((Object)charSequence5.append((String)object9).append(OO0000).toString());
            }
        }
        MainKt.\u00d4O0000(MainKt.return() + ' ' + (String)object6 + " \"PRAGMA journal_mode=DELETE;\"");
        MainKt.\u00d4O0000(MainKt.return() + ' ' + (String)object6 + " \"VACUUM;\"");
        MainKt.\u00d4O0000(MainKt.o00000(325) + (String)object6 + MainKt.o00000(495) + (String)object6 + MainKt.o00000(496) + (String)object6 + MainKt.o00000(497));
        MainKt.\u00d4O0000(MainKt.o00000(501) + '$' + MainKt.o00000(450) + string2 + "):$" + MainKt.o00000(452) + string2 + ") " + (String)object6 + MainKt.o00000(326));
        MainKt.\u00d4O0000(MainKt.o00000(501) + '$' + MainKt.o00000(450) + string2 + "):$" + MainKt.o00000(452) + string2 + ") " + (String)object6 + MainKt.o00000(502));
        MainKt.\u00d4O0000(MainKt.o00000(501) + '$' + MainKt.o00000(450) + string2 + "):$" + MainKt.o00000(452) + string2 + ") " + (String)object6 + MainKt.o00000(503));
        MainKt.\u00d4O0000(MainKt.o00000(501) + '$' + MainKt.o00000(450) + string2 + "):$" + MainKt.o00000(452) + string2 + ") " + (String)object6 + MainKt.o00000(504));
        object2 = MainKt.o00000(347) + string + MainKt.o00000(476);
        MainKt.\u00d4O0000(MainKt.o00000(488) + '$' + MainKt.o00000(450) + string2 + "):$" + MainKt.o00000(452) + string2 + ") " + (String)object2 + MainKt.o00000(326));
        MainKt.\u00d4O0000(MainKt.o00000(456) + (String)object6);
        MainKt.\u00d4O0000(MainKt.o00000(505) + (String)object2);
        MainKt.\u00d4O0000(MainKt.o00000(489) + (String)object2 + MainKt.o00000(490));
        MainKt.\u00d4O0000(MainKt.o00000(506) + (String)object6 + MainKt.o00000(490));
        Integer n2 = b.q.f.Objectsuper(((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.return() + ' ' + (String)object6 + " \"SELECT COUNT(*) FROM cookies WHERE name='.ROBLOSECURITY' AND LENGTH(value) > 0;\""))).toString());
        int n3 = n2 != null ? n2 : 0;
        if (n3 > 0) {
            System.out.println((Object)(if + MainKt.o00000(507) + string + MainKt.o00000(508) + n3 + MainKt.o00000(509) + OO0000));
            System.out.println((Object)(return + MainKt.o00000(510) + string + MainKt.o00000(511) + OO0000));
            Thread.sleep(500L);
            MainKt.while(string);
            System.out.println((Object)(if + MainKt.o00000(512) + OO0000));
            if ((System.currentTimeMillis() & 0L) != 0L) {
                Thread.sleep(382L);
                return;
            }
        } else {
            System.out.println((Object)(\u00f800000 + MainKt.o00000(513) + string + '!' + OO0000));
        }
    }

    private static String \u00f4O0000(String object) {
        object = MainKt.\u00d4O0000((String)object);
        if (!b.q.f.\u00f800000(((f)object).\u00d200000)) {
            return ((f)object).\u00d200000;
        }
        return ((f)object).o00000;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static e OO0000(String var0) {
        block56: {
            block61: {
                block60: {
                    block59: {
                        block58: {
                            block57: {
                                block55: {
                                    var1_1 = MainKt.\u00f4O0000(MainKt.o00000(363) + var0);
                                    if (b.q.f.\u00f800000(var1_1) || b.q.f.\u00d400000((CharSequence)var1_1, (CharSequence)MainKt.o00000(51), true)) {
                                        return new e(var0, MainKt.o00000(52), "", "", "", "", "");
                                    }
                                    var1_1 = b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(327) + var0)).toString();
                                    if (b.q.f.\u00f800000(var1_1)) {
                                        var1_1 = b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(364) + var0 + MainKt.o00000(365))).toString();
                                    }
                                    var2_2 = MainKt.\u00f4O0000(MainKt.o00000(366) + var0);
                                    var3_3 = MainKt.\u00f4O0000(MainKt.o00000(367) + var0);
                                    var4_4 = b.q.f.\u00d300000((CharSequence)var2_2, (CharSequence)var0, false, 2, null) != false || b.q.f.\u00d300000((CharSequence)var3_3, (CharSequence)var0, false, 2, null) != false;
                                    var5_5 = MainKt.\u00f4O0000(MainKt.o00000(368) + var0 + MainKt.o00000(369));
                                    if (!b.q.f.\u00d400000((CharSequence)var5_5, (CharSequence)var0, true)) ** GOTO lbl-1000
                                    v0 = var5_5;
                                    v1 = new String[4];
                                    var5_5 = v1;
                                    v1[0] = MainKt.o00000(53);
                                    var5_5[1] = MainKt.o00000(54);
                                    var5_5[2] = MainKt.o00000(55);
                                    var5_5[3] = MainKt.o00000(56);
                                    if (MainKt.new((String)v0, mc.new(var5_5))) {
                                        v2 = true;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        v2 = false;
                                    }
                                    var5_6 = v2 != false && b.q.f.\u00f800000(var1_1) != false;
                                    var6_7 = false;
                                    var7_8 = MainKt.o00000(57);
                                    if (b.q.f.\u00f800000(var1_1) == false && b.q.f.\u00f800000((CharSequence)(var7_8 = MainKt.\u00f4O0000(MainKt.o00000(333) + var1_1 + MainKt.o00000(370) + (String)var7_8 + MainKt.o00000(371)))) == false) {
                                        block53: {
                                            v3 = b.q.f.\u00f600000((CharSequence)var7_8);
                                            var11_10 = v3.listIterator(v3.size());
                                            while (var11_10.hasPrevious()) {
                                                var14_15 = var11_10.previous();
                                                if (!(b.q.f.\u00f800000((String)var14_15) == false)) continue;
                                                v4 = var14_15;
                                                break block53;
                                            }
                                            v4 = null;
                                        }
                                        if ((v5 = (String)v4) == null) {
                                            v5 = "";
                                        }
                                        if ((var9_21 = kb.super(new kb("\\d{2}-\\d{2} (\\d{2}):(\\d{2}):"), var8_19 = v5, 0, 2, null)) != null) {
                                            v6 = b.q.f.Objectsuper((String)var9_21.\u00d600000().get(1));
                                            var10_28 = v6 != null ? v6 : -1;
                                            v7 = b.q.f.Objectsuper((String)var9_21.\u00d600000().get(2));
                                            var9_22 = v7 != null ? v7 : -1;
                                            var11_11 = LocalTime.now().getMinute();
                                            var15_31 = (LocalTime.now().getHour() * 60 + var11_11 - (var10_28 * 60 + var9_22) + 1440) % 1440;
                                            v8 = var15_31 >= 0 ? var15_31 < 6 : false;
                                            if (v8) {
                                                var6_7 = true;
                                            }
                                        } else {
                                            var6_7 = false;
                                        }
                                    }
                                    var9_23 = var0;
                                    v9 = new String[3];
                                    var7_8 = v9;
                                    v9[0] = MainKt.o00000(347) + var9_23 + MainKt.o00000(348);
                                    var7_8[1] = MainKt.o00000(349) + var9_23 + MainKt.o00000(348);
                                    var7_8[2] = MainKt.o00000(320) + var9_23 + MainKt.o00000(350);
                                    var9_23 = mc.o00000(mc.new(var7_8), " ", null, null, 0, null, (b.o.e.g)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, o\u00d20000(java.lang.String ), (Ljava/lang/String;)Ljava/lang/CharSequence;)(), 30, null);
                                    var7_9 = b.q.f.\u00f800000(MainKt.\u00f4O0000("find " + var9_23 + " -type f -mmin -10 2>/dev/null | head -n 10 | while read f; do tail -n 100 \"${'$'}f\" 2>/dev/null; done | grep -iE 'kicked|disconnect|lost connection|same account|error code|fatal|crash|exception' | tail -n 20")) == false;
                                    var8_20 = false;
                                    try {
                                        var10_29 = b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(58))).toString();
                                        if (b.q.f.\u00f800000(var10_29) == false && (var11_12 = kb.super(new kb("Timestamp \\(Unix\\):\\s*(\\d+)"), var9_23 = b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(372) + var10_29 + MainKt.o00000(373))).toString(), 0, 2, null)) != null) {
                                            v10 = b.q.f.voidsuper((String)var11_12.\u00d600000().get(1));
                                            var14_16 = v10 != null ? v10 : 0L;
                                            var18_32 = System.currentTimeMillis() / 1000L - var14_16;
                                            if (var18_32 < 180L) {
                                                var8_20 = true;
                                                var20_36 = b.q.f.\u00d300000((CharSequence)var9_23, (CharSequence)MainKt.o00000(59), false, 2, null) == false;
                                                v11 = kb.super(new kb("Last Action:\\s*(.+)"), var9_23, 0, 2, null);
                                                if (v11 == null || (v11 = v11.\u00d600000()) == null || (v11 = (String)v11.get(1)) == null || (v11 = b.q.f.\u00f400000((CharSequence)v11).toString()) == null) {
                                                    v11 = MainKt.o00000(60);
                                                }
                                                var13_38 = v11;
                                                var9_23 = MainKt.o00000(374) + var18_32 + MainKt.o00000(375) + var20_36 + MainKt.o00000(376) + (String)var13_38;
                                                System.out.println((Object)(MainKt.\u00f800000 + MainKt.o00000(377) + var9_23 + MainKt.OO0000));
                                            }
                                        }
                                    }
                                    catch (Exception v12) {}
                                    var10_30 = false;
                                    if (b.q.f.\u00f800000(var1_1) && b.q.f.\u00f800000(var9_23 = b.q.f.\u00f400000(MainKt.\u00f4O0000("logcat -d -t 300 | grep -iE 'kicked|disconnect.*reason|lost connection|same account|Connection lost' | grep -i '" + b.q.f.super(var0, ".", "\\\\.", false, 4, null) + "\\|roblox' | tail -n 3")).toString()) == false) {
                                        block54: {
                                            v13 = b.q.f.\u00f600000(var9_23);
                                            var17_40 = v13.listIterator(v13.size());
                                            while (var17_40.hasPrevious()) {
                                                var18_33 = var17_40.previous();
                                                if (!(b.q.f.\u00f800000((String)var18_33) == false)) continue;
                                                v14 = var18_33;
                                                break block54;
                                            }
                                            v14 = null;
                                        }
                                        if ((v15 = (String)v14) == null) {
                                            v15 = "";
                                        }
                                        if ((var14_17 = kb.super(new kb("\\d{2}-\\d{2} (\\d{2}):(\\d{2}):"), var11_13 = v15, 0, 2, null)) != null) {
                                            v16 = b.q.f.Objectsuper((String)var14_17.\u00d600000().get(1));
                                            var15_31 = v16 != null ? v16 : -1;
                                            v17 = b.q.f.Objectsuper((String)var14_17.\u00d600000().get(2));
                                            var16_43 = v17 != null ? v17 : -1;
                                            var17_41 = LocalTime.now().getMinute();
                                            var19_45 = (LocalTime.now().getHour() * 60 + var17_41 - (var15_31 * 60 + var16_43) + 1440) % 1440;
                                            v18 = var19_45 >= 0 ? var19_45 < 6 : false;
                                            if (v18) {
                                                var10_30 = true;
                                                System.out.println((Object)(MainKt.\u00f800000 + MainKt.o00000(378) + b.q.f.interface(var11_13, 100) + MainKt.OO0000));
                                            }
                                        }
                                    }
                                    var9_23 = MainKt.thissuper(var0);
                                    var11_14 = false;
                                    var14_18 = false;
                                    var15_31 = 0;
                                    var16_44 = "";
                                    if (b.q.f.\u00d300000(var9_23, MainKt.o00000(63), true)) {
                                        var11_14 = true;
                                        MainKt.\u00d5O0000(var0);
                                    } else if (b.q.f.\u00d300000(var9_23, MainKt.o00000(64), true)) {
                                        var15_31 = 1;
                                        System.out.println((Object)(MainKt.\u00f500000 + MainKt.o00000(379) + MainKt.OO0000));
                                    } else if (b.q.f.\u00d300000(var9_23, MainKt.o00000(65), true)) {
                                        v19 = new String[1];
                                        var18_34 /* !! */  = v19;
                                        v19[0] = ":";
                                        var17_40 = b.q.f.super((CharSequence)b.q.f.\u00d300000(var9_23, (CharSequence)MainKt.o00000(65)), var18_34 /* !! */ , false, 0, 6, null);
                                        v20 /* !! */  = (String)mc.\u00f400000((List)var17_40, 0);
                                        if (v20 /* !! */  == null || (v20 /* !! */  = b.q.f.\u00f400000((CharSequence)v20 /* !! */ ).toString()) == null) {
                                            v20 /* !! */  = var18_34 /* !! */  = "";
                                        }
                                        if ((v21 = (String)mc.\u00f400000((List)var17_40, 1)) == null || (v21 = b.q.f.\u00f400000(v21).toString()) == null) {
                                            v21 = var16_44 = "";
                                        }
                                        if ((var19_46 = b.q.f.voidsuper((String)var18_34 /* !! */ )) != null && System.currentTimeMillis() / 1000L - var19_46 > 45L) {
                                            var14_18 = true;
                                        }
                                    }
                                    var17_42 = MainKt.o00000(var0);
                                    var18_35 = MainKt.\u00d8o0000(var0);
                                    if (b.q.f.\u00f800000(var18_35)) {
                                        var18_35 = MainKt.\u00d5o0000(var0);
                                    }
                                    v22 = new String[3];
                                    var19_47 = v22;
                                    v22[0] = "placeId\\s*=\\s*([0-9]{5,})";
                                    var19_47[1] = "placeId[\\\"'=:\\s]+([0-9]{5,})";
                                    var19_47[2] = "place_id[\\\"'=:\\s]+([0-9]{5,})";
                                    var20_37 = MainKt.o00000(MainKt.\u00f4O0000(MainKt.o00000(380) + var0 + MainKt.o00000(381)), mc.new(var19_47));
                                    if (b.q.f.\u00f800000((CharSequence)var20_37)) {
                                        var9_23 = var0;
                                        var12_49 = MainKt.\u00f4O0000(MainKt.o00000(361) + var9_23);
                                        v23 = kb.super(new kb("placeId=([0-9]+)", b.q.g.void), var12_49, 0, 2, null);
                                        if (v23 == null || (v23 = v23.class()) == null || (v23 = v23.o00000(1)) == null || (v23 = v23.Object()) == null) {
                                            v23 = "";
                                        }
                                        var20_37 = v23;
                                    }
                                    var19_48 = false;
                                    if (b.q.f.\u00f800000(var1_1) == false && !(var19_48 = b.q.f.\u00f800000(MainKt.\u00f4O0000(MainKt.o00000(333) + var1_1 + MainKt.o00000(382))) == false)) {
                                        var9_24 = b.q.f.\u00d400000((CharSequence)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(383) + var0 + MainKt.o00000(384))).toString(), (CharSequence)MainKt.o00000(66), true);
                                        var12_49 = b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(331) + var1_1 + MainKt.o00000(332))).toString();
                                        var13_38 = b.q.f.\u00f400000(MainKt.\u00f4O0000("cat /proc/uptime 2>/dev/null | awk '{print $1}'")).toString();
                                        v24 = b.q.f.voidsuper(var12_49);
                                        var22_50 = v24 != null ? v24 : 0L;
                                        v25 = b.q.f.\u00d4O0000((String)var13_38);
                                        var24_51 = v25 != null ? v25 : 0.0;
                                        var26_52 = var22_50 > 0L && var24_51 > 0.0 ? (long)(var24_51 - (double)var22_50 / 100.0) : 0L;
                                        var12_49 = b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(328) + var1_1 + MainKt.o00000(385))).toString();
                                        if (var9_24 && var26_52 > 60L && b.q.f.\u00f800000(var12_49)) {
                                            var19_48 = true;
                                            var9_25 = MainKt.\u00d300000 + MainKt.o00000(386) + var26_52 + MainKt.o00000(387) + MainKt.OO0000;
                                            System.out.println((Object)var9_25);
                                        }
                                    }
                                    var13_39 = -1;
                                    var21_53 = false;
                                    if (b.q.f.\u00f800000(var18_35) == false && b.q.f.\u00f800000(var1_1) == false && (var9_26 = MainKt.return(var18_35)) != null) {
                                        var13_39 = var9_26;
                                        if (var9_26 == 2) {
                                            if (var6_7) {
                                                System.out.println((Object)(MainKt.if + MainKt.o00000(388) + MainKt.OO0000));
                                                if (System.nanoTime() < 0L) {
                                                    var12_49 = String.valueOf(Math.random());
                                                    System.out.println((Object)var12_49);
                                                }
                                                var6_7 = false;
                                            }
                                            if (var14_18) {
                                                var12_49 = MainKt.if + MainKt.o00000(389) + MainKt.OO0000;
                                                System.out.println((Object)var12_49);
                                                var14_18 = false;
                                            }
                                        } else if (var9_26 != 2 && var19_48 && !var11_14 && !var6_7) {
                                            var21_53 = true;
                                        }
                                    }
                                    if (!(b.q.f.\u00f800000(var18_35) == false) || (v26 = MainKt.Stringsuper(var18_35)) == null) {
                                        v26 = var9_27 = "";
                                    }
                                    if (var15_31 == 0) break block55;
                                    v27 = MainKt.o00000(67);
                                    break block56;
                                }
                                if (!var11_14) break block57;
                                v27 = MainKt.o00000(68);
                                break block56;
                            }
                            if (!var14_18 || !(b.q.f.\u00f800000(var1_1) == false)) break block58;
                            v27 = MainKt.o00000(68);
                            break block56;
                        }
                        if (!b.q.f.\u00f800000(var1_1) || !var8_20) break block59;
                        v27 = MainKt.o00000(69);
                        break block56;
                    }
                    if (!b.q.f.\u00f800000(var1_1) || !var10_30) break block60;
                    v27 = MainKt.o00000(68);
                    break block56;
                }
                if (!b.q.f.\u00f800000(var1_1) || !var5_6) break block61;
                v27 = MainKt.o00000(69);
                break block56;
            }
            if (b.q.f.\u00f800000(var1_1)) ** GOTO lbl-1000
            if (b.q.f.\u00f800000(var1_1) == false && var6_7) {
                v27 = MainKt.o00000(68);
            } else if (b.q.f.\u00f800000(var1_1) == false && fc.o00000((Object)var16_44, (Object)MainKt.o00000(61))) {
                v27 = MainKt.o00000(71);
            } else if (b.q.f.\u00f800000(var1_1) == false && (var19_48 || fc.o00000((Object)var16_44, (Object)MainKt.o00000(62)))) {
                v27 = MainKt.o00000(72);
            } else if (b.q.f.\u00f800000(var1_1) == false && var4_4 && !var19_48) {
                v27 = MainKt.o00000(73);
            } else if (b.q.f.\u00f800000(var1_1) == false && var21_53) {
                v27 = MainKt.o00000(68);
            } else if (b.q.f.\u00f800000(var1_1) == false) {
                v27 = MainKt.o00000(74);
            } else lbl-1000:
            // 2 sources

            {
                v27 = MainKt.o00000(70);
            }
        }
        var12_49 = v27;
        return new e(var0, var12_49, var1_1, var4_4, var5_6, var7_9, var17_42, var18_35, (String)var20_37, var2_2, var3_3, var9_27, var13_39, var19_48);
    }

    private static String o00000(Properties object, String string) {
        Object object2 = MainKt.if((Properties)object);
        if ((object = (List)(object2.isEmpty() ? mc.o00000(MainKt.o00000(44)) : object2)).size() == 1) {
            return (String)mc.Oo0000((List)object);
        }
        System.out.println((Object)(return + string + ':' + OO0000));
        object2 = (Iterable)object;
        int n2 = 0;
        object2 = object2.iterator();
        while (object2.hasNext()) {
            int n3;
            Object object3 = object2.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            object3 = (String)object3;
            System.out.println((Object)("  " + if + '[' + (n3 + 1) + ']' + OO0000 + ' ' + object3));
        }
        System.out.println((Object)("  " + \u00f400000 + "[0]" + OO0000 + MainKt.o00000(550)));
        object2 = ((Object)b.q.f.\u00f400000(MainKt.oo0000(MainKt.o00000(186)))).toString();
        if (fc.o00000(object2, (Object)"0")) {
            return null;
        }
        Integer n4 = b.q.f.Objectsuper((String)object2);
        if (n4 == null) {
            return (String)mc.Oo0000((List)object);
        }
        n2 = n4 - 1;
        String string2 = (String)mc.\u00f400000((List)object, n2);
        if (string2 == null) {
            string2 = (String)mc.Oo0000((List)object);
        }
        return string2;
    }

    private static void Oo0000(String charSequence) {
        Object object = MainKt.o00000(347) + charSequence + MainKt.o00000(353);
        MainKt.\u00d4O0000(MainKt.o00000(417) + charSequence);
        object = MainKt.\u00d4O0000(MainKt.return() + ' ' + MainKt.\u00f500000((String)object) + " \"DELETE FROM cookies WHERE host_key LIKE '%roblox.com%';\"");
        charSequence = ((f)object).\u00d200000 ? MainKt.o00000(459) + charSequence : (b.q.f.\u00f800000(charSequence = (CharSequence)((f)object).o00000) ? ((f)object).\u00d200000 : charSequence);
        System.out.println(charSequence);
    }

    private static String o00000(String object, String object2, String object3) {
        if (b.q.f.\u00f800000((CharSequence)object) || b.q.f.\u00f800000((CharSequence)object2)) {
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(MainKt.o00000(106)).openConnection();
        httpURLConnection.setRequestMethod(MainKt.o00000(103));
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Cookie", ".ROBLOSECURITY=".concat(String.valueOf(object)));
        httpURLConnection.setRequestProperty(MainKt.o00000(107), (String)object2);
        httpURLConnection.setRequestProperty("Referer", "https://www.roblox.com/games/" + (String)object3 + '/');
        httpURLConnection.setRequestProperty(MainKt.o00000(108), "1");
        httpURLConnection.setRequestProperty(MainKt.o00000(109), MainKt.o00000(110));
        try {
            object = httpURLConnection.getOutputStream();
            object2 = null;
            try {
                ((OutputStream)object).write("{}".getBytes(fb.\u00d300000));
            }
            catch (Throwable throwable) {
                try {
                    object3 = throwable;
                    object2 = throwable;
                    throw object3;
                }
                catch (Throwable throwable2) {
                    o.o00000((Closeable)object, (Throwable)object2);
                    throw throwable2;
                }
            }
            o.o00000((Closeable)object, null);
            int n2 = httpURLConnection.getResponseCode();
            boolean bl = 200 <= n2 ? n2 < 300 : false;
            if (bl) {
                object2 = httpURLConnection.getHeaderField(MainKt.o00000(111));
                return object2;
            }
        }
        catch (Exception exception) {
        }
        finally {
            httpURLConnection.disconnect();
        }
        return null;
    }

    private static boolean new(String string, List object) {
        if (!((object = (Iterable)object) instanceof Collection) || !((Collection)object).isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                String string2 = (String)object.next();
                if (!b.q.f.\u00d400000((CharSequence)string, (CharSequence)string2, true)) continue;
                return true;
            }
        }
        return false;
    }

    private static void \u00f800000(Properties serializable) {
        try {
            Closeable closeable;
            Serializable serializable2 = File.createTempFile(MainKt.o00000(36), MainKt.o00000(37));
            Object object = new FileOutputStream((File)serializable2);
            Object object2 = null;
            try {
                closeable = (FileOutputStream)object;
                serializable.store((OutputStream)closeable, MainKt.o00000(38));
            }
            catch (Throwable throwable) {
                try {
                    serializable2 = throwable;
                    object2 = throwable;
                    throw serializable2;
                }
                catch (Throwable throwable2) {
                    o.o00000((Closeable)object, (Throwable)object2);
                    throw throwable2;
                }
            }
            o.o00000((Closeable)object, null);
            object = OO0000.getAbsolutePath();
            object2 = MainKt.\u00d4O0000("cp " + MainKt.\u00f500000(((File)serializable2).getAbsolutePath()) + ' ' + MainKt.\u00f500000((String)object));
            ((File)serializable2).delete();
            if (!((f)object2).\u00d200000) {
                File file = OO0000.getParentFile();
                if (file != null) {
                    file.mkdirs();
                }
                closeable = new FileOutputStream(OO0000);
                serializable2 = null;
                try {
                    object = closeable;
                    serializable.store((OutputStream)object, MainKt.o00000(38));
                }
                catch (Throwable throwable) {
                    try {
                        serializable = throwable;
                        serializable2 = throwable;
                        throw serializable;
                    }
                    catch (Throwable throwable3) {
                        o.o00000(closeable, (Throwable)serializable2);
                        throw throwable3;
                    }
                }
                o.o00000(closeable, null);
                return;
            }
        }
        catch (Exception exception) {
            System.out.println((Object)(\u00f800000 + MainKt.o00000(339) + exception.getMessage() + OO0000));
        }
    }

    private static List \u00d800000(Properties object) {
        Object object22;
        Collection collection;
        Object object3;
        Object object4;
        Object object5;
        Object object62;
        Object object7;
        Iterable iterable;
        Object object8;
        String string;
        block17: {
            String string2 = ((Properties)object).getProperty(MainKt.o00000(95));
            if (string2 == null) {
                string2 = string = "";
            }
            if (!((Collection)(object8 = MainKt.if((Properties)object))).isEmpty()) {
                Object object9;
                Object object10 = object9 = (Iterable)object8;
                Object object11 = new ArrayList(mc.o00000((Iterable)object9, 10));
                int n2 = 0;
                Object object12 = object10.iterator();
                while (object12.hasNext()) {
                    int n3;
                    object10 = object12.next();
                    if ((n3 = n2++) < 0) {
                        mc.\u00d800000();
                    }
                    String string3 = (String)object10;
                    int n4 = n3;
                    Collection collection2 = object11;
                    collection2.add(new d("tab" + (n4 + 1), string3, string));
                }
                object8 = (List)object11;
                String string4 = ((Properties)object).getProperty(MainKt.o00000(96));
                if (string4 == null) {
                    string4 = "";
                }
                object = (String)(b.q.f.\u00f800000((CharSequence)(object10 = (CharSequence)string4)) ? MainKt.o00000(1) : object10);
                object9 = new File((String)object);
                object11 = object10 = new StringBuilder();
                ((StringBuilder)object10).append(MainKt.o00000(97)).append('\n');
                Iterator iterator = object8.iterator();
                while (iterator.hasNext()) {
                    object12 = (d)iterator.next();
                    ((StringBuilder)object11).append(((d)object12).new + '|' + ((d)object12).o00000 + '|' + ((d)object12).\u00d300000).append('\n');
                }
                object10 = ((StringBuilder)object10).toString();
                b.l.f.o00000((File)object9, (String)object10, null, 2, null);
                return object8;
            }
            String string5 = ((Properties)object).getProperty(MainKt.o00000(96));
            if (string5 == null) {
                string5 = "";
            }
            object8 = string5;
            iterable = mc.o00000(string5);
            object7 = new ArrayList();
            for (Object object62 : iterable) {
                if (!(!b.q.f.\u00f800000((String)object62))) continue;
                object7.add(object62);
            }
            object7 = object62 = (Iterable)mc.\u00f4\u00d20000(mc.return((Collection)((List)object7), (Iterable)OO0000));
            object5 = new ArrayList(mc.o00000(object62, 10));
            object62 = object7.iterator();
            while (object62.hasNext()) {
                Object object13 = object62.next();
                object13 = (String)object13;
                object4 = object5;
                object4.add(new File((String)object13));
            }
            object7 = ((Iterable)((List)object5)).iterator();
            while (object7.hasNext()) {
                object5 = object7.next();
                object3 = (File)object5;
                if (!(((File)object3).exists() && ((File)object3).isFile())) continue;
                collection = object5;
                break block17;
            }
            collection = null;
        }
        object62 = (File)((Object)collection);
        if (object62 != null) {
            object5 = b.l.f.o00000((File)object62, null, 1, null);
            object3 = new ArrayList();
            object22 = object5.iterator();
            while (object22.hasNext()) {
                if (MainKt.\u00d300000((String)object22.next()) == null) continue;
                object3.add(object7);
            }
            object62 = (List)object3;
            if (!((Collection)object62).isEmpty()) {
                return object62;
            }
        }
        object3 = object7 = (Iterable)((List)((iterable = (Collection)MainKt.\u00d400000((Properties)object)).isEmpty() ? mc.o00000(MainKt.o00000(44)) : iterable));
        object62 = new ArrayList(mc.o00000((Iterable)object7, 10));
        int n5 = 0;
        object22 = object3.iterator();
        while (object22.hasNext()) {
            int n6;
            Object object14 = object22.next();
            if ((n6 = n5++) < 0) {
                mc.\u00d800000();
            }
            object = (String)object14;
            int n7 = n6;
            object4 = object62;
            object4.add(new d("tab" + (n7 + 1), (String)object, string));
        }
        List list = (List)object62;
        object5 = (CharSequence)object8;
        object = (String)(b.q.f.\u00f800000((CharSequence)object5) ? MainKt.o00000(1) : object5);
        File file = new File((String)object);
        object62 = object3 = new StringBuilder();
        ((StringBuilder)object3).append(MainKt.o00000(98)).append('\n');
        ((StringBuilder)object62).append(MainKt.o00000(99)).append('\n');
        for (Object object22 : list) {
            ((StringBuilder)object62).append(((d)object22).new + '|' + ((d)object22).o00000 + '|' + ((d)object22).\u00d300000).append('\n');
        }
        object5 = ((StringBuilder)object3).toString();
        b.l.f.o00000(file, (String)object5, null, 2, null);
        System.out.println((Object)(MainKt.o00000(398) + file.getPath()));
        if (fc.o00000((Object)System.getenv("LIIL1001L"), (Object)"lO0010l1I0OO0l10I")) {
            Runtime.getRuntime().halt(6);
        }
        return list;
    }

    private static String return() {
        if (new == null) {
            new = MainKt.\u00f500000();
        }
        return new;
    }

    private static String oo0000(String string) {
        System.out.print((Object)(string + ": "));
        String string2 = b.l.r.\u00d200000();
        if (string2 == null) {
            string2 = "";
        }
        return ((Object)b.q.f.\u00f400000(string2)).toString();
    }

    private static void \u00d500000(Properties properties) {
        boolean bl;
        Object object;
        Object object2;
        block20: {
            CharSequence charSequence;
            int n2;
            CharSequence charSequence2;
            Object object3;
            if (Thread.currentThread().getName().length() < 0) {
                System.exit(37);
            }
            List list = (List)((object3 = (Collection)MainKt.if(properties)).isEmpty() ? mc.o00000(MainKt.o00000(44)) : object3);
            object3 = properties.getProperty(MainKt.o00000(95), "");
            System.out.println((Object)("\n" + \u00d400000 + return + MainKt.o00000(631) + OO0000));
            CharSequence charSequence3 = new StringBuilder().append(\u00f500000).append("Global PlaceID:").append(OO0000).append(' ');
            object2 = (CharSequence)object3;
            if (b.q.f.\u00f800000((CharSequence)object2)) {
                object2 = charSequence3;
                charSequence2 = "(chua set)";
                charSequence3 = object2;
            } else {
                charSequence2 = object2;
            }
            System.out.println((Object)charSequence3.append((String)charSequence2).toString());
            System.out.println();
            object2 = list;
            int n3 = 0;
            object2 = object2.iterator();
            while (object2.hasNext()) {
                Object object4;
                int n4;
                object = object2.next();
                if ((n4 = n3++) < 0) {
                    mc.\u00d800000();
                }
                object = (String)object;
                n2 = n4;
                String string = properties.getProperty("place_id.".concat(String.valueOf(object)), "");
                charSequence = string;
                String string2 = (String)(b.q.f.\u00f800000(charSequence) ? object3 : charSequence);
                charSequence = !b.q.f.\u00f800000(string) ? if + "(custom)" + OO0000 : \u00d300000 + "(global)" + OO0000;
                CharSequence charSequence4 = new StringBuilder("  ").append(if).append('[').append(n2 + 1).append(']').append(OO0000).append(' ').append((String)object).append(" | PlaceID: ");
                object = string2;
                if (b.q.f.\u00f800000((CharSequence)object)) {
                    object = charSequence4;
                    object4 = "(none)";
                    charSequence4 = object;
                } else {
                    object4 = object;
                }
                System.out.println((Object)charSequence4.append((String)object4).append(' ').append((String)charSequence).toString());
            }
            System.out.println();
            System.out.println((Object)(if + "[0]" + OO0000 + MainKt.o00000(632)));
            System.out.println((Object)(\u00f400000 + "[B]" + OO0000 + MainKt.o00000(539)));
            object2 = ((Object)b.q.f.\u00f400000(MainKt.oo0000(MainKt.o00000(209)))).toString();
            object3 = ((String)object2).toLowerCase(Locale.ROOT);
            if (fc.o00000(object3, (Object)"b")) {
                return;
            }
            if (fc.o00000(object3, (Object)"0")) {
                String string = MainKt.oo0000(MainKt.o00000(210));
                if (!b.q.f.\u00f800000(string)) {
                    boolean bl2;
                    block19: {
                        object2 = string;
                        for (int i2 = 0; i2 < object2.length(); ++i2) {
                            if (Character.isDigit(object2.charAt(i2))) continue;
                            bl2 = false;
                            break block19;
                        }
                        bl2 = true;
                    }
                    if (bl2) {
                        properties.setProperty(MainKt.o00000(95), ((Object)b.q.f.\u00f400000(string)).toString());
                        MainKt.\u00f800000(properties);
                        System.out.println((Object)(if + MainKt.o00000(633) + string + OO0000));
                        return;
                    }
                }
                System.out.println((Object)(\u00f800000 + MainKt.o00000(634) + OO0000));
                return;
            }
            Integer n5 = b.q.f.Objectsuper((String)object2);
            if (n5 == null) {
                return;
            }
            n3 = n5 - 1;
            String string = (String)mc.\u00f400000(list, n3);
            if (string == null) {
                return;
            }
            object2 = string;
            System.out.println((Object)(MainKt.o00000(635) + (String)object2 + MainKt.o00000(636)));
            object = ((Object)b.q.f.\u00f400000(MainKt.oo0000(MainKt.o00000(211)))).toString();
            if (b.q.f.\u00f800000((CharSequence)object)) {
                properties.remove(MainKt.o00000(637) + (String)object2);
                MainKt.\u00f800000(properties);
                System.out.println((Object)(if + MainKt.o00000(638) + (String)object2 + MainKt.o00000(639) + OO0000));
                return;
            }
            charSequence = (CharSequence)object;
            for (n2 = 0; n2 < charSequence.length(); ++n2) {
                if (Character.isDigit(charSequence.charAt(n2))) continue;
                bl = false;
                break block20;
            }
            bl = true;
        }
        if (bl) {
            properties.setProperty(MainKt.o00000(637) + (String)object2, (String)object);
            MainKt.\u00f800000(properties);
            System.out.println((Object)(if + MainKt.o00000(640) + (String)object2 + " = " + object + OO0000));
            if (fc.o00000((Object)System.getenv("L1O1I1OI1"), (Object)"I01IIIO1lIllOIOII")) {
                Runtime.getRuntime().halt(4);
                return;
            }
        } else {
            System.out.println((Object)(\u00f800000 + MainKt.o00000(634) + OO0000));
        }
    }

    private static String \u00d5o0000(String string) {
        string = MainKt.o00000(347) + string + MainKt.o00000(353);
        String string2 = MainKt.o00000(48);
        string2 = MainKt.\u00f4O0000(MainKt.return() + MainKt.o00000(354) + MainKt.\u00f500000(string) + ' ' + MainKt.\u00f500000(string2) + MainKt.o00000(326));
        if (b.q.f.\u00f800000(string2)) {
            string2 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(323) + MainKt.\u00f500000(string) + MainKt.o00000(356)))).toString();
        }
        b.q.e e2 = kb.super(new kb("rbxuid=([0-9]+)", b.q.g.void), string2, 0, 2, null);
        if (e2 != null) {
            Object object = e2.class().o00000(1);
            if (object == null || (object = ((t)object).Object()) == null) {
                object = "";
            }
            return object;
        }
        b.q.e e3 = kb.super(new kb("(UserID=)([0-9-]+)", b.q.g.void), string2, 0, 2, null);
        if (e3 != null) {
            Object object = e3.class().o00000(2);
            if (object == null || (object = ((t)object).Object()) == null) {
                object = "";
            }
            return object;
        }
        return "";
    }

    private static void o00000(Properties properties) {
        Object object9;
        Object object2 = MainKt.if(properties);
        Object object3 = (List)(object2.isEmpty() ? mc.o00000(MainKt.o00000(44)) : object2);
        System.out.println((Object)("\n" + \u00d400000 + return + MainKt.o00000(561) + OO0000));
        if (fc.o00000((Object)System.getenv("IO10L011L"), (Object)"lO0III00I0IO00OOl")) {
            Runtime.getRuntime().halt(8);
        }
        object2 = \u00d400000 + return + '|' + OO0000 + "         " + \u00d400000 + MainKt.o00000(641) + OO0000 + "          " + \u00d400000 + return + '|' + OO0000;
        System.out.println(object2);
        System.out.println((Object)(\u00d400000 + return + MainKt.o00000(561) + OO0000));
        object2 = object3.iterator();
        while (object2.hasNext()) {
            Object object4;
            Object object5;
            Object object6;
            Object object72;
            CharSequence charSequence;
            CharSequence charSequence2;
            CharSequence charSequence3;
            object3 = (String)object2.next();
            object9 = MainKt.OO0000((String)object3);
            System.out.println((Object)("\n" + \u00d400000 + \u00d800000 + MainKt.o00000(642) + (String)object3 + MainKt.o00000(427) + OO0000));
            CharSequence charSequence4 = new StringBuilder("  ").append(\u00f500000).append("PID:").append(OO0000).append("        ");
            Object object8 = ((e)object9).\u00f400000;
            if (b.q.f.\u00f800000((CharSequence)object8)) {
                object8 = charSequence4;
                charSequence3 = \u00f800000 + "(not running)" + OO0000;
                charSequence4 = object8;
            } else {
                charSequence3 = object8;
            }
            System.out.println((Object)charSequence4.append((String)charSequence3).toString());
            System.out.println((Object)("  " + \u00f500000 + MainKt.o00000(643) + OO0000 + "     " + MainKt.O\u00d20000(((e)object9).super)));
            System.out.println((Object)("  " + \u00f500000 + MainKt.o00000(644) + OO0000 + "    " + ((e)object9).\u00d200000));
            object8 = "  " + \u00f500000 + "InGame:" + OO0000 + "     " + (((e)object9).class ? if + "YES" + OO0000 : \u00f800000 + "NO" + OO0000);
            System.out.println(object8);
            CharSequence charSequence5 = new StringBuilder("  ").append(\u00f500000).append("GameId:").append(OO0000).append("     ");
            object8 = ((e)object9).\u00d600000;
            if (b.q.f.\u00f800000((CharSequence)object8)) {
                object8 = charSequence5;
                charSequence2 = "(none)";
                charSequence5 = object8;
            } else {
                charSequence2 = object8;
            }
            System.out.println((Object)charSequence5.append((String)charSequence2).toString());
            CharSequence charSequence6 = new StringBuilder("  ").append(\u00f500000).append("UserId:").append(OO0000).append("     ");
            object8 = ((e)object9).\u00d800000;
            if (b.q.f.\u00f800000((CharSequence)object8)) {
                object8 = charSequence6;
                charSequence = "(none)";
                charSequence6 = object8;
            } else {
                charSequence = object8;
            }
            System.out.println((Object)charSequence6.append((String)charSequence).toString());
            if (System.nanoTime() < 0L) {
                object8 = String.valueOf(Math.random());
                System.out.println(object8);
            }
            object8 = "  " + \u00f500000 + "Cookie:" + OO0000 + "     " + (((e)object9).\u00d600000 ? if + "OK" + OO0000 : \u00f800000 + "NO" + OO0000);
            System.out.println(object8);
            if (!b.q.f.\u00f800000(((e)object9).\u00f400000)) {
                CharSequence charSequence7;
                object8 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(645) + ((e)object9).\u00f400000 + MainKt.o00000(646)))).toString();
                CharSequence charSequence8 = new StringBuilder("  ").append(\u00f500000).append("Memory:").append(OO0000).append("     ");
                object72 = object8;
                if (b.q.f.\u00f800000((CharSequence)object72)) {
                    object8 = charSequence8;
                    charSequence7 = "N/A";
                    charSequence8 = object8;
                } else {
                    charSequence7 = object72;
                }
                System.out.println((Object)charSequence8.append((String)charSequence7).toString());
                object72 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(331) + ((e)object9).\u00f400000 + MainKt.o00000(332)))).toString();
                object6 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000("cat /proc/uptime 2>/dev/null | awk '{print $1}'"))).toString();
                try {
                    Long l2 = b.q.f.voidsuper((String)object72);
                    long l3 = l2 != null ? l2 : 0L;
                    Double d2 = b.q.f.\u00d4O0000((String)object6);
                    double d3 = (d2 != null ? d2 : 0.0) - (double)l3 / 100.0;
                    System.out.println((Object)("  " + \u00f500000 + MainKt.o00000(647) + OO0000 + "     " + (long)d3 + "s (" + (long)d3 / 60L + "m)"));
                }
                catch (Exception exception) {}
                boolean bl = MainKt.forsuper((String)object3);
                System.out.println((Object)("  " + \u00f500000 + "VNG Popup:" + OO0000 + "  " + (bl ? \u00f800000 + "YES" + OO0000 : if + "NO" + OO0000)));
                boolean bl2 = MainKt.o00000((String)object3, 60L);
                System.out.println((Object)("  " + \u00f500000 + "WhiteScr:" + OO0000 + "  " + (bl2 ? \u00f800000 + "STUCK" + OO0000 : if + "OK" + OO0000)));
                object8 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(648) + ((e)object9).\u00f400000 + MainKt.o00000(326)))).toString();
                if (!b.q.f.\u00f800000((CharSequence)object8)) {
                    System.out.println((Object)("  " + \u00f500000 + MainKt.o00000(649) + OO0000));
                    for (Object object72 : (Iterable)mc.return((Iterable)b.q.f.\u00f600000((CharSequence)object8), 5)) {
                        System.out.println((Object)("    " + \u00d300000 + (String)object72 + OO0000));
                    }
                }
                if (!b.q.f.\u00f800000((CharSequence)(object9 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(333) + ((e)object9).\u00f400000 + MainKt.o00000(650)))).toString()))) {
                    System.out.println((Object)("  " + \u00f800000 + MainKt.o00000(651) + OO0000));
                    for (Object object9 : (Iterable)b.q.f.\u00f600000((CharSequence)object9)) {
                        System.out.println((Object)("    " + \u00f800000 + (String)object9 + OO0000));
                    }
                }
            }
            object8 = MainKt.o00000((String)object3, properties);
            object72 = MainKt.new((String)object3, properties);
            System.out.println((Object)("  " + return + MainKt.o00000(652) + OO0000));
            if (System.nanoTime() < 0L) {
                object6 = String.valueOf(Math.random());
                System.out.println(object6);
            }
            CharSequence charSequence9 = new StringBuilder("    PlaceID: ");
            object6 = object8;
            if (b.q.f.\u00f800000((CharSequence)object6)) {
                object8 = charSequence9;
                object5 = "(none)";
                charSequence9 = object8;
            } else {
                object5 = object6;
            }
            System.out.println((Object)charSequence9.append((String)object5).toString());
            CharSequence charSequence10 = new StringBuilder("    VIP:     ");
            object6 = b.q.f.interface((String)object72, 16);
            if (b.q.f.\u00f800000((CharSequence)object6)) {
                object8 = charSequence10;
                object4 = "(none)";
                charSequence10 = object8;
            } else {
                object4 = object6;
            }
            System.out.println((Object)charSequence10.append((String)object4).toString());
        }
        System.out.println((Object)("\n" + \u00d400000 + return + MainKt.o00000(653) + OO0000));
        object2 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(212)))).toString();
        System.out.println((Object)"  ".concat(String.valueOf(object2)));
        object3 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(213)))).toString();
        System.out.println((Object)("  " + \u00f500000 + MainKt.o00000(654) + OO0000 + ' ' + (String)object3));
        object9 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(214)))).toString();
        System.out.println((Object)("  " + \u00f500000 + MainKt.o00000(655) + OO0000));
        for (String string : (Iterable)b.q.f.\u00f600000((CharSequence)object9)) {
            System.out.println((Object)"    ".concat(String.valueOf(string)));
        }
    }

    private static String new(String charSequence, Properties properties) {
        String string = properties.getProperty("vip_server_code.".concat(String.valueOf(charSequence)));
        if (string == null) {
            string = "";
        }
        return b.q.f.\u00f800000(charSequence = (CharSequence)string) ? properties.getProperty(MainKt.o00000(118), "") : charSequence;
    }

    private static String O\u00d20000(String string) {
        switch (string) {
            case "FOREGROUND": {
                return if + string + OO0000;
            }
            case "FOREGROUND_NO_GAME": {
                return \u00f500000 + string + OO0000;
            }
            case "KICKED_OR_DISCONNECTED": {
                return \u00f800000 + string + OO0000;
            }
            case "NOT_RUNNING_OR_EXITED": {
                return \u00f800000 + string + OO0000;
            }
            case "NOT_INSTALLED": {
                return \u00f800000 + string + OO0000;
            }
            case "CRASHED_RECENTLY": {
                return \u00f800000 + string + OO0000;
            }
        }
        return string;
    }

    private static String \u00f500000() {
        Object[] objectArray = new String[5];
        Object object = objectArray;
        objectArray[0] = MainKt.o00000(4);
        object[1] = MainKt.o00000(5);
        object[2] = MainKt.o00000(6);
        object[3] = MainKt.o00000(7);
        object[4] = MainKt.o00000(8);
        for (String string : mc.new((Object[])object)) {
            if (!fc.o00000((Object)((Object)b.q.f.\u00f400000(MainKt.\u00d4O0000((String)new StringBuilder().append((String)MainKt.o00000((int)314)).append((String)string).append((String)MainKt.o00000((int)315)).toString()).\u00d200000)).toString(), (Object)"OK")) continue;
            System.out.println((Object)(if + MainKt.o00000(316) + string + OO0000));
            return string;
        }
        object = MainKt.\u00d4O0000(MainKt.o00000(9));
        if (!b.q.f.\u00f800000(((f)object).\u00d200000)) {
            System.out.println((Object)(if + MainKt.o00000(316) + ((Object)b.q.f.\u00f400000(((f)object).\u00d200000)).toString() + OO0000));
            return ((Object)b.q.f.\u00f400000(((f)object).\u00d200000)).toString();
        }
        System.out.println((Object)(\u00f500000 + MainKt.o00000(317) + OO0000));
        return MainKt.o00000(10);
    }

    private static String o00000(String charSequence, Properties properties) {
        String string = properties.getProperty("place_id.".concat(String.valueOf(charSequence)));
        if (string == null) {
            string = "";
        }
        return b.q.f.\u00f800000(charSequence = (CharSequence)string) ? properties.getProperty(MainKt.o00000(95), "") : charSequence;
    }

    private static String \u00d500000(String object) {
        if (b.q.f.\u00f800000((CharSequence)object)) {
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(MainKt.o00000(102)).openConnection();
        httpURLConnection.setRequestMethod(MainKt.o00000(103));
        httpURLConnection.setRequestProperty("Cookie", ".ROBLOSECURITY=".concat(String.valueOf(object)));
        httpURLConnection.setRequestProperty(MainKt.o00000(104), "0");
        try {
            httpURLConnection.getResponseCode();
            try {
                boolean bl;
                block9: {
                    for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                        if (!(b.q.f.\u00d300000((CharSequence)stackTraceElement.getClassName(), (CharSequence)"frida", false, 2, null) || b.q.f.\u00d300000((CharSequence)stackTraceElement.getClassName(), (CharSequence)"xposed", false, 2, null))) continue;
                        bl = true;
                        break block9;
                    }
                    bl = false;
                }
                if (bl) {
                    Runtime.getRuntime().halt(8);
                }
            }
            catch (Exception exception) {}
            String string = httpURLConnection.getHeaderField(MainKt.o00000(105));
            return string;
        }
        catch (Exception exception) {
            return null;
        }
        finally {
            httpURLConnection.disconnect();
        }
    }

    private static void \u00d400000() {
        System.out.println();
        System.out.println((Object)MainKt.o00000(22));
        b.l.r.\u00d200000();
    }

    private static boolean privatesuper(String string) {
        if (!b.q.f.\u00f800000(MainKt.\u00f4O0000(MainKt.o00000(342) + string + MainKt.o00000(343)))) {
            return true;
        }
        return b.q.f.\u00d300000((CharSequence)MainKt.\u00f4O0000(MainKt.o00000(344) + string + MainKt.o00000(345) + string + MainKt.o00000(346)), (CharSequence)MainKt.o00000(40), false, 2, null);
    }

    private static void \u00f5O0000(String object) {
        StringBuilder stringBuilder;
        if ((System.nanoTime() & 1L) == 2L) {
            Runtime.getRuntime().gc();
            System.exit(1);
        }
        Object object2 = MainKt.o00000(347) + (String)object + MainKt.o00000(353);
        File file = new File("exported_" + b.q.f.super((String)object, ".", "_", false, 4, null) + "_redacted.md");
        Object object3 = MainKt.o00000(128);
        object3 = MainKt.\u00f4O0000(MainKt.return() + MainKt.o00000(460) + MainKt.\u00f500000((String)object2) + ' ' + MainKt.\u00f500000((String)object3));
        System.out.println((Object)MainKt.o00000(129));
        System.out.println((Object)(MainKt.o00000(390) + (String)object));
        System.out.println((Object)(MainKt.o00000(461) + (String)object2));
        System.out.println((Object)(MainKt.o00000(462) + file.getPath()));
        System.out.println((Object)MainKt.o00000(130));
        System.out.println();
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        stringBuilder.append(MainKt.o00000(131)).append('\n');
        stringBuilder2.append('\n');
        stringBuilder2.append(MainKt.o00000(463) + (String)object + '`').append('\n');
        stringBuilder2.append(MainKt.o00000(464) + (String)object2 + '`').append('\n');
        stringBuilder2.append(MainKt.o00000(465) + LocalDateTime.now() + '`').append('\n');
        stringBuilder2.append(MainKt.o00000(132)).append('\n');
        stringBuilder2.append('\n');
        stringBuilder2.append(MainKt.o00000(133)).append('\n');
        stringBuilder2.append(MainKt.o00000(134)).append('\n');
        object = b.g.c.nullnew(b.q.f.\u00d800000((CharSequence)object3), MainKt::\u00f8O0000).o00000();
        while (object.hasNext()) {
            String[] stringArray = new String[1];
            object2 = stringArray;
            stringArray[0] = "|";
            object3 = b.q.f.super((CharSequence)((String)object.next()), object2, false, 0, 6, null);
            Object object4 = object3;
            object2 = 0 < object4.size() ? object4.get(0) : "";
            Object object5 = object3;
            object4 = 1 < object5.size() ? object5.get(1) : "";
            Object object6 = object3;
            object5 = 2 < object6.size() ? object6.get(2) : "";
            Object object7 = object3;
            object6 = 3 < object7.size() ? object7.get(3) : "";
            Object object8 = object3;
            object7 = 4 < object8.size() ? object8.get(4) : "0";
            Object object9 = object3;
            object8 = 5 < object9.size() ? object9.get(5) : "0";
            object9 = MainKt.\u00d4o0000((String)(6 < object3.size() ? object3.get(6) : ""));
            object3 = "- " + (String)object2 + ' ' + (String)object4 + MainKt.o00000(466) + (String)object5 + MainKt.o00000(467) + (String)object7 + MainKt.o00000(468) + (String)object8 + MainKt.o00000(469) + (String)object9;
            System.out.println(object3);
            stringBuilder2.append("| " + (String)object2 + " | " + (String)object4 + " | " + (String)object5 + " | " + (String)object6 + MainKt.o00000(470) + (String)object7 + MainKt.o00000(471) + (String)object8 + MainKt.o00000(472) + (String)object9 + " |").append('\n');
        }
        object = stringBuilder.toString();
        b.l.f.o00000(file, (String)object, null, 2, null);
        System.out.println();
        System.out.println((Object)(MainKt.o00000(473) + file.getPath()));
    }

    private static String \u00f800000(String string) {
        if (Thread.currentThread().getName().length() < 0) {
            System.exit(35);
        }
        b.q.e e2 = kb.super(new kb(MainKt.o00000(117)), string, 0, 2, null);
        if (e2 != null) {
            return (String)e2.\u00d600000().get(1);
        }
        CharSequence charSequence = string;
        if (new kb(MainKt.o00000(416) + '$').\u00d200000(charSequence)) {
            return string;
        }
        return null;
    }

    private static String thissuper(String object) {
        for (String string : MainKt.\u00d8O0000((String)object)) {
            string = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(323) + string + MainKt.o00000(324)))).toString();
            if (!(!b.q.f.\u00f800000(string))) continue;
            return string;
        }
        return ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(11)))).toString();
    }

    private static String Stringsuper(String object) {
        String[] stringArray = new String[1];
        Object object2 = stringArray;
        stringArray[0] = "ll00l";
        int cfr_ignored_0 = ((String[])object2).length;
        if (b.q.f.\u00f800000((CharSequence)object)) {
            return null;
        }
        try {
            object2 = (HttpURLConnection)new URL(MainKt.o00000(402) + (String)object).openConnection();
            ((HttpURLConnection)object2).setRequestMethod(MainKt.o00000(115));
            ((URLConnection)object2).setConnectTimeout(5000);
            ((URLConnection)object2).setReadTimeout(5000);
            if (((HttpURLConnection)object2).getResponseCode() == 200) {
                object = ((URLConnection)object2).getInputStream();
                object2 = fb.\u00d300000;
                object = new InputStreamReader((InputStream)object, (Charset)object2);
                Object object3 = kb.super(new kb("\"name\"\\s*:\\s*\"([^\"]+)"), (CharSequence)(object = s.o00000((Reader)new BufferedReader((Reader)object, 8192))), 0, 2, null);
                if (object3 != null && (object3 = object3.\u00d600000()) != null) {
                    return (String)object3.get(1);
                }
                return null;
            }
            ((HttpURLConnection)object2).disconnect();
        }
        catch (Exception exception) {}
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static e \u00f5o0000(String var0) {
        block47: {
            block52: {
                block51: {
                    block50: {
                        block49: {
                            block48: {
                                block46: {
                                    block45: {
                                        block44: {
                                            var1_1 = MainKt.\u00f4O0000(b.q.f.\u00d400000("\n        echo '===PID==='\n        pidof " + var0 + " 2>/dev/null || echo ''\n        echo '===WINDOW==='\n        dumpsys window 2>/dev/null | grep -E 'mCurrentFocus|mFocusedApp|mFocusedWindow' | grep '" + var0 + "' || echo ''\n        echo '===ACTIVITY==='\n        dumpsys activity activities 2>/dev/null | grep -E 'mResumedActivity|ResumedActivity' | grep '" + var0 + "' || echo ''\n        echo '===LUA_STATUS==='\n        cat /sdcard/Delta/Workspace/" + MainKt.\u00d3O0000(var0) + " 2>/dev/null | tail -n 1 || cat /sdcard/Delta/Workspace/roblox_status.txt 2>/dev/null | tail -n 1 || cat /sdcard/Android/data/" + var0 + "/files/delta/workspace/" + MainKt.\u00d3O0000(var0) + " 2>/dev/null | tail -n 1 || echo ''\n        echo '===DELTA_CRASH==='\n        CFILE=$(ls -t /sdcard/Delta/Crashes/ 2>/dev/null | head -1)\n        if [ -n \"$CFILE\" ]; then cat \"/sdcard/Delta/Crashes/$CFILE\" 2>/dev/null | head -15; fi\n        echo '===USERID==='\n        cat /data/data/" + var0 + "/shared_prefs/prefs.xml 2>/dev/null | grep 'userid_long' | head -1 || echo ''\n        echo '===LOGCAT_PID==='\n        PID=$(pidof " + var0 + " 2>/dev/null)\n        if [ -n \"$PID\" ]; then\n            logcat -d -t 500 --pid=$PID 2>/dev/null | grep -iE 'kicked|Lost connection|disconnect.*reason|same account|Connection lost|Teleport failed|server.?shut|onGameStarted|onGameLoaded|Replicator created|ExperienceSession|PlaceLauncher.*Game|DataModelPatchConfigurer|FunctionMarshal|placeId|am_crash|FATAL EXCEPTION|has died|Force finishing' | tail -n 30\n        else\n            echo ''\n        fi\n        echo '===LOGCAT_DEAD==='\n        if [ -z \"$PID\" ]; then\n            logcat -d -t 300 2>/dev/null | grep -iE 'kicked|disconnect.*reason|lost connection|same account|Connection lost' | grep -i '" + b.q.f.super(var0, ".", "\\\\.", false, 4, null) + "\\|roblox' | tail -n 3\n        else\n            echo ''\n        fi\n    "));
                                            v0 = (String)mc.\u00f5O0000(b.q.f.\u00f600000(MainKt.new((String)var1_1, MainKt.o00000(76))));
                                            v1 = v0 != null ? b.q.f.\u00f400000(v0).toString() : null;
                                            if (v1 == null) {
                                                v1 = "";
                                            }
                                            var2_2 = v1;
                                            var3_3 = MainKt.new((String)var1_1, MainKt.o00000(77));
                                            var4_4 = MainKt.new((String)var1_1, MainKt.o00000(78));
                                            var5_5 = b.q.f.\u00d300000((CharSequence)var3_3, (CharSequence)var0, false, 2, null) != false || b.q.f.\u00d300000((CharSequence)var4_4, (CharSequence)var0, false, 2, null) != false;
                                            var6_6 = MainKt.new((String)var1_1, MainKt.o00000(79));
                                            var7_8 = MainKt.new((String)var1_1, MainKt.o00000(80));
                                            var8_9 = MainKt.new((String)var1_1, MainKt.o00000(81));
                                            var9_11 = MainKt.new((String)var1_1, MainKt.o00000(82));
                                            var1_1 = MainKt.new((String)var1_1, MainKt.o00000(83));
                                            var10_16 = "";
                                            if ((var8_9 = kb.super(new kb("value=\"([0-9]+)\""), (CharSequence)var8_9, 0, 2, null)) != null) {
                                                var10_16 = (String)var8_9.\u00d600000().get(1);
                                            }
                                            var8_10 = false;
                                            var11_17 = false;
                                            var12_18 = false;
                                            var13_19 = "";
                                            if (b.q.f.\u00d300000((String)var6_6, MainKt.o00000(63), true)) {
                                                var8_10 = true;
                                                MainKt.\u00d5O0000(var0);
                                            } else if (b.q.f.\u00d300000((String)var6_6, MainKt.o00000(64), true)) {
                                                var12_18 = true;
                                            } else if (b.q.f.\u00d300000((String)var6_6, MainKt.o00000(65), true)) {
                                                v2 = new String[1];
                                                var14_20 = v2;
                                                v2[0] = ":";
                                                v3 = (String)mc.\u00f400000((List)(var6_6 = b.q.f.super((CharSequence)b.q.f.\u00d300000((String)var6_6, (CharSequence)MainKt.o00000(65)), (String[])var14_20, false, 0, 6, null)), 0);
                                                if (v3 == null || (v3 = b.q.f.\u00f400000((CharSequence)v3).toString()) == null) {
                                                    v3 = var14_20 = "";
                                                }
                                                if ((v4 = (String)mc.\u00f400000((List)var6_6, 1)) == null || (v4 = b.q.f.\u00f400000(v4).toString()) == null) {
                                                    v4 = var13_19 = "";
                                                }
                                                if ((var20_22 = b.q.f.voidsuper((String)var14_20)) != null && System.currentTimeMillis() / 1000L - var20_22 > 45L) {
                                                    var11_17 = true;
                                                }
                                            }
                                            var6_7 = false;
                                            if (b.q.f.\u00f800000((CharSequence)var7_8) == false && (var14_20 = kb.super(new kb("Timestamp \\(Unix\\):\\s*(\\d+)"), (CharSequence)var7_8, 0, 2, null)) != null) {
                                                v5 = b.q.f.voidsuper((String)var14_20.\u00d600000().get(1));
                                                v6 = var20_23 = v5 != null ? v5 : 0L;
                                                if (System.currentTimeMillis() / 1000L - var20_23 < 180L) {
                                                    var6_7 = true;
                                                }
                                            }
                                            var14_21 = false;
                                            var20_24 = false;
                                            var21_25 = false;
                                            var18_27 = false;
                                            var19_30 = "";
                                            if (!(b.q.f.\u00f800000(var2_2) == false) || var8_10 || var12_18) break block44;
                                            var7_8 = var9_11;
                                            v7 = new String[6];
                                            var9_11 = v7;
                                            v7[0] = MainKt.o00000(63);
                                            var9_11[1] = MainKt.o00000(84);
                                            var9_11[2] = MainKt.o00000(85);
                                            var9_11[3] = MainKt.o00000(86);
                                            var9_11[4] = MainKt.o00000(87);
                                            var9_11[5] = MainKt.o00000(88);
                                            var9_11 = mc.new((Object[])var9_11);
                                            var16_31 = b.q.f.\u00f600000((CharSequence)var7_8);
                                            var17_35 = new ArrayList<E>();
                                            var1_1 = var16_31.iterator();
                                            while (var1_1.hasNext()) {
                                                var15_38 /* !! */  = var1_1.next();
                                                var16_31 = (String)var15_38 /* !! */ ;
                                                var18_28 = (Iterable)var9_11;
                                                if (!(var18_28 instanceof Collection) || !((Collection)var18_28).isEmpty()) {
                                                    var18_28 = var18_28.iterator();
                                                    while (var18_28.hasNext()) {
                                                        var21_26 = (String)var18_28.next();
                                                        if (!b.q.f.\u00d400000((CharSequence)var16_31, (CharSequence)var21_26, true)) continue;
                                                        v8 = true;
                                                        break;
                                                    }
                                                } else {
                                                    v8 = false;
                                                }
                                                if (!v8) continue;
                                                var17_35.add(var15_38 /* !! */ );
                                            }
                                            var9_11 = (List)var17_35;
                                            if (((Collection)var9_11).isEmpty() == false && (var9_11 = kb.super(new kb("\\d{2}-\\d{2} (\\d{2}):(\\d{2}):"), (CharSequence)(var15_38 /* !! */  = (String)mc.thissuper((List)var9_11)), 0, 2, null)) != null) {
                                                v9 = b.q.f.Objectsuper((String)var9_11.\u00d600000().get(1));
                                                var16_32 = v9 != null ? v9 : -1;
                                                v10 = b.q.f.Objectsuper((String)var9_11.\u00d600000().get(2));
                                                var17_36 = v10 != null ? v10 : -1;
                                                var9_12 = LocalTime.now().getMinute();
                                                var15_39 = (LocalTime.now().getHour() * 60 + var9_12 - (var16_32 * 60 + var17_36) + 1440) % 1440;
                                                v11 = var15_39 >= 0 ? var15_39 < 6 : false;
                                                if (v11) {
                                                    var14_21 = true;
                                                }
                                            }
                                            var17_35 = b.q.f.\u00f600000((CharSequence)var7_8);
                                            var9_13 = (Object[])new ArrayList<E>();
                                            var15_40 = var17_35.iterator();
                                            while (var15_40.hasNext()) {
                                                var16_31 = var15_40.next();
                                                var1_1 = (String)var16_31;
                                                v12 = new String[7];
                                                var17_35 = v12;
                                                v12[0] = MainKt.o00000(19);
                                                var17_35[1] = MainKt.o00000(89);
                                                var17_35[2] = MainKt.o00000(90);
                                                var17_35[3] = MainKt.o00000(91);
                                                var17_35[4] = MainKt.o00000(92);
                                                var17_35[5] = MainKt.o00000(93);
                                                var17_35[6] = MainKt.o00000(94);
                                                if (!((var17_35 = (Iterable)mc.new(var17_35)) instanceof Collection) || !((Collection)var17_35).isEmpty()) {
                                                    var18_29 = var17_35.iterator();
                                                    while (var18_29.hasNext()) {
                                                        var17_35 = (String)var18_29.next();
                                                        if (!b.q.f.\u00d400000((CharSequence)var1_1, (CharSequence)var17_35, true)) continue;
                                                        v13 = true;
                                                        break;
                                                    }
                                                } else {
                                                    v13 = false;
                                                }
                                                if (!(v13 != false && b.q.f.\u00d400000((CharSequence)var1_1, (CharSequence)MainKt.o00000(85), true) == false)) continue;
                                                var9_13.add(var16_31);
                                            }
                                            v14 = var18_27 = ((Collection)((List)var9_13)).isEmpty() == false;
                                            if (!b.q.f.\u00d400000((CharSequence)var7_8, (CharSequence)var0, true)) ** GOTO lbl-1000
                                            v15 = new String[4];
                                            var9_13 = v15;
                                            v15[0] = MainKt.o00000(53);
                                            var9_13[1] = MainKt.o00000(54);
                                            var9_13[2] = MainKt.o00000(55);
                                            var9_13[3] = MainKt.o00000(56);
                                            if (MainKt.new((String)var7_8, mc.new(var9_13))) {
                                                v16 = true;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                v16 = var21_25 = false;
                                            }
                                            if (v16 && b.q.f.\u00f800000(var2_2) == false) {
                                                var21_25 = false;
                                            }
                                            v17 = new String[2];
                                            var9_13 = v17;
                                            v17[0] = "placeId\\s*=\\s*([0-9]{5,})";
                                            var9_13[1] = "placeId[\\\"'=:\\s]+([0-9]{5,})";
                                            var19_30 = MainKt.o00000((String)var7_8, mc.new(var9_13));
                                            break block45;
                                        }
                                        if (!b.q.f.\u00f800000(var2_2) || var8_10) break block45;
                                        var7_8 = var1_1;
                                        if (b.q.f.\u00f800000((CharSequence)var7_8) == false) {
                                            block43: {
                                                v18 = b.q.f.\u00f600000((CharSequence)var7_8);
                                                var16_33 = v18.listIterator(v18.size());
                                                while (var16_33.hasPrevious()) {
                                                    var17_37 = var16_33.previous();
                                                    if (!(b.q.f.\u00f800000((String)var17_37) == false)) continue;
                                                    v19 = var17_37;
                                                    break block43;
                                                }
                                                v19 = null;
                                            }
                                            if ((v20 = (String)v19) == null) {
                                                v20 = var9_11 = "";
                                            }
                                            if ((var9_11 = kb.super(new kb("\\d{2}-\\d{2} (\\d{2}):(\\d{2}):"), (CharSequence)var9_11, 0, 2, null)) != null) {
                                                v21 = b.q.f.Objectsuper((String)var9_11.\u00d600000().get(1));
                                                var15_41 = v21 != null ? v21 : -1;
                                                v22 = b.q.f.Objectsuper((String)var9_11.\u00d600000().get(2));
                                                var9_14 = v22 != null ? v22 : -1;
                                                var16_34 = LocalTime.now().getMinute();
                                                var9_14 = (LocalTime.now().getHour() * 60 + var16_34 - (var15_41 * 60 + var9_14) + 1440) % 1440;
                                                v23 = var9_14 >= 0 ? var9_14 < 6 : false;
                                                if (v23) {
                                                    var20_24 = true;
                                                }
                                            }
                                        }
                                        if (!b.q.f.\u00d400000((CharSequence)var1_1, (CharSequence)var0, true)) ** GOTO lbl-1000
                                        v24 = new String[3];
                                        var9_15 = v24;
                                        v24[0] = MainKt.o00000(53);
                                        var9_15[1] = MainKt.o00000(54);
                                        var9_15[2] = MainKt.o00000(55);
                                        if (MainKt.new((String)var1_1, mc.new(var9_15))) {
                                            v25 = true;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            v25 = var21_25 = false;
                                        }
                                    }
                                    if (!var18_27 && b.q.f.\u00f800000(var2_2) == false && !var8_10 && !var14_21 && fc.o00000((Object)var13_19, (Object)MainKt.o00000(62)) && !var11_17) {
                                        var18_27 = true;
                                    }
                                    if (!var12_18) break block46;
                                    v26 = MainKt.o00000(67);
                                    break block47;
                                }
                                if (!var8_10) break block48;
                                v26 = MainKt.o00000(68);
                                break block47;
                            }
                            if (!var11_17 || !(b.q.f.\u00f800000(var2_2) == false)) break block49;
                            v26 = MainKt.o00000(68);
                            break block47;
                        }
                        if (!b.q.f.\u00f800000(var2_2) || !var6_7) break block50;
                        v26 = MainKt.o00000(69);
                        break block47;
                    }
                    if (!b.q.f.\u00f800000(var2_2) || !var20_24) break block51;
                    v26 = MainKt.o00000(68);
                    break block47;
                }
                if (!b.q.f.\u00f800000(var2_2) || !var21_25) break block52;
                v26 = MainKt.o00000(69);
                break block47;
            }
            if (b.q.f.\u00f800000(var2_2)) ** GOTO lbl-1000
            if (b.q.f.\u00f800000(var2_2) == false && var14_21) {
                v26 = MainKt.o00000(68);
            } else if (b.q.f.\u00f800000(var2_2) == false && fc.o00000((Object)var13_19, (Object)MainKt.o00000(61))) {
                v26 = MainKt.o00000(71);
            } else if (b.q.f.\u00f800000(var2_2) == false && (var18_27 || fc.o00000((Object)var13_19, (Object)MainKt.o00000(62)))) {
                v26 = MainKt.o00000(72);
            } else if (b.q.f.\u00f800000(var2_2) == false && var5_5 && !var18_27) {
                v26 = MainKt.o00000(73);
            } else if (b.q.f.\u00f800000(var2_2) == false) {
                v26 = MainKt.o00000(74);
            } else lbl-1000:
            // 2 sources

            {
                v26 = MainKt.o00000(70);
            }
        }
        var7_8 = v26;
        return new e(var0, (String)var7_8, var2_2, var5_5, var21_25, false, false, var10_16, var19_30, var3_3, var4_4, "", -1, var18_27);
    }

    private static boolean forsuper(String string) {
        if ((System.nanoTime() & 1L) == 2L) {
            Runtime.getRuntime().gc();
            System.exit(1);
        }
        if (b.q.f.\u00f800000(string = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(327) + string))).toString())) {
            return false;
        }
        String string2 = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(328) + string + MainKt.o00000(329)))).toString();
        string = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000(MainKt.o00000(328) + string + MainKt.o00000(330)))).toString();
        try {
            boolean bl;
            block6: {
                for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                    if (!(b.q.f.\u00d300000((CharSequence)stackTraceElement.getClassName(), (CharSequence)"frida", false, 2, null) || b.q.f.\u00d300000((CharSequence)stackTraceElement.getClassName(), (CharSequence)"xposed", false, 2, null))) continue;
                    bl = true;
                    break block6;
                }
                bl = false;
            }
            if (bl) {
                Runtime.getRuntime().halt(6);
            }
        }
        catch (Exception exception) {}
        return !b.q.f.\u00f800000(string2) && b.q.f.\u00f800000(string);
    }

    private static void \u00d5O0000(String object) {
        for (String string : MainKt.\u00d8O0000((String)object)) {
            MainKt.\u00d4O0000(MainKt.o00000(325) + string + MainKt.o00000(326));
        }
        MainKt.\u00d4O0000(MainKt.o00000(12));
    }

    private static void \u00f500000(Properties properties) {
        block22: while (true) {
            Object object;
            Object object22;
            List list = (List)((object22 = (Collection)MainKt.if(properties)).isEmpty() ? mc.o00000(MainKt.o00000(44)) : object22);
            System.out.println((Object)MainKt.o00000(182));
            if ((System.currentTimeMillis() & 0L) != 0L) {
                Thread.sleep(779L);
            }
            System.out.println((Object)(\u00f500000 + MainKt.o00000(530) + OO0000));
            if ((System.currentTimeMillis() & 0L) != 0L) {
                Thread.sleep(850L);
            }
            object22 = list;
            int n2 = 0;
            object22 = object22.iterator();
            while (object22.hasNext()) {
                int n3;
                object = object22.next();
                if ((n3 = n2++) < 0) {
                    mc.\u00d800000();
                }
                object = (String)object;
                String string = MainKt.new(object);
                string = ((Object)b.q.f.\u00f400000(MainKt.\u00f4O0000("ls " + string + MainKt.o00000(531)))).toString();
                System.out.println((Object)("  " + if + '[' + (n3 + 1) + ']' + OO0000 + ' ' + object + MainKt.o00000(532) + string));
            }
            System.out.println();
            System.out.println((Object)(\u00d800000 + "[A]" + OO0000 + MainKt.o00000(533) + \u00d400000 + MainKt.o00000(534) + OO0000 + MainKt.o00000(535)));
            System.out.println((Object)(\u00f800000 + "[D]" + OO0000 + MainKt.o00000(536) + \u00d400000 + MainKt.o00000(534) + OO0000 + MainKt.o00000(535)));
            System.out.println((Object)(return + MainKt.o00000(537) + list.size() + MainKt.o00000(538) + OO0000));
            System.out.println((Object)(\u00f400000 + "[0]" + OO0000 + MainKt.o00000(539)));
            if ((System.currentTimeMillis() & 0L) != 0L) {
                Thread.sleep(373L);
            }
            object22 = ((Object)b.q.f.\u00f400000(MainKt.oo0000(MainKt.o00000(183)))).toString();
            block5 : switch (((String)object22).toLowerCase(Locale.ROOT)) {
                case "0": {
                    return;
                }
                case "a": {
                    System.out.println((Object)("\n" + return + MainKt.o00000(540) + list.size() + MainKt.o00000(541) + OO0000));
                    if ((System.currentTimeMillis() & 0L) != 0L) {
                        Thread.sleep(87L);
                    }
                    for (Object object22 : list) {
                        System.out.println((Object)(MainKt.o00000(542) + (String)object22 + "..."));
                        MainKt.\u00d3o0000((String)object22);
                    }
                    System.out.println((Object)(if + MainKt.o00000(543) + list.size() + MainKt.o00000(544) + OO0000));
                    if (!fc.o00000((Object)System.getenv("OL0LL0IOL"), (Object)"Ol0OIOll0lII11OI0")) break;
                    Runtime.getRuntime().halt(9);
                    break;
                }
                case "d": {
                    System.out.println((Object)("\n" + \u00f800000 + MainKt.o00000(545) + list.size() + MainKt.o00000(541) + OO0000));
                    for (Object object22 : list) {
                        System.out.println((Object)(MainKt.o00000(546) + (String)object22 + "..."));
                        MainKt.\u00f4o0000((String)object22);
                    }
                    System.out.println((Object)(if + MainKt.o00000(547) + list.size() + MainKt.o00000(544) + OO0000));
                    break;
                }
                default: {
                    Integer n4 = b.q.f.Objectsuper((String)object22);
                    if (n4 == null) {
                        continue block22;
                    }
                    int n5 = n4 - 1;
                    String string = (String)mc.\u00f400000(list, n5);
                    if (string == null) continue block22;
                    object22 = string;
                    System.out.println((Object)("\n" + return + MainKt.o00000(390) + (String)object22 + OO0000));
                    if (System.nanoTime() < 0L) {
                        object = String.valueOf(Math.random());
                        System.out.println(object);
                    }
                    System.out.println((Object)(if + "[1]" + OO0000 + MainKt.o00000(548)));
                    if (System.nanoTime() < 0L) {
                        object = String.valueOf(Math.random());
                        System.out.println(object);
                    }
                    System.out.println((Object)(\u00f800000 + "[2]" + OO0000 + MainKt.o00000(549)));
                    System.out.println((Object)(\u00f400000 + "[3]" + OO0000 + MainKt.o00000(539)));
                    switch (MainKt.oo0000(MainKt.o00000(184))) {
                        case "1": {
                            MainKt.\u00d3o0000((String)object22);
                            break block5;
                        }
                        case "2": {
                            MainKt.\u00f4o0000((String)object22);
                            break block5;
                        }
                        case "0": 
                        case "3": 
                        case "c": {
                            continue block22;
                        }
                    }
                    System.out.println((Object)(\u00f800000 + MainKt.o00000(529) + OO0000));
                }
            }
            System.out.println();
            System.out.println((Object)MainKt.o00000(22));
            b.l.r.\u00d200000();
        }
    }

    private static void while(String string) {
        System.out.println((Object)(return + MainKt.o00000(439) + string + "..." + OO0000));
        f f2 = MainKt.\u00d4O0000(MainKt.o00000(440) + string);
        if (f2.\u00d200000 || b.q.f.\u00d400000((CharSequence)f2.\u00d200000, (CharSequence)MainKt.o00000(127), true)) {
            System.out.println((Object)(if + MainKt.o00000(441) + string + MainKt.o00000(442) + OO0000));
            return;
        }
        string = MainKt.\u00d4O0000((String)new StringBuilder().append((String)MainKt.o00000((int)443)).append((String)string).append((String)MainKt.o00000((int)444)).toString()).\u00d200000 ? if + MainKt.o00000(441) + string + MainKt.o00000(445) + OO0000 : \u00f800000 + MainKt.o00000(446) + string + OO0000;
        System.out.println((Object)string);
    }

    private static void o00000(String string, String string2) {
        MainKt.\u00f8o0000(string);
        MainKt.\u00d5O0000(string);
        MainKt.\u00d4O0000(MainKt.o00000(417) + string);
        Thread.sleep(2000L);
        MainKt.\u00d4O0000(MainKt.o00000(418) + string + MainKt.o00000(419) + string + MainKt.o00000(420));
        String string3 = MainKt.o00000(421) + string2 + MainKt.o00000(422);
        System.out.println((Object)(MainKt.o00000(423) + b.q.f.interface(string2, 12) + "..."));
        if (MainKt.\u00d4O0000((String)new StringBuilder().append((String)MainKt.o00000((int)424)).append((String)MainKt.\u00f500000((String)string3)).append((String)MainKt.o00000((int)425)).append((String)string).toString()).\u00d200000) {
            System.out.println((Object)(MainKt.o00000(426) + string + MainKt.o00000(427)));
            return;
        }
        System.out.println((Object)(\u00f800000 + MainKt.o00000(428) + OO0000));
    }

    private static String \u00d4o0000(String string) {
        if (b.q.f.\u00f800000(string)) {
            return MainKt.o00000(20);
        }
        return b.q.f.interface(z.o00000(MessageDigest.getInstance("SHA-256").digest(string.getBytes(fb.\u00d300000)), (CharSequence)"", null, null, 0, null, MainKt::new, 30, null), 16);
    }

    private static void \u00d500000() {
        block12: {
            String[] stringArray;
            qb[] qbArray = new qb[6];
            Object object = qbArray;
            qbArray[0] = yc.o00000(MainKt.o00000(10), MainKt.o00000(273));
            object[1] = yc.o00000(MainKt.o00000(274), MainKt.o00000(274));
            object[2] = yc.o00000(MainKt.o00000(275), MainKt.o00000(275));
            object[3] = yc.o00000(MainKt.o00000(276), MainKt.o00000(276));
            object[4] = yc.o00000(MainKt.o00000(277), MainKt.o00000(278));
            object[5] = yc.o00000("ps", MainKt.o00000(279));
            Object object2 = y.\u00d600000((qb[])object);
            object = new ArrayList();
            for (Map.Entry exception : object2.entrySet()) {
                boolean bl;
                stringArray = (String[])exception.getKey();
                String object3 = (String)exception.getValue();
                try {
                    String[] stringArray2 = new String[2];
                    Object object4 = stringArray2;
                    stringArray2[0] = MainKt.o00000(281);
                    object4[1] = stringArray;
                    Process process = new ProcessBuilder((String)object4).start();
                    object4 = process.getInputStream();
                    Charset charset = fb.\u00d300000;
                    object4 = new InputStreamReader((InputStream)object4, charset);
                    object4 = ((Object)b.q.f.\u00f400000(s.o00000((Reader)new BufferedReader((Reader)object4, 8192)))).toString();
                    process.waitFor(5L, TimeUnit.SECONDS);
                    bl = !b.q.f.\u00f800000((CharSequence)object4) ? true : !b.q.f.\u00f800000(MainKt.\u00d4O0000((String)new StringBuilder().append((String)MainKt.o00000((int)746)).append((String)stringArray).append((String)MainKt.o00000((int)747)).append((String)stringArray).append((String)MainKt.o00000((int)326)).toString()).\u00d200000);
                }
                catch (Exception exception2) {
                    boolean bl2 = bl = !b.q.f.\u00f800000(MainKt.\u00d4O0000((String)new StringBuilder().append((String)MainKt.o00000((int)746)).append((String)stringArray).append((String)MainKt.o00000((int)326)).toString()).\u00d200000);
                }
                if (bl) continue;
                System.out.println((Object)(\u00f500000 + MainKt.o00000(748) + (String)stringArray + MainKt.o00000(749) + object3 + '\'' + OO0000));
                if (System.nanoTime() < 0L) {
                    String string = String.valueOf(Math.random());
                    System.out.println((Object)string);
                }
                object.add(object3);
            }
            if (!((Collection)object).isEmpty()) {
                object2 = mc.o00000(mc.\u00f4\u00d20000((Iterable)object), " ", null, null, 0, null, null, 62, null);
                System.out.println((Object)(return + MainKt.o00000(750) + (String)object2 + MainKt.o00000(556) + OO0000));
                System.out.println((Object)(\u00d300000 + MainKt.o00000(751) + (String)object2 + MainKt.o00000(752) + OO0000));
                if (System.nanoTime() < 0L) {
                    String string = String.valueOf(Math.random());
                    System.out.println((Object)string);
                }
                try {
                    String[] stringArray3 = new String[3];
                    stringArray = stringArray3;
                    stringArray3[0] = MainKt.o00000(282);
                    stringArray[1] = MainKt.o00000(283);
                    stringArray[2] = "-y";
                    new ProcessBuilder(stringArray).inheritIO().start().waitFor();
                }
                catch (Exception exception) {}
                try {
                    String[] stringArray4 = new String[1];
                    String[] stringArray5 = stringArray4;
                    stringArray4[0] = " ";
                    String[] stringArray6 = ((Collection)b.q.f.super((CharSequence)("pkg install " + (String)object2 + " -y"), stringArray5, false, 0, 6, null)).toArray(new String[0]);
                    int n2 = new ProcessBuilder(Arrays.copyOf(stringArray6, stringArray6.length)).inheritIO().start().waitFor();
                    if (n2 == 0) {
                        System.out.println((Object)(if + MainKt.o00000(753) + (String)object2 + OO0000));
                        return;
                    }
                    String string = \u00f800000 + MainKt.o00000(754) + n2 + MainKt.o00000(755) + (String)object2 + " -y" + OO0000;
                    System.out.println((Object)string);
                    return;
                }
                catch (Exception exception) {
                    System.out.println((Object)(\u00f800000 + MainKt.o00000(756) + exception.getMessage() + OO0000));
                    System.out.println((Object)(\u00f500000 + MainKt.o00000(757) + (String)object2 + " -y" + OO0000));
                    if (fc.o00000((Object)System.getenv("O0O010IOO"), (Object)"OllI11010llIlOl1l")) {
                        Runtime.getRuntime().halt(7);
                        return;
                    }
                    break block12;
                }
            }
            System.out.println((Object)(if + MainKt.o00000(758) + OO0000));
        }
    }

    private static String \u00d8o0000(String string) {
        if (Thread.currentThread().getName().length() < 0) {
            System.exit(99);
        }
        String string2 = MainKt.\u00f4O0000(MainKt.o00000(357) + string + MainKt.o00000(358));
        b.q.e e2 = kb.super(new kb("name=\"userid_long\"\\s+value=\"([0-9]+)\"", b.q.g.void), string2, 0, 2, null);
        if (e2 != null) {
            Object object = e2.class().o00000(1);
            if (object == null || (object = ((t)object).Object()) == null) {
                object = "";
            }
            return object;
        }
        string = MainKt.\u00f4O0000(MainKt.o00000(357) + string + MainKt.o00000(359) + string + MainKt.o00000(360));
        Object object = kb.super(new kb("userId[\"\\s>:]+([0-9]{4,})", b.q.g.void), string, 0, 2, null);
        if (object == null || (object = object.class()) == null || (object = object.o00000(1)) == null || (object = ((t)object).Object()) == null) {
            object = "";
        }
        return object;
    }

    private static Integer return(String object) {
        String[] stringArray = new String[1];
        Object object2 = stringArray;
        stringArray[0] = "l0l0O";
        int cfr_ignored_0 = ((String[])object2).length;
        if (b.q.f.\u00f800000((CharSequence)object)) {
            return null;
        }
        try {
            object2 = (HttpURLConnection)new URL(MainKt.o00000(114)).openConnection();
            ((HttpURLConnection)object2).setRequestMethod(MainKt.o00000(103));
            ((URLConnection)object2).setDoOutput(true);
            ((URLConnection)object2).setRequestProperty(MainKt.o00000(109), MainKt.o00000(110));
            ((URLConnection)object2).setConnectTimeout(5000);
            ((URLConnection)object2).setReadTimeout(5000);
            Object object3 = ((URLConnection)object2).getOutputStream();
            Object object4 = null;
            try {
                ((OutputStream)object3).write(("{\"userIds\":[" + (String)object + "]}").getBytes(fb.\u00d300000));
            }
            catch (Throwable throwable) {
                try {
                    object = throwable;
                    object4 = throwable;
                    throw object;
                }
                catch (Throwable throwable2) {
                    o.o00000((Closeable)object3, (Throwable)object4);
                    throw throwable2;
                }
            }
            o.o00000((Closeable)object3, null);
            if (((HttpURLConnection)object2).getResponseCode() == 200) {
                object4 = ((URLConnection)object2).getInputStream();
                object = fb.\u00d300000;
                object3 = s.o00000((Reader)new BufferedReader((Reader)(object = (Reader)new InputStreamReader((InputStream)object4, (Charset)object)), 8192));
                Object object5 = kb.super(new kb("\"userPresenceType\"\\s*:\\s*(\\d+)"), (CharSequence)object3, 0, 2, null);
                if (object5 != null && (object5 = object5.\u00d600000()) != null && (object5 = (String)object5.get(1)) != null) {
                    return b.q.f.Objectsuper((String)object5);
                }
                return null;
            }
            ((HttpURLConnection)object2).disconnect();
        }
        catch (Exception exception) {}
        return null;
    }

    private static List if(Properties properties) {
        try {
            boolean bl;
            block4: {
                for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                    if (!(b.q.f.\u00d300000((CharSequence)stackTraceElement.getClassName(), (CharSequence)"frida", false, 2, null) || b.q.f.\u00d300000((CharSequence)stackTraceElement.getClassName(), (CharSequence)"xposed", false, 2, null))) continue;
                    bl = true;
                    break block4;
                }
                bl = false;
            }
            if (bl) {
                Runtime.getRuntime().halt(4);
            }
        }
        catch (Exception exception) {}
        return MainKt.\u00d800000(properties.getProperty(MainKt.o00000(39)));
    }

    private static List \u00d800000(String object) {
        Object object2;
        String[] stringArray = object;
        if (object == null) {
            stringArray = "";
        }
        String[] stringArray2 = new String[1];
        object = stringArray2;
        stringArray2[0] = ",";
        object = b.q.f.super((CharSequence)stringArray, (String[])object, false, 0, 6, null);
        Iterator iterator = object;
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            String string = (String)object2;
            object2 = object;
            object2.add((String)((Object)b.q.f.\u00f400000(string)).toString());
        }
        iterator = (List)object;
        object = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            if (!(!b.q.f.\u00f800000((String)object2))) continue;
            object.add(object2);
        }
        return (List)object;
    }

    private static void if(String string3) {
        Object object = MainKt.o00000(347) + string3 + MainKt.o00000(353);
        String string2 = MainKt.o00000(347) + string3;
        Object[] objectArray = new String[7];
        Object[] objectArray2 = objectArray;
        objectArray[0] = MainKt.o00000(417) + string3;
        objectArray2[1] = MainKt.o00000(314) + MainKt.\u00f500000((String)object);
        objectArray2[2] = MainKt.o00000(314) + MainKt.return() + MainKt.o00000(447) + MainKt.return() + ' ' + MainKt.\u00f500000((String)object) + MainKt.o00000(448);
        objectArray2[3] = "rm -f " + MainKt.\u00f500000((String)object + "-journal") + ' ' + MainKt.\u00f500000((String)object + "-wal") + ' ' + MainKt.\u00f500000((String)object + "-shm");
        objectArray2[4] = MainKt.o00000(449) + '$' + MainKt.o00000(450) + MainKt.\u00f500000(string2) + MainKt.o00000(451) + '$' + MainKt.o00000(452) + MainKt.\u00f500000(string2) + MainKt.o00000(453) + '$' + MainKt.o00000(454) + '$' + MainKt.o00000(455) + MainKt.\u00f500000((String)object);
        objectArray2[5] = MainKt.o00000(456) + MainKt.\u00f500000((String)object);
        objectArray2[6] = MainKt.o00000(457) + MainKt.\u00f500000((String)object) + MainKt.o00000(458);
        for (String string3 : mc.new(objectArray2)) {
            object = MainKt.\u00d4O0000(string3);
            System.out.println((Object)((((f)object).\u00d200000 ? "OK" : "WARN") + ": " + string3));
            if (!b.q.f.\u00f800000(((f)object).\u00d200000)) {
                System.out.println((Object)((f)object).\u00d200000);
            }
            if (!(!b.q.f.\u00f800000(((f)object).o00000))) continue;
            System.out.println((Object)((f)object).o00000);
        }
    }

    private static String o00000(boolean bl) {
        if (bl) {
            return if + "[OK]" + OO0000;
        }
        return \u00f800000 + "[FAIL]" + OO0000;
    }

    private static String new(String string) {
        return MainKt.o00000(320) + string + MainKt.o00000(514);
    }

    private static final String[] o00000() {
        return MainKt.new();
    }

    private static final void \u00d800000() {
        while (true) {
            try {
                while (true) {
                    MainKt.\u00d300000();
                    try {
                        boolean bl;
                        String string = b.l.f.\u00d500000(new File("/proc/self/maps"), null, 1, null);
                        Object[] objectArray = new String[5];
                        Object object = objectArray;
                        objectArray[0] = "frida";
                        object[1] = "xposed";
                        object[2] = "substrate";
                        object[3] = "gadget";
                        object[4] = "libhook";
                        object = mc.new((Object[])object);
                        if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
                            object = object.iterator();
                            while (object.hasNext()) {
                                String string2 = (String)object.next();
                                if (!b.q.f.\u00d400000((CharSequence)string, (CharSequence)string2, true)) continue;
                                bl = true;
                                break;
                            }
                        } else {
                            bl = false;
                        }
                        if (bl) {
                            Runtime.getRuntime().halt(0);
                        }
                    }
                    catch (Exception exception) {}
                    Thread.sleep(3000L + (long)(Math.random() * 4000.0));
                }
            }
            catch (InterruptedException interruptedException) {
                return;
            }
            catch (Exception exception) {
                continue;
            }
            break;
        }
    }

    private static final CharSequence o00000(byte by) {
        String string = "%02x";
        Object[] objectArray = new Object[1];
        Object[] objectArray2 = objectArray;
        objectArray[0] = by;
        return String.format(string, Arrays.copyOf(objectArray2, objectArray2.length));
    }

    private static final void o00000(Object object, Object object2) {
        System.out.println((Object)(\u00f500000 + object + OO0000 + '=' + object2));
    }

    private static final String \u00f400000(String string) {
        return ((Object)b.q.f.\u00f400000(b.q.f.\u00d300000(string, (CharSequence)MainKt.o00000(42)))).toString();
    }

    private static final boolean nullsuper(String string) {
        return !b.q.f.\u00f800000(string);
    }

    private static final String oO0000(String string) {
        return ((Object)b.q.f.\u00f400000(b.q.f.\u00d300000(string, (CharSequence)MainKt.o00000(42)))).toString();
    }

    private static final boolean o00000(Set set, String string) {
        return !b.q.f.\u00f800000(string) && !set.contains(string);
    }

    private static final CharSequence o\u00d20000(String string) {
        return MainKt.\u00f500000(string);
    }

    private static final boolean \u00f8O0000(String string) {
        return !b.q.f.\u00f800000(string);
    }

    private static final String new(String string, String string2) {
        String[] stringArray = new String[1];
        Object object = stringArray;
        stringArray[0] = "lO10O";
        int cfr_ignored_0 = ((String[])object).length;
        object = "===" + string2 + "===";
        int n2 = b.q.f.super((CharSequence)string, (String)object, 0, false, 6, null);
        if (n2 < 0) {
            return "";
        }
        int n3 = b.q.f.super((CharSequence)string, MainKt.o00000(75), (n2 += ((String)object).length()) + 1, false, 4, null);
        n3 = n3 > n2 ? n3 : string.length();
        return ((Object)b.q.f.\u00f400000(string.substring(n2, n3))).toString();
    }

    private static final CharSequence new(byte by) {
        String string = MainKt.o00000(21);
        Object[] objectArray = new Object[1];
        Object[] objectArray2 = objectArray;
        objectArray[0] = by;
        return String.format(string, Arrays.copyOf(objectArray2, objectArray2.length));
    }

    public static final /* synthetic */ String a() {
        return MainKt.o00000(44);
    }

    static {
        Object[] objectArray = new String[3];
        Object[] objectArray2 = objectArray;
        objectArray[0] = MainKt.o00000(1);
        objectArray2[1] = MainKt.o00000(2);
        objectArray2[2] = MainKt.o00000(3);
        OO0000 = mc.new(objectArray2);
        OO0000 = new AtomicInteger(511);
        String string = System.getenv("IL00O1IO1");
        if (string == null) {
            string = "O1I11O1OllOll";
        }
        o00000 = string;
        \u00f800000 = new AtomicInteger(942);
    }
}

