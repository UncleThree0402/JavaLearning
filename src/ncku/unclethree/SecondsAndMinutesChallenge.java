package ncku.unclethree;

import java.text.DecimalFormat;

public class SecondsAndMinutesChallenge {

    public static String getDurationString(long minutes, long seconds) {
        DecimalFormat df = new DecimalFormat("00");
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid Value";
        } else {
            return df.format((minutes * 60 + seconds) / 3600) + "h " + df.format(((minutes * 60 + seconds) % 3600) / 60) + "m " + df.format(((minutes * 60 + seconds) % 3600) % 60) + "s";
        }
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        } else {
            return getDurationString(seconds/60,seconds%60);
        }
    }
}
