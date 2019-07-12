/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ird.dropper.ers.syc.common;

import fr.ird.dropper.ers.syc.business.LogDeclarationType;

/**
 *
 * @author jlebranc
 */
public class EvaUtils {

    public static String getTripNumber(LogDeclarationType log) {
        String tn = null;
        if (log != null) {
            tn = log.getTN();
        }
        return tn;

    }

    public static String getVesselNumber(LogDeclarationType log) {
        String cfr = null;
        if (log != null) {
            cfr = log.getIR();
        }

        return cfr;

    }

}
