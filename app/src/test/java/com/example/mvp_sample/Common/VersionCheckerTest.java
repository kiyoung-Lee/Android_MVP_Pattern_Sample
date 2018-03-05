package com.example.mvp_sample.Common;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by KiyoungLee on 2018-03-05.
 */
public class VersionCheckerTest {

    @Test
    public void versionCheckTest(){
        String oldVer1 = "2.3.3.1";
        String newVer1 = "2.3.2";

        assertEquals(VersionChecker.isOldVer(oldVer1, newVer1), -1);

        String oldVer2 = "2.2.2";
        String newVer2 = "2.2.2";

        assertEquals(VersionChecker.isOldVer(oldVer2, newVer2), 0);

        String oldVer3 = "2.2.2";
        String newVer3 = "2.2.3";

        assertEquals(VersionChecker.isOldVer(oldVer3, newVer3), 1);

        String oldVer4 = "2.2.2";
        String newVer4 = "2.2.2.1";

        assertEquals(VersionChecker.isOldVer(oldVer4, newVer4), 1);

        String oldVer5 = "2.2.2.1";
        String newVer5 = "2.2.2.0";

        assertEquals(VersionChecker.isOldVer(oldVer5, newVer5), -1);

        String oldVer6 = "2.2.2";
        String newVer6 = "2.2.2.0";

        assertEquals(VersionChecker.isOldVer(oldVer6, newVer6), 0);

    }

}