/**
 * @file MtcProvCfg.java
 * @brief MtcProvCfg interface
 */
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.juphoon.lemon;

/**
 * @brief MtcProvCfg interface
 */
public class MtcProvCfg implements MtcProvCfgConstants {
/**
 * @brief Get using default provision.
 *
 * Default 
 * @retval true Detect local IP.
 * @retval false Not detect local IP.
 *
 * @retval true MTC provide provision management.
 * @retval false MTC don't have provision management.
 *
 * @see @ref MtcProvCfg::Mtc_ProvCfgSetUseDft
 */
  public static boolean Mtc_ProvCfgGetUseDft() {
    return MtcProvCfgJNI.Mtc_ProvCfgGetUseDft();
  }

/**
 * @brief Get provision file name.
 *
 * MTC provide default provision management. 
 * If client using another provision management, just ignore it.
 *
 * @return provision file name.
 *
 * @see @ref MtcProvCfg::Mtc_ProvCfgSetFileName
 */
  public static String Mtc_ProvCfgGetFileName() {
    return MtcProvCfgJNI.Mtc_ProvCfgGetFileName();
  }

/**
 * @brief Set using default provision management.
 *
 * @param [in] bUse Use default provision management.
 *
 * @retval ZOK Set use provision successfully.
 * @retval ZFAILED Set use provision failed.
 *
 * @see @ref MtcProvCfg::Mtc_ProvCfgGetUseDft
 */
  public static int Mtc_ProvCfgSetUseDft(boolean bUse) {
    return MtcProvCfgJNI.Mtc_ProvCfgSetUseDft(bUse);
  }

/**
 * @brief Set provision file name.
 *
 * @param [in] pcFile The provision file name.
 *
 * @retval ZOK Set provision file name successfully.
 * @retval ZFAILED Set provision file name failed.
 *
 * @see @ref MtcProvCfg::Mtc_ProvCfgGetFileName
 */
  public static int Mtc_ProvCfgSetFileName(String pcFile) {
    return MtcProvCfgJNI.Mtc_ProvCfgSetFileName(pcFile);
  }

}
