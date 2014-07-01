package com.synature.util;

/**
 * @author j1tth4
 * This utility class use for manage level of thai text 
 */
public class ThaiLevelText {
	/**
	 * @param unicode prntTxt
	 * @return OPOSThaiText objec
	 */
	public static OPOSThaiText parsingThaiLevel(String prntTxt) {
		String strLine1 = null;
		String strLine2 = null;
		String strLine3 = null;
		int i = 0;
		int code = 0;
		int nextCode = 0;
		String strChar = null;
		OPOSThaiText resultText = new OPOSThaiText();
		strLine1 = "";
		strLine2 = "";
		strLine3 = "";
		for (; i < prntTxt.length(); i++) {
			code = prntTxt.charAt(i);
			strChar = Character.toString(prntTxt.charAt(i));
			switch (code) {
			case 3633: //ไม้หันอากาศ
			case 3636: //สระอิ
			case 3637: //สระอี
			case 3638: //สระอึ
			case 3639: //สระอื
				//ไม้หันอากาศ และ สระด้านบน เช่น อิ อี
				//Check if letter next to it is วรรณยุกต์
				if (i == prntTxt.length()) {
					// This is the last letter
					strChar = Character.toString(prntTxt.charAt(i));
				} else {
					nextCode = (int) prntTxt.charAt(i + 1);
					switch (nextCode) {
					// Comboine current and the next character into new one
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
								nextCode = 0x80;
								break;
							case 3636: //อิ
								nextCode = 0x84;
								break;
							case 3637: //อี
								nextCode = 0x89;
								break;
							case 3638: //อึ
								nextCode = 0x8d;
								break;
							case 3639: //อื
								nextCode = 0x91;
								break;
							}
							break;
						case 3657: //ไม้โท
							switch (code) {
							case 3633: //ไม้หันอากาศ
								nextCode = 0x81;
								break;
							case 3636: //อิ
								nextCode = 0x85;
								break;
							case 3637: //อี
								nextCode = 0x8a;
								break;
							case 3638: //อึ
								nextCode = 0x8e;
								break;
							case 3639: //อื
								nextCode = 0x92;
								break;
							}
							break;
						case 3658: //ไม้ตรี
							switch (code) {
							case 3633: //ไม้หันอากาศ
								nextCode = 0x82;
								break;
							case 3636: //อิ
								nextCode = 0x86;
								break;
							case 3637: //อี
								nextCode = 0x8b;
								break;
							case 3638: //อึ
								nextCode = 0x8f;
								break;
							case 3639: //อื
								nextCode = 0x93;
								break;
							}
							break;
						case 3659: //ไมจัตวา
							switch (code) {
							case 3633: //ไม้หันอากาศ
								nextCode = 0x83;
								break;
							case 3636: //อิ
								nextCode = 0x87;
								break;
							case 3637: //อี
								nextCode = 0x8c;
								break;
							case 3638: //อึ
								nextCode = 0x90;
								break;
							case 3639: //อื
								nextCode = 0x94;
								break;
							}
							break;
						case 3660: //การันต์
							switch (code) {
							case 3636: //อิ
								nextCode = 0x88;
								break;
							}
							break;
						}
						strChar = String.valueOf(nextCode);
						i += 1;

						break;
					default:
						strChar = Character.toString(prntTxt.charAt(i));
						break;
					}
				}
				strLine1 = strLine1.substring(1, strLine1.length()) + strChar;
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
				if (i == prntTxt.length()) { // This is the last letter
					strLine1 = strLine1.substring(1, strLine1.length()) + prntTxt.charAt(i);
				} else {
					nextCode = (int) prntTxt.charAt(i);
					switch (nextCode) {
					case 3635: //สระอำ
						switch (code) { //เปลี่ยน สระอำ เป็น สระอา และ เปลี่ยน ลูกกลมข้างบนรวมกับวรรณยุกต์
						case 3656: //ไม้เอก
							strLine1 = strLine1.substring(1, strLine1.length()) + (char) 0x95 + " ";
							break;
						case 3657: //ไม้โท
							strLine1 = strLine1.substring(1, strLine1.length()) + (char) 0x96 + " ";
							break;
						case 3658: //ไม้ตรี
							strLine1 = strLine1.substring(1, strLine1.length()) + (char) 0x97 + " ";
							break;
						case 3659: //ไม้จัตวา
							strLine1 = strLine1.substring(1, strLine1.length()) + (char) 0x98 + " ";
							break;
						}
						strLine2 += (char) 3634; //สระอา
						strLine3 += " ";
						i += 1;
						break;
					default:
						strLine1 = strLine1.substring(1, strLine1.length()) + prntTxt.charAt(i);
						break;
					}
				}

				break;
			case 3640: //สระอุ
			case 3641: //สระอู
				strLine3 = strLine3.substring(1, strLine3.length()) + Character.toString(prntTxt.charAt(i));
				break;
			default:
				strLine1 += " ";
				strLine2 += Character.toString(prntTxt.charAt(i));
				strLine3 += " ";
				break;
			}
		}
		resultText.TextLine1 = strLine1;
		resultText.TextLine2 = strLine2;
		resultText.TextLine3 = strLine3;
		return resultText;
	}

	public static class OPOSThaiText
	{
	    public String TextLine1;
	    public String TextLine2;
	    public String TextLine3;
	}
}
