/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.d;

import b.c.d;
import b.c.f;
import b.o.d.w;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c
extends Enum {
    private final String \u00f6\u00d30000;
    private final boolean Stringnew;
    public static final /* enum */ c \u00d3\u00d50000 = new c("UNRESOLVED_TYPE", 0, "Unresolved type for %s", true);
    public static final /* enum */ c \u00d8\u00d20000 = new c("UNRESOLVED_TYPE_PARAMETER_TYPE", 1, "Unresolved type parameter type", true);
    public static final /* enum */ c String = new c("UNRESOLVED_CLASS_TYPE", 2, "Unresolved class %s", true);
    public static final /* enum */ c whileObject = new c("UNRESOLVED_JAVA_CLASS", 3, "Unresolved java class %s", true);
    public static final /* enum */ c \u00f8\u00d30000 = new c("UNRESOLVED_DECLARATION", 4, "Unresolved declaration %s", true);
    public static final /* enum */ c \u00d2o0000 = new c("UNRESOLVED_KCLASS_CONSTANT_VALUE", 5, "Unresolved type for %s (arrayDimensions=%s)", true);
    public static final /* enum */ c o\u00d50000 = new c("UNRESOLVED_TYPE_ALIAS", 6, "Unresolved type alias %s", false, 2, null);
    public static final /* enum */ c \u00d6\u00d30000 = new c("RETURN_TYPE", 7, "Return type for %s cannot be resolved", false, 2, null);
    public static final /* enum */ c \u00d200000 = new c("RETURN_TYPE_FOR_FUNCTION", 8, "Return type for function cannot be resolved", false, 2, null);
    public static final /* enum */ c fornew = new c("RETURN_TYPE_FOR_PROPERTY", 9, "Return type for property %s cannot be resolved", false, 2, null);
    public static final /* enum */ c o\u00d60000 = new c("RETURN_TYPE_FOR_CONSTRUCTOR", 10, "Return type for constructor %s cannot be resolved", false, 2, null);
    public static final /* enum */ c \u00d3\u00d20000 = new c("IMPLICIT_RETURN_TYPE_FOR_FUNCTION", 11, "Implicit return type for function %s cannot be resolved", false, 2, null);
    public static final /* enum */ c \u00d6\u00d40000 = new c("IMPLICIT_RETURN_TYPE_FOR_PROPERTY", 12, "Implicit return type for property %s cannot be resolved", false, 2, null);
    public static final /* enum */ c thisString = new c("IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR", 13, "Implicit return type for property accessor %s cannot be resolved", false, 2, null);
    public static final /* enum */ c \u00f5\u00d20000 = new c("ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT", 14, "%s() return type", false, 2, null);
    public static final /* enum */ c \u00d3\u00d30000 = new c("RECURSIVE_TYPE", 15, "Recursive type", false, 2, null);
    public static final /* enum */ c \u00d6O0000 = new c("RECURSIVE_TYPE_ALIAS", 16, "Recursive type alias %s", false, 2, null);
    public static final /* enum */ c \u00d2\u00d40000 = new c("RECURSIVE_ANNOTATION_TYPE", 17, "Recursive annotation's type", false, 2, null);
    public static final /* enum */ c \u00f8\u00d20000 = new c("CYCLIC_UPPER_BOUNDS", 18, "Cyclic upper bounds", false, 2, null);
    public static final /* enum */ c \u00d800000 = new c("CYCLIC_SUPERTYPES", 19, "Cyclic supertypes", false, 2, null);
    public static final /* enum */ c nullnew = new c("UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE", 20, "Cannot infer a lambda context receiver type", false, 2, null);
    public static final /* enum */ c \u00d5o0000 = new c("UNINFERRED_LAMBDA_PARAMETER_TYPE", 21, "Cannot infer a lambda parameter type", false, 2, null);
    public static final /* enum */ c \u00d5\u00d50000 = new c("UNINFERRED_TYPE_VARIABLE", 22, "Cannot infer a type variable %s", false, 2, null);
    public static final /* enum */ c \u00d3\u00d40000 = new c("RESOLUTION_ERROR_TYPE", 23, "Resolution error type (%s)", false, 2, null);
    public static final /* enum */ c privatenew = new c("ERROR_EXPECTED_TYPE", 24, "Error expected type", false, 2, null);
    public static final /* enum */ c \u00d3\u00d60000 = new c("ERROR_DATA_FLOW_TYPE", 25, "Error type for data flow", false, 2, null);
    public static final /* enum */ c \u00f6o0000 = new c("ERROR_WHILE_RECONSTRUCTING_BARE_TYPE", 26, "Failed to reconstruct type %s", false, 2, null);
    public static final /* enum */ c \u00d6o0000 = new c("UNABLE_TO_SUBSTITUTE_TYPE", 27, "Unable to substitute type (%s)", false, 2, null);
    public static final /* enum */ c \u00d300000 = new c("DONT_CARE", 28, "Special DONT_CARE type", false, 2, null);
    public static final /* enum */ c thisnew = new c("STUB_TYPE", 29, "Stub type %s", false, 2, null);
    public static final /* enum */ c returnsuper = new c("FUNCTION_PLACEHOLDER_TYPE", 30, "Function placeholder type (arguments: %s)", false, 2, null);
    public static final /* enum */ c \u00f5o0000 = new c("TYPE_FOR_COMPILER_EXCEPTION", 31, "Error type for a compiler exception while analyzing %s", false, 2, null);
    public static final /* enum */ c \u00f600000 = new c("ERROR_FLEXIBLE_TYPE", 32, "Error java flexible type with id %s. (%s..%s)", false, 2, null);
    public static final /* enum */ c \u00f5\u00d40000 = new c("ERROR_RAW_TYPE", 33, "Error raw type %s", false, 2, null);
    public static final /* enum */ c \u00d2\u00d20000 = new c("TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS", 34, "Inconsistent type %s (parameters.size = %s, arguments.size = %s)", false, 2, null);
    public static final /* enum */ c \u00d8\u00d40000 = new c("ILLEGAL_TYPE_RANGE_FOR_DYNAMIC", 35, "Illegal type range for dynamic type %s..%s", false, 2, null);
    public static final /* enum */ c \u00d2\u00d30000 = new c("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER", 36, "Unknown type parameter %s. Please try recompiling module containing \"%s\"", false, 2, null);
    public static final /* enum */ c whilesuper = new c("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME", 37, "Couldn't deserialize type parameter %s in %s", false, 2, null);
    public static final /* enum */ c oo0000 = new c("INCONSISTENT_SUSPEND_FUNCTION", 38, "Inconsistent suspend function type in metadata with constructor %s", false, 2, null);
    public static final /* enum */ c \u00d2O0000 = new c("UNEXPECTED_FLEXIBLE_TYPE_ID", 39, "Unexpected id of a flexible type %s. (%s..%s)", false, 2, null);
    public static final /* enum */ c o00000 = new c("UNKNOWN_TYPE", 40, "Unknown type", false, 2, null);
    public static final /* enum */ c \u00d3o0000 = new c("NO_TYPE_SPECIFIED", 41, "No type specified for %s", false, 2, null);
    public static final /* enum */ c \u00d8O0000 = new c("NO_TYPE_FOR_LOOP_RANGE", 42, "Loop range has no type", false, 2, null);
    public static final /* enum */ c StringString = new c("NO_TYPE_FOR_LOOP_PARAMETER", 43, "Loop parameter has no type", false, 2, null);
    public static final /* enum */ c newObject = new c("MISSED_TYPE_FOR_PARAMETER", 44, "Missed a type for a value parameter %s", false, 2, null);
    public static final /* enum */ c \u00f6O0000 = new c("MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER", 45, "Missed a type argument for a type parameter %s", false, 2, null);
    public static final /* enum */ c forString = new c("PARSE_ERROR_ARGUMENT", 46, "Error type for parse error argument %s", false, 2, null);
    public static final /* enum */ c \u00f5O0000 = new c("STAR_PROJECTION_IN_CALL", 47, "Error type for star projection directly passing as a call type argument", false, 2, null);
    public static final /* enum */ c ifsuper = new c("PROHIBITED_DYNAMIC_TYPE", 48, "Dynamic type in a not allowed context", false, 2, null);
    public static final /* enum */ c \u00d8\u00d50000 = new c("NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT", 49, "Not an annotation type %s in the annotation context", false, 2, null);
    public static final /* enum */ c \u00d8o0000 = new c("UNIT_RETURN_TYPE_FOR_INC_DEC", 50, "Unit type returned by inc or dec", false, 2, null);
    public static final /* enum */ c o\u00d40000 = new c("RETURN_NOT_ALLOWED", 51, "Return not allowed", false, 2, null);
    public static final /* enum */ c private = new c("UNRESOLVED_PARCEL_TYPE", 52, "Unresolved 'Parcel' type", true);
    public static final /* enum */ c \u00d8\u00d30000 = new c("KAPT_ERROR_TYPE", 53, "Kapt error type", false, 2, null);
    public static final /* enum */ c o\u00d20000 = new c("SYNTHETIC_ELEMENT_ERROR_TYPE", 54, "Error type for synthetic element", false, 2, null);
    public static final /* enum */ c o\u00d30000 = new c("AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE", 55, "Error type in ad hoc resolve for lighter classes", false, 2, null);
    public static final /* enum */ c \u00d2\u00d60000 = new c("ERROR_EXPRESSION_TYPE", 56, "Error expression type", false, 2, null);
    public static final /* enum */ c oO0000 = new c("ERROR_RECEIVER_TYPE", 57, "Error receiver type for %s", false, 2, null);
    public static final /* enum */ c \u00f6\u00d20000 = new c("ERROR_CONSTANT_VALUE", 58, "Error constant value %s", false, 2, null);
    public static final /* enum */ c \u00d5\u00d40000 = new c("EMPTY_CALLABLE_REFERENCE", 59, "Empty callable reference", false, 2, null);
    public static final /* enum */ c \u00d5\u00d30000 = new c("UNSUPPORTED_CALLABLE_REFERENCE_TYPE", 60, "Unsupported callable reference type %s", false, 2, null);
    public static final /* enum */ c \u00f8\u00d40000 = new c("TYPE_FOR_DELEGATION", 61, "Error delegation type for %s", false, 2, null);
    public static final /* enum */ c \u00d5O0000 = new c("UNAVAILABLE_TYPE_FOR_DECLARATION", 62, "Type is unavailable for declaration %s", false, 2, null);
    public static final /* enum */ c \u00f800000 = new c("ERROR_TYPE_PARAMETER", 63, "Error type parameter", false, 2, null);
    public static final /* enum */ c returnObject = new c("ERROR_TYPE_PROJECTION", 64, "Error type projection", false, 2, null);
    public static final /* enum */ c \u00d5\u00d20000 = new c("ERROR_SUPER_TYPE", 65, "Error super type", false, 2, null);
    public static final /* enum */ c \u00d500000 = new c("SUPER_TYPE_FOR_ERROR_TYPE", 66, "Supertype of error type %s", false, 2, null);
    public static final /* enum */ c ifObject = new c("ERROR_PROPERTY_TYPE", 67, "Error property type", false, 2, null);
    public static final /* enum */ c \u00d6\u00d20000 = new c("ERROR_CLASS", 68, "Error class", false, 2, null);
    public static final /* enum */ c newsuper = new c("TYPE_FOR_ERROR_TYPE_CONSTRUCTOR", 69, "Type for error type constructor (%s)", false, 2, null);
    public static final /* enum */ c \u00f8\u00d50000 = new c("INTERSECTION_OF_ERROR_TYPES", 70, "Intersection of error types %s", false, 2, null);
    public static final /* enum */ c \u00f8O0000 = new c("CANNOT_COMPUTE_ERASED_BOUND", 71, "Cannot compute erased upper bound of a type parameter %s", false, 2, null);
    public static final /* enum */ c \u00d3O0000 = new c("NOT_FOUND_UNSIGNED_TYPE", 72, "Unsigned type %s not found", false, 2, null);
    public static final /* enum */ c \u00f6\u00d50000 = new c("ERROR_ENUM_TYPE", 73, "Not found the corresponding enum class for given enum entry %s.%s", false, 2, null);
    public static final /* enum */ c \u00d6\u00d50000 = new c("NO_RECORDED_TYPE", 74, "Not found recorded type for %s", false, 2, null);
    public static final /* enum */ c for = new c("NOT_FOUND_DESCRIPTOR_FOR_FUNCTION", 75, "Descriptor not found for function %s", false, 2, null);
    public static final /* enum */ c nullString = new c("NOT_FOUND_DESCRIPTOR_FOR_CLASS", 76, "Cannot build class type, descriptor not found for builder %s", false, 2, null);
    public static final /* enum */ c \u00d600000 = new c("NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER", 77, "Cannot build type parameter type, descriptor not found for builder %s", false, 2, null);
    public static final /* enum */ c \u00d2\u00d50000 = new c("UNMAPPED_ANNOTATION_TARGET_TYPE", 78, "Type for unmapped Java annotation target to Kotlin one", false, 2, null);
    public static final /* enum */ c \u00f500000 = new c("UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT", 79, "Unknown type for an array element of a java annotation argument", false, 2, null);
    public static final /* enum */ c \u00f5\u00d50000 = new c("NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION", 80, "No fqName for annotation %s", false, 2, null);
    public static final /* enum */ c \u00f6\u00d40000 = new c("NOT_FOUND_FQNAME", 81, "No fqName for %s", false, 2, null);
    public static final /* enum */ c \u00f5\u00d30000 = new c("TYPE_FOR_GENERATED_ERROR_EXPRESSION", 82, "Type for generated error expression", false, 2, null);
    private static final /* synthetic */ c[] \u00f8o0000;
    private static final /* synthetic */ f null;

    /*
     * WARNING - void declaration
     */
    private c() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.\u00f6\u00d30000 = var3_2;
        this.Stringnew = var4_1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ c(String string, boolean bl, int n2, w object) {
        void var1_-1;
        void var5_4;
        if ((var5_4 & 2) != 0) {
            object = false;
        }
        this((String)var1_-1, bl ? 1 : 0, (String)n2, (boolean)object);
    }

    public final String o00000() {
        return this.\u00f6\u00d30000;
    }

    public final boolean Object() {
        return this.Stringnew;
    }

    public static c[] values() {
        return (c[])\u00f8o0000.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static final /* synthetic */ c[] \u00d200000() {
        c[] cArray = new c[83];
        c[] cArray2 = cArray;
        cArray[0] = \u00d3\u00d50000;
        cArray2[1] = \u00d8\u00d20000;
        cArray2[2] = String;
        cArray2[3] = whileObject;
        cArray2[4] = \u00f8\u00d30000;
        cArray2[5] = \u00d2o0000;
        cArray2[6] = o\u00d50000;
        cArray2[7] = \u00d6\u00d30000;
        cArray2[8] = \u00d200000;
        cArray2[9] = fornew;
        cArray2[10] = o\u00d60000;
        cArray2[11] = \u00d3\u00d20000;
        cArray2[12] = \u00d6\u00d40000;
        cArray2[13] = thisString;
        cArray2[14] = \u00f5\u00d20000;
        cArray2[15] = \u00d3\u00d30000;
        cArray2[16] = \u00d6O0000;
        cArray2[17] = \u00d2\u00d40000;
        cArray2[18] = \u00f8\u00d20000;
        cArray2[19] = \u00d800000;
        cArray2[20] = nullnew;
        cArray2[21] = \u00d5o0000;
        cArray2[22] = \u00d5\u00d50000;
        cArray2[23] = \u00d3\u00d40000;
        cArray2[24] = privatenew;
        cArray2[25] = \u00d3\u00d60000;
        cArray2[26] = \u00f6o0000;
        cArray2[27] = \u00d6o0000;
        cArray2[28] = \u00d300000;
        cArray2[29] = thisnew;
        cArray2[30] = returnsuper;
        cArray2[31] = \u00f5o0000;
        cArray2[32] = \u00f600000;
        cArray2[33] = \u00f5\u00d40000;
        cArray2[34] = \u00d2\u00d20000;
        cArray2[35] = \u00d8\u00d40000;
        cArray2[36] = \u00d2\u00d30000;
        cArray2[37] = whilesuper;
        cArray2[38] = oo0000;
        cArray2[39] = \u00d2O0000;
        cArray2[40] = o00000;
        cArray2[41] = \u00d3o0000;
        cArray2[42] = \u00d8O0000;
        cArray2[43] = StringString;
        cArray2[44] = newObject;
        cArray2[45] = \u00f6O0000;
        cArray2[46] = forString;
        cArray2[47] = \u00f5O0000;
        cArray2[48] = ifsuper;
        cArray2[49] = \u00d8\u00d50000;
        cArray2[50] = \u00d8o0000;
        cArray2[51] = o\u00d40000;
        cArray2[52] = private;
        cArray2[53] = \u00d8\u00d30000;
        cArray2[54] = o\u00d20000;
        cArray2[55] = o\u00d30000;
        cArray2[56] = \u00d2\u00d60000;
        cArray2[57] = oO0000;
        cArray2[58] = \u00f6\u00d20000;
        cArray2[59] = \u00d5\u00d40000;
        cArray2[60] = \u00d5\u00d30000;
        cArray2[61] = \u00f8\u00d40000;
        cArray2[62] = \u00d5O0000;
        cArray2[63] = \u00f800000;
        cArray2[64] = returnObject;
        cArray2[65] = \u00d5\u00d20000;
        cArray2[66] = \u00d500000;
        cArray2[67] = ifObject;
        cArray2[68] = \u00d6\u00d20000;
        cArray2[69] = newsuper;
        cArray2[70] = \u00f8\u00d50000;
        cArray2[71] = \u00f8O0000;
        cArray2[72] = \u00d3O0000;
        cArray2[73] = \u00f6\u00d50000;
        cArray2[74] = \u00d6\u00d50000;
        cArray2[75] = for;
        cArray2[76] = nullString;
        cArray2[77] = \u00d600000;
        cArray2[78] = \u00d2\u00d50000;
        cArray2[79] = \u00f500000;
        cArray2[80] = \u00f5\u00d50000;
        cArray2[81] = \u00f6\u00d40000;
        cArray2[82] = \u00f5\u00d30000;
        return cArray2;
    }

    static {
        \u00f8o0000 = c.\u00d200000();
        null = d.o00000(\u00f8o0000);
    }
}

