package com.learn.spring.flux;

import reactor.core.publisher.Mono;

public class MonoFluxTest {
    
    public void testMono(){
        Mono<String> monoString = Mono.just("hariinfo");
    }
}
