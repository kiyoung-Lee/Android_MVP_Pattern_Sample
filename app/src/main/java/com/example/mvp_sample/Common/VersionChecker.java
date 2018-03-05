package com.example.mvp_sample.Common;

/**
 * Created by KiyoungLee on 2018-03-05.
 */

public class VersionChecker {

    public static int isOldVer(String old, String New){
        if(old != null && New != null){
            try {
                Version oldVer = new Version(old);
                Version newVer = new Version(New);

                // newVer > oldVer = 1;
                // newVer = oldVer = 0;
                // newVer < oldVer = -1;

                int result = newVer.compareTo(oldVer);
                return result;
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        return -1;
    }

    public static class Version implements Comparable<Version> {

        private String version;

        public final String get() {
            return this.version;
        }

        public Version(String version) {
            if(version == null)
                throw new IllegalArgumentException("Version can not be null");
            if(!version.matches("[0-9]+(\\.[0-9]+)*"))
                throw new IllegalArgumentException("Invalid version format");
            this.version = version;
        }

        @Override public int compareTo(Version that) {
            if(that == null)
                return 1;
            String[] thisParts = this.get().split("\\.");
            String[] thatParts = that.get().split("\\.");
            int length = Math.max(thisParts.length, thatParts.length);
            for(int i = 0; i < length; i++) {
                int thisPart = i < thisParts.length ?
                        Integer.parseInt(thisParts[i]) : 0;
                int thatPart = i < thatParts.length ?
                        Integer.parseInt(thatParts[i]) : 0;
                if(thisPart < thatPart)
                    return -1;
                if(thisPart > thatPart)
                    return 1;
            }
            return 0;
        }

        @Override public boolean equals(Object that) {
            if(this == that)
                return true;
            if(that == null)
                return false;
            if(this.getClass() != that.getClass())
                return false;
            return this.compareTo((Version) that) == 0;
        }

    }

}
