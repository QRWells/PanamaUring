// Generated by jextract

package top.dreamlike.nativeLib.unistd;

import top.dreamlike.common.CType;
import top.dreamlike.helper.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;
class constants$8 {

    static final FunctionDescriptor geteuid$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT);
    static final MethodHandle geteuid$MH = RuntimeHelper.downcallHandle(
        "geteuid",
        constants$8.geteuid$FUNC
    );
    static final FunctionDescriptor getgid$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT);
    static final MethodHandle getgid$MH = RuntimeHelper.downcallHandle(
        "getgid",
        constants$8.getgid$FUNC
    );
    static final FunctionDescriptor getegid$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT);
    static final MethodHandle getegid$MH = RuntimeHelper.downcallHandle(
        "getegid",
        constants$8.getegid$FUNC
    );
    static final FunctionDescriptor getgroups$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle getgroups$MH = RuntimeHelper.downcallHandle(
        "getgroups",
        constants$8.getgroups$FUNC
    );
    static final FunctionDescriptor setuid$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle setuid$MH = RuntimeHelper.downcallHandle(
        "setuid",
        constants$8.setuid$FUNC
    );
    static final FunctionDescriptor setreuid$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle setreuid$MH = RuntimeHelper.downcallHandle(
        "setreuid",
        constants$8.setreuid$FUNC
    );
}


