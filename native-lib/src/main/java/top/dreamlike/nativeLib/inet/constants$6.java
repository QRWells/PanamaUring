// Generated by jextract

package top.dreamlike.nativeLib.inet;

import top.dreamlike.common.CType;
import top.dreamlike.helper.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
class constants$6 {

    static final FunctionDescriptor bindresvport$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle bindresvport$MH = RuntimeHelper.downcallHandle(
        "bindresvport",
        constants$6.bindresvport$FUNC
    );
    static final FunctionDescriptor bindresvport6$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle bindresvport6$MH = RuntimeHelper.downcallHandle(
        "bindresvport6",
        constants$6.bindresvport6$FUNC
    );
    static final FunctionDescriptor inet_addr$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle inet_addr$MH = RuntimeHelper.downcallHandle(
        "inet_addr",
        constants$6.inet_addr$FUNC
    );
    static final FunctionDescriptor inet_lnaof$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        MemoryLayout.structLayout(
            CType.C_INT$LAYOUT.withName("s_addr")
        ).withName("in_addr")
    );
    static final MethodHandle inet_lnaof$MH = RuntimeHelper.downcallHandle(
        "inet_lnaof",
        constants$6.inet_lnaof$FUNC
    );
    static final FunctionDescriptor inet_makeaddr$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        CType.C_INT$LAYOUT.withName("s_addr")
    ).withName("in_addr"),
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle inet_makeaddr$MH = RuntimeHelper.downcallHandle(
        "inet_makeaddr",
        constants$6.inet_makeaddr$FUNC
    );
    static final FunctionDescriptor inet_netof$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        MemoryLayout.structLayout(
            CType.C_INT$LAYOUT.withName("s_addr")
        ).withName("in_addr")
    );
    static final MethodHandle inet_netof$MH = RuntimeHelper.downcallHandle(
        "inet_netof",
        constants$6.inet_netof$FUNC
    );
}


