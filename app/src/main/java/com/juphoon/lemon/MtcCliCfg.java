/**
 * @file MtcCliCfg.java
 * @brief MtcCliCfg interface
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
 * @brief MtcCliCfg interface
 */
public class MtcCliCfg implements MtcCliCfgConstants {
/**
 * @brief Open all modules logs.
 *
 * @retval ZOK Open Log successfully.
 * @retval ZFAILED Open Log failed.
 *
 * @see @ref MtcCliCfg::Mtc_CliCfgCloseLog
 */
  public static int Mtc_CliCfgOpenLog() {
    return MtcCliCfgJNI.Mtc_CliCfgOpenLog();
  }

/**
 * @brief Close all modules logs.
 *
 * @retval ZOK Close Log successfully.
 * @retval ZFAILED Close Log failed.
 *
 * @see @ref MtcCliCfg::Mtc_CliCfgOpenLog
 */
  public static int Mtc_CliCfgCloseLog() {
    return MtcCliCfgJNI.Mtc_CliCfgCloseLog();
  }

/**
 * @brief Get using detect local IP when client start and login.
 *
 * @retval true Detect local IP.
 * @retval false Not detect local IP.
 *
 * @see @ref MtcCliCfg::Mtc_CliCfgSetUseDetLclIp
 */
  public static boolean Mtc_CliCfgGetUseDetLclIp() {
    return MtcCliCfgJNI.Mtc_CliCfgGetUseDetLclIp();
  }

/**
 * @brief Set using detect local IP when client start and login.
 *
 * @param [in] bDetect Use default profile management.
 *
 * @retval ZOK Set detect option successfully.
 * @retval ZFAILED Set detect option failed.
 *
 * @see @ref MtcCliCfg::Mtc_CliCfgGetUseDetLclIp
 */
  public static int Mtc_CliCfgSetUseDetLclIp(boolean bDetect) {
    return MtcCliCfgJNI.Mtc_CliCfgSetUseDetLclIp(bDetect);
  }

/**
 * @brief Get support ability of network detection when client has logined.
 *
 * @retval true Detect network available.
 * @retval false Not detect available.
 *
 * @see @ref MtcCliCfg::Mtc_CliCfgSetSuptNetDetect
 */
  public static boolean Mtc_CliCfgGetSuptNetDetect() {
    return MtcCliCfgJNI.Mtc_CliCfgGetSuptNetDetect();
  }

/**
 * @brief Set support ability of network detection when client has logined.
 *
 * @param [in] bSupt Support network detection.
 *
 * @retval ZOK Set network detection successfully.
 * @retval ZFAILED Set network detection failed.
 *
 * @see @ref MtcCliCfg::Mtc_CliCfgGetSuptNetDetect
 */
  public static int Mtc_CliCfgSetSuptNetDetect(boolean bSupt) {
    return MtcCliCfgJNI.Mtc_CliCfgSetSuptNetDetect(bSupt);
  }

/**
 * @brief Get support ability of encrypt password.
 *
 * @retval true Password saved in crypto.
 * @retval false Password save in plain text.
 *
 * @see @ref MtcCliCfg::Mtc_CliCfgSetSuptEncPwd
 */
  public static boolean Mtc_CliCfgGetSuptEncPwd() {
    return MtcCliCfgJNI.Mtc_CliCfgGetSuptEncPwd();
  }

/**
 * @brief Set support ability of encrypt password.
 *
 * @param [in] bSupt Support encrypt password.
 *
 * @retval ZOK Set encrypt password successfully.
 * @retval ZFAILED Set encrypt password failed.
 *
 * @see @ref MtcCliCfg::Mtc_CliCfgGetSuptEncPwd
 */
  public static int Mtc_CliCfgSetSuptEncPwd(boolean bSupt) {
    return MtcCliCfgJNI.Mtc_CliCfgSetSuptEncPwd(bSupt);
  }

/**
 * @brief Get REGISTER capability flag.
 *
 * @return REGISTER capability, see @ref MTC_REG_CAP_OPT_IM etc.
 *
 * @see @ref MtcCliCfg::Mtc_CliCfgSetRegCap
 */
  public static int Mtc_CliCfgGetRegCap() {
    return MtcCliCfgJNI.Mtc_CliCfgGetRegCap();
  }

/**
 * @brief Set REGISTER capability flag.
 *
 * @param [in] dwCapOpt REGISTER capability flag, see @ref MTC_REG_CAP_OPT_IM etc.
 *
 * @retval ZOK Set capability option successfully.
 * @retval ZFAILED Set capability option failed.
 *
 * @see @ref MtcCliCfg::Mtc_CliCfgGetRegCap
 */
  public static int Mtc_CliCfgSetRegCap(int dwCapOpt) {
    return MtcCliCfgJNI.Mtc_CliCfgSetRegCap(dwCapOpt);
  }

/**
 * @brief Clear REGISTER capability flag.
 *
 * @param [in] dwCapOpt REGISTER capability flag, see @ref MTC_REG_CAP_OPT_IM etc.
 *
 * @retval ZOK Clear capability option successfully.
 * @retval ZFAILED Clear capability option failed.
 *
 * @see @ref MtcCliCfg::Mtc_CliCfgGetRegCap
 */
  public static int Mtc_CliCfgClrRegCap(int dwCapOpt) {
    return MtcCliCfgJNI.Mtc_CliCfgClrRegCap(dwCapOpt);
  }

/**
 * @brief Set Log file directory.
 *
 * @param [in] pcDir The log file directory.
 *
 * @retval ZOK Set directory successfully.
 * @retval ZFAILED Set directory failed.
 */
  public static int Mtc_CliCfgSetLogDir(String pcDir) {
    return MtcCliCfgJNI.Mtc_CliCfgSetLogDir(pcDir);
  }

/**
 * @brief Set license file name.
 *
 * @param [in] pcFileName The license file name.
 *
 * @retval ZOK Set file name successfully.
 * @retval ZFAILED Set file name failed.
 */
  public static int Mtc_CliCfgSetLicenseFileName(String pcFileName) {
    return MtcCliCfgJNI.Mtc_CliCfgSetLicenseFileName(pcFileName);
  }

/**
 * @brief Set application context.
 *
 * @param [in] zContext The application context.
 *
 * @retval ZOK Set file name successfully.
 * @retval ZFAILED Set file name failed.
 */
  public static int Mtc_CliCfgSetContext(Object zContext) {
    return MtcCliCfgJNI.Mtc_CliCfgSetContext(zContext);
  }

}