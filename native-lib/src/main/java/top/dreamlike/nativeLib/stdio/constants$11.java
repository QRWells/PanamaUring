// Generated by jextract

package top.dreamlike.nativeLib.stdio;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

class constants$11 {

    static final FunctionDescriptor fseeko$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fseeko$MH = RuntimeHelper.downcallHandle(
            "fseeko",
            constants$11.fseeko$FUNC
    );
    static final FunctionDescriptor ftello$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ftello$MH = RuntimeHelper.downcallHandle(
            "ftello",
            constants$11.ftello$FUNC
    );
    static final FunctionDescriptor fgetpos$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fgetpos$MH = RuntimeHelper.downcallHandle(
            "fgetpos",
            constants$11.fgetpos$FUNC
    );
    static final FunctionDescriptor fsetpos$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fsetpos$MH = RuntimeHelper.downcallHandle(
            "fsetpos",
            constants$11.fsetpos$FUNC
    );
    static final FunctionDescriptor clearerr$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clearerr$MH = RuntimeHelper.downcallHandle(
            "clearerr",
            constants$11.clearerr$FUNC
    );
    static final FunctionDescriptor feof$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle feof$MH = RuntimeHelper.downcallHandle(
            "feof",
            constants$11.feof$FUNC
    );
}

