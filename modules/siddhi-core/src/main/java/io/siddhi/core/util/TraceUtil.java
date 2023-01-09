package io.siddhi.core.util;

import java.util.Stack;
import org.javatuples.Triplet;

public class TraceUtil {
    public static Stack<Triplet<Long, String, Long>> traceStack = new Stack<Triplet<Long, String, Long>>();

    public static void addTrace(Long id, String message, Long time) {
        traceStack.push(new Triplet<Long, String, Long>(id, message, time));
    }
}
