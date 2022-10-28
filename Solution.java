package hactoberfest;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
        Integer numstr = Integer.parseInt(c.readLine());
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        while(numstr > 0)
        {
            String str = c.readLine();
            if (map.get(str)==null)
                map.put(str, 1);
            else
            {
                int num = map.get(str);
                map.put(str, num+1);
            }
            numstr--;
        }
        Integer numops = Integer.parseInt(c.readLine());
        while(numops > 0)
        {
            String s = c.readLine();
            if (map.get(s) == null)
                System.out.println(0);
            else
                System.out.println(map.get(s));
            numops--;
        }
    }
}
