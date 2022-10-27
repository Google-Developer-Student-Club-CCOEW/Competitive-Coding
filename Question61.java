//You are given a string of length 5 called time, representing the current time on a digital clock in the format "hh:mm". The earliest possible time is "00:00" and the latest possible time is "23:59".
//In the string time, the digits represented by the ? symbol are unknown, and must be replaced with a digit from 0 to 9.
//Return an integer answer, the number of valid clock times that can be created by replacing every ? with a digit from 0 to 9.

class que61 {
    public int countTime(String time) {

        if (time.equals("??:??"))
            return 24 * 60;

        int result = 1;

        if (time.charAt(0) == '?' && time.charAt(1) == '?')
        {
            result = result*24;
        }
        else if (time.charAt(0) == '?')
        {
            result =result* (time.charAt(1) - '0' >= 4 ? 2 : 3);
        }
        else if (time.charAt(1) == '?')
        {
            result =result* (time.charAt(0) - '0' >= 2 ? 4 : 10);
        }

        if (time.charAt(4) == '?')
            result =result* 10;
        if (time.charAt(3) == '?')
            result =result* 6;

        return result;

    }
}
