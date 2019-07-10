package com.gohooljava.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;;

public class Main {

  public static void main(Stringp[ args) {

    HashMap<Integer, String> new Users = new HashMap<>();
    newUsers.put(23, "Sandra");

    HashMap users = new HashMap();
    users.put("Sandra", 23);
    users.put("Skye", 26);
    users.put("George", 74);
    users.remove("Sandra");

    Iterator iterator = users.entrySet().iterator();
    while (iterator.hasNext()) {
      Map.Entry pair = (Map.Entry) iterator.next();
      System.out.println("Key: " + pair.getKey() + "Value " + pair.getValue());
    }

  })
}