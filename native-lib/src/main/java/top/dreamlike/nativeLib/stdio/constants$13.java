// Generated by jextract

package top.dreamlike.nativeLib.stdio;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

class constants$13 {

    static final FunctionDescriptor fileno$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fileno$MH = RuntimeHelper.downcallHandle(
            "fileno",
            constants$13.fileno$FUNC
    );
    static final FunctionDescriptor fileno_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fileno_unlocked$MH = RuntimeHelper.downcallHandle(
            "fileno_unlocked",
            constants$13.fileno_unlocked$FUNC
    );
    static final FunctionDescriptor popen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle popen$MH = RuntimeHelper.downcallHandle(
            "popen",
            constants$13.popen$FUNC
    );
    static final FunctionDescriptor pclose$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pclose$MH = RuntimeHelper.downcallHandle(
            "pclose",
            constants$13.pclose$FUNC
    );
    static final FunctionDescriptor ctermid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ctermid$MH = RuntimeHelper.downcallHandle(
            "ctermid",
            constants$13.ctermid$FUNC
    );
}

