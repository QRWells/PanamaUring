// Generated by jextract

package top.dreamlike.nativeLib.unistd;

import top.dreamlike.common.CType;
import top.dreamlike.helper.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;
class constants$18 {

    static final FunctionDescriptor lockf$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle lockf$MH = RuntimeHelper.downcallHandle(
        "lockf",
        constants$18.lockf$FUNC
    );
    static final FunctionDescriptor fdatasync$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle fdatasync$MH = RuntimeHelper.downcallHandle(
        "fdatasync",
        constants$18.fdatasync$FUNC
    );
    static final FunctionDescriptor crypt$FUNC = FunctionDescriptor.of(CType.C_POINTER$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle crypt$MH = RuntimeHelper.downcallHandle(
        "crypt",
        constants$18.crypt$FUNC
    );
    static final FunctionDescriptor getentropy$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle getentropy$MH = RuntimeHelper.downcallHandle(
        "getentropy",
        constants$18.getentropy$FUNC
    );

}


