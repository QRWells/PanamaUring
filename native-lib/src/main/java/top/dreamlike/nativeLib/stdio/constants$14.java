// Generated by jextract

package top.dreamlike.nativeLib.stdio;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

class constants$14 {

    static final FunctionDescriptor flockfile$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle flockfile$MH = RuntimeHelper.downcallHandle(
            "flockfile",
            constants$14.flockfile$FUNC
    );
    static final FunctionDescriptor ftrylockfile$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ftrylockfile$MH = RuntimeHelper.downcallHandle(
            "ftrylockfile",
            constants$14.ftrylockfile$FUNC
    );
    static final FunctionDescriptor funlockfile$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle funlockfile$MH = RuntimeHelper.downcallHandle(
            "funlockfile",
            constants$14.funlockfile$FUNC
    );
    static final FunctionDescriptor __uflow$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __uflow$MH = RuntimeHelper.downcallHandle(
            "__uflow",
            constants$14.__uflow$FUNC
    );
    static final FunctionDescriptor __overflow$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __overflow$MH = RuntimeHelper.downcallHandle(
            "__overflow",
            constants$14.__overflow$FUNC
    );
    static final MemorySegment NULL$ADDR = MemorySegment.NULL;
}


