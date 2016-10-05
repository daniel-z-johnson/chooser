package com.exercise.self.Controller;

import com.exercise.self.model.Choices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Created by prime23 for self exercise
 */
@RestController
public class ChooserController {

    @PostMapping(path = "/chooser")
    public Map<String, Integer> flipCoins(@RequestBody Choices choices) {
        Map<String, Integer> result = new HashMap<>();
        List<String> items = choices.getItems();
        IntStream.range(0, choices.getFlips()).forEach(i -> {
            Collections.shuffle(items);
            String key = items.get(0);
            result.put(key, result.getOrDefault(key, 0) + 1);
        });
        return result;
    }
}
