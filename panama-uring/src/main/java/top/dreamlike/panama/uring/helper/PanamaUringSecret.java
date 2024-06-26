package top.dreamlike.panama.uring.helper;

import top.dreamlike.panama.uring.async.cancel.CancelToken;
import top.dreamlike.panama.uring.async.trait.IoUringBufferRing;
import top.dreamlike.panama.uring.nativelib.struct.liburing.IoUringBufferRingElement;
import top.dreamlike.panama.uring.trait.OwnershipMemory;

import java.util.BitSet;
import java.util.function.Function;

public class PanamaUringSecret {
    public static Function<OwnershipMemory, IoUringBufferRingElement> lookupOwnershipBufferRingElement;

    public static Function<IoUringBufferRing, BitSet> peekOccupyBitSet;

    public static Function<CancelToken, Long> peekCancelToken;
}
