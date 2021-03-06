/**
 * @file MtcMediaConstants.java
 * @brief MtcMediaConstants constants
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
 * @brief MtcMediaConstants constants
 */
public interface MtcMediaConstants {
  public final static int INVALIDID = -1; /**< @brief invalid id */
  public final static int ZOK = 0; /**< @brief ok */
  public final static int ZFAILED = 1; /**< @brief failed */
  // EN_MTC_EC_TYPE 
  public final static int EN_MTC_EC_AEC = 0; /**< @brief Default AEC provided by engine. */
  public final static int EN_MTC_EC_OS = 1; /**< @brief AEC provided by OS. */
  public final static int EN_MTC_EC_AES = 2; /**< @brief AES provided by engine. */
  public final static int EN_MTC_EC_AEC_FDE = 3; /**< @brief AEC based on formant delay estimation. */
  public final static int EN_MTC_EC_AEC_SDE = 4; /**< @brief AEC based on spectrum delay estimation. */

  // EN_MTC_NS_TYPE 
  public final static int EN_MTC_NS_LOW = 0; /**< @brief NS with low level. */
  public final static int EN_MTC_NS_MID = 1; /**< @brief NS with moderate level. */
  public final static int EN_MTC_NS_HIGH = 2; /**< @brief NS with high level. */
  public final static int EN_MTC_NS_VERYHIGH = 3; /**< @brief NS with very high level. */

  // EN_MTC_GC_TYPE 
  public final static int EN_MTC_GC_ANALOG = 0; /**< @brief AGC based on analog volume adjustment. */
  public final static int EN_MTC_GC_OS = 1; /**< @brief AGC provided by OS */
  public final static int EN_MTC_GC_DIGITAL = 2; /**< @brief AGC based on digital volume adjustment. */

  // EN_MTC_RX_GC_TYPE 
  public final static int EN_MTC_RX_GC_FIXED = 0; /**< @brief RX-AGC based on fixed digital volume adjustment. */
  public final static int EN_MTC_RX_GC_ADAPTIVE = 1; /**< @brief RX-AGC based on adaptive digital volume adjustment. */

  // EN_MTC_ARS_TYPE 
  public final static int EN_MTC_ARS_QUALITY_SPATIAL = 0; /**< @brief Spatial quality first: clear picture. */
  public final static int EN_MTC_ARS_QUALITY_TEMPORAL = 1; /**< @brief Temporal quality first: fluent motion. */

  // EN_MTC_VAD_TYPE 
  public final static int EN_MTC_VAD_NORMAL = 0; /**< @brief VAD with lowest level. */
  public final static int EN_MTC_VAD_LOW = 1; /**< @brief VAD with low level. */
  public final static int EN_MTC_VAD_MID = 2; /**< @brief VAD with moderate level. */
  public final static int EN_MTC_VAD_HIGH = 3; /**< @brief VAD with high level. */

  // EN_MTC_NET_STATUS_TYPE 
  public final static int EN_MTC_NET_STATUS_BAD = -1; /**< @brief Network status is bad. */
  public final static int EN_MTC_NET_STATUS_NORMAL = 0; /**< @brief Network status is normal. */

  // EN_MTC_NET_STATUS_REASON_TYPE 
  public final static int EN_MTC_NET_STATUS_REASON_NORMAL = 0; /**< @brief Network status is normal. */
  public final static int EN_MTC_NET_STATUS_REASON_BANDWIDTH = 1; /**< @brief Network has bandwidth problem. */
  public final static int EN_MTC_NET_STATUS_REASON_LOSS = 2; /**< @brief There is packet lost. */
  public final static int EN_MTC_NET_STATUS_REASON_BOTH = 3; /**< @brief Both bandwidth problem and packet lost. */

  // EN_MTC_MFILE_TYPE 
  public final static int EN_MTC_MFILE_UNKNOW = 0; /**< @brief Unknow file type. */
  public final static int EN_MTC_MFILE_PCM = EN_MTC_MFILE_UNKNOW + 1; /**< @brief PCM file. */
  public final static int EN_MTC_MFILE_WAV = EN_MTC_MFILE_PCM + 1; /**< @brief WAV file. */
  public final static int EN_MTC_MFILE_WAV_PCM = EN_MTC_MFILE_WAV + 1; /**< @brief WAV file with codec of PCM. */
  public final static int EN_MTC_MFILE_WAV_PCMU = EN_MTC_MFILE_WAV_PCM + 1; /**< @brief WAV file with codec of PCMU. */
  public final static int EN_MTC_MFILE_WAV_PCMA = EN_MTC_MFILE_WAV_PCMU + 1; /**< @brief WAV file with codec of PCMA. */
  public final static int EN_MTC_MFILE_ILBC = EN_MTC_MFILE_WAV_PCMA + 1; /**< @brief WAV file with codec of iLBC. */
  public final static int EN_MTC_MFILE_AMR = EN_MTC_MFILE_ILBC + 1; /**< @brief WAV file with codec of AMR. */
  public final static int EN_MTC_MFILE_AVI = EN_MTC_MFILE_AMR + 1; /**< @brief AVI file. */
  public final static int EN_MTC_MFILE_AVI_VP8 = EN_MTC_MFILE_AVI + 1; /**< @brief AVI file with codec of VP8. */
  public final static int EN_MTC_MFILE_AVI_I420 = EN_MTC_MFILE_AVI_VP8 + 1; /**< @brief AVI file with codec of I420. */
  public final static int EN_MTC_MFILE_AVI_H264 = EN_MTC_MFILE_AVI_I420 + 1; /**< @brief AVI file with codec of H264. */

  // EN_MTC_DISPLAY_MODE 
  public final static int EN_MTC_DISPLAY_FULL_CONTENT = 0; /**< @brief Scale size to fit display area with ratio unchanged */
  public final static int EN_MTC_DISPLAY_FULL_SCREEN = EN_MTC_DISPLAY_FULL_CONTENT + 1; /**< @brief Scale size to fullfill display area with ratio unchanged */

  // EN_MTC_ORIENTATION_TYPE 
  public final static int EN_MTC_ORIENTATION_PORTRAIT = 0; /**< @brief Display like a portrait, home button on the bottom side. */
  public final static int EN_MTC_ORIENTATION_LANDSCAPE_RIGHT = EN_MTC_ORIENTATION_PORTRAIT + 1; /**< @brief Landscape display, home button on the right side. */
  public final static int EN_MTC_ORIENTATION_PORTRAIT_UPSIDEDOWN = EN_MTC_ORIENTATION_LANDSCAPE_RIGHT + 1; /**< @brief Display like a portrait, home button on the top side. */
  public final static int EN_MTC_ORIENTATION_LANDSCAPE_LEFT = EN_MTC_ORIENTATION_PORTRAIT_UPSIDEDOWN + 1; /**< @brief Landscape display, home button on the left side. */

  // EN_MTC_AN_BR_TYPE 
  public final static int EN_MTC_AN_BR_UNKNOW = 0; /**< @brief Unknow adaptive negotiation bitrate mode type. */
  public final static int EN_MTC_AN_BR_LOW = EN_MTC_AN_BR_UNKNOW + 1; /**< @brief LOW adaptive negotiation bitrate mode type. */
  public final static int EN_MTC_AN_BR_MID = EN_MTC_AN_BR_LOW + 1; /**< @brief MIDDLE adaptive negotiation bitrate mode type. */
  public final static int EN_MTC_AN_BR_HIGH = EN_MTC_AN_BR_MID + 1; /**< @brief HIGH adaptive negotiation bitrate mode type. */

  // EN_MTC_AUIDO_STREAM_TYPE 
  public final static int EN_MTC_AUDIO_STREAM_INVALID = -1;
  public final static int EN_MTC_AUDIO_STREAM_VOICE_CALL = 0x00;
  public final static int EN_MTC_AUDIO_STREAM_SYSTEM = 0x01;
  public final static int EN_MTC_AUDIO_STREAM_MUSIC = 0x03;

}
