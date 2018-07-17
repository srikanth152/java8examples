package com.lambdas;

import java.sql.Timestamp;
import java.time.Instant;

public class InstantDemo {

    public static void main(String[] args) {
        //validityStartDate(Instant.parse("1900-01-01T01:00:00Z"))  
        Instant i = Instant.parse("2017-11-18T00:00:00Z");
        Timestamp current = Timestamp.from(i);
        System.out.println(current);

    }

}
