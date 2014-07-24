package cn.sdut.system;

import java.math.BigDecimal;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.sdut.system.db.DBTools;

import com.opensymphony.xwork2.ActionContext;

public class Tools {
	private final static int MATCH_SCALE = 2; // ��������Ĭ��С��λ��
	private final static String safe = "00000";
	public final static String initPwd = "55f30e5117ad909ed7092e44c98b2db6";

	public static void main(String[] args) {
		try {
			String pwd = "0000";
			String md5pwd = Tools.getMd5(pwd);
			System.out.println(md5pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * �����û���¼����
	 * 
	 * @param fname
	 * @return
	 * @throws Exception
	 */
	public static String getLoginName(String fname) throws Exception {
		String lastNumber = DBTools.opt.getLastNumber(fname); // ��ȡ��ű�β��
		int len = lastNumber.length(); // ������
		String bm = Tools.safe.substring(len); // ��������
		return "U" + bm + lastNumber; // �û���¼����
	}

	public static List getOptions(String fname) throws Exception {
		return Tools.getOptions(fname, "0");
	}

	public static List getOptions(String fname, String pfcode) throws Exception {
		return DBTools.opt.getOptions(fname, pfcode);
	}

	public static Map describe() {
		ActionContext act = ActionContext.getContext();

		Map tem = act.getParameters();
		Set<Map.Entry<String, String[]>> entrySet = tem.entrySet();
		Map dto = new HashMap();
		String val[] = null;
		for (Map.Entry<String, String[]> entry : entrySet) {
			val = entry.getValue();
			if (val.length == 1) {
				dto.put(entry.getKey(), val[0]);
				if(entry.getKey().equals("rows")){
					dto.put(entry.getKey(), val[0]);
				}
			} else {
				dto.put(entry.getKey(), val);
			}
		}
		dto.put("contextpath", "/CRM"); // ��ǰ���̷�������

		Map session = act.getSession();
		if (session.containsKey("USERINFO")) {
			Map userinfo = (Map) session.get("USERINFO");
			dto.put("SYSUID", userinfo.get("pas001")); // �û���ˮ��
			dto.put("SYSUNAME", userinfo.get("pas002")); // ��¼��
			dto.put("SYSCNNAME", userinfo.get("pas003")); // ������
		} else {
			dto.put("SYSUID", "6"); // �û���ˮ��
			dto.put("SYSUNAME", "M10002"); // ��¼��
			dto.put("SYSCNNAME", "Ǯ��"); // ������
		}
		return dto;
	}

	public static java.util.Date parseDate(Object date) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.parse(date.toString());
	}
	
	public static java.util.Date parseDate1(Object date) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.parse(date.toString());
	}

	public static Object[] StringtoLongArray(Object array) {
		String sarray[] = (String[]) array;
		List val = new ArrayList();

		for (String tem : sarray) {
			if (tem != null && !tem.equals("")) {
				val.add(Long.parseLong(tem));
			}
		}
		return val.toArray();
	}

	/**
	 * �����ĸ�����Ϊ����ת������
	 * 
	 * @param dol
	 *            double
	 * @param scale
	 *            int
	 * @return String
	 */
	public static double ObjToDouble(Object dol, int scale) {
		return Tools.ObjectToBigDecimal(dol, scale).doubleValue();
	}

	public static double ObjToDouble(Object dol) {
		return Tools.ObjToDouble(dol, MATCH_SCALE);
	}

	public static String DoubleToStr(double dol, int scale) {
		return Tools.ObjectToBigDecimal(dol, scale).toString();
	}

	public static String DoubleToStr(double dol) {
		return Tools.DoubleToStr(dol, MATCH_SCALE);
	}

	public static double DoubleToDouble(double dol, int scale) {
		return Tools.ObjectToBigDecimal(dol, scale).doubleValue();
	}

	public static double DoubleToDouble(double dol) {
		return Tools.DoubleToDouble(dol, MATCH_SCALE);
	}

	public static double StrToDouble(String dol, int scale) {
		return Tools.ObjectToBigDecimal(dol, scale).doubleValue();
	}

	public static double StrToDouble(String dol) {
		return Tools.StrToDouble(dol, MATCH_SCALE);
	}

	public static String StrToStr(String dol, int scale) {
		return Tools.ObjectToBigDecimal(dol, scale).toString();
	}

	public static String StrToStr(String dol) {
		return Tools.StrToStr(dol, MATCH_SCALE);
	}

	private static BigDecimal ObjectToBigDecimal(Object dol, int scale) {
		BigDecimal decimal = null; // ��������
		if (dol == null || dol.equals("")) {
			return new BigDecimal(0);
		}
		decimal = new BigDecimal(dol.toString());
		decimal = decimal.setScale(scale, BigDecimal.ROUND_HALF_UP);
		return decimal;
	}

	// ******************BEGIN MD5******************

	public final static String getMd5(Object pwd) throws Exception {
		String md51 = Tools.MD5Encode(pwd);
		String pwd2 = md51 + "�{��̖��@#$%��������^&*" + md51;
		String md52 = Tools.MD5Encode(pwd2);
		return md52;
	}

	private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

	/**
	 * ת���ֽ�����Ϊ16�����ִ�
	 * 
	 * @param b
	 *            �ֽ�����
	 * @return 16�����ִ�
	 */
	private static String byteArrayToHexString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}

	/**
	 * ת���ֽ�Ϊ16�����ַ���
	 * 
	 * @param b
	 *            byte
	 * @return String
	 */
	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n = 256 + n;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}

	/**
	 * �õ�MD5����������
	 * 
	 * @param origin
	 *            String
	 * @throws Exception
	 * @return String
	 */
	private static String MD5Encode(Object origin) throws Exception {
		String resultString = null;
		try {
			resultString = new String(origin.toString());
			MessageDigest md = MessageDigest.getInstance("MD5");
			resultString = byteArrayToHexString(md.digest(resultString
					.getBytes()));
			return resultString;
		} catch (Exception ex) {
			throw ex;
		}
	}
	// ******************END MD5******************

}
