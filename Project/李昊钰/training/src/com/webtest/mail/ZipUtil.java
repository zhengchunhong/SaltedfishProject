package com.webtest.mail;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.testng.TestListenerAdapter;

/**
 * date: 2020/11/15 writed by �����lhy
 */
/**
 * zip�ļ�ѹ��
 */
public class ZipUtil  extends TestListenerAdapter{


	public static void ZipCompress(String inputFile, String outputFile) throws Exception {
		// ����zip�����
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outputFile));
		// �������������
		BufferedOutputStream bos = new BufferedOutputStream(out);
		File input = new File(inputFile);
		compress(out, bos, input, null);
		bos.close();
		out.close();
	}

	// �ݹ�ѹ��
	public static void compress(ZipOutputStream out, BufferedOutputStream bos, File input, String name)
			throws IOException {
		if (name == null) {
			name = input.getName();
		}
		// ���·��ΪĿ¼���ļ��У�
		if (input.isDirectory()) {
			// ȡ���ļ����е��ļ��������ļ��У�
			File[] flist = input.listFiles();

			if (flist.length == 0)// ����ļ���Ϊ�գ���ֻ����Ŀ�ĵ�zip�ļ���д��һ��Ŀ¼����
			{
				out.putNextEntry(new ZipEntry(name + "/"));
			} else// ����ļ��в�Ϊ�գ���ݹ����compress���ļ����е�ÿһ���ļ������ļ��У�����ѹ��
			{
				for (int i = 0; i < flist.length; i++) {
					compress(out, bos, flist[i], name + "/" + flist[i].getName());
				}
			}
		} else// �������Ŀ¼���ļ��У�����Ϊ�ļ�������д��Ŀ¼����㣬֮���ļ�д��zip�ļ���
		{
			out.putNextEntry(new ZipEntry(name));
			FileInputStream fos = new FileInputStream(input);
			BufferedInputStream bis = new BufferedInputStream(fos);
			int len;
			// ��Դ�ļ�д�뵽zip�ļ���
			byte[] buf = new byte[1024];
			while ((len = bis.read(buf)) != -1) {
				bos.write(buf, 0, len);
			}
			bis.close();
			fos.close();
		}
	}

	public static void main(String[] args) {
		try {
			ZipCompress("D:\\Java\\2019-09-workplace\\training\\test-output", "D:\\Java\\2019-09-workplace\\test-output.zip");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}