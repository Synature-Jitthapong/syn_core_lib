package com.synature.util;

import android.text.TextUtils;

/**
 * @author j1tth4
 * This utility class use for manage level of thai text 
 */
public class LevelTextPrint {
	
	/**
	 * @param prntTxt
	 * @return TextThreeLine
	 */
	public static ThreeLevelPrint parsingLaoLevel(String prntTxt){
		String strLine1 = "";
		String strLine2 = "";
		String strLine3 = "";
		int i = 0;
		int code = 0;
		int nextCode = 0;
		String strChar = "";
		ThreeLevelPrint resultText = new ThreeLevelPrint();
		for (; i < prntTxt.length(); i++) {
			code = prntTxt.charAt(i);
			switch (code) {
			case 3761: //ไม้กรรณ
			case 3764: //สระอิ
			case 3765: //สระอี
			case 3766: //สระอึ
			case 3767: //สระอื
				//ไม้กรรณ และ สระด้านบน เช่น อิ อี
				//Check if letter next to it is วรรณยุกต์
				if (i == prntTxt.length() - 1) {
					// This is the last letter
					strChar = Character.toString(prntTxt.charAt(i));
				} else {
					nextCode = (int) prntTxt.charAt(i + 1);
					switch (nextCode) {// Comboine current and the next character into new one
					case 3784: //ไม้เอก
					case 3785: //ไม้โท
					case 3786: //ไม้ตรี
					case 3787: //ไม้จัตวา
					case 3788: //การันต์
					case 3789: //นิคหิต
						//วรรณยุกต์ และการันต์
						switch (nextCode) {
						case 3784:
							switch (code) {
							case 3761: //ไม้หันอากาศ
								nextCode = 3633;
								break;
							case 3764: //อิ
								nextCode = 144;
								break;
							case 3765: //อี
								nextCode = 132;
								break;
							case 3766: //อึ
								nextCode = 136;
								break;
							case 3767: //อื
								nextCode = 140;
								break;
							}
							break;
						case 3785: //ไม้โท
							switch (code) {
							case 3761: //ไม้หันอากาศ
								nextCode = 3633;
								break;
							case 3764: //อิ
								nextCode = 144;
								break;
							case 3765: //อี
								nextCode = 132;
								break;
							case 3766: //อึ
								nextCode = 136;
								break;
							case 3767: //อื
								nextCode = 140;
								break;
							}
							break;
						case 3786: //ไม้ตรี
							switch (code) {
							case 3761: //ไม้หันอากาศ
								nextCode = 3633;
								break;
							case 3764: //อิ
								nextCode = 144;
								break;
							case 3765: //อี
								nextCode = 132;
								break;
							case 3766: //อึ
								nextCode = 136;
								break;
							case 3767: //อื
								nextCode = 140;
								break;
							}
							break;
						case 3787: //ไมจัตวา
							switch (code) {
							case 3761: //ไม้หันอากาศ
								nextCode = 3633;
								break;
							case 3764: //อิ
								nextCode = 144;
								break;
							case 3765: //อี
								nextCode = 132;
								break;
							case 3766: //อึ
								nextCode = 136;
								break;
							case 3767: //อื
								nextCode = 140;
								break;
							}
							break;
						case 3788: //การันต์
							switch (code) {
							case 3764: //อิ
								nextCode = 148;
								break;
							}
							break;
						}
						strChar = Character.toString((char) nextCode);
						i += 1;
						break;
					default:
						strChar = Character.toString(prntTxt.charAt(i));
						break;
					}
				}
				strLine1 = strLine1.substring(0, strLine1.length() - 1) + strChar;
				break;
			case 3784: //ไม้เอก
			case 3785: //ไม้โท
			case 3786: //ไม้ตรี
			case 3787: //ไม้จัตวา
			case 3788: //การันต์
			case 3789: //นิคหิต
				//วรรณยุกต์
				// Check if letter next to it is วรรณยุกต์
				if (i == prntTxt.length() - 1) { // This is the last letter
					strLine1 = strLine1.substring(0, strLine1.length() - 1) + Character.toString(prntTxt.charAt(i));
				} else {
					nextCode = (int) prntTxt.charAt(i + 1);
					switch (nextCode) {
					case 3763: //สระอำ
						switch (code) {
						case 3784: //ไม้เอก
							strLine1 = strLine1.substring(0, strLine1.length() - 1) + Character.toString((char) 3784) + " ";
							break;
						case 3785: //ไม้โท
							strLine1 = strLine1.substring(0, strLine1.length() - 1) + Character.toString((char) 3785) + " ";
							break;
						case 3786: //ไม้ตรี
							strLine1 = strLine1.substring(0, strLine1.length() - 1) + Character.toString((char) 3786) + " ";
							break;
						case 3787: //ไม้จัตวา
							strLine1 = strLine1.substring(0, strLine1.length() - 1) + Character.toString((char) 3787) + " ";
							break;
						}
						strLine2 += Character.toString((char) 3763);
						strLine3 += " ";
						i += 1;
						break;
					default:
						strLine1 = strLine1.substring(0, strLine1.length() - 1) + Character.toString(prntTxt.charAt(i));
						break;
					}
				}
				break;
			case 3768: //สระอุ
			case 3769: //สระอู
				strLine3 = strLine3.substring(0, strLine3.length() - 1) + Character.toString(prntTxt.charAt(i));
				break;
			default:
				strLine1 += " ";
				strLine2 += Character.toString(prntTxt.charAt(i));
				strLine3 += " ";
				break;
			}
		}
		resultText.line1 = TextUtils.isEmpty(strLine1.trim()) ? "" : strLine1;
		resultText.line2 = TextUtils.isEmpty(strLine2.trim()) ? "" : strLine2;
		resultText.line3 = TextUtils.isEmpty(strLine3.trim()) ? "" : strLine3;
		return resultText;
	}
	
	/**
	 * @param unicode prntTxt
	 * @return OPOSThaiText obj
	 */
	public static ThreeLevelPrint parsingThaiLevel(String prntTxt) {
		String strLine1 = "";
		String strLine2 = "";
		String strLine3 = "";
		int i = 0;
		int code = 0;
		int nextCode = 0;
		String strChar = "";
		ThreeLevelPrint resultText = new ThreeLevelPrint();
		for (; i < prntTxt.length(); i++) {
			code = prntTxt.charAt(i);
			switch (code) {
			case 3633: //ไม้หันอากาศ
			case 3636: //สระอิ
			case 3637: //สระอี
			case 3638: //สระอึ
			case 3639: //สระอื
				//ไม้หันอากาศ และ สระด้านบน เช่น อิ อี
				//Check if letter next to it is วรรณยุกต์
				if (i == prntTxt.length() - 1) {
					// This is the last letter
					strChar = Character.toString(prntTxt.charAt(i));
				} else {
					nextCode = (int) prntTxt.charAt(i + 1);
					switch (nextCode) {// Comboine current and the next character into new one
					case 3656: //ไม้เอก
					case 3657: //ไม้โท
					case 3658: //ไม้ตรี
					case 3659: //ไม้จัตวา
					case 3660: //การันต์
					case 3661: //นิคหิต
						//วรรณยุกต์ และการันต์
						switch (nextCode) {
						case 3656:
							switch (code) {
							case 3633: //ไม้หันอากาศ
								nextCode = 3633;
								break;
							case 3636: //อิ
								nextCode = 144;
								break;
							case 3637: //อี
								nextCode = 132;
								break;
							case 3638: //อึ
								nextCode = 136;
								break;
							case 3639: //อื
								nextCode = 140;
								break;
							}
							break;
						case 3657: //ไม้โท
							switch (code) {
							case 3633: //ไม้หันอากาศ
								nextCode = 129;
								break;
							case 3636: //อิ
								nextCode = 145;
								break;
							case 3637: //อี
								nextCode = 133;
								break;
							case 3638: //อึ
								nextCode = 137;
								break;
							case 3639: //อื
								nextCode = 141;
								break;
							}
							break;
						case 3658: //ไม้ตรี
							switch (code) {
							case 3633: //ไม้หันอากาศ
								nextCode = 130;
								break;
							case 3636: //อิ
								nextCode = 146;
								break;
							case 3637: //อี
								nextCode = 134;
								break;
							case 3638: //อึ
								nextCode = 138;
								break;
							case 3639: //อื
								nextCode = 142;
								break;
							}
							break;
						case 3659: //ไมจัตวา
							switch (code) {
							case 3633: //ไม้หันอากาศ
								nextCode = 131;
								break;
							case 3636: //อิ
								nextCode = 147;
								break;
							case 3637: //อี
								nextCode = 135;
								break;
							case 3638: //อึ
								nextCode = 139;
								break;
							case 3639: //อื
								nextCode = 143;
								break;
							}
							break;
						case 3660: //การันต์
							switch (code) {
							case 3636: //อิ
								nextCode = 148;
								break;
							}
							break;
						}
						strChar = Character.toString((char) nextCode);
						i += 1;
						break;
					default:
						strChar = Character.toString(prntTxt.charAt(i));
						break;
					}
				}
				strLine1 = strLine1.substring(0, strLine1.length() - 1) + strChar;
				break;
			case 3655: //ไม้ไต่คู้
			case 3656:
			case 3657:
			case 3658:
			case 3659:
			case 3660:
			case 3661:
				//วรรณยุกต์
				// Check if letter next to it is วรรณยุกต์
				if (i == prntTxt.length() - 1) { // This is the last letter
					strLine1 = strLine1.substring(0, strLine1.length() - 1) + Character.toString(prntTxt.charAt(i));
				} else {
					nextCode = (int) prntTxt.charAt(i + 1);
					switch (nextCode) {
					case 3635: //สระอำ
						switch (code) {
						case 3656: //ไม้เอก
							strLine1 = strLine1.substring(0, strLine1.length() - 1) + Character.toString((char) 3656) + " ";
							break;
						case 3657: //ไม้โท
							strLine1 = strLine1.substring(0, strLine1.length() - 1) + Character.toString((char) 3657) + " ";
							break;
						case 3658: //ไม้ตรี
							strLine1 = strLine1.substring(0, strLine1.length() - 1) + Character.toString((char) 3658) + " ";
							break;
						case 3659: //ไม้จัตวา
							strLine1 = strLine1.substring(0, strLine1.length() - 1) + Character.toString((char) 3659) + " ";
							break;
						}
						strLine2 += Character.toString((char) 3635);
						strLine3 += " ";
						i += 1;
						break;
					default:
						strLine1 = strLine1.substring(0, strLine1.length() - 1) + Character.toString(prntTxt.charAt(i));
						break;
					}
				}
				break;
			case 3640: //สระอุ
			case 3641: //สระอู
				strLine3 = strLine3.substring(0, strLine3.length() - 1) + Character.toString(prntTxt.charAt(i));
				break;
			default:
				strLine1 += " ";
				strLine2 += Character.toString(prntTxt.charAt(i));
				strLine3 += " ";
				break;
			}
		}
		resultText.setLine1(TextUtils.isEmpty(strLine1.trim()) ? "" : strLine1);
		resultText.setLine2(TextUtils.isEmpty(strLine2.trim()) ? "" : strLine2);
		resultText.setLine3(TextUtils.isEmpty(strLine3.trim()) ? "" : strLine3);
		return resultText;
	}

	public static class ThreeLevelPrint
	{
	    private String line1;
	    private String line2;
	    private String line3;
		public String getLine1() {
			return line1;
		}
		public void setLine1(String line1) {
			this.line1 = line1;
		}
		public String getLine2() {
			return line2;
		}
		public void setLine2(String line2) {
			this.line2 = line2;
		}
		public String getLine3() {
			return line3;
		}
		public void setLine3(String line3) {
			this.line3 = line3;
		}
	}
}
