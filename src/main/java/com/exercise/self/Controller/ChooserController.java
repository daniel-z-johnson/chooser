package com.exercise.self.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Created by daniel on 10/4/16.
 */
@RestController
public class ChooserController {

    @PostMapping(path = "/chooser")
    public Map<String, Integer> flipCoins(@RequestBody List<String> choices) {
        Map<String, Integer> result = new HashMap<>();
        IntStream.range(0, 999983).forEach(i -> {
            Collections.shuffle(choices);
            String key = choices.get(0);
            result.put(key, result.getOrDefault(key, 0) + 1);
        });
        return result;
    }
}
