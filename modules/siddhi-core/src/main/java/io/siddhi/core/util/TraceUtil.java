package io.siddhi.core.util;

import java.util.Stack;
import org.javatuples.Triplet;

public class TraceUtil {
    public static Stack<Triplet<Long, String, Long>> traceStack = new Stack<Triplet<Long, String, Long>>();

    public static void addTrace(Long id, Long time) {
        traceStack.push(new Triplet<Long, String, Long>(id, Thread.currentThread().getStackTrace()[2].toString(), time));
    }
}
