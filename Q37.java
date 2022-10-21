

import java.io.IOException;
import java.util.*;



public class LShape
{


    public static void main(String[] args) throws IOException {

        int t;
        t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
        for (int tt = 1; tt <= t; ++tt)
        {
            int r;
            int c;
            r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
            c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
            ArrayList<ArrayList<Integer>> g = VectorHelper.nestedArrayList(r, c, 0);
            ArrayList<ArrayList<Integer>> gr = VectorHelper.nestedArrayList(r, c, 0);
            ArrayList<ArrayList<Integer>> grr =VectorHelper.nestedArrayList(r, c, 0);
            ArrayList<ArrayList<Integer>> gc = VectorHelper.nestedArrayList(r, c, 0);
            ArrayList<ArrayList<Integer>> gcc =VectorHelper.nestedArrayList(r, c, 0);

            for (int i = 0; i < r; ++i)
            {
                for (int j = 0; j < c; ++j)
                {
                    g.get(i).set(j, Integer.parseInt(ConsoleInput.readToWhiteSpace(true)));
                }
            }

            for (int i = 0; i < r; ++i)
            {
                for (int j = 0; j < c; ++j)
                {
                    if (g.get(i).get(j) == 0)
                    {
                        gr.get(i).set(j, 0);
                        gc.get(i).set(j, 0);
                    }
                    else
                    {
                        if (i == 0)
                        {
                            gr.get(i).set(j, 1);
                        }
                        if (i != 0)
                        {
                            gr.get(i).set(j, gr.get(i - 1).get(j) + 1);
                        }
                        if (j == 0)
                        {
                            gc.get(i).set(j, 1);
                        }
                        if (j != 0)
                        {
                            gc.get(i).set(j, gc.get(i).get(j - 1) + 1);
                        }
                    }
                }
            }

            for (int i = r - 1; i >= 0; --i)
            {
                for (int j = c - 1; j >= 0; --j)
                {
                    if (g.get(i).get(j) == 0)
                    {
                        gr.get(i).set(j, 0);
                        gc.get(i).set(j, 0);
                    }
                    else
                    {
                        if (i == r - 1)
                        {
                            grr.get(i).set(j, 1);
                        }
                        if (i != r - 1)
                        {
                            grr.get(i).set(j, grr.get(i + 1).get(j) + 1);
                        }
                        if (j == c - 1)
                        {
                            gcc.get(i).set(j, 1);
                        }
                        if (j != c - 1)
                        {
                            gcc.get(i).set(j, gcc.get(i).get(j + 1) + 1);
                        }
                    }
                }
            }
            long ans = 0;

            for (int i = 0; i < r; ++i)
            {
                for (int j = 0; j < c; ++j)
                {
                    if (gcc.get(i).get(j) >= 2)
                    {
                        ans += Math.max(0, Math.min(gr.get(i).get(j) / 2,gcc.get(i).get(j)) - 1);
                    }
                    if (gc.get(i).get(j) >= 2)
                    {
                        ans += Math.max(0, Math.min(gr.get(i).get(j) / 2,gc.get(i).get(j)) - 1);
                    }
                    if (gc.get(i).get(j) >= 2)
                    {
                        ans += Math.max(0, Math.min(grr.get(i).get(j) / 2,gc.get(i).get(j)) - 1);
                    }
                    if (gcc.get(i).get(j) >= 2)
                    {
                        ans += Math.max(0, Math.min(grr.get(i).get(j) / 2,gcc.get(i).get(j)) - 1);
                    }
                    if (gr.get(i).get(j) >= 2)
                    {
                        ans += Math.max(0, Math.min(gc.get(i).get(j) / 2,gr.get(i).get(j)) - 1);
                    }
                    if (grr.get(i).get(j) >= 2)
                    {
                        ans += Math.max(0, Math.min(gc.get(i).get(j) / 2,grr.get(i).get(j)) - 1);
                    }
                    if (grr.get(i).get(j) >= 2)
                    {
                        ans += Math.max(0, Math.min(gcc.get(i).get(j) / 2,grr.get(i).get(j)) - 1);
                    }
                    if (gr.get(i).get(j) >= 2)
                    {
                        ans += Math.max(0, Math.min(gcc.get(i).get(j) / 2,gr.get(i).get(j)) - 1);
                    }
                }
            }
            System.out.print("Case #");
            System.out.print(tt);
            System.out.print(": ");
            System.out.print(ans);
            System.out.print("\n");
        }

    }
}


final class VectorHelper
{
    public static <T> void resize(ArrayList<T> list, int newSize)
    {
        resize(list, newSize, null);
    }

    public static <T> void resize(ArrayList<T> list, int newSize, T value)
    {
        if (list.size() > newSize)
        {
            for (int i = list.size() - 1; i >= newSize; i--)
            {
                list.remove(i);
            }
        }
        else if (list.size() < newSize)
        {
            for (int i = list.size(); i < newSize; i++)
            {
                list.add(value);
            }
        }
    }

    public static <T> void swap(ArrayList<T> list1, ArrayList<T> list2)
    {
        ArrayList<T> temp = new ArrayList<T>(list1);
        list1.clear();
        list1.addAll(list2);
        list2.clear();
        list2.addAll(temp);
    }

    public static <T> ArrayList<T> initializedArrayList(int size, T value)
    {
        ArrayList<T> temp = new ArrayList<T>();
        for (int count = 1; count <= size; count++)
        {
            temp.add(value);
        }

        return temp;
    }

    public static <T> ArrayList<ArrayList<T>> nestedArrayList(int outerSize, int innerSize)
    {
        ArrayList<ArrayList<T>> temp = new ArrayList<ArrayList<T>>();
        for (int count = 1; count <= outerSize; count++)
        {
            temp.add(new ArrayList<T>(innerSize));
        }

        return temp;
    }

    public static <T> ArrayList<ArrayList<T>> nestedArrayList(int outerSize, int innerSize, T value)
    {
        ArrayList<ArrayList<T>> temp = new ArrayList<ArrayList<T>>();
        for (int count = 1; count <= outerSize; count++)
        {
            temp.add(initializedArrayList(innerSize, value));
        }

        return temp;
    }
}

final class ConsoleInput
{
    private static boolean goodLastRead = false;
    public static boolean lastReadWasGood()
    {
        return goodLastRead;
    }

    public static String readToWhiteSpace(boolean skipLeadingWhiteSpace) throws IOException {
        String input = "";
        char nextChar;
        while (Character.isWhitespace(nextChar = (char)System.in.read()))
        {
            //accumulate leading white space if skipLeadingWhiteSpace is false:
            if (!skipLeadingWhiteSpace)
            {
                input += nextChar;
            }
        }
        //the first non white space character:
        input += nextChar;

        //accumulate characters until white space is reached:
        while (!Character.isWhitespace(nextChar = (char)System.in.read()))
        {
            input += nextChar;
        }

        goodLastRead = input.length() > 0;
        return input;
    }

    public static String scanfRead() throws IOException {
        return scanfRead(null, -1);
    }

    public static String scanfRead(String unwantedSequence) throws IOException {
        return scanfRead(unwantedSequence, -1);
    }

    public static String scanfRead(String unwantedSequence, int maxFieldLength) throws IOException {
        String input = "";

        char nextChar;
        if (unwantedSequence != null)
        {
            nextChar = '\0';
            for (int charIndex = 0; charIndex < unwantedSequence.length(); charIndex++)
            {
                if (Character.isWhitespace(unwantedSequence.charAt(charIndex)))
                {
                    //ignore all subsequent white space:
                    while (Character.isWhitespace(nextChar = (char)System.in.read()))
                    {
                    }
                }
                else
                {
                    //ensure each character matches the expected character in the sequence:
                    nextChar = (char)System.in.read();
                    if (nextChar != unwantedSequence.charAt(charIndex))
                        return null;
                }
            }

            input = (Character.valueOf(nextChar)).toString();
            if (maxFieldLength == 1)
                return input;
        }

        while (!Character.isWhitespace(nextChar = (char)System.in.read()))
        {
            input += nextChar;
            if (maxFieldLength == input.length())
                return input;
        }

        return input;
    }
}
