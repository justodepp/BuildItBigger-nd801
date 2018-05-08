package com.dshare.libjokes;

import java.util.Random;

public class MakeJoke {

    private String jokes[] = {
            "Code never lies, comments do." ,
            "Unix is user friendly. It's just very particular about who its friends are.",
            "There's no place like 127.0.0.1",
            "We give you a year to get the job done. Let us know when the system is ready.",
            "Documentation is like sex. When it's good, it's very good. When it's bad, it's better than nothing."
    };

    public String getRandomJoke() {
        Random random = new Random();
        int randomValue = random.nextInt(jokes.length);
        return jokes[randomValue];
    }
}
