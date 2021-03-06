/**
 * @file MtcProf.java
 * @brief MtcProf interface
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
 * @brief MtcProf interface
 */
public class MtcProf implements MtcProfConstants {
/**
 * @brief Get user count in profile management.
 *
 * This interface should be invoke after @ref MtcCli::Mtc_CliInit was called.
 *
 * @return The profile user size.
 */
  public static int Mtc_ProfGetUserSize() {
    return MtcProfJNI.Mtc_ProfGetUserSize();
  }

/**
 * @brief MTC profile get user name by index 
 *
 * This interface should be invoke after @ref MtcCli::Mtc_CliInit was called.
 *
 * @param [in] iIndex The index in profile list, 0 to size - 1.
 *
 * @return The user name string.
 *   The caller must copy it, then use.
 */  
  public static String Mtc_ProfGetUser(int iIndex) {
    return MtcProfJNI.Mtc_ProfGetUser(iIndex);
  }

/**
 * @brief MTC profile get current user.
 *
 * This interface should be invoke after @ref MtcCli::Mtc_CliInit and 
 * @ref MtcCli::Mtc_CliOpen was called.
 *
 * @return The current user string, if client is not open return ZNULL.
 */
  public static String Mtc_ProfGetCurUser() {
    return MtcProfJNI.Mtc_ProfGetCurUser();
  }

/**
 * @brief MTC profile create a user.
 *
 * This interface should be invoke after @ref MtcCli::Mtc_CliInit was called.
 *
 * @param [in] pcUserName The new user name. 
 *
 * @retval ZOK Create a user successfully.
 * @retval ZFAILED Create a user failed.
 */
  public static int Mtc_ProfCreateUser(String pcUserName) {
    return MtcProfJNI.Mtc_ProfCreateUser(pcUserName);
  }

/**
 * @brief MTC profile delete a user.
 *
 * This interface should be invoke after @ref MtcCli::Mtc_CliInit was called.
 *
 * @param [in] pcUserName The name of the user will be deleted. 
 *
 * @retval ZOK Delete a user successfully.
 * @retval ZFAILED Delete a user failed.
 */
  public static int Mtc_ProfDeleteUser(String pcUserName) {
    return MtcProfJNI.Mtc_ProfDeleteUser(pcUserName);
  }

/**
 * @brief MTC profile check exist the user.
 *
 * This interface should be invoke after @ref MtcCli::Mtc_CliInit was called.
 *
 * @param [in] pcUserName The name of the user will be checked. 
 *
 * @retval true The user is exist.
 * @retval false The user is not exist.
 */
  public static boolean Mtc_ProfExistUser(String pcUserName) {
    return MtcProfJNI.Mtc_ProfExistUser(pcUserName);
  }

/**
 * @brief MTC profile save configuration of current user.
 *
 * This interface should be invoke after @ref MtcCli::Mtc_CliInit and 
 * @ref MtcCli::Mtc_CliOpen was called.
 *
 * @retval ZOK Save provision successfully.
 * @retval ZFAILED Save provision failed.
 */
  public static int Mtc_ProfSaveProvision() {
    return MtcProfJNI.Mtc_ProfSaveProvision();
  }

/**
 * @brief MTC profile reset configuration of current user.
 *
 * This interface should be invoke after @ref MtcCli::Mtc_CliInit and 
 * @ref MtcCli::Mtc_CliOpen was called.
 *
 * @retval ZOK Reset provision successfully.
 * @retval ZFAILED Reset provision failed.
 */
  public static int Mtc_ProfResetProvision() {
    return MtcProfJNI.Mtc_ProfResetProvision();
  }

/**
 * @brief MTC profile restore configuration of current user for speicifc mode.
 *
 * @param [in] iMode The combination of MtcProfConstants::EN_MTC_PROF_SERVICE_VOIP 
                     and MtcProfConstants::EN_MTC_PROF_MEDIA_BASE. 
 *
 * This interface should be invoke after @ref MtcCli::Mtc_CliInit and 
 * @ref MtcCli::Mtc_CliOpen was called.
 *
 * @retval ZOK Restore provision successfully.
 * @retval ZFAILED Restore provision failed.
 */
  public static int Mtc_ProfRestoreProvision(int iMode) {
    return MtcProfJNI.Mtc_ProfRestoreProvision(iMode);
  }

}
