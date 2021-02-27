package com.codecafe.java8.streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReusingStreams {

    public static void main(String[] args) {

        // Java streams cannot be reused.
        // As soon as you call any terminal operation the stream is closed:

        Stream<String> stream = Stream.of("d2", "a2", "b1", "b3", "c")
                                      .filter(s -> s.startsWith("a"));

        stream.anyMatch(s -> true);    // ok
        stream.noneMatch(s -> true);   // exception

        // Calling noneMatch after anyMatch on the same stream results in the following exception:

        /*
         java.lang.IllegalStateException: stream has already been operated upon or closed
         at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:229)
         at java.util.stream.ReferencePipeline.noneMatch(ReferencePipeline.java:459)
         at com.winterbe.java8.Streams5.test7(Streams5.java:38)
         at com.winterbe.java8.Streams5.main(Streams5.java:28)
         */

        // To overcome this limitation we have to to create a new stream chain for every terminal operation we want to execute,
        // e.g. we could create a stream supplier to construct a new stream with all intermediate operations already set up:

        Supplier<Stream<String>> streamSupplier = () -> Stream.of("d2", "a2", "b1", "b3", "c")
                                                              .filter(s -> s.startsWith("a"));

        streamSupplier.get().anyMatch(s -> true);   // ok
        streamSupplier.get().noneMatch(s -> true);  // ok

        // Each call to get() constructs a new stream on which we are save to call the desired terminal operation.
    }

}