// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

class constants$7 {

    static final FunctionDescriptor killpg$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle killpg$MH = RuntimeHelper.downcallHandle(
        "killpg",
        constants$7.killpg$FUNC
    );
    static final FunctionDescriptor raise$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle raise$MH = RuntimeHelper.downcallHandle(
        "raise",
        constants$7.raise$FUNC
    );
    static final FunctionDescriptor sigpause$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sigpause$MH = RuntimeHelper.downcallHandle(
        "sigpause",
        constants$7.sigpause$FUNC
    );
    static final FunctionDescriptor sigemptyset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigemptyset$MH = RuntimeHelper.downcallHandle(
        "sigemptyset",
        constants$7.sigemptyset$FUNC
    );
    static final FunctionDescriptor sigfillset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigfillset$MH = RuntimeHelper.downcallHandle(
        "sigfillset",
        constants$7.sigfillset$FUNC
    );
    static final FunctionDescriptor sigaddset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sigaddset$MH = RuntimeHelper.downcallHandle(
        "sigaddset",
        constants$7.sigaddset$FUNC
    );
}

